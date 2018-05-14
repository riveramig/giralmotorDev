/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.gm.ska.giralmotor.modelDao;

import mx.com.gm.ska.giralmotor.model.Configuracion;
import org.springframework.stereotype.Service;

/**
 *
 * @author river
 */
@Service
public interface ConfiguracionDao {
    
    public int setIndex(int index);
    public Configuracion getConf();
}
