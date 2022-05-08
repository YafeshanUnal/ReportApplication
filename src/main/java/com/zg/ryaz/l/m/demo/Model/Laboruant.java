package com.zg.ryaz.l.m.demo.Model;


import org.apache.catalina.core.ApplicationFilterChain;
import org.hibernate.loader.BatchLoadSizingStrategy;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "doktorlar")
public class Laboruant {

    /**
     * Rapor Tanımı ( Dosya numarası, Hasta Ad ve Soyad, Hasta Kimlik
     * Numarası(TC), Koyulan Tanı Başlığı, Tanı Detayları, Raporun Verildiği
     * Tarih, Fiziksel Rapora Ait .png/.jpg Formatında Bir Adet Fotoğraf )
     * Bir rapor yalnızca bir laborant tarafından tanımlanmış olmalı. Bir
     * laborant ise  n tane rapor tanımlayabilir. ( Ad, Soyad, Hastane Kimlik
     * Numarası(7 Haneli), )
     */

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "Doktor_Adi", length = 20, nullable = false)
    private String name;
    @Column(name = "Doktor_soyAdi", length = 20, nullable = false)
    private String surname;
    @Column(name = "Doktor_KimlikNo", length = 7, nullable = false)
    private int identifyNumber;

    @OneToMany(mappedBy = "laboruant",cascade = CascadeType.ALL)
    private List<Report> reports;




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
