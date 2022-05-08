package com.zg.ryaz.l.m.demo.Repository;

import com.zg.ryaz.l.m.demo.Model.Report;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReportRepository extends JpaRepository<Report, Long> {


     default String findOne(Report reportName){
        return reportName.getReportDate();
    };
}
