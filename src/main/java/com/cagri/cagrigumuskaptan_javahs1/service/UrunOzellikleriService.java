package com.cagri.cagrigumuskaptan_javahs1.service;

import com.cagri.cagrigumuskaptan_javahs1.dto.request.UrunOzellikleriSaveRequestDto;
import com.cagri.cagrigumuskaptan_javahs1.entity.UrunOzellikleri;
import com.cagri.cagrigumuskaptan_javahs1.mapper.UrunOzellikleriMapper;
import com.cagri.cagrigumuskaptan_javahs1.repository.UrunOzellikleriRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UrunOzellikleriService {
    private final UrunOzellikleriRepository repository;



    public UrunOzellikleri save(UrunOzellikleriSaveRequestDto dto) {
        return repository.save(UrunOzellikleriMapper.INSTANCE.fromUrunOzellikleriSaveDto(dto));
    }

    public List<UrunOzellikleri> findByKategoriAdiAndOzellikAdi(String kategoriAdi, String ozellikAdi) {
        return repository.findByKategoriAdiAndOzellikAdi(kategoriAdi, ozellikAdi);
    }

    public List<UrunOzellikleri> findByKategoriAdi(String kategoriAdi) {
        return repository.findByKategoriAdi(kategoriAdi);
    }

    public List<UrunOzellikleri> findAll() {
        return repository.findAll();
    }

    public List<UrunOzellikleri> findByOzellikAdi(String ozellikAdi) {
        return repository.findByOzellikAdi(ozellikAdi);
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
