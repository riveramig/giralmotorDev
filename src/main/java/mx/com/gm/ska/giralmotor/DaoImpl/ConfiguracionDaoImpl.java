/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.gm.ska.giralmotor.DaoImpl;

import mx.com.gm.ska.giralmotor.model.Configuracion;
import mx.com.gm.ska.giralmotor.modelDao.ConfiguracionDao;
import org.bson.types.ObjectId;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.query.Query;
import org.mongodb.morphia.query.UpdateOperations;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author river
 */
public class ConfiguracionDaoImpl implements ConfiguracionDao{
    
    @Autowired
    Datastore dataStore;

    @Override
    public int setIndex(int index) {
        Query<Configuracion> query=dataStore.createQuery(Configuracion.class);
        if(query.get()==null){
            Configuracion c=new Configuracion();
            c.setIndex(index);
            dataStore.save(c);
        }else{
            ObjectId id=query.get().getId();
            query.filter("id ==", id);
            UpdateOperations<Configuracion> ops=dataStore.createUpdateOperations(Configuracion.class);
            ops.set("index", index);
            dataStore.update(query, ops);
        }
        return 1;
    }

    @Override
    public Configuracion getConf() {
        Query<Configuracion>query=dataStore.createQuery(Configuracion.class);
        return query.get();
    }

}
