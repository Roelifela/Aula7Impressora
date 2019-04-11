package br.com.digitalhouse;

public class Foto implements Imprimivel{

    public String fotoNome;
    public String tipo;

    public Foto (String nomeFoto, String tipoFoto){

        fotoNome = nomeFoto;
        tipo = tipoFoto;
    }


    public String getFotoNome() {
        return fotoNome;
    }

    public void setFotoNome(String fotoNome) {
        this.fotoNome = fotoNome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public void imprimir() {
        System.out.println("Sou uma Selfie do " + getFotoNome() + "do tipo " + getTipo());
    }
}
