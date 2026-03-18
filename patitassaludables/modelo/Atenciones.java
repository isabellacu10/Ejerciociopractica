/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patitassaludables.modelo;

/**
 *
 * @author asus
 */
public class Atenciones {
    public int veterinario;
    public String descripcion;
    public String fecha;

    public Atenciones(int veterinario, String descripcion, String fecha) {
        this.veterinario = veterinario;
        this.descripcion = descripcion;
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Atenciones{" + "veterinario=" + veterinario + ", descripcion=" + descripcion + ", fecha=" + fecha + '}';
    }
    
    
}
