package com.cagri.cagrigumuskaptan_javahs1.dto.request;

import com.cagri.cagrigumuskaptan_javahs1.entity.Marka;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ModelSaveRequestDto {
    private String modelAdi;
    private Marka marka;
}
