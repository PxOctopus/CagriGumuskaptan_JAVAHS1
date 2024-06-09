package com.cagri.cagrigumuskaptan_javahs1.controller;

import com.cagri.cagrigumuskaptan_javahs1.dto.request.UrunOzellikleriSaveRequestDto;
import com.cagri.cagrigumuskaptan_javahs1.entity.UrunOzellikleri;
import com.cagri.cagrigumuskaptan_javahs1.exception.ErrorType;
import com.cagri.cagrigumuskaptan_javahs1.exception.UrunException;
import com.cagri.cagrigumuskaptan_javahs1.repository.UrunRepository;
import com.cagri.cagrigumuskaptan_javahs1.service.UrunOzellikleriService;
import com.cagri.cagrigumuskaptan_javahs1.utility.enums.EBeden;
import com.cagri.cagrigumuskaptan_javahs1.utility.enums.ECinsiyet;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
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

    @GetMapping(LISTPROPERTIES)
    public ResponseEntity<List<UrunOzellikleri>> getUrunOzellikleri() {
        return ResponseEntity.ok(urunOzellikleriService.getListedProperties());
    }
}
