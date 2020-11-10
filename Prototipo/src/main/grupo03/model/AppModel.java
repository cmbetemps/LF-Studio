package main.grupo03.model;

import com.google.gson.Gson;

/**
 *
 * @author Grupo-03
 */
public abstract class AppModel {
    private Gson json;
    private boolean statusOK;
    public enum Tooltip{AFND, AFD, AP, ER, GR, GLC, MT};
    
}
