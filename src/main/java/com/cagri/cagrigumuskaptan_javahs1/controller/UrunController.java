package com.cagri.cagrigumuskaptan_javahs1.controller;

import com.cagri.cagrigumuskaptan_javahs1.dto.request.UrunSaveRequestDto;
import com.cagri.cagrigumuskaptan_javahs1.exception.ErrorType;
import com.cagri.cagrigumuskaptan_javahs1.exception.UrunException;
import com.cagri.cagrigumuskaptan_javahs1.service.UrunService;
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
@RequestMapping(URUN)
public class UrunController {
    private final UrunService urunService;

    @PostMapping(SAVE)
    public ResponseEntity<String> urunKaydet(@RequestBody @Valid UrunSaveRequestDto dto) {
        if (Objects.isNull(dto.getAnaResimUrl())
                || Objects.isNull(dto.getResimUrl1())
                || Objects.isNull(dto.getResimUrl2())
                || Objects.isNull(dto.getResimUrl3())) {
            throw new UrunException(ErrorType.PRODUCT_IMAGEURLS_EMPTY_ERROR);
        }
        urunService.save(dto);
        return ResponseEntity.ok("Urun basariyla eklendi.");


    }
}
