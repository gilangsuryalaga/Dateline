package com.example.dateline;

public class Content {
    private String judul;
    private String harga;
    private int photo;

    public Content() {
    }

    public Content(String judul, String harga, int photo) {
        this.judul = judul;
        this.harga = harga;
        this.photo = photo;
    }

    //Getter

    public String getJudul() {
        return judul;
    }

    public String getHarga() {
        return harga;
    }

    public int getPhoto() {
        return photo;
    }

    //Setter

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }
}
