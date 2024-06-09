package com.cagri.cagrigumuskaptan_javahs1.service;

import com.cagri.cagrigumuskaptan_javahs1.dto.request.UrunSaveRequestDto;
import com.cagri.cagrigumuskaptan_javahs1.exception.ErrorType;
import com.cagri.cagrigumuskaptan_javahs1.exception.UrunException;
import com.cagri.cagrigumuskaptan_javahs1.repository.UrunRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UrunService {
    private final UrunRepository repository;
    public void save(UrunSaveRequestDto dto) {
        if (repository.existsById(dto.getId())){
            throw new UrunException(ErrorType.PRODUCT_EXISTS_ERROR);
        }
    }
}
