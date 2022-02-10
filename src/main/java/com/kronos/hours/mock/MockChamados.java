package com.kronos.hours.mock;

import com.kronos.hours.DTOS.Chamado;

import java.util.ArrayList;
import java.util.List;

public class MockChamados {

    public static Chamado chamdo1 = new Chamado();
    public static Chamado chamdo2 = new Chamado();
    public static Chamado chamdo3 = new Chamado();
    public static Chamado chamdo4 = new Chamado();

    public static List<Chamado> chamados = new ArrayList<>();

    public static List<Chamado> getAll(){

        MockChamados.chamdo1.setId(1);
        MockChamados.chamdo1.setRelator(MockUsuario.getUsuarioPorId(1));
        MockChamados.chamdo1.setResponsavel(MockUsuario.getUsuarioPorId(2));
        MockChamados.chamdo1.setDataAbertura("2022/02/15");
        MockChamados.chamdo1.setDataAtendimento("2022/02/16");
        MockChamados.chamdo1.setHorasAtuacao("08h");
        MockChamados.chamdo1.setSistema(MockSistemas.getPorId(1));
        MockChamados.chamdo1.setStatus(2);

        MockChamados.chamdo2.setId(2);
        MockChamados.chamdo2.setRelator(MockUsuario.getUsuarioPorId(1));
        MockChamados.chamdo2.setResponsavel(MockUsuario.getUsuarioPorId(2));
        MockChamados.chamdo2.setDataAbertura("2022/02/15");
        MockChamados.chamdo2.setDataAtendimento("2022/02/16");
        MockChamados.chamdo2.setHorasAtuacao("08h");
        MockChamados.chamdo2.setSistema(MockSistemas.getPorId(1));
        MockChamados.chamdo2.setStatus(2);

        MockChamados.chamdo3.setId(3);
        MockChamados.chamdo3.setRelator(MockUsuario.getUsuarioPorId(1));
        MockChamados.chamdo3.setResponsavel(MockUsuario.getUsuarioPorId(2));
        MockChamados.chamdo3.setDataAbertura("2022/02/15");
        MockChamados.chamdo3.setDataAtendimento("2022/02/16");
        MockChamados.chamdo3.setHorasAtuacao("08h");
        MockChamados.chamdo3.setSistema(MockSistemas.getPorId(1));
        MockChamados.chamdo3.setStatus(2);

        MockChamados.chamdo4.setId(4);
        MockChamados.chamdo4.setRelator(MockUsuario.getUsuarioPorId(1));
        MockChamados.chamdo4.setResponsavel(MockUsuario.getUsuarioPorId(2));
        MockChamados.chamdo4.setDataAbertura("2022/02/15");
        MockChamados.chamdo4.setDataAtendimento("2022/02/16");
        MockChamados.chamdo4.setHorasAtuacao("08h");
        MockChamados.chamdo4.setSistema(MockSistemas.getPorId(1));
        MockChamados.chamdo4.setStatus(2);


        MockChamados.chamados.add(chamdo1);
        MockChamados.chamados.add(chamdo2);
        MockChamados.chamados.add(chamdo3);
        MockChamados.chamados.add(chamdo4);

        return MockChamados.chamados;
    }

    public static Chamado getPorId(Integer id){

        for(Chamado c: getAll()){
            if(c.getId().equals(id)) return c;
        }

        return null;
    }
}
