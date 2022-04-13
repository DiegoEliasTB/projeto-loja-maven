package com.diego.projet.loja.maven.model.bo;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "bairro")
public class Bairro {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idBairro;
    
    @Column
    private String descricaoBairro;

    public Bairro() {
    }

    public Bairro(int idBairro, String descricaoBairro) {
        this.idBairro = idBairro;
        this.descricaoBairro = descricaoBairro;
    }
    
    public int getIdBairro() {
        return idBairro;
    }

    public void setIdBairro(int idBairro) {
        this.idBairro = idBairro;
    }

    public String getDescricaoBairro() {
        return descricaoBairro;
    }

    public void setDescricaoBairro(String descricaoBairro) {
        this.descricaoBairro = descricaoBairro;
    }

    @Override
    public String toString() {
        return this.getIdBairro() + "," + this.getDescricaoBairro();
    }
     
}
