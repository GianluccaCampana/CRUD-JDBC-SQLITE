/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import conexao.ConnectionFactory;
import modelo.*;

public class CarroDAO {

    // a conexao com o banco de dados
    private Connection connection;

    public CarroDAO() {
        try {
            this.connection = ConnectionFactory.getConnection();
        } catch (Exception e) {
            System.out.println("Erro na abertura do banco de dados: " + e.getMessage());
        }
    }

    public List<Carro> getListar() {        
         
        try {
            String sql = "SELECT * FROM CARRO";
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

    public void adiciona(Carro carro) {
        String sql = "insert into CARRO (marca,modelo,placa,chassi,disponibilidade,valor) values (?,?,?,?,?,?)";
        try {
            // prepared statement para insercao
            PreparedStatement stmt = connection.prepareStatement(sql);

            stmt.setString(1, carro.getMarca());
            stmt.setString(2, carro.getModelo());
            stmt.setString(3, carro.getPlaca());
            stmt.setString(4, carro.getChassi());
            stmt.setString(5, carro.getDisponibilidade());
            stmt.setString(6, carro.getValor());

            // executa
            stmt.execute();
            stmt.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void altera(Carro carro) {
        String sql = "update CARRO set marca =?, modelo=?, placa=?, chassi=?, disponibilidade=?, valor=?" + " WHERE id =?";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, carro.getMarca());
            stmt.setString(2, carro.getModelo());
            stmt.setString(3, carro.getPlaca());
            stmt.setString(4, carro.getChassi());
            stmt.setString(5, carro.getDisponibilidade());
            stmt.setString(6, carro.getValor());
            stmt.setInt(7, carro.getId());
            
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void remove(Carro carro) {
        try {
            PreparedStatement stmt = connection.prepareStatement("delete from CARRO WHERE id=? AND placa=?");
            
            stmt.setInt(1, carro.getId());
            stmt.setString(2, carro.getPlaca());
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
