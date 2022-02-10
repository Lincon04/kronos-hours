package com.kronos.hours.mock;

import com.kronos.hours.DTOS.PerfisDeAcesso;

import java.util.ArrayList;
import java.util.List;

public class MockPerfilDeAcesso {

    public static PerfisDeAcesso ADIMINISTRADOR = new PerfisDeAcesso(1, "ADIMINISTRADOR");
    public static PerfisDeAcesso DESENVOLVEDORES = new PerfisDeAcesso(2, "DESENVOLVEDORES");
    public static PerfisDeAcesso CLIENTE_EMPRESA = new PerfisDeAcesso(3, "CLIENTE_EMPRESA");

    public static List<PerfisDeAcesso> perfis = new ArrayList<>();

    public static List<PerfisDeAcesso> getAll(){
        perfis.add(ADIMINISTRADOR);
        perfis.add(DESENVOLVEDORES);
        perfis.add(CLIENTE_EMPRESA);
        return perfis;
    }

    public static PerfisDeAcesso getPorId(Integer id){
        for(PerfisDeAcesso p: getAll()){
            if(p.getId().equals(id)) return p;
        }
        return null;
    }
}
