package com.example.taproject;

import java.util.Date;

public class TimeClass {
    private String selisih_waktu, waktu_mulai, waktu_berjalan, tanggal;

    public TimeClass(){

    }

    public TimeClass(String selisih_waktu, String tanggal, String waktu_mulai, String waktu_berjalan) {
        this.selisih_waktu = selisih_waktu;
        this.tanggal = tanggal;
        this.waktu_mulai = waktu_mulai;
        this.waktu_berjalan = waktu_berjalan;

    }

    public String getSelisih_waktu(){
        return  selisih_waktu;
    }

    public String getWaktu_mulai(){
        return waktu_mulai;
    }

    public String getWaktu_berjalan(){
        return waktu_berjalan;
    }

    public String getTanggal(){
        return tanggal;
    }

}
