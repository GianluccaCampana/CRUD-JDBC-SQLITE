/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacao;

import conexao.ConnectionFactory;
import static conexao.ConnectionFactory.checkDatabase;
import view.ViewPrincipal;

/**
 *
 * @author Lider
 */
public class Aplicacao {
    
    public static void main(String[] args) throws Exception  {
        
       
        
        ViewPrincipal view = new ViewPrincipal();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewPrincipal().setVisible(true);
            }
        });
    }
    
    
}
