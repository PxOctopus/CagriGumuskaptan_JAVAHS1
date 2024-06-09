package com.cagri.cagrigumuskaptan_javahs1.entity;

import com.cagri.cagrigumuskaptan_javahs1.utility.enums.EBeden;
import com.cagri.cagrigumuskaptan_javahs1.utility.enums.ECinsiyet;
import com.cagri.cagrigumuskaptan_javahs1.utility.enums.ERenk;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // get,set toString
@AllArgsConstructor // parametreli constructorlarin tumu
@NoArgsConstructor // default constructor
@Builder
@Entity
@Table(name = "tbl_urunozellikleri")
public class UrunOzellikleri {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // id icin otomatik artan
    private Long id;
    private String ozellikAdi;
    private String ozellikAciklama;
    private String kategoriAdi;
    private Double urunYildizi;

    @Enumerated(EnumType.STRING)
    private ECinsiyet cinsiyet;
    @Enumerated(EnumType.STRING)
    private EBeden beden;
    @Enumerated(EnumType.STRING)
    private ERenk renk;

    @ManyToOne
    private Urun urun;
}
