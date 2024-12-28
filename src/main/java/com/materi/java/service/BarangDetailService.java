package com.materi.java.service;

import com.materi.java.exception.NotFoundException;
import com.materi.java.model.Barang;
import com.materi.java.repository.BarangRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class BarangDetailService {

    @Autowired
    BarangRepository barangRepository;

    @Transactional
    public Barang getBarangByNama(String namaBarang) {
        return barangRepository.findByNamaBarang(namaBarang)
                .orElseThrow(() -> new NotFoundException("Barang Not Found with name: " + namaBarang));
    }

    @Transactional
    public boolean existsByNamaBarang(String namaBarang) {
        return barangRepository.existsByNamaBarang(namaBarang);
    }
}