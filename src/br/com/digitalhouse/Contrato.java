package br.com.digitalhouse;

public class Contrato implements Imprimivel {

    public String nome;
    public String tipo;

    public Contrato(String nomeContrato, String tipoContrato){

        nome = nomeContrato;
        tipo = tipoContrato;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }


    @Override
    public void imprimir() {

        System.out.println("Sou um contrato do" + getNome() + " do tipo " + getTipo());

    }
}
