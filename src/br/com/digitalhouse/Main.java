package br.com.digitalhouse;

public class Main {

    public static void main(String[] args) {

        Contrato meuContrato = new Contrato("Contrato do Rodrigo", "PJ");
        Foto minhaFoto = new Foto("Foto do Rodrigo", "15x10 color");
        Documento meuDocumento = new Documento("Documento do Rodrigo", "Contrato Social");

        Impressora impressora = new Impressora();
        impressora.adicionarImprimivel(meuContrato);
        impressora.adicionarImprimivel(minhaFoto);
        impressora.adicionarImprimivel(meuDocumento);

        impressora.imprimirTudo();



    }


}
