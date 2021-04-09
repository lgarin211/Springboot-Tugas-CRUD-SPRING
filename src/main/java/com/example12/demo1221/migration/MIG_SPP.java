package com.example12.demo1221.migration;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class MIG_SPP {
    @Id
    private Long Id;
    private String NISN;
    private String Waktu_bayar;
    private String Petugas;
    private String Pembayar;
    private String Tungakan;
    private String Lunas;

//    Contrukter


    public MIG_SPP() {

    }

    //    Geter And Setter
    public String getNISN() {
        return NISN;
    }

    public void setNISN(String NISN) {
        this.NISN = NISN;
    }

    public String getWaktu_bayar() {
        return Waktu_bayar;
    }

    public void setWaktu_bayar(String waktu_bayar) {
        Waktu_bayar = waktu_bayar;
    }

    public String getPetugas() {
        return Petugas;
    }

    public void setPetugas(String petugas) {
        Petugas = petugas;
    }

    public String getPembayar() {
        return Pembayar;
    }

    public void setPembayar(String pembayar) {
        Pembayar = pembayar;
    }

    public String getTungakan() {
        return Tungakan;
    }

    public void setTungakan(String tungakan) {
        Tungakan = tungakan;
    }

    public String getLunas() {
        return Lunas;
    }

    public void setLunas(String lunas) {
        Lunas = lunas;
    }
}
