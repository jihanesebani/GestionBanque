package com.application.banque.entities;

import com.application.banque.enums.Type;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Operation implements Serializable {
    @Id
    private String num_operation;
    @ManyToOne
    @JoinColumn
    private Compte compte;
    private Type type_operation;


}
