package com.davidpopayan.sena.pruebamapazulema;

import java.util.List;

interface DireccionFinderListener {

    void onDirectionFinderStart();
    void onDirectionFinderSuccess(List<Ruta>ruta);
}
