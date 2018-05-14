/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.gm.ska.giralmotor.DaoImpl;

import java.util.List;
import mx.com.gm.ska.giralmotor.model.Empresa;
import mx.com.gm.ska.giralmotor.modelDao.EmpresaDao;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.query.Query;
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
    public int updateEmpresa(String nit, String newNit, String nombre, String correo, String celular) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Empresa> getAllEmpresas() {
        Query<Empresa>query=dataStore.createQuery(Empresa.class);
        query.order("-nombre");
        return query.asList();
    }
    
}
