package com.myproject.vuchiencong.ungdungquanlinhanvien.services.serviceImpl;

import com.myproject.vuchiencong.ungdungquanlinhanvien.models.Depart;
import com.myproject.vuchiencong.ungdungquanlinhanvien.repositories.DepartRepository;
import com.myproject.vuchiencong.ungdungquanlinhanvien.services.DepartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartServiceImpl implements DepartService {

    @Autowired
    private DepartRepository departRepository;


    /**
     *
     * @param depart
     * @return
     */
    @Override
    public Depart save(Depart depart) {
        return departRepository.save(depart);
    }


    /**
     *
     * @param departs
     * @return
     */
    @Override
    public List<Depart> saveAll(List<Depart> departs) {
        return (List<Depart>) departRepository.saveAll(departs);
    }


    /**
     *
     * @param id
     * @return
     */
    @Override
    public Optional<Depart> findById(Integer id) {
        return departRepository.findById(id);
    }


    /**
     *
     * @param id
     * @return
     */
    @Override
    public boolean existsById(Integer id) {
        return departRepository.existsById(id);
    }


    /**
     *
     * @return
     */
    @Override
    public Iterable<Depart> findAll() {
        return departRepository.findAll();
    }


    /**
     *
     * @param ids
     * @return
     */
    @Override
    public List<Depart> findAllById(List<Integer> ids) {
        return (List<Depart>) departRepository.findAllById(ids);
    }


    /**
     *
     * @return
     */
    @Override
    public long count() {
        return departRepository.count();
    }


    /**
     *
     * @param id
     */
    @Override
    public void deleteById(Integer id) {
        departRepository.deleteById(id);
    }


    /**
     *
     * @param depart
     */
    @Override
    public void delete(Depart depart) {
        departRepository.delete(depart);
    }


    /**
     *
     * @param departs
     */
    @Override
    public void deleteAll(List<Depart> departs) {
        departRepository.deleteAll(departs);
    }


    /**
     *
     * @param name
     * @return
     */
    public List<Depart> findByNameLikeOrderByName(String name) {
        return departRepository.findByNameLikeOrderByName("%" +name+ "%");
    }


    /**
     *
     */
    @Override
    public void deleteAll() {
        departRepository.deleteAll();
    }
}
