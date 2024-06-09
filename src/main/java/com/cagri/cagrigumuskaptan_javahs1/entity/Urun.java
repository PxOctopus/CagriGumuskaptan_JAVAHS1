package com.cagri.cagrigumuskaptan_javahs1.entity;

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


    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Marka marka;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Model model;

    @OneToMany(mappedBy = "urun", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<UrunOzellikleri> urunOzellikleriListesi;
}
