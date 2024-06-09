package com.cagri.cagrigumuskaptan_javahs1.controller;

import com.cagri.cagrigumuskaptan_javahs1.dto.request.UrunOzellikleriSaveRequestDto;
import com.cagri.cagrigumuskaptan_javahs1.entity.UrunOzellikleri;
import com.cagri.cagrigumuskaptan_javahs1.exception.ErrorType;
import com.cagri.cagrigumuskaptan_javahs1.exception.UrunException;
import com.cagri.cagrigumuskaptan_javahs1.service.UrunOzellikleriService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

import static com.cagri.cagrigumuskaptan_javahs1.config.RestApis.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(URUNOZELLIKLERI)
public class UrunOzellikleriController {

    private final UrunOzellikleriService urunOzellikleriService;

    @PostMapping(ADD)
    public ResponseEntity<String> urunOzellikleriEkle(@RequestBody @Valid UrunOzellikleriSaveRequestDto dto) {
        if (Objects.isNull(dto.getUrun().getId())) {
            if (Objects.isNull(dto.getUrun().getAnaResimUrl())
                    || Objects.isNull(dto.getUrun().getResimUrl1())
                    || Objects.isNull(dto.getUrun().getResimUrl2())
                    || Objects.isNull(dto.getUrun().getResimUrl3())){
                throw new UrunException(ErrorType.PRODUCT_INVALID_PARAMETER_ERROR);
            }
        }
        urunOzellikleriService.save(dto);
        return ResponseEntity.ok("Islem Basarili!");
    }

    @GetMapping(GETBYKATEGORIADIANDOZELIKADI)
    public List<UrunOzellikleri> getUrunOzellikByKategoriAdiAndOzellikAdi(String kategoriAdi, String ozellikAdi) {
        return urunOzellikleriService.findByKategoriAdiAndOzellikAdi(kategoriAdi, ozellikAdi);
    }

    @GetMapping(GETBYKATEGORIADI)
    public List<UrunOzellikleri> getUrunOzellikByKategoriAdi(String kategoriAdi) {
        return urunOzellikleriService.findByKategoriAdi(kategoriAdi);
    }

    @GetMapping(GETALL)
    public List<UrunOzellikleri> getAll() {
        return urunOzellikleriService.findAll();
    }

    @GetMapping(GETBYOZELLIKADI)
    public List<UrunOzellikleri> getUrunOzellikByOzellikAdi(String ozellikAdi) {
        return urunOzellikleriService.findByOzellikAdi(ozellikAdi);
    }

}
