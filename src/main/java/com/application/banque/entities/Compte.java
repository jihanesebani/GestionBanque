package com.application.banque.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Setter
@Getter
@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
public class Compte implements Serializable {
    @Id
    private String num_compte;
    @NonNull
    private Date date_ouverture;
    @OneToOne(mappedBy = "compte")
    @NonNull
    private Client client;
    @OneToMany(mappedBy = "compte", cascade = CascadeType.ALL)
    private List<Operation> operations = null;

}
