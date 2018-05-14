/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.gm.ska.giralmotor.modelDao;

import java.util.List;
import mx.com.gm.ska.giralmotor.model.Empresa;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 *
 * @author river
 */
@Service
public interface EmpresaDao {
    public int createEmpresa(Empresa e);
    public Empresa searchByNit(String nit);
    public int updateEmpresa(Empresa e);
    public List<Empresa> getAllEmpresas();
    public List<Empresa> searchEmpresaByName(String nombre);
}
