package br.com.ifba.atividade06.main;
import br.com.ifba.atividade06.classes.ContaBanco;

public class MainBanco {
    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(1111);
        p1.setDono("Jubileu");
        p1.abrirConta("CC"); 
        
        p1.depositar(100);    
        p1.pagarMensal();     // 138 (150 - 12)
        p1.sacar(138);       
        p1.fecharConta();     
        
        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(2222);
        p2.setDono("Creusa");
        p2.abrirConta("CP"); 
        
        p2.depositar(500);    
        p2.sacar(100);      
        p2.pagarMensal();     // 530 (550 - 20)
        
        p1.estadoAtual();
        p2.estadoAtual();
    }
}
