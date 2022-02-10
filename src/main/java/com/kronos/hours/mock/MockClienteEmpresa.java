package com.kronos.hours.mock;

import com.kronos.hours.DTOS.ClienteEmpresa;

import java.util.ArrayList;
import java.util.List;

public class MockClienteEmpresa {
    static ClienteEmpresa clienteEmpresa1 = new ClienteEmpresa();
    static ClienteEmpresa clienteEmpresa2 = new ClienteEmpresa();

    public static void preencherDados(){
        MockClienteEmpresa.clienteEmpresa1.setId(1);
        MockClienteEmpresa.clienteEmpresa1.setCnpj("52658561");
        MockClienteEmpresa.clienteEmpresa1.setNomeComercial("nome comercial 1");
        MockClienteEmpresa.clienteEmpresa1.setRazaoSocial("razao social 1");
        MockClienteEmpresa.clienteEmpresa1.setUsuarios(MockUsuario.getAllUsuarios());

        MockClienteEmpresa.clienteEmpresa1.setId(2);
        MockClienteEmpresa.clienteEmpresa1.setCnpj("52658561");
        MockClienteEmpresa.clienteEmpresa1.setNomeComercial("nome comercial 2");
        MockClienteEmpresa.clienteEmpresa1.setRazaoSocial("razao social 2");
        MockClienteEmpresa.clienteEmpresa1.setUsuarios(MockUsuario.getAllUsuarios());
    }

    public static List<ClienteEmpresa> getAll(){
        MockClienteEmpresa.preencherDados();
        List<ClienteEmpresa> list = new ArrayList<>();
        list.add(clienteEmpresa1);
        list.add(clienteEmpresa2);

        return list;
    }

    public static ClienteEmpresa getPorId(Integer id){
        MockClienteEmpresa.preencherDados();
        for (ClienteEmpresa c: getAll()){
            if(c.getId().equals(id)) return c;
        }
        return null;
    }
}
