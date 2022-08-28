package com.myproject.vuchiencong.ungdungquanlinhanvien.repositories;

import com.myproject.vuchiencong.ungdungquanlinhanvien.models.Staff;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StaffRepository extends CrudRepository<Staff, Long> {
}
