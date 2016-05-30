package com.alura.designpatterns.modulo2fazer.capitulo6.bridgesandadapters;

import java.io.InputStream;
import java.net.URL;

/**
 * Created by XM0V on 30/05/16.
 */
public class ProgramaBridge {

    // Lidando com sistemas de terceiros

    // Código do mapa (GoogleMaps e MapLink) deve ser isolado para ser utilizado no sistema

    public static void main(String[] args) throws Exception{

        // pegar um mapa

        String googleMaps = "http://maps.google.com.br/maps?q=rua+vergueiro";
        URL url = new URL(googleMaps);
        InputStream openStream = url.openStream();

        //

    }

}
