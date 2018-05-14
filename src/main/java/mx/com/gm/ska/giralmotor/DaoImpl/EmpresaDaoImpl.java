/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.gm.ska.giralmotor.DaoImpl;

import java.util.List;
import java.util.regex.Pattern;
import mx.com.gm.ska.giralmotor.model.Empresa;
import mx.com.gm.ska.giralmotor.modelDao.EmpresaDao;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.query.Query;
import org.mongodb.morphia.query.UpdateOperations;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author river
 */
public class EmpresaDaoImpl implements EmpresaDao{
    
    @Autowired
    Datastore dataStore;

    @Override
    public int createEmpresa(Empresa e) {
        System.out.println(e.toString());
        Query<Empresa>query=dataStore.createQuery(Empresa.class);
        Empresa x=query.filter("nit ==", e.getNit()).get();
        if(x==null){
            dataStore.save(e);
            return 1;
        }else{
            return 0;
        }
    }

    @Override
    public Empresa searchByNit(String nit) {
        Query<Empresa>query=dataStore.createQuery(Empresa.class);
        return query.filter("nit ==", nit).get();
    }

    @Override
    public List<Empresa> getAllEmpresas() {
        Query<Empresa>query=dataStore.createQuery(Empresa.class);
        query.order("-nombre");
        return query.asList();
    }

    @Override
    public List<Empresa> searchEmpresaByName(String nombre) {
        Query<Empresa>query=dataStore.createQuery(Empresa.class);
        Pattern regexp =Pattern.compile(nombre, Pattern.CASE_INSENSITIVE);
        return query.filter("nombre", regexp).asList();
    }

    @Override
    public int updateEmpresa(Empresa e) {
        Query<Empresa>query=dataStore.createQuery(Empresa.class);
        query.filter("id ==", e.getId());
        UpdateOperations<Empresa>ops=dataStore.createUpdateOperations(Empresa.class);
        ops.set("nit", e.getNit());
        ops.set("nombre", e.getNombre());
        ops.set("correo",e.getDireccion());
        ops.set("telefono", e.getTelefono());
        dataStore.update(query, ops);
        return 1;
    }
    
}
