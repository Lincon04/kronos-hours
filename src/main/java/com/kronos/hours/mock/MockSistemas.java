package com.kronos.hours.mock;

import com.kronos.hours.DTOS.Sistemas;

import java.util.ArrayList;
import java.util.List;

public class MockSistemas {

    public static Sistemas sistema1 = new Sistemas();
    public static Sistemas sistema2 = new Sistemas();
    public static Sistemas sistema3 = new Sistemas();
    public static Sistemas sistema4 = new Sistemas();

    public static List<Sistemas> sistemasList = new ArrayList<>();

    public static List<Sistemas> getAll(){
        sistemasList.add(sistema1);
        sistemasList.add(sistema2);
        sistemasList.add(sistema3);
        sistemasList.add(sistema4);
        return sistemasList;
    }

    public static Sistemas getPorId(Integer id){
        for(Sistemas s: getAll()){
            if(s.getId().equals(id)) return s;
        }
        return null;
    }
}
