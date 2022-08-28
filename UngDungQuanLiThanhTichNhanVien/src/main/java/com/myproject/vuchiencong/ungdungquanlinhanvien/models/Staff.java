package com.myproject.vuchiencong.ungdungquanlinhanvien.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "staffs")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class Staff implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name" ,length = 50)
    private String name;

    @Column(name = "photo",length = 100)
    private String photo;

    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "dd/MM/YYYY")
    @Column(name = "birthday")
    private Date birthday;

    @ManyToOne
    private Depart depart;

}
