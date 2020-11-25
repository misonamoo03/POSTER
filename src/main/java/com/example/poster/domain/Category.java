package com.example.poster.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter @Setter
@Entity
@Table(name="POSTER_CATEGORY", schema="bizmiso")
public class Category {

    @Id @GeneratedValue
    @Column(name = "CTGRY_NO")
    private Long ctgryNo;

    @Column(name = "CTGRY_NM")
    private String ctgryNm;

    @Column(name="CTGRY_REGISTER")
    private Long ctgryRegister;

    @Column(name="CTGRY_REGIST_DT")
    private Date ctgryRegistDt;

    @Column(name="CTGRY_UPDT_USR")
    private Long ctgryUpdtUsr;

    @Column(name="CTGRY_UPDT_DT")
    private Date ctgryUpdtDt;

}
