package main.modulos.ExpressoesRegulares.domain.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Operators {
    
    public static ArrayList<String> union (ArrayList<String> l1, ArrayList<String> l2){
        l1.addAll(l2);
        
        ArrayList<String> list = new ArrayList<String>(new HashSet<>(l1));
        Collections.sort(list);
        return list;
    }

    public static ArrayList<String> concatenate (ArrayList<String> l1, ArrayList<String> l2){
        ArrayList<String> l3 = new ArrayList<String>();
        
        for (int i = 0; i < l1.size(); i++) {
            for (int j = 0; j < l2.size(); j++) {
                l3.add(l1.get(i).concat(l2.get(j)));
            }
        }

        ArrayList<String> list = new ArrayList<String>(new HashSet<>(l3));
        Collections.sort(list);      
        return list;
    }

    public static ArrayList<String> kleeneClosure(ArrayList<String> l1){
        int chain = 3;
        ArrayList<String> l2 = new ArrayList<String>();
        l2.addAll(l1);
        for (int i = 0; i < chain; i++) {
            l2.addAll(kleene(l2, i));
        }
        
        ArrayList<String> list = new ArrayList<String>(new HashSet<>(l2));
        Collections.sort(list);

        return list;
    }

    private static ArrayList<String> kleene(ArrayList<String> t1, int cont){
        if (cont == 0) {
            return t1;
        } else {
            ArrayList<String> t2 = new ArrayList<String>();
            for (int i = 0; i < t1.size(); i++) {
                for (int j = 0; j < t1.size(); j++) {
                    t2.add(t1.get(i).concat(t1.get(j)));
                }
            }
            cont--;
            return t2;
        }
    }
}
