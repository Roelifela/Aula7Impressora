package br.com.digitalhouse;

import java.util.ArrayList;
import java.util.List;

public class Impressora{

    List<Imprimivel> imprimiveis = new ArrayList<>();


    public void imprimirTudo(){

        for (Imprimivel imprimivel : imprimiveis) {
            imprimivel.imprimir();
        }
    }

    public void adicionarImprimivel(Imprimivel imprimivel){

        imprimiveis.add(imprimivel);

    }



}
