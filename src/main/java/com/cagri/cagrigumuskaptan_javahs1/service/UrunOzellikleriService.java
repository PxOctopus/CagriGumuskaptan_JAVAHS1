package com.cagri.cagrigumuskaptan_javahs1.service;

import com.cagri.cagrigumuskaptan_javahs1.dto.request.UrunOzellikleriSaveRequestDto;
import com.cagri.cagrigumuskaptan_javahs1.entity.UrunOzellikleri;
import com.cagri.cagrigumuskaptan_javahs1.mapper.UrunOzellikleriMapper;
import com.cagri.cagrigumuskaptan_javahs1.repository.UrunOzellikleriRepository;
import com.cagri.cagrigumuskaptan_javahs1.utility.enums.EBeden;
import com.cagri.cagrigumuskaptan_javahs1.utility.enums.ECinsiyet;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class UrunOzellikleriService {
    private final UrunOzellikleriRepository repository;
    private final UrunService urunService;

    

    public UrunOzellikleri save(UrunOzellikleriSaveRequestDto dto) {
        return repository.save(UrunOzellikleriMapper.INSTANCE.fromUrunOzellikleriSaveDto(dto));
    }


    public List<UrunOzellikleri> getListedProperties() {
        List<UrunOzellikleri> urunOzellikleriList = urunService.

        urunOzellikleriList.add(new UrunOzelliklerisA("Beden",
                Arrays.stream(EBeden.values())
                        .map(Enum::name)
                        .collect(Collectors.toList())));

        urunOzellikleriList.add(new UrunOzellikleri("Cinsiyet",
                Arrays.stream(ECinsiyet.values())
                        .map(Enum::name)
                        .collect(Collectors.toList())));

        return repository.;
    }
}
