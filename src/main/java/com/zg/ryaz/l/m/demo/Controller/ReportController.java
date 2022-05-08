package com.zg.ryaz.l.m.demo.Controller;

import com.zg.ryaz.l.m.demo.Model.Report;
import com.zg.ryaz.l.m.demo.Service.ReportService;
import org.bouncycastle.cert.ocsp.Req;
import org.bouncycastle.math.raw.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class ReportController{

    /**Hasta adı/soyadı, Hasta kimlik numarası, Laborant adı/soyadı
     bilgileri ile arama yapılabilmeli. Rapor tarihi ile sıralama
     yapılabilmeli
     * Var olan bir rapor üzerinde değişiklik yapılabilmeli
     * Var olan tüm raporların detayları incelenebilmeli
     * Var olan bir rapor silinebilmeli*/


    @Autowired
    private ReportService reportService;

    public ReportController(ReportService reportService){
        this.reportService = reportService;
    }

    @RequestMapping("/")
    public String getAllReport(Model model) {
        List<Report> report = reportService.getAllReports();
        model.addAttribute("report",report);
        return "index";
    }
    @RequestMapping("/new")
    public String showNewReportForm(Model model){
        Report report = new Report();
        model.addAttribute("report",report);
        return "new_report";

    }
    @RequestMapping(value = "/save",method = RequestMethod.POST)
        public String saveReport(@ModelAttribute("report") Report report){
            reportService.save(report);
            return "redirect:/";
    }

    @RequestMapping("edit/{id}")
    public ModelAndView updateReport(@PathVariable(name = "id") Long id){
        ModelAndView modelAndView = new ModelAndView("edit_report");
        Report report = reportService.get(id);
        modelAndView.addObject("report",report);
        return modelAndView;
    }
    @RequestMapping( "delete/{id}")
    public String deleteReport(@PathVariable(name = "id") Long id){
        reportService.delete(id);
        return "redirect:/";
    }









}

