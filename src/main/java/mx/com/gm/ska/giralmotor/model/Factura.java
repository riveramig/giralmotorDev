/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.gm.ska.giralmotor.model;

import java.util.Date;
import java.util.List;
import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Reference;

/**
 *
 * @author river
 */
@Entity("Factura")
public class Factura {
    
    @Id
    private ObjectId id;
    private long consecutivo;
    private Date fechaRealizado;
    @Reference
    private List<Articulo> objetosFact;
    @Reference
    private Empresa empresaCompradora;
    private long iva;
    private long total;
    private long subtotal;
    private boolean anulada;

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public long getConsecutivo() {
        return consecutivo;
    }

    public void setConsecutivo(long consecutivo) {
        this.consecutivo = consecutivo;
    }

    public Date getFechaRealizado() {
        return fechaRealizado;
    }

    public void setFechaRealizado(Date fechaRealizado) {
        this.fechaRealizado = fechaRealizado;
    }

    public List<Articulo> getObjetosFact() {
        return objetosFact;
    }

    public void setObjetosFact(List<Articulo> objetosFact) {
        this.objetosFact = objetosFact;
    }

    public Empresa getEmpresaCompradora() {
        return empresaCompradora;
    }

    public void setEmpresaCompradora(Empresa empresaCompradora) {
        this.empresaCompradora = empresaCompradora;
    }

    public long getIva() {
        return iva;
    }

    public void setIva(long iva) {
        this.iva = iva;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public long getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(long subtotal) {
        this.subtotal = subtotal;
    }

    public boolean isAnulada() {
        return anulada;
    }

    public void setAnulada(boolean anulada) {
        this.anulada = anulada;
    }

    @Override
    public String toString() {
        return "Factura{" + "id=" + id + ", consecutivo=" + consecutivo + ", fechaRealizado=" + fechaRealizado + ", objetosFact=" + objetosFact + ", empresaCompradora=" + empresaCompradora + ", iva=" + iva + ", total=" + total + ", subtotal=" + subtotal + ", anulada=" + anulada + '}';
    }
    
    
    
}
