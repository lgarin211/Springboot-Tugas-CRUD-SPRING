package com.example12.demo1221.migration;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class MIG_Dapodik {

    @Id
    private String NISN;
    private String Nama;
    private String NIP;
    private String Kelas;
    private String Alamat;
    private String Jurusan;
    private String Other_Info;


    //    Ini Bagian Construkter
    public MIG_Dapodik() {

    }

    //    ini Bagian Geter And Setter


    public String getNama() {
        return Nama;
    }

    public void setNama(String nama) {
        Nama = nama;
    }

    public String getNISN() {
        return NISN;
    }

    public void setNISN(String NISN) {
        this.NISN = NISN;
    }

    public String getNIP() {
        return NIP;
    }

    public void setNIP(String NIP) {
        this.NIP = NIP;
    }

    public String getKelas() {
        return Kelas;
    }

    public void setKelas(String kelas) {
        Kelas = kelas;
    }

    public String getAlamat() {
        return Alamat;
    }

    public void setAlamat(String alamat) {
        Alamat = alamat;
    }

    public String getJurusan() {
        return Jurusan;
    }

    public void setJurusan(String jurusan) {
        Jurusan = jurusan;
    }

    public String getOther_Info() {
        return Other_Info;
    }

    public void setOther_Info(String other_Info) {
        Other_Info = other_Info;
    }
}
