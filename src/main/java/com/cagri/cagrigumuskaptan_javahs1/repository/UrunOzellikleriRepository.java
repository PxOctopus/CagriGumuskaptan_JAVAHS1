package com.cagri.cagrigumuskaptan_javahs1.repository;

import com.cagri.cagrigumuskaptan_javahs1.entity.UrunOzellikleri;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UrunOzellikleriRepository extends JpaRepository<UrunOzellikleri, Long> {

    List<UrunOzellikleri> findByKategoriAdiAndOzellikAdi(String kategoriAdi, String ozellikAdi);

    List<UrunOzellikleri> findByKategoriAdi(String kategoriAdi);

    List<UrunOzellikleri> findByOzellikAdi(String ozellikAdi);
}
