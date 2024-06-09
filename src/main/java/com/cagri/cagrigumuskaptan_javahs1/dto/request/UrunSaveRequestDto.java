package com.cagri.cagrigumuskaptan_javahs1.dto.request;

import com.cagri.cagrigumuskaptan_javahs1.entity.Marka;
import com.cagri.cagrigumuskaptan_javahs1.entity.Model;
import com.cagri.cagrigumuskaptan_javahs1.entity.UrunOzellikleri;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class UrunSaveRequestDto {
    private Long id;
    private String ad;
    private String aciklama;

    @NotNull
    private String anaResimUrl;
    @NotNull
    private String resimUrl1;
    @NotNull
    private String resimUrl2;
    @NotNull
    private String resimUrl3;

    private Integer stokAdedi;
    private Double urunFiyati;

    private Marka marka;
    private Model model;
    private UrunOzellikleri urunOzellikleri;
}
