package com.example12.demo1221.migration;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class MIG_Petugas {
    @Id
    private Long Id;
    private String Nama_Petugas;

    public MIG_Petugas() {
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getNama_Petugas() {
        return Nama_Petugas;
    }

    public void setNama_Petugas(String nama_Petugas) {
        Nama_Petugas = nama_Petugas;
    }
}
