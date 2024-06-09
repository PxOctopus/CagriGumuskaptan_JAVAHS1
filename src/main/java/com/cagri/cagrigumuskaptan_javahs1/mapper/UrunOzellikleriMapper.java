package com.cagri.cagrigumuskaptan_javahs1.mapper;

import com.cagri.cagrigumuskaptan_javahs1.dto.request.UrunOzellikleriSaveRequestDto;
import com.cagri.cagrigumuskaptan_javahs1.entity.UrunOzellikleri;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface UrunOzellikleriMapper {
    UrunOzellikleriMapper INSTANCE = Mappers.getMapper(UrunOzellikleriMapper.class);

    UrunOzellikleri fromUrunOzellikleriSaveDto(UrunOzellikleriSaveRequestDto dto);
}
