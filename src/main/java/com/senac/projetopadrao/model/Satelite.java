package com.senac.projetopadrao.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Satelite implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idSatelite;

    public int getIdSatelite() {
        return idSatelite;
    }

    public void setIdSatelite(int idSatelite) {
        this.idSatelite = idSatelite;
    }
}
