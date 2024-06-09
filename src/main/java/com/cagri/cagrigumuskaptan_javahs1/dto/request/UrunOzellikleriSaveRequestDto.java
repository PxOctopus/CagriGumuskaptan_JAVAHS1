package com.cagri.cagrigumuskaptan_javahs1.dto.request;

import com.cagri.cagrigumuskaptan_javahs1.entity.Urun;
import com.cagri.cagrigumuskaptan_javahs1.utility.enums.EBeden;
import com.cagri.cagrigumuskaptan_javahs1.utility.enums.ECinsiyet;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
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
    private String ozellikAciklama;

    private ECinsiyet cinsiyet;

    private EBeden beden;
    private Urun urun;
}
