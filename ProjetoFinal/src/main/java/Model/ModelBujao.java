/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author drico
 */
@Entity
@Table(name = "Bujao")
public class ModelBujao implements Serializable {
    
    @Id    
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String tipo;
    private double preco;

    public ModelBujao() {
    }

    public ModelBujao(String tipo, double preco) {
        this.tipo = tipo;
        this.preco = preco;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Tipo:" + tipo + ", preco: R$ " + preco;
    }

    public int getID() {
        return id;
    }

//    public void setID(int id) {
//        this.id = ID;
//    }
    
    
    
}
