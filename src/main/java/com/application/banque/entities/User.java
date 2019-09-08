package com.application.banque.entities;

import com.application.banque.enums.Status;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable {
    @Id
    private String matricule;
    private String password;
    private String cin;
    private String nom;
    private String prenom;
    private Date date_naissance;
    private Date date_recrutement;
    private Status status;

}
