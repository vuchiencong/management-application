package com.myproject.vuchiencong.ungdungquanlinhanvien.dtos;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class StaffDto implements Serializable {

    private Long id;

    @NotNull
    private String name;

    @NotNull
    private MultipartFile image;

    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "dd/MM/YYYY")

    private Date birthday;

    @NotNull
    private Integer departId;
}
