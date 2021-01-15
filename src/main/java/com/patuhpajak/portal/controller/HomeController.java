package com.patuhpajak.portal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController{

    @GetMapping(value = "/")
    public String home() {
        return "homepage/home";
    }

    @GetMapping(value = "/login")
    public String sso() {
        return "portal/sso";
    }

    @GetMapping(value = "/dashboard-user")
    public String dashUser() {
        return "portal/dashuser";
    }

    @GetMapping(value = "/profil-user")
    public String profilUser() {
        return "portal/profilUser";
    }

    @GetMapping(value = "/admin")
    public String admin() {
        return "redirect:/admin/login";
    }

    @GetMapping(value = "/admin/login")
    public String adminLogin() {
        return "admin/adminLogin";
    }

    @GetMapping(value = "/admin/dashboard")
    public String adminDash() {
        return "admin/adminDash";
    }

    @GetMapping(value = "/admin/manage-web")
    public String adminManageWeb() {
        return "redirect:/admin/manage-web/layanan";
    }

    @GetMapping(value = "/admin/manage-web/layanan")
    public String adminManageWebLayanan() {
        return "admin/manage-web/layanan";
    }

    @GetMapping(value = "/admin/manage-web/paket")
    public String adminManageWebPaket() {
        return "admin/manage-web/paket";
    }

    @GetMapping(value = "/admin/manage-web/patner")
    public String adminManageWebPatner() {
        return "admin/manage-web/patner";
    }

    @GetMapping(value = "/admin/manage-web/banner")
    public String adminManageWebBanner() {
        return "admin/manage-web/banner";
    }

    @GetMapping(value = "/admin/manage-web/faq")
    public String adminManageWebFaq() {
        return "admin/manage-web/faq";
    }

    @GetMapping(value = "/admin/manage-web/runtext")
    public String adminManageWebRuntext() {
        return "admin/manage-web/runtext";
    }

    @GetMapping(value = "/admin/manage-web/info")
    public String adminManageWebInfo() {
        return "admin/manage-web/info";
    }

    @GetMapping(value = "/admin/manage-web/aboutus")
    public String adminManageWebAboutus() {
        return "admin/manage-web/aboutus";
    }

    @GetMapping(value = "/admin/manage-web/fitur")
    public String adminManageWebFitur() {
        return "admin/manage-web/fitur";
    }

}
