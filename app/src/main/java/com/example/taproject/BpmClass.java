package com.example.taproject;

public class BpmClass {
    private Integer bpm_min;
    private Integer bpm_max;
    private String tanggal;
    private String waktu_mulai;
    private String waktu_berjalan;

    public BpmClass(){

    }

    public BpmClass(Integer bpm_min, Integer bpm_max, String tanggal, String waktu_mulai, String waktu_berjalan) {
        this.bpm_min = bpm_min;
        this.bpm_max = bpm_max;
        this.tanggal = tanggal;
        this.waktu_mulai = waktu_mulai;
        this.waktu_berjalan = waktu_berjalan;
    }

    public Integer getBpm_min(){
        return bpm_min;
    }

    public Integer getBpm_max(){
        return bpm_max;
    }

    public String getTanggal(){
        return tanggal;
    }

    public String getWaktu_mulai(){
        return waktu_mulai;
    }

    public String getWaktu_berjalan(){
        return waktu_berjalan;
    }

}
