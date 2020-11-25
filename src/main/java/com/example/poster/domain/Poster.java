package com.example.poster.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter @Setter
@Entity
@Table(name="POSTER_MAIN", schema = "bizmiso")
public class Poster {

    @Id
    @GeneratedValue
    @Column(name = "POSTER_NO")
    private Long posterNo;

    @Column(name="POSTER_TITLE")
    private String posterTitle;

    @Column(name="POSTER_CONTENT")
    private String posterContent;

    @Column(name="POSTER_TYPE")
    private Long posterType;

    @Column(name="POSTER_REGIST_DT")
    private Date posterRegistDt;

    @Column(name="POSTER_REGISTER")
    private Long posterRegister;

    @Column(name="POSTER_UPDT_USR")
    private Long posterUpdtUsr;

    @Column(name="POSTER_UPDT_DT")
    private Date posterUpdtDt;

    @Column(name="POSTER_IMG_PATH")
    private String posterImgPath;

}
