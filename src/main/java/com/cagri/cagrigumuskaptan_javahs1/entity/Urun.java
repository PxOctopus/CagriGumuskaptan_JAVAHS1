package com.cagri.cagrigumuskaptan_javahs1.entity;

import com.cagri.cagrigumuskaptan_javahs1.utility.enums.EBeden;
import com.cagri.cagrigumuskaptan_javahs1.utility.enums.ECinsiyet;
import com.cagri.cagrigumuskaptan_javahs1.utility.enums.ERenk;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data // get,set toString
@AllArgsConstructor // parametreli constructorlarin tumu
@NoArgsConstructor // default constructor
@Builder
@Entity
@Table(name = "tbl_urun")
public class Urun {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // id icin otomatik artan
    private Long id;
    private String ad;
    private String aciklama;
    private String anaResimUrl;
    private String resimUrl1;
    private String resimUrl2;
    private String resimUrl3;
    private Integer stokAdedi;
    private Double urunFiyati;

    @Enumerated(EnumType.STRING)
    private ECinsiyet cinsiyet;
    @Enumerated(EnumType.STRING)
    private EBeden beden;
    @Enumerated(EnumType.STRING)
    private ERenk renk;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Marka marka;


    @OneToMany(mappedBy = "urun", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<UrunOzellikleri> urunOzellikleriListesi;
}
