
package modelo;

public class Cliente extends Persona{
    int codigo;

    public Cliente() {
        super(0, null, null, null);
    }    
    
    public Cliente(int codigo, int dni, String nombres, String correo, String telefono) {
        super(dni, nombres, correo, telefono);
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
     
}
