
package lab.pkg5_fabiohenriquez;


public class Villanos {
   private String nombre;
    private String poder;
    private String debilidad;
    private Escuadron escuadron;
    private String fuerza;
    private String Habilidad_Fisica;
    private String Habilidad_Mental;

    public Villanos() {
    }

    public Villanos(String nombre, String poder, String debilidad, Escuadron escuadron, String fuerza, String Habilidad_Fisica, String Habilidad_Mental) {
        this.nombre = nombre;
        this.poder = poder;
        this.debilidad = debilidad;
        this.escuadron = escuadron;
        this.fuerza = fuerza;
        this.Habilidad_Fisica = Habilidad_Fisica;
        this.Habilidad_Mental = Habilidad_Mental;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPoder() {
        return poder;
    }

    public void setPoder(String poder) {
        this.poder = poder;
    }

    public String getDebilidad() {
        return debilidad;
    }

    public void setDebilidad(String debilidad) {
        this.debilidad = debilidad;
    }

    public Escuadron getEscuadron() {
        return escuadron;
    }

    public void setEscuadron(Escuadron escuadron) {
        this.escuadron = escuadron;
    }

    public String getFuerza() {
        return fuerza;
    }

    public void setFuerza(String fuerza) {
        this.fuerza = fuerza;
    }

    public String getHabilidad_Fisica() {
        return Habilidad_Fisica;
    }

    public void setHabilidad_Fisica(String Habilidad_Fisica) {
        this.Habilidad_Fisica = Habilidad_Fisica;
    }

    public String getHabilidad_Mental() {
        return Habilidad_Mental;
    }

    public void setHabilidad_Mental(String Habilidad_Mental) {
        this.Habilidad_Mental = Habilidad_Mental;
    }

    @Override
    public String toString() {
        return "Villanos{" + "nombre=" + nombre + ", poder=" + poder + ", debilidad=" + debilidad + ", escuadron=" + escuadron + ", fuerza=" + fuerza + ", Habilidad_Fisica=" + Habilidad_Fisica + ", Habilidad_Mental=" + Habilidad_Mental + '}';
    }
    
    
}
