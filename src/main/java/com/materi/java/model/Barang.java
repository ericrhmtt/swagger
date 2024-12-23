package com.materi.java.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Barang")
public class Barang {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "Nama_Barang")
    private String Nama_Barang;

    @Column(name = "stok_barang")
    private Long stok_barang;

    @Column(name = "deskripsi_barang")
    private String deskripsi_barang;

    @Column(name = "jenis_barang")
    private String jenis_barang;

    @Column(name = "Tanggal_Kadaluarsa")
    private Date Tanggal_Kadaluarsa;

    @Column(name = "harga_barang")
    private Float harga_barang;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNama_Barang() {
        return Nama_Barang;
    }

    public void setNama_Barang(String nama_Barang) {
        Nama_Barang = nama_Barang;
    }

    public Long getStok_barang() {
        return stok_barang;
    }

    public void setStok_barang(Long stok_barang) {
        this.stok_barang = stok_barang;
    }

    public String getDeskripsi_barang() {
        return deskripsi_barang;
    }

    public void setDeskripsi_barang(String deskripsi_barang) {
        this.deskripsi_barang = deskripsi_barang;
    }

    public String getJenis_barang() {
        return jenis_barang;
    }

    public void setJenis_barang(String jenis_barang) {
        this.jenis_barang = jenis_barang;
    }

    public Date getTanggal_Kadaluarsa() {
        return Tanggal_Kadaluarsa;
    }

    public void setTanggal_Kadaluarsa(Date tanggal_Kadaluarsa) {
        Tanggal_Kadaluarsa = tanggal_Kadaluarsa;
    }

    public Float getHarga_barang() {
        return harga_barang;
    }

    public void setHarga_barang(Float harga_barang) {
        this.harga_barang = harga_barang;
    }
}
