package com.cagri.cagrigumuskaptan_javahs1.service;

import com.cagri.cagrigumuskaptan_javahs1.dto.request.UrunSaveRequestDto;
import com.cagri.cagrigumuskaptan_javahs1.entity.Urun;
import com.cagri.cagrigumuskaptan_javahs1.exception.ErrorType;
import com.cagri.cagrigumuskaptan_javahs1.exception.UrunException;
import com.cagri.cagrigumuskaptan_javahs1.mapper.UrunMapper;
import com.cagri.cagrigumuskaptan_javahs1.repository.UrunRepository;
import com.cagri.cagrigumuskaptan_javahs1.utility.enums.EBeden;
import com.cagri.cagrigumuskaptan_javahs1.utility.enums.ECinsiyet;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UrunService {

    private final UrunRepository repository;

    public Urun save(UrunSaveRequestDto dto) {
        if (repository.existsById(dto.getId())) {
            throw new UrunException(ErrorType.PRODUCT_EXISTS_ERROR);
        }
        return repository.save(UrunMapper.INSTANCE.fromUrunSaveDto(dto));
    }

    public List<Urun> getAll() {
        return repository.findAll();
    }

    public List<Urun> getAllByBeden(EBeden beden) {
        return repository.findAllByEBedenContainingIgnoreCase(beden);
    }

    public List<Urun> getAllByCinsiyet(ECinsiyet cinsiyet) {
        return repository.findAllByECinsiyetContainingIgnoreCase(cinsiyet);
    }
}
