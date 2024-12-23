package com.materi.java.controller;

import com.materi.java.exception.CommonResponse;
import com.materi.java.exception.ResponseHelper;
import com.materi.java.model.Barang;
import com.materi.java.service.BarangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/Barang")
@CrossOrigin(origins = "*")
public class BarangController {
    @Autowired
    BarangService barangService;

    @PostMapping("/register")
    public CommonResponse<Barang> register(@RequestBody Barang barang){
        return ResponseHelper.ok( barangService.add(barang));
    }

    @GetMapping("/{id}")
    public CommonResponse<Barang> get(@PathVariable("id") Long id){
        return ResponseHelper.ok( barangService.get(id));
    }

    @GetMapping
    public CommonResponse<List<Barang>> getAll(){
        return ResponseHelper.ok(barangService.getAll());
    }

    @PutMapping("/{id}")
    public CommonResponse<Barang> put(@PathVariable("id") Long id , @RequestBody Barang barang){
        return ResponseHelper.ok( barangService.edit(id, barang));
    }

    @DeleteMapping("/{id}")
    public CommonResponse<?> delete(@PathVariable("id")  Long id ) {
        return ResponseHelper.ok( barangService.delete(id));
    }

}
