package com.cagri.cagrigumuskaptan_javahs1.controller;

import com.cagri.cagrigumuskaptan_javahs1.dto.request.UrunSaveRequestDto;
import com.cagri.cagrigumuskaptan_javahs1.entity.Urun;
import com.cagri.cagrigumuskaptan_javahs1.entity.UrunOzellikleri;
import com.cagri.cagrigumuskaptan_javahs1.exception.ErrorType;
import com.cagri.cagrigumuskaptan_javahs1.exception.UrunException;
import com.cagri.cagrigumuskaptan_javahs1.service.UrunService;
import com.cagri.cagrigumuskaptan_javahs1.utility.enums.EBeden;
import com.cagri.cagrigumuskaptan_javahs1.utility.enums.ECinsiyet;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

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

    @GetMapping(GETALL)
    public ResponseEntity<List<Urun>> getAll() {
        return ResponseEntity.ok(urunService.getAll());
    }

    @GetMapping(GETALLBYBEDEN)
    public ResponseEntity<List<Urun>> getAllByBeden(EBeden beden) {
        return ResponseEntity.ok(urunService.getAllByBeden(beden));
    }

    @GetMapping(GETALLBYCINSIYET)
    public ResponseEntity<List<Urun>> getAllByCinsiyet(ECinsiyet cinsiyet) {
        return ResponseEntity.ok(urunService.getAllByCinsiyet(cinsiyet));
    }

    @GetMapping(GETBYID)
    public ResponseEntity<Optional<Urun>> getUrunById(@PathVariable Long id) {
        if (Objects.isNull(id))
            throw new UrunException(ErrorType.PRODUCT_INVALID_PARAMETER_ERROR);
        return ResponseEntity.ok(urunService.getUrunById(id));
    }

}
