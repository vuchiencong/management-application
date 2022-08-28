package com.myproject.vuchiencong.ungdungquanlinhanvien.services;

import com.myproject.vuchiencong.ungdungquanlinhanvien.models.Depart;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface DepartService {

    Depart save(Depart depart);

    List<Depart> saveAll(List<Depart> departs);

    Optional<Depart> findById(Integer id);

    boolean existsById(Integer id);

    Iterable<Depart> findAll();

    List<Depart> findAllById(List<Integer> ids);

    long count();

    void deleteById(Integer id);

    void delete(Depart depart);

    void deleteAll(List<Depart> departs);

    void deleteAll();

    List<Depart> findByNameLikeOrderByName(String name);
}
