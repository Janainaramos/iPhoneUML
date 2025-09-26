package br.com.iphoneuml.model;

import br.com.iphoneuml.interfaces.*;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    private String contatoAtual;
    private String playlistAtual;
    private String urlAtual;
    private boolean tocando = false;
    private boolean emChamada = false;

    // Métodos do ReprodutorMusical
    @Override
    public void tocar(String faixa) {

        System.out.println("Tocando: " + faixa);
    }

    @Override
    public void pausar() {

            System.out.println("Reprodução pausada.");

    }

    @Override
    public void selecionarPlaylist(String playlist) {
        this.playlistAtual = playlist;
        System.out.println("Playlist selecionada: " + playlist);
    }

    // Métodos do AparelhoTelefonico
    @Override
    public void ligarPara(String numero) {
        emChamada = true;
        contatoAtual = numero;
        System.out.println("Ligando para: " + numero);
    }

    @Override
    public void atender() {
        if (!emChamada) {
            System.out.println("Chamando... atendendo.");
        } else {
            System.out.println("Chamada em andamento — atendida.");
        }
        emChamada = true;
    }

    @Override
    public void desligar() {
        if (emChamada) {
            emChamada = false;
            System.out.println("Chamada encerrada.");
            contatoAtual = null;
        } else {
            System.out.println("Não há chamada ativa.");
        }
    }

    // Métodos do NavegadorInternet
    @Override
    public void abrirURL(String url) {
        this.urlAtual = url;
        System.out.println("Abrindo URL: " + url);
    }

    @Override
    public void atualizarPagina() {
        if (urlAtual != null) {
            System.out.println("Atualizando página: " + urlAtual);
        } else {
            System.out.println("Nenhuma página aberta para atualizar.");
        }
    }

    @Override
    public void voltarPagina() {
        System.out.println("Voltando na navegação.");
    }
}

