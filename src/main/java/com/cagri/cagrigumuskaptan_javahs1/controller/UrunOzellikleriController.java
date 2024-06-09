package com.cagri.cagrigumuskaptan_javahs1.controller;

import com.cagri.cagrigumuskaptan_javahs1.dto.request.UrunOzellikleriSaveRequestDto;
import com.cagri.cagrigumuskaptan_javahs1.exception.ErrorType;
import com.cagri.cagrigumuskaptan_javahs1.exception.UrunException;
import com.cagri.cagrigumuskaptan_javahs1.service.UrunOzellikleriService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
//    @GetMapping(LISTPROPERTIES)
//    public ResponseEntity<List<UrunOzellikleri>> getUrunByIdAndListOzellikler(@PathVariable Long id)  {
//        if (Objects.isNull(id))
//            throw new UrunException(ErrorType.PRODUCT_INVALID_PARAMETER_ERROR);
//        return ResponseEntity.ok(urunOzellikleriService.getUrunByIdAndListProperties(id));
//    }

}
