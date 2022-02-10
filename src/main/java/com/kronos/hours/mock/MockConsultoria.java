package com.kronos.hours.mock;

import com.kronos.hours.DTOS.Consultoria;

import java.util.ArrayList;
import java.util.List;

public class MockConsultoria {

    public static Consultoria consultoria1 = new Consultoria();
    public static Consultoria consultoria2 = new Consultoria();

    public static void preencherDados(){
        MockConsultoria.consultoria1.setCnpj("1568546");
        MockConsultoria.consultoria1.setId(1);
        MockConsultoria.consultoria1.setNomeComercial("cosultoria 1");
        MockConsultoria.consultoria1.setRazaoSocial("consultoria lta 1");
        MockConsultoria.consultoria1.setUsuarios(MockUsuario.getAllUsuarios());

        MockConsultoria.consultoria2.setCnpj("156949546");
        MockConsultoria.consultoria2.setId(2);
        MockConsultoria.consultoria2.setNomeComercial("cosultoria 2");
        MockConsultoria.consultoria2.setRazaoSocial("consultoria lta 2");
        MockConsultoria.consultoria2.setUsuarios(MockUsuario.getAllUsuarios());
    }

    public static List<Consultoria> getAll(){
        List<Consultoria> list = new ArrayList<>();
        list.add(consultoria1);
        list.add(consultoria2);

        return list;
    }

    public static Consultoria getPorId(Integer id){
        for (Consultoria c: getAll()) {
            if (c.getId().equals(id)) return c;
        }

        return null;
    }

}
