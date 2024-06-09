package com.cagri.cagrigumuskaptan_javahs1.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class MarkaSaveRequestDto {
    private String ad;
}
