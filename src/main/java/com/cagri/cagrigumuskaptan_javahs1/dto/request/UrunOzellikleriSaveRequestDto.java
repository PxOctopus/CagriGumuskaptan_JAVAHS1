package com.cagri.cagrigumuskaptan_javahs1.dto.request;

import com.cagri.cagrigumuskaptan_javahs1.entity.Urun;
import com.cagri.cagrigumuskaptan_javahs1.utility.enums.EBeden;
import com.cagri.cagrigumuskaptan_javahs1.utility.enums.ECinsiyet;
import com.cagri.cagrigumuskaptan_javahs1.utility.enums.ERenk;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class UrunOzellikleriSaveRequestDto {
    private String ozellikAdi;
    private String kategoriAdi;

    private String ozellikAciklama;

    private Urun urun;
}
