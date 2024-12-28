package com.materi.java.controller;

import com.materi.java.service.BarangService;
import com.materi.java.exception.CommonResponse;
import com.materi.java.exception.ResponseHelper;
import com.materi.java.model.Barang;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/barang")
@CrossOrigin(origins = "*")
public class BarangController {

    @Autowired
    private BarangService barangService;

    @ApiOperation(value = "Add")
    @PostMapping("/add")
    public CommonResponse<Barang> createBarang(@RequestBody Barang barang) {
        return ResponseHelper.ok(barangService.add(barang));
    }

    @ApiOperation(value = "Get")
    @GetMapping("/get/{id}")
    public CommonResponse<Barang> getBarangById(@PathVariable("id") Long id) {
        return ResponseHelper.ok(barangService.getById(id));
    }

    @ApiOperation(value = "GetAll")
    @GetMapping("/getAll")
    public CommonResponse<List<Barang>> getAllBarang() {
        return ResponseHelper.ok(barangService.getAll());
    }



    @ApiOperation(value = "Put")
    @PutMapping("/{id}")
    public CommonResponse<Barang> updateBarang(@PathVariable("id") Long id, @RequestBody Barang barang) {
        return ResponseHelper.ok(barangService.edit(id, barang));
    }

    @ApiOperation(value = "Delete")
    @DeleteMapping("/{id}")
    public CommonResponse<?> deleteBarang(@PathVariable("id") Long id) {
        return ResponseHelper.ok(barangService.delete(id));
    }


}