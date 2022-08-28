package com.myproject.vuchiencong.ungdungquanlinhanvien.services.serviceImpl;

import com.myproject.vuchiencong.ungdungquanlinhanvien.models.Depart;
import com.myproject.vuchiencong.ungdungquanlinhanvien.models.Staff;
import com.myproject.vuchiencong.ungdungquanlinhanvien.repositories.DepartRepository;
import com.myproject.vuchiencong.ungdungquanlinhanvien.repositories.StaffRepository;
import com.myproject.vuchiencong.ungdungquanlinhanvien.services.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StaffServiceImpl implements StaffService {

    @Autowired
    private StaffRepository staffRepository;

    @Autowired
    private DepartRepository departRepository;

    @Override
    public  List<Depart> findAllDeparts(){
        return (List<Depart>) departRepository.findAll();
    }


    /**
     *
     * @param staff
     * @return
     */
    @Override
    public Staff  save(Staff staff) {
        return staffRepository.save(staff);
    }


    /**
     *
     * @param staffs
     * @return
     */
    @Override
    public List<Staff> saveAll(List<Staff> staffs) {
        return (List<Staff>) staffRepository.saveAll(staffs);
    }


    /**
     *
     * @param id
     * @return
     */
    @Override
    public Optional<Staff> findById(Long id) {
        return staffRepository.findById(id);
    }


    /**
     *
     * @param id
     * @return
     */
    @Override
    public boolean existsById(Long id) {
        return staffRepository.existsById(id);
    }


    /**
     *
     * @return
     */
    @Override
    public Iterable<Staff> findAll() {
        return staffRepository.findAll();
    }


    /**
     *
     * @return
     */
    @Override
    public long count() {
        return staffRepository.count();
    }


    /**
     *
     * @param id
     */
    @Override
    public void deleteById(Long id) {
        staffRepository.deleteById(id);
    }


    /**
     *
     * @param staff
     */
    @Override
    public void delete(Staff staff) {
        staffRepository.delete(staff);
    }


    /**
     *
     * @param staffs
     */
    @Override
    public void deleteAll(List<Staff> staffs) {
        staffRepository.deleteAll(staffs);
    }
}
