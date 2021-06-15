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

public class ClienteDAO {
// a conexao com o banco de dados

    private Connection connection;

    public ClienteDAO() {
        try {
            this.connection = ConnectionFactory.getConnection();
        } catch (Exception e) {
            System.out.println("Erro na abertura do banco de dados: " + e.getMessage());
        }
    }

    public List<Cliente> getListar() {

        try {
            String sql = "SELECT * FROM CLIENTE";
            PreparedStatement stmt = this.connection.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            List<Cliente> clientes = new ArrayList<Cliente>();

//            stmt.setString(1, c.getPrimeiroNome());
//            stmt.setString(2, c.getUltimoNome());
//            stmt.setString(3, c.getCPF());
            while (rs.next()) {
// criando o objeto Contato
                Cliente cliente = new Cliente();
                cliente.setId(rs.getInt("id"));
                cliente.setPrimeiroNome(rs.getString("primeiro_nome"));
                cliente.setUltimoNome(rs.getString("ultimo_nome"));
                cliente.setCPF(rs.getString("CPF"));
                cliente.setNomeRua(rs.getString("nome_da_rua"));
                cliente.setNumCasa(rs.getString("numero_da_casa"));
                cliente.setComplemento(rs.getString("complemento"));
                cliente.setCEP(rs.getString("CEP"));
                cliente.setBairro(rs.getString("bairro"));
                cliente.setCidade(rs.getString("cidade"));
// adicionando o objeto a lista
                clientes.add(cliente);
            }

            stmt.execute();
            rs.close();
            stmt.close();
            return clientes;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public void adiciona(Cliente cliente) {
        String sql = "insert into CLIENTE (primeiro_nome,ultimo_nome,CPF,nome_da_rua,numero_da_casa,complemento,CEP,bairro,cidade) values (?,?,?,?,?,?,?,?,?)";

        try {
// prepared statement para insercao
            PreparedStatement stmt = connection.prepareStatement(sql);

            stmt.setString(1, cliente.getPrimeiroNome());
            stmt.setString(2, cliente.getUltimoNome());
            stmt.setString(3, cliente.getCPF());
            stmt.setString(4, cliente.getNomeRua());
            stmt.setString(5, cliente.getNumCasa());
            stmt.setString(6, cliente.getComplemento());
            stmt.setString(7, cliente.getCEP());
            stmt.setString(8, cliente.getBairro());
            stmt.setString(9, cliente.getCidade());
// executa
            stmt.execute();
            stmt.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void altera(Cliente cliente) {
        String sql = "update CLIENTE set primeiro_nome=?, ultimo_nome=?, CPF=?, nome_da_rua=?, numero_da_casa=?,complemento=?, CEP=?, bairro=?, cidade=? " + " WHERE id=? ";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, cliente.getPrimeiroNome());
            stmt.setString(2, cliente.getUltimoNome());
            stmt.setString(3, cliente.getCPF());
            stmt.setString(4, cliente.getNomeRua());
            stmt.setString(5, cliente.getNumCasa());
            stmt.setString(6, cliente.getComplemento());
            stmt.setString(7, cliente.getCEP());
            stmt.setString(8, cliente.getBairro());
            stmt.setString(9, cliente.getCidade());
            stmt.setInt(10, cliente.getId());
            
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void remove(Cliente cliente) {
        try {
            PreparedStatement stmt = connection.prepareStatement("delete from CLIENTE where CPF=? AND id=? ");
            stmt.setString(1, cliente.getCPF());
            stmt.setInt(2, cliente.getId());
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
