package com.application.banque.entities;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import java.io.Serializable;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
public class Client implements Serializable {

    @Id
    private String cin;
    @NonNull
    private String nom;
    @NonNull
    private String prenom;
    @NonNull
    private Date date_naissance;
    @NonNull
    private String telephone;
    @NonNull
    private String adress;
    @NonNull
    private Date date_inscription;
    @OneToOne
    @JoinColumn
    private Compte compte;

}
