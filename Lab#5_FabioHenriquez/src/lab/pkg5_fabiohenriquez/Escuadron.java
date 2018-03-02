
package lab.pkg5_fabiohenriquez;

import java.util.ArrayList;


public class Escuadron {
    private String nombre;
    private String localidad;
    private String lema;
    private Herores lider;
    private Villanos lider_;
    private boolean tipo;
    private ArrayList miembros = new ArrayList();

    public Escuadron() {
    }

    public Escuadron(String nombre, String localidad, String lema, Herores lider, Villanos lider_, boolean tipo) {
        this.nombre = nombre;
        this.localidad = localidad;
        this.lema = lema;
        this.lider = lider;
        this.lider_ = lider_;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getLema() {
        return lema;
    }

    public void setLema(String lema) {
        this.lema = lema;
    }

    public Herores getLider() {
        return lider;
    }

    public void setLider(Herores lider) {
        this.lider = lider;
    }

    public Villanos getLider_() {
        return lider_;
    }

    public void setLider_(Villanos lider_) {
        this.lider_ = lider_;
    }

    public boolean isTipo() {
        return tipo;
    }

    public void setTipo(boolean tipo) {
        this.tipo = tipo;
    }

    public ArrayList getMiembros() {
        return miembros;
    }

    public void setMiembros(ArrayList miembros) {
        this.miembros = miembros;
    }

    @Override
    public String toString() {
        return nombre ;
    }
    
    
}
