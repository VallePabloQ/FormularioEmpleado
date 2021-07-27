/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
/**
 *
 * @author Lenovo FX
 */
public class Empleado extends Persona {
    private String codEmpleado,puesto;

    public Empleado(){}
    public Empleado(String codEmpleado, String puesto, String nombres, String apellidos, String direccion, String telefono, String fechN) {
        super(nombres, apellidos, direccion, telefono, fechN);
        this.codEmpleado = codEmpleado;
        this.puesto = puesto;
    }

    public String getCodEmpleado() {
        return codEmpleado;
    }

    public void setCodEmpleado(String codEmpleado) {
        this.codEmpleado = codEmpleado;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
    
    @Override
    public void agregar(){
        System.out.println("Codigo del Empleado: " + getCodEmpleado());
        System.out.println("Puesto: " + getPuesto());
        System.out.println("Nombre: " + getNombres());
        System.out.println("Apellidos: " + getApellidos());
        System.out.println("Dirección: " + getDireccion());
        System.out.println("Telefono: " + getTelefono());
        System.out.println("F Nacimiento: " + getFechN());
        System.out.println("____________________________________");
    }
    @Override
    public void modificar() {
        System.out.println("Metodo de Modificacion");
    }
    @Override
    public void eliminar() {
        System.out.println("Metodo de eliminacion");
    }
}
