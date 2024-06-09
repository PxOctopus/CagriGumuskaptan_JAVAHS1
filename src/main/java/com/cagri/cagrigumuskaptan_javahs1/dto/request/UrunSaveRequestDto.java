package com.cagri.cagrigumuskaptan_javahs1.dto.request;

import com.cagri.cagrigumuskaptan_javahs1.entity.Marka;
import com.cagri.cagrigumuskaptan_javahs1.entity.Model;
import com.cagri.cagrigumuskaptan_javahs1.entity.UrunOzellikleri;
import com.cagri.cagrigumuskaptan_javahs1.utility.enums.EBeden;
import com.cagri.cagrigumuskaptan_javahs1.utility.enums.ECinsiyet;
import com.cagri.cagrigumuskaptan_javahs1.utility.enums.ERenk;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class UrunSaveRequestDto {

    private String ad;
    private String aciklama;


    private String anaResimUrl;
    @NotNull
    private String resimUrl1;
    @NotNull
    private String resimUrl2;
    @NotNull
    private String resimUrl3;

    private Integer stokAdedi;
    private Double urunFiyati;

    @Min(value = 1)
    @Max(value = 5)
    private Double urunYildizi;

    private Model model;
    private ERenk renk;

    private ECinsiyet cinsiyet;

    private EBeden beden;
    private List<UrunOzellikleri> urunOzellikleriListesi;
}
