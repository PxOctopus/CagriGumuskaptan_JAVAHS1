package com.cagri.cagrigumuskaptan_javahs1.mapper;

import com.cagri.cagrigumuskaptan_javahs1.dto.request.UrunSaveRequestDto;
import com.cagri.cagrigumuskaptan_javahs1.entity.Urun;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface UrunMapper {
    UrunMapper INSTANCE = Mappers.getMapper(UrunMapper.class);

    Urun fromUrunSaveDto(UrunSaveRequestDto dto);
}
