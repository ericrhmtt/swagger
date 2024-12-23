package com.materi.java.service;

import com.materi.java.exception.NotFoundException;
import com.materi.java.model.Barang;
import com.materi.java.repository.BarangRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class BarangService {
    @Autowired
    private BarangRepository barangRepository;

    public Barang add(Barang barang) {
        return barangRepository.save(barang);
    }


    public Barang get(Long id) {
        return barangRepository.findById(id).orElseThrow(() -> new NotFoundException("Id Not Found"));
    }

    public List<Barang> getAll() {
        return barangRepository.findAll();
    }

    public Barang edit(Long id, Barang barang) {
        Barang update = barangRepository.findById(id).orElseThrow(() -> new NotFoundException("Id Not Found"));
        update.setNama_Barang(barang.getNama_Barang());
        update.setStok_barang(barang.getStok_barang());
        update.setDeskripsi_barang(barang.getDeskripsi_barang());
        update.setJenis_barang(barang.getJenis_barang());
        update.setTanggal_Kadaluarsa(barang.getTanggal_Kadaluarsa());
        update.setHarga_barang(barang.getHarga_barang());
        return barangRepository.save(update);
    }
    public Map<String, Boolean> delete(Long id) {
        try {
            barangRepository.deleteById(id);
            Map<String, Boolean> map = new HashMap<>();
            map.put("Deleted", Boolean.TRUE);
            return map;
        } catch (Exception e) {
            return null;
        }
    }
}

