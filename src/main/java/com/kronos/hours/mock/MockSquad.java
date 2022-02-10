package com.kronos.hours.mock;

import com.kronos.hours.DTOS.Squad;

import java.util.ArrayList;
import java.util.List;

public class MockSquad {

    public static Squad squad1 = new Squad();
    public static Squad squad2 = new Squad();


    public static List<Squad> squadList = new ArrayList<>();

    public static List<Squad> getAll(){

        MockSquad.squad1.setId(1);
        MockSquad.squad1.setNome("squad1");
        MockSquad.squad1.setDesenvolvedores(MockUsuario.getAllUsuarios());
        MockSquad.squad1.setClienteEmpresa(MockClienteEmpresa.getPorId(1));

        MockSquad.squad1.setId(2);
        MockSquad.squad1.setNome("squad2");
        MockSquad.squad1.setDesenvolvedores(MockUsuario.getAllUsuarios());
        MockSquad.squad1.setClienteEmpresa(MockClienteEmpresa.getPorId(2));

        MockSquad.squadList.add(squad1);
        MockSquad.squadList.add(squad2);

        return squadList;
    }

    public static Squad getPorId(Integer id){

        for(Squad s: getAll()){
            if(s.getId().equals(id)) return s;
        }

        return null;
    }


}
