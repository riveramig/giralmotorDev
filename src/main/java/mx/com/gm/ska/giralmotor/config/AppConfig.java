/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.gm.ska.giralmotor.config;

import com.mongodb.MongoClient;
import mx.com.gm.ska.giralmotor.DaoImpl.EmpresaDaoImpl;
import mx.com.gm.ska.giralmotor.modelDao.EmpresaDao;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 *
 * @author river
 */
@Configuration
@ComponentScan("mx.com.gm.ska.giralmotor")
public class AppConfig {
    
   final Morphia morphia =new Morphia();
    
   @Bean
   @Scope("singleton")
   public Datastore createDataStore(){
       morphia.mapPackage("mx.com.gm.ska.giralmotor.model");
       final Datastore ds=morphia.createDatastore(new MongoClient(), "giralmotor");
       ds.ensureIndexes();
       return ds;
   }
   
   @Bean
   @Scope("singleton")
   public EmpresaDao empresaService(){
       return new EmpresaDaoImpl();
   }
}
