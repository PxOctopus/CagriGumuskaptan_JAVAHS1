package com.cagri.cagrigumuskaptan_javahs1.service;

import com.cagri.cagrigumuskaptan_javahs1.dto.request.UrunOzellikleriSaveRequestDto;
import com.cagri.cagrigumuskaptan_javahs1.entity.UrunOzellikleri;
import com.cagri.cagrigumuskaptan_javahs1.mapper.UrunOzellikleriMapper;
import com.cagri.cagrigumuskaptan_javahs1.repository.UrunOzellikleriRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UrunOzellikleriService {
    private final UrunOzellikleriRepository repository;
    private final UrunService urunService;


    public UrunOzellikleri save(UrunOzellikleriSaveRequestDto dto) {
        return repository.save(UrunOzellikleriMapper.INSTANCE.fromUrunOzellikleriSaveDto(dto));
    }


//    public List<UrunOzellikleri> getUrunByIdAndListProperties(Long id){
//       Optional<Urun> urun = urunService.getUrunById(id);
//       if (Objects.isNull(urun))
//           throw new UrunException(ErrorType.PRODUCT_NOT_FOUND_ERROR);
//       urun.urunOzellikleriListesiGetir();
//       List<UrunOzellikleri> urunOzellikleriList = new ArrayList<>();
//        urunOzellikleriList.add(urun.getUrunOzellikleri());
//
//        urunOzellikleriList.add(new UrunOzellikleri("Cinsiyet",
//                Arrays.stream(ECinsiyet.values())
//                        .map(Enum::name)
//                        .collect(Collectors.toList())));
//    }


}
