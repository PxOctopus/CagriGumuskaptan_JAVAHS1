package com.cagri.cagrigumuskaptan_javahs1.controller;

import com.cagri.cagrigumuskaptan_javahs1.dto.request.UrunOzellikleriSaveRequestDto;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

import static com.cagri.cagrigumuskaptan_javahs1.config.RestApis.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(URUNOZELLIKLERI)
public class UrunOzellikleriController {

    @PostMapping(ADD)
    public ResponseEntity<String> urunOzellikleriEkle(@RequestBody @Valid UrunOzellikleriSaveRequestDto dto){
        if(Objects.isNull(dto.getUrun().getId())){
            if(Objects.isNull(dto.getMusteriAd())|| Objects.isNull(dto.getMusteriSoyad())){
                throw new AracTakipException(ErrorType.CUSTOMER_INVALID_PARAMETER_ERROR);
            }
        }
        kiralamaService.save(dto);
        return  ResponseEntity.ok("İşlem Başarılı");
    }
}
