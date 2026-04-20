/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.com.ifba.atividade08.main;

import br.com.ifba.atividade08.classes.LogAuditoria;
import br.com.ifba.atividade08.classes.PerfilUsuario;
import br.com.ifba.atividade08.classes.Sessao;
import br.com.ifba.atividade08.classes.Usuario;
import java.util.ArrayList;
import java.util.List;

public class MainSistema {

    public static void main(String[] args) {

        //CRIA PERFIL
        List<String> permissao = new ArrayList<>();
        permissao.add("ACESSO_TOTAL");
        PerfilUsuario perfilAdmin = new PerfilUsuario(1L, "Administrador", permissao);

        //CRIAR USUÁRIO
        Usuario evandro = new Usuario(10L, perfilAdmin, "evandro", "evandro@gmail.com", "1234", true);

        //FAZER LOGIN
        LogAuditoria logLogin = evandro.logar("1234", "PC-EVANDRO");

        //CRIAR SESSÃO 
        Sessao sessaoEvandro = evandro.criarSessao();

        //IMPRIMIR
        System.out.println("=== TESTE DOS RELACIONAMENTOS ===");
        System.out.println(perfilAdmin.toString());
        System.out.println(evandro.toString());
        System.out.println(logLogin.toString());
        System.out.println(sessaoEvandro.toString());
    }
}
