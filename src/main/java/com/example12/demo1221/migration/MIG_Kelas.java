package com.example12.demo1221.migration;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class MIG_Kelas {
    @Id
    private Long Id;
    private String Nama_kelas;

    public MIG_Kelas() {
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getNama_kelas() {
        return Nama_kelas;
    }

    public void setNama_kelas(String nama_kelas) {
        Nama_kelas = nama_kelas;
    }
}
