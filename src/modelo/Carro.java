/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import javax.swing.JFormattedTextField;
import javax.swing.JTextField;

public class Carro {
    
    private int id;
    private String marca, modelo, placa, chassi, disponibilidade;
    private String valor;

    public Carro(int id, String marca, String modelo, String placa, String chassi, String disponibilidade, String valor) {
        //atualização
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.chassi = chassi;
        this.disponibilidade = disponibilidade;
        this.valor = valor;
    }
    
    

   

    public Carro(String marca, String modelo, String placa) { // exclusao
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
    }

    
    
    public Carro(String marca, String modelo, String placa, String chassi, String disponibilidade, String valor) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.chassi = chassi;
        this.disponibilidade = disponibilidade;
        this.valor = valor;
    }

    public Carro() {
            }

    public Carro(int id, String placa) {
        // conntrutor para exclusão
        this.id = id;
        this.placa = placa;       
    }

   /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the placa
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * @param placa the placa to set
     */
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    /**
     * @return the chassi
     */
    public String getChassi() {
        return chassi;
    }

    /**
     * @param chassi the chassi to set
     */
    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    /**
     * @return the disponibilidade
     */
    public String getDisponibilidade() {
        return disponibilidade;
    }

    /**
     * @param disponibilidade the disponibilidade to set
     */
    public void setDisponibilidade(String disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    /**
     * @return the valor
     */
    public String getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(String valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Carro{" + "id=" + id + ", marca=" + marca + ", modelo=" + modelo + ", placa=" + placa + ", chassi=" + chassi + ", disponibilidade=" + disponibilidade + ", valor=" + valor + '}';
    }
    
    
    

}
