package com.example12.demo1221.migration;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class MIG_Jurusan {
    @Id
    private Long Id;
    private String Nama_Jurusan;

    public MIG_Jurusan() {
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getNama_Jurusan() {
        return Nama_Jurusan;
    }

    public void setNama_Jurusan(String nama_Jurusan) {
        Nama_Jurusan = nama_Jurusan;
    }
}
