package com.materi.java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaApplication {
	public static void main(String[] args) {
		SpringApplication.run(JavaApplication.class, args);

		String nama = "Eric Rahmat";
		String kelas ="10 TKJ 2";


		System.out.println("Nama : " + nama);
		System.out.println("Kelas : " + kelas);
	}



}
