package com.myproject.vuchiencong.ungdungquanlinhanvien.controller;

import com.myproject.vuchiencong.ungdungquanlinhanvien.models.Staff;
import com.myproject.vuchiencong.ungdungquanlinhanvien.services.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Optional;


@Controller
public class ImageController {

    @Autowired
    private StaffService staffService;

    @RequestMapping(value = "getimage/{id}", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<ByteArrayResource> downloadLinkImage(@PathVariable Long id){
        Optional<Staff> sop = staffService.findById(id);

        if(sop.isPresent()){
            Staff staff = sop.get();
            try{
                Path fileName = Paths.get("images", staff.getPhoto());
                byte[] buffer = Files.readAllBytes(fileName);
                ByteArrayResource bsr = new ByteArrayResource(buffer);
                return ResponseEntity.ok()
                        .contentLength(buffer.length)
                        .contentType(MediaType.parseMediaType("image/png"))
                        .body(bsr);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        return ResponseEntity.badRequest().build();
    }




    @GetMapping("/upload")
    public String upload(){
        return "uploadForm";
    }

    @PostMapping("/upload")
    public String upload(ModelMap model, @RequestParam("image")MultipartFile image){

        if(image.isEmpty()){
            model.addAttribute("message", "Please upload an image");
        }
        Path path = Paths.get("images/");

        try(InputStream inputStream = image.getInputStream()){
            Files.copy(inputStream, path.resolve(image.getOriginalFilename()),
                    StandardCopyOption.REPLACE_EXISTING);
                String filename = image.getOriginalFilename();
                model.addAttribute("message", filename + "upload");
        }catch(Exception e){
        e.printStackTrace();
        model.addAttribute("message", "error: " +e.getMessage());
        }

        return "uploadForm";
    }
}
