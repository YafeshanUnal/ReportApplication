package com.zg.ryaz.l.m.demo.Model;

import javax.persistence.*;

@Entity
@Table(name = "raporlar")
public class Report {


    /**
     * Rapor Tanımı ( Dosya numarası, Hasta Ad ve Soyad, Hasta Kimlik
     * Numarası(TC), Koyulan Tanı Başlığı, Tanı Detayları, Raporun Verildiği
     * Tarih, Fiziksel Rapora Ait .png/.jpg Formatında Bir Adet Fotoğraf )
     * Bir rapor yalnızca bir laborant tarafından tanımlanmış olmalı. Bir
     * laborant ise  n tane rapor tanımlayabilir. ( Ad, Soyad, Hastane Kimlik
     * Numarası(7 Haneli), )
     */

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(name = "Hasta_adi", length = 20, nullable = false)
    private String name;
    @Column(name = "Hasta_soyAdi", length = 20, nullable = false)
    private String surName;
    @Column(name = "Hasta_TCNo", length = 20, nullable = false)
    private Long identifyNumber;
    @Column(name = "Hasta_tanıBaşlığı", length = 20, nullable = false)
    private String diagnosisTitle;
    @Column(name = "Hasta_tanıDetay", length = 200, nullable = false)
    private String diagnosisInfo;
    @Column(name = "Hasta_raporTarihi", length = 20, nullable = false)
    private String reportDate;
    @Column(name="Hasta_Resim")
    private byte[] patientPic;

    @ManyToOne
    private Laboruant laboruant;



    public byte[] getPatientPic() {
        return patientPic;
    }

    public void setPatientPic(byte[] patientPic) {
        this.patientPic = patientPic;
    }

    public String getReportDate() {
        return reportDate;
    }

    public void setReportDate(String reportDate) {
        this.reportDate = reportDate;
    }

    public String getDiagnosisInfo() {
        return diagnosisInfo;
    }

    public void setDiagnosisInfo(String diagnosisInfo) {
        this.diagnosisInfo = diagnosisInfo;
    }

    public String getDiagnosisTitle() {
        return diagnosisTitle;
    }

    public void setDiagnosisTitle(String diagnosisTitle) {
        this.diagnosisTitle = diagnosisTitle;
    }

    public Long getIdentifyNumber() {
        return identifyNumber;
    }

    public void setIdentifyNumber(Long identifyNumber) {
        this.identifyNumber = identifyNumber;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }



    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
}
