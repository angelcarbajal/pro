package kardex.controlador;

import javax.swing.JButton;
import javax.swing.JTextField;
import kardex.vista.UIKardex;
import kardex.Kardex;
import kardex.controlador.almacen.CAlmacen;

public class CKardex implements IKardex
{
    private UIKardex ventana;
    
    public CKardex()
    {
        ventana = new UIKardex(this);
    }
    
    public void almacen()
    {
        CAlmacen almacen = new CAlmacen();
        ventana.dispose();
    }
    public void cargar(JTextField txtNombre, JTextField txtDni, JButton btnUsuario, JButton btnExistencia, JButton btnEntrada, JButton btnSalida)
    {
        txtNombre.setText(Kardex.user.getUsrNom() + " " + Kardex.user.getUsrApe());
        txtDni.setText("DNI Nº " + Kardex.user.getUsrDni());
        
        if(Kardex.user.getUsrPer().equals("0"))
        {
            btnUsuario.setEnabled(false);
            btnExistencia.setEnabled(false);
            btnEntrada.setEnabled(false);
            btnSalida.setEnabled(false);
        }
    }
    
    public void cerrarSesion()
    {
        CLogin login = new CLogin();
        ventana.dispose();
    }
}
