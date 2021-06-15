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
public class Cliente {

    private String primeiroNome, ultimoNome, CPF;
    private String nomeRua, numCasa, complemento, CEP, bairro, cidade;
    private int id;

    public Cliente(String CPF, int id) {
        //para exclusão
        this.CPF = CPF;
        this.id = id;
    }

    public Cliente(String primeiroNome, String ultimoNome, String CPF, String nomeRua, String numCasa, String complemento, String CEP, String bairro, String cidade, int id) {
        //para atualização
        this.primeiroNome = primeiroNome;
        this.ultimoNome = ultimoNome;
        this.CPF = CPF;
        this.nomeRua = nomeRua;
        this.numCasa = numCasa;
        this.complemento = complemento;
        this.CEP = CEP;
        this.bairro = bairro;
        this.cidade = cidade;
        this.id = id;
    }
    
    
    
    

    public Cliente(String primeiroNome, String ultimoNome, String CPF, String nomeRua, String numCasa, String complemento, String CEP, String bairro, String cidade) {
        this.primeiroNome = primeiroNome;
        this.ultimoNome = ultimoNome;
        this.CPF = CPF;
        this.nomeRua = nomeRua;
        this.numCasa = numCasa;
        this.complemento = complemento;
        this.CEP = CEP;
        this.bairro = bairro;
        this.cidade = cidade;
    }
    
    public Cliente(String primeiroNome, String ultimoNome, String CPF){
        // construtor para pesquisa
        this.primeiroNome = primeiroNome;
        this.ultimoNome = ultimoNome;
        this.CPF = CPF;
    }

    public Cliente() {
     
    }
    
    public Cliente(int id){
        // para exclusao
        this.id = id;
    }

    /**
     * @return the primeiroNome
     */
    public String getPrimeiroNome() {
        return primeiroNome;
    }

    /**
     * @param primeiroNome the primeiroNome to set
     */
    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    /**
     * @return the ultimoNome
     */
    public String getUltimoNome() {
        return ultimoNome;
    }

    /**
     * @param ultimoNome the ultimoNome to set
     */
    public void setUltimoNome(String ultimoNome) {
        this.ultimoNome = ultimoNome;
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
     * @return the nomeRua
     */
    public String getNomeRua() {
        return nomeRua;
    }

    /**
     * @param nomeRua the nomeRua to set
     */
    public void setNomeRua(String nomeRua) {
        this.nomeRua = nomeRua;
    }

    /**
     * @return the numCasa
     */
    public String getNumCasa() {
        return numCasa;
    }

    /**
     * @param numCasa the numCasa to set
     */
    public void setNumCasa(String numCasa) {
        this.numCasa = numCasa;
    }

    /**
     * @return the complemento
     */
    public String getComplemento() {
        return complemento;
    }

    /**
     * @param complemento the complemento to set
     */
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    /**
     * @return the CEP
     */
    public String getCEP() {
        return CEP;
    }

    /**
     * @param CEP the CEP to set
     */
    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    /**
     * @return the bairro
     */
    public String getBairro() {
        return bairro;
    }

    /**
     * @param bairro the bairro to set
     */
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    /**
     * @return the cidade
     */
    public String getCidade() {
        return cidade;
    }

    /**
     * @param cidade the cidade to set
     */
    public void setCidade(String cidade) {
        this.cidade = cidade;
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

    @Override
    public String toString() {
        return "Cliente{" + "primeiroNome=" + primeiroNome + ", ultimoNome=" + ultimoNome + ", CPF=" + CPF + ", nomeRua=" + nomeRua + ", numCasa=" + numCasa + ", complemento=" + complemento + ", CEP=" + CEP + ", bairro=" + bairro + ", cidade=" + cidade + ", id=" + id + '}';
    }

    
}
