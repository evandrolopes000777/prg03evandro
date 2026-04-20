/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade08.classes;

import java.time.LocalDateTime;
import java.util.UUID;

public class Usuario {
    private Long id;
    private PerfilUsuario perfil;
    private String nomeUsuario;
    private String email;
    private String senha;
    private LocalDateTime ultimoLogin;
    private Boolean ativo;

    public Usuario(Long id, PerfilUsuario perfil, String nomeUsuario, String email, String senha, Boolean ativo) {
        this.id = id;
        this.perfil = perfil;
        this.nomeUsuario = nomeUsuario;
        this.email = email;
        this.senha = senha;
        this.ativo = ativo;
    }

    // Tenta realizar o login e retorna um Log do que aconteceu
    public LogAuditoria logar(String senhaDigitada, String ipOrigem) {
        if (this.senha.equals(senhaDigitada)) {
            this.ultimoLogin = LocalDateTime.now();
            return new LogAuditoria(System.currentTimeMillis(), this, "Login efetuado com sucesso", this.ultimoLogin, ipOrigem);
        } else {
            return new LogAuditoria(System.currentTimeMillis(), this, "Falha no login: Senha incorreta", LocalDateTime.now(), ipOrigem);
        }
    }

    // Gera uma nova sessão com um token aleatório
    public Sessao criarSessao() {
        String tokenUnico = UUID.randomUUID().toString().toUpperCase();
        return new Sessao(System.currentTimeMillis(), this, tokenUnico);
    }

    //GETTERS E SETTERS
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public PerfilUsuario getPerfil() { return perfil; }
    public void setPerfil(PerfilUsuario perfil) { this.perfil = perfil; }

    public String getNomeUsuario() { return nomeUsuario; }
    public void setNomeUsuario(String nomeUsuario) { this.nomeUsuario = nomeUsuario; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getSenha() { return senha; }
    public void setSenha(String senha) { this.senha = senha; }

    public LocalDateTime getUltimoLogin() { return ultimoLogin; }
    public void setUltimoLogin(LocalDateTime ultimoLogin) { this.ultimoLogin = ultimoLogin; }

    public Boolean getAtivo() { return ativo; }
    public void setAtivo(Boolean ativo) { this.ativo = ativo; }

    @Override
    public String toString() {
        return "Usuario: " + nomeUsuario + " [Perfil: " + perfil.getDescricao() + "] - Ativo: " + ativo;
    }
}