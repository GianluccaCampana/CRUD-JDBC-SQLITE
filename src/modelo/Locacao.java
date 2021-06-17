/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Lider
 */
public class Locacao {
    
   private int id, idCarro;
   private String CPF, dataLocacao, DataDevolucao;

    public Locacao(int id) {
        this.id = id;
    }
   
   

    public Locacao() {
    }

    public Locacao(int idCarro, String CPF, String dataLocacao, String DataDevolucao) {
        
        this.idCarro = idCarro;
        this.CPF = CPF;
        this.dataLocacao = dataLocacao;
        this.DataDevolucao = DataDevolucao;
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
     * @return the idCarro
     */
    public int getIdCarro() {
        return idCarro;
    }

    /**
     * @param idCarro the idCarro to set
     */
    public void setIdCarro(int idCarro) {
        this.idCarro = idCarro;
    }

    /**
     * @return the CPF
     */
    public String getCPF() {
        return CPF;
    }

    /**
     * @param CPF the CPF to set
     */
    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    /**
     * @return the dataLocacao
     */
    public String getDataLocacao() {
        return dataLocacao;
    }

    /**
     * @param dataLocacao the dataLocacao to set
     */
    public void setDataLocacao(String dataLocacao) {
        this.dataLocacao = dataLocacao;
    }

    /**
     * @return the DataDevolucao
     */
    public String getDataDevolucao() {
        return DataDevolucao;
    }

    /**
     * @param DataDevolucao the DataDevolucao to set
     */
    public void setDataDevolucao(String DataDevolucao) {
        this.DataDevolucao = DataDevolucao;
    }

    @Override
    public String toString() {
        return "Locacao{" + "id=" + id + ", idCarro=" + idCarro + ", CPF=" + CPF + ", dataLocacao=" + dataLocacao + ", DataDevolucao=" + DataDevolucao + '}';
    } 
   
    
    
    
}
