/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package patitassaludables;

import java.util.Scanner;
import java.util.ArrayList;
import patitassaludables.modelo.Atenciones;
import patitassaludables.modelo.Mascota;
import patitassaludables.modelo.Veterinario;
/**
 *
 * @author asus
 */
public class Patitassaludables {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Veterinario>veterinarios=new ArrayList<>();
    static ArrayList<Mascota> mascostas = new ArrayList<>();
    
    public static void main(String[] args) {
        
        while (true) {
            System.out.println("     MENU\n"+"1.REGISTRAR VETERINARIOS\n"+"2.REGISTRAR MASCOTA\n"+"3.REGISTRAR ATENCIONES\n"+"4.LISTAR VETERINARIOS\n"+"5.LISTAR MASCOTAS\n"+"6.SALIR");
            int menu = sc.nextInt();
            
            switch (menu) {
                case 1:
                    Registrarveterinario();
                    break;
                case 2:
                    registrarmascota();
                    break;
                case 3:
                    registraratenciones(mascostas);
                    break;
                case 4:
                    Listarveterinarios(veterinarios);
                    break;
                case 5:
                    Listarmascota();
                    break;
                case 6:
                    System.exit(0);
                    break;
            }
            
        }
    }
    public static void Registrarveterinario() {
        System.out.println("Ingrese el ID del veterinario: "); int id = sc.nextInt();
        System.out.println("Ingrese el nombre del veterinario: "); String nombre = sc.nextLine();
        System.out.println("Ingrese la direccion del veterinario: "); String direccion = sc.nextLine();
        System.out.println("Ingrese el telefono del veterinario: "); String telefono = sc.nextLine();
        Veterinario veterinario1 = new Veterinario(id, nombre, direccion, telefono);
        veterinarios.add(veterinario1);
        System.out.println("Veterinario registrado correctamente");
    }
    public static void registrarmascota() {
        System.out.println("Ingrese el ID de la mascota: "); int idm = sc.nextInt();
        System.out.println("Ingrese el nombre del dueño: "); String dueño = sc.nextLine();
        System.out.println("Ingrese la direccion: "); String direcccion = sc.nextLine();
        System.out.println("Ingrese el telefono: "); String telefono = sc.nextLine();
        Mascota mascota1 = new Mascota(idm, dueño, direcccion, telefono);
        mascostas.add(mascota1);
        System.out.println("Mascota registrada correctamente");
        
    }
    public static void registraratenciones(ArrayList<Mascota>mascotas) {
        System.out.println("Ingrese el ID de la mascota: "); int id = sc.nextInt();
        for (Mascota e : mascotas) {
            if (e.id==id){
                System.out.println("Ingrese el ID del veterinario: "); int veter =sc.nextInt();
                System.out.println("Descripcion: "); String descripcion =sc.nextLine();
                System.out.println("ingrese la fecha (dd/mm/aa):"); String fecha =sc.nextLine();
                Atenciones atencion1=new Atenciones(veter, descripcion, fecha);
                e.atencioness.add(atencion1);
                System.out.println("Se registro la atencion");
            }
            
        }
        
    }
    public static void Listarveterinarios(ArrayList<Veterinario>veterinarios) {
        for (Veterinario v : veterinarios) {
            System.out.println("     FICHA\n"
                    +"ID: "+v.id+"\n"
                    +"NOMBRE: "+v.nombre+"\n"
                    +"DIRECCION: "+v.direccion+"\n"
                    +"TELEFONO: "+v.telefono+"\n");
        }
    }
    public static void Listarmascota() {
        for (Mascota m : mascostas) {
            System.out.println("     FICHA\n"
                    +"ID: "+m.id+"\n"
                    +"DUEÑO: "+m.dueño+"\n"
                    +"DIRECCION: "+m.direccion+"\n"
                    +"TELEFONO: "+m.telefono+"\n"
                    +"ATENCIONES: "+m.atencioness);
        }
    }
    
}
