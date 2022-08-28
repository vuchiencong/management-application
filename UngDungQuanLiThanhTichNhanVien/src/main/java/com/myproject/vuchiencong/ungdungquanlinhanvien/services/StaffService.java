package com.myproject.vuchiencong.ungdungquanlinhanvien.services;

import com.myproject.vuchiencong.ungdungquanlinhanvien.models.Depart;
import com.myproject.vuchiencong.ungdungquanlinhanvien.models.Staff;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface StaffService {


    List<Depart> findAllDeparts();

    Staff save(Staff staff);

    List<Staff> saveAll(List<Staff> staffs);

    Optional<Staff> findById(Long id);

    boolean existsById(Long id);

    Iterable<Staff> findAll();

    long count();

    void deleteById(Long id);

    void delete(Staff staff);

    void deleteAll(List<Staff> staffs);
}
