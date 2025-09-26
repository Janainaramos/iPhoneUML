package br.com.iphoneuml.app;

import br.com.iphoneuml.model.Iphone;

public class Main {
    public static void main(String[] args) {
        Iphone meuIphone = new Iphone();

        // Reprodutor musical
        meuIphone.selecionarPlaylist("Rock Clássico");
        meuIphone.tocar("Bohemian Rhapsody");
        meuIphone.pausar();

        // Telefone
        meuIphone.ligarPara("11999999999"); // <--- nome correto do método
        meuIphone.atender();
        meuIphone.desligar();

        // Navegador
        meuIphone.abrirURL("https://www.apple.com");
        meuIphone.atualizarPagina();
        meuIphone.voltarPagina();
    }
}
