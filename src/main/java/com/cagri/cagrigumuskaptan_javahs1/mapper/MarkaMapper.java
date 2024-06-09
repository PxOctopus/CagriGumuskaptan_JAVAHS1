package com.cagri.cagrigumuskaptan_javahs1.mapper;

import com.cagri.cagrigumuskaptan_javahs1.dto.request.MarkaSaveRequestDto;
import com.cagri.cagrigumuskaptan_javahs1.entity.Marka;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface MarkaMapper {
    MarkaMapper INSTANCE = Mappers.getMapper(MarkaMapper.class);

    Marka fromMarkaSaveDto(MarkaSaveRequestDto dto);
}
