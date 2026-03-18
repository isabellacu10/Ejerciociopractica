/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patitassaludables.modelo;

import java.util.ArrayList;

/**
 *
 * @author asus
 */
public class Mascota {
    public int id;
    public String dueño;
    public String direccion;
    public String telefono;
    public ArrayList<Atenciones>atencioness;

    public Mascota(int id, String dueño, String direccion, String telefono) {
        this.id = id;
        this.dueño = dueño;
        this.direccion = direccion;
        this.telefono = telefono;
        atencioness = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Mascota{" + "id=" + id + ", due\u00f1o=" + dueño + ", direccion=" + direccion + ", telefono=" + telefono + ", atenciones=" + atencioness + '}';
    }
}
