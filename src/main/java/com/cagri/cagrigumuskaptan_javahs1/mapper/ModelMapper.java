package com.cagri.cagrigumuskaptan_javahs1.mapper;

import com.cagri.cagrigumuskaptan_javahs1.dto.request.ModelSaveRequestDto;
import com.cagri.cagrigumuskaptan_javahs1.entity.Model;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ModelMapper {
    ModelMapper INSTANCE = Mappers.getMapper(ModelMapper.class);

    Model fromModelSaveDto(ModelSaveRequestDto dto);

}
