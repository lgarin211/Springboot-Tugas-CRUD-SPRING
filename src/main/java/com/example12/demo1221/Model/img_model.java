
package com.example12.demo1221.Model;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class img_model {
    @Id
    private Long id;
    private String gambar;
    private String text;

//this are the construktor
    public img_model() {
    }

    public img_model(Long id,String gambar,String text)
    {
        this.id = id;
        this.gambar = gambar;
        this.text = text;
    }


    //This are geter and seter
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getGambar() {
        return gambar;
    }

    public void setGambar(String gambar) {
        this.gambar = gambar;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "img_model{" +
                "id=" + id +
                ", gambar='" + gambar + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
