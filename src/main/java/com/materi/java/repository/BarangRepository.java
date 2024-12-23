package com.materi.java.repository;

import com.materi.java.model.Barang;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BarangRepository extends JpaRepository<Barang , Long> {
    @Override
    Optional<Barang> findById(Long aLong);
}
