package com.example.dateline;

public class ListContent {
    private String judul;
    private String harga;
    private int photo;

    public ListContent() {
    }

    public ListContent(String judul, String harga, int photo) {
        this.judul = judul;
        this.harga = harga;
        this.photo = photo;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }
}
