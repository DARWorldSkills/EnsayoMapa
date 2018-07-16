package com.davidpopayan.sena.pruebamapazulema;

public class DireccionFinder {
    private static  final  String Direccion_URl_Api = "https://maps.googleapis.com/maps/api/directions/json?";
    private static final String GoogleApiKey = "AIzaSyAH13O78vwTFo_qS1DfiJ_HW8JLLl7iUl4";

    private DireccionFinderListener listener;
    private String origen;
    private String destino;


    public DireccionFinder(DireccionFinderListener listener, String origen, String destino) {
        this.listener = listener;
        this.listener = origen;
        this.listener = destino;
    }
}
}
