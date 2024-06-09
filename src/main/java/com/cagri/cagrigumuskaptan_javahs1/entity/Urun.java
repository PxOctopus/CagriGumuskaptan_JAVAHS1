package com.cagri.cagrigumuskaptan_javahs1.entity;

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


    @ManyToOne(cascade = CascadeType.ALL)
    private Marka marka;

    @OneToOne
    private Model model;
}
