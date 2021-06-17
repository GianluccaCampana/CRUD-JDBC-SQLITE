/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import conexao.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.Carro;
import modelo.Cliente;
import modelo.Locacao;

/**
 *
 * @author Lider
 */
public class locacaoDAO {

    private Connection connection;

    public locacaoDAO() {
        try {
            this.connection = ConnectionFactory.getConnection();
        } catch (Exception e) {
            System.out.println("Erro na abertura do banco de dados: " + e.getMessage());
        }
    }

    public List<Carro> getListar() {        
         
        try {
            String sql = "SELECT * FROM CARRO WHERE disponibilidade='SIM'";
            PreparedStatement stmt = this.connection.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            List<Carro> carros = new ArrayList<Carro>();
            

            while (rs.next()) {
// criando o objeto Contato
                Carro carro = new Carro();
                carro.setId(rs.getInt("id"));
                carro.setMarca(rs.getString("marca"));
                carro.setModelo(rs.getString("modelo"));
                carro.setPlaca(rs.getString("placa"));
                carro.setChassi(rs.getString("chassi"));
                carro.setDisponibilidade(rs.getString("disponibilidade"));
                carro.setValor(rs.getString("valor"));
// adicionando o objeto a lista
                carros.add(carro);
            }
            
            stmt.execute();
            rs.close();
            stmt.close();
            return carros;
            
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        
    }
    
     public void adiciona(Locacao locacao) {
        String sql = "insert into LOCACAO (idCarro,CPF,dataLocacao, dataDevolucao) values (?,?,?,?);";
        String sql2 =  "UPDATE CARRO SET disponibilidade='NAO' WHERE id=?";
        try {
            // prepared statement para insercao
            PreparedStatement stmt = connection.prepareStatement(sql);

            stmt.setInt(1, locacao.getIdCarro());
            stmt.setString(2, locacao.getCPF());
            stmt.setString(3, locacao.getDataLocacao());
            stmt.setString(4, locacao.getDataLocacao());
            
            
            PreparedStatement stmt2 = connection.prepareStatement(sql2);
            stmt2.setInt(1, locacao.getIdCarro());

            // executa
            stmt.execute();
            stmt2.execute();
            stmt.close();
            stmt2.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
     
//     public List<Locacao> listarLocacoes() {        
//         
//        try {
//            String sql = "SELECT l.id, c.CPF, c.primeiro_nome, c.ultimo_nome, ca.marca, ca.modelo, ca.valor  " 
//                    + "FROM LOCACAO l INNER JOIN CLIENTE c ON l.CPF = c.CPF " 
//                    + "INNER JOIN CARRO ca ON l.idCarro = ca.id;";
//            
//            
//            
//            PreparedStatement stmt = this.connection.prepareStatement(sql);
//            ResultSet rs = stmt.executeQuery();
//            List<Cliente> clientes = new ArrayList<>();
//            List<Carro> carros = new ArrayList<>();
//            List<Locacao> locacoes = new ArrayList<>();
//            
//
//            while (rs.next()) {
//
//                Locacao locacao = new Locacao();
//                Carro carro = new Carro();
//                Cliente cliente = new Cliente();
//                locacao.setId(rs.getInt("id"));
//                cliente.setCPF(rs.getString("CPF"));
//                cliente.setPrimeiroNome(rs.getString("primeiro_nome"));
//                cliente.setUltimoNome(rs.getString("ultimo_nome"));
//                carro.setMarca(rs.getString("marca"));
//                carro.setModelo(rs.getString("modelo"));
//                carro.setValor(rs.getString("valor"));
//                
//
//                
//            }
//            
//            stmt.execute();
//            rs.close();
//            stmt.close();
//            return locacoes;
//            
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
        
//    }
     
     public List<Locacao> listarAlugados() {        
         
        try {
            String sql = "SELECT * FROM LOCACAO";
            PreparedStatement stmt = this.connection.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            List<Locacao> locacoes = new ArrayList<>();
            

            while (rs.next()) {
                Locacao locacao = new Locacao();
                locacao.setId(rs.getInt("id"));
                locacao.setIdCarro(rs.getInt("idCarro"));
                locacao.setCPF(rs.getString("CPF"));
                locacao.setDataLocacao("dataLocacao");
                locacao.setDataDevolucao("dataDevolucao");
                
                locacoes.add(locacao);
                
            }
            
            stmt.execute();
            rs.close();
            stmt.close();
            return locacoes;
            
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        
    }

}
