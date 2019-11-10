/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author drico
 */
@Entity
@Table(name = "Venda")
public class ModelVenda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private Date data;
    
    @OneToMany
    @JoinColumn(name = "bujao_id", referencedColumnName = "id")
    private List<ModelBujao> bujoes;
    
    @OneToOne
    @JoinColumn(name = "cliente_id", referencedColumnName = "id")
    private ModelCliente modelCliente;
    
    private double valor;

    public ModelVenda() {
    }

    public ModelVenda(Date data, ModelCliente modelCliente, double valor) {
        this.data = data;
        this.modelCliente = modelCliente;
        this.valor = valor;
        this.bujoes = new ArrayList<>();
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public ModelCliente getModelCliente() {
        return modelCliente;
    }

    public void setModelCliente(ModelCliente modelCliente) {
        this.modelCliente = modelCliente;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void addBujao(ModelBujao modelBujao) {
        this.bujoes.add(modelBujao);
    }

    public void removeBujao(ModelBujao modelBujao) {
        this.bujoes.remove(modelBujao);
    }

    @Override
    public String toString() {
        String bujoesVenda = "";
        for (Object bujao : bujoes) {
            bujoesVenda += bujao.toString();
        }
        return "Data=" + data + ", bujoes=" + bujoesVenda + ", Cliente:" + modelCliente + ", valor: R$ " + valor;
    }

}
