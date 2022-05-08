package com.zg.ryaz.l.m.demo.Service;

import com.zg.ryaz.l.m.demo.Model.Report;
import com.zg.ryaz.l.m.demo.Repository.ReportRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Service
public class ReportService {

    /**Hasta adı/soyadı, Hasta kimlik numarası, Laborant adı/soyadı
     bilgileri ile arama yapılabilmeli. Rapor tarihi ile sıralama
     yapılabilmeli
     * Var olan bir rapor üzerinde değişiklik yapılabilmeli
     * Var olan tüm raporların detayları incelenebilmeli
     * Var olan bir rapor silinebilmeli*/


    private ReportRepository reportRepository;

    public ReportService(ReportRepository reportRepository){
        this.reportRepository = reportRepository;
    }

    //Tüm Raporları Getirme
    public List<Report> getAllReports(){
        return reportRepository.findAll();
    }

    //Yeni Rapor Ekleme
    public void save(Report newReport) {
        reportRepository.save(newReport);
    }

    //Rapor Üzerinde Değişiklik Yapılmalı
    public Report updateOneReport(Long reportId,Report newReport) {
        Optional<Report> report = reportRepository.findById(reportId);
        if (report.isPresent()) {
            Report foundReport = report.get();
            foundReport.setName(newReport.getName());
            foundReport.setSurName(newReport.getSurName());
            foundReport.setIdentifyNumber(newReport.getIdentifyNumber());
            foundReport.setDiagnosisTitle(newReport.getDiagnosisTitle());
            foundReport.setDiagnosisInfo(newReport.getDiagnosisInfo());
            foundReport.setReportDate(newReport.getReportDate());
            reportRepository.save(foundReport);
            System.out.println("Update Succesfull");
            return newReport;
        } else {
            return null;
        }
    }

    //Raporlar silinebilmeli
    public void delete(Long reportId){
        reportRepository.deleteById(reportId);
    }


    public Report get(Long id){
        return reportRepository.findById(id).get();
    }
}
