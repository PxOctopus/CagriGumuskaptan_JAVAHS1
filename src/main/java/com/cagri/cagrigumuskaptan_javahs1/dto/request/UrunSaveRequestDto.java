package com.cagri.cagrigumuskaptan_javahs1.dto.request;

import com.cagri.cagrigumuskaptan_javahs1.entity.Marka;
import com.cagri.cagrigumuskaptan_javahs1.entity.Model;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class UrunSaveRequestDto {
    private String ad;
    private String aciklama;
    private String anaResimUrl;
    private String resimUrl1;
    private String resimUrl2;
    private String resimUrl3;
    private Integer stokAdedi;
    private Marka marka;
    private Model model;
}
