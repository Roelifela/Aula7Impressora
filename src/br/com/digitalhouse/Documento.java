package br.com.digitalhouse;

public class Documento implements Imprimivel {

    public String documentoNome;
    public String documentoTipo;

    public Documento (String nomeDocumento, String tipoDocumento){

        documentoNome = nomeDocumento;
        documentoTipo = tipoDocumento;

    }

    public String getDocumentoNome() {
        return documentoNome;
    }

    public void setDocumentoNome(String documentoNome) {
        this.documentoNome = documentoNome;
    }

    public String getDocumentoTipo() {
        return documentoTipo;
    }

    public void setDocumentoTipo(String documentoTipo) {
        this.documentoTipo = documentoTipo;
    }

    @Override
    public void imprimir() {
        System.out.println("Sou um documento do Word " + getDocumentoNome() + "do tipo " + getDocumentoTipo());
    }
}
