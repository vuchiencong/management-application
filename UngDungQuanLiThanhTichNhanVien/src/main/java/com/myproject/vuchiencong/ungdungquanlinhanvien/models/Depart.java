package com.myproject.vuchiencong.ungdungquanlinhanvien.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "departs")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class Depart implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name" ,length = 100)
    private String name;

    @OneToMany(mappedBy = "depart", cascade = CascadeType.ALL)
    private Set<Staff> staffs;


}
