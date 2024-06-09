package com.cagri.cagrigumuskaptan_javahs1.repository;

import com.cagri.cagrigumuskaptan_javahs1.entity.Urun;
import com.cagri.cagrigumuskaptan_javahs1.utility.enums.EBeden;
import com.cagri.cagrigumuskaptan_javahs1.utility.enums.ECinsiyet;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UrunRepository extends JpaRepository<Urun, Long> {

    List<Urun> findAllByCinsiyetContainingAndBedenContaining(ECinsiyet cinsiyet, EBeden beden);

}
