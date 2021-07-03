package clases;

import java.sql.*;
import java.sql.Connection;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



public class ConexionMetodos
{

    /*#################################- CLASE PARA LOS METODOS CON BASES DE DATOS -#################################*/
    Connection cn;

    
    /*---------------------------ABRIR CONEXION------------------------------*/
    public ConexionMetodos()
    {
        //lamamos la clase 
        ConexionSQLSERVER con = new ConexionSQLSERVER();
        //abrimos la conexion con el metodo deseado (1, 2 o el 3)
        //1 = en red local sin usuarios.
        //2 = en red local con usuarios
        //3 = en la misma red remotamente con usuarios e IP
        cn = con.conectar(1);
    }

    /*---------------------------CERRAR CONEXION------------------------------*/
    public void CerrarConexion()
    {
        try
        {
            //se cierra la conexion
            cn.close();
        }
        catch (Exception e)
        {
            System.out.println("clases.Conexion_Metodos.CerrarConexion Error:\n" + e);
        }
    }

    public Connection getConexion()
    {
        return cn;
    }
    
    /*---------------------------EJECUTAR CONSULTA------------------------------*/
    public boolean EjecutarConsulta(String ConsultaQuery)
    {
        boolean ejecutado = false;
        try
        {
            //ccreamos una sentencia
            Statement cmd = cn.createStatement();
            //la ejecutamos
            if (!cmd.execute(ConsultaQuery))
            {
                //si se ejecuta se devuelve verdadero
                ejecutado = true;
                //Insertaremos a la bitacora
                //Obtenemos el primer caracter de la cadena, pues a partir de eso podemos ver si es insert update o delete
                String consulta_tipo = String.valueOf(ConsultaQuery.charAt(0));
                //Separamos la consulta, cada espacio que tenga es un salto que hara para el arreglo, 
                //en un punto de cada consulta será la tabla y eso es siempre, ya que las consultas siguen un parametro de escritura 
                String[] tabla = ConsultaQuery.split(" ");
                
                
            }
            //cerramos la conexion
            cmd.close();
            cn.close();
        }
        catch (Exception ex)
        {
            System.out.println("clases.Conexion_Metodos.EjecutarConsulta Error:\n" + ex);
        }
        return ejecutado;
    }

    /*--------------------------OBTENER UN VALOR DE UNA CONSULTA-------------------------------*/
    public String ObtenerValor(String ColumnaDelValor, String consultaobtenervalor)
    {
        String valorObtenido = "";
        try
        {
            //creamos una sentencia
            Statement st = cn.createStatement();
            //le pasamos los resultados a una variable
            ResultSet rs = st.executeQuery(consultaobtenervalor);

            //mientras hayan resultados....
            while (rs.next())
            {
                //obtenemos el valor
                valorObtenido = rs.getString(ColumnaDelValor);
            }
            //si es igual a null
            if (valorObtenido == null)
            {
                //se devuelve en vacio
                valorObtenido = "";
            }
            //cerramos las conexiones
            st.close();
            cn.close();
        }
        catch (Exception ex)
        {
            System.out.println("clases.Conexion_Metodos.ObtenerValor Error:\n" + ex);
        }
        return valorObtenido;
    }
//Método para obtener el valor de un campo especifico de la base de datos.
    public static ResultSet mthObtenerValor(PreparedStatement query) {
        ResultSet resultado = null;
        try {
            resultado = query.executeQuery();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return resultado;
    }
    /*---------------------------CARGAR COMBOBOXS-------------------------------*/
    public DefaultComboBoxModel LlenarCombobox(String DisplayMemberCmb, String SelectCombo)
    {
        //creamos el modelo del combobox que devolveremos
        DefaultComboBoxModel jcmb = new DefaultComboBoxModel();
        try
        {
            //creamos la sentencia
            Statement st = cn.createStatement();
            //obtenemos los resultados al ejecutar la sentencia
            ResultSet rs = st.executeQuery(SelectCombo);

            //mientras hayan resultados
            while (rs.next())
            {
                //agregamos cada resultado al modelo
                jcmb.addElement(rs.getString(DisplayMemberCmb));
            }
            //cerramos las conexiones
            st.close();
            cn.close();
        }
        catch (Exception ex)
        {
            System.out.println("clases.Conexion_Metodos.LlenarCombobox Error:\n" + ex);
        }
        return jcmb;
    }
 //Método para asignar datos a un JComboBox.
    public  JComboBox mthCargarLista(PreparedStatement query, JComboBox origen) {
        try {
            ResultSet rs = mthObtenerValor(query);
            while (rs.next())
            { 
                origen.addItem(rs.getString(1));
            }
            return origen;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
            return origen;
        }
    }
    /*-----------------------------OBTENER DATOS PARA LLENAR TABLAS--------------------------------*/
    public DefaultTableModel LlenarJTable(String consulta)
    {
        //creo el modelo para la tabla y pongo que las celdas no sean editables.
        DefaultTableModel modelo = new DefaultTableModel()
        {
            @Override
            public boolean isCellEditable(int rowIndex,int columnIndex)
            {
                return false;
            }
        };
            
        try 
        {
            //para ejecutar la consulta
            Statement st = cn.createStatement();
            //Almaceno los datos en un tipo de dato ResultSet
            ResultSet rs = st.executeQuery(consulta);
            //Obteniendo la informacion de las columnas que estan siendo consultadas
            ResultSetMetaData rsMd = rs.getMetaData();
            //variable de cuantas columnas tiene el resultado
            int cantidadColumnas = rsMd.getColumnCount();
            for (int i = 1; i <= cantidadColumnas; i++) 
            {
                //va ir agregandolo al modelo en la posicion i
                modelo.addColumn(rsMd.getColumnLabel(i));
            }
            //mientras que si hayan resultados....
            while (rs.next()) 
            {
                //arreglo de objetos del tamaño de la cantidad de columnas
                Object[] fila = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) 
                {
                    //se ira agregando al arreglo
                    fila[i]=rs.getObject(i+1);
                }
                //y ahora se agrega la fila a la tabla
                modelo.addRow(fila);
            }
            //cerramos conexiones
            st.close();
            cn.close();
        } 
        catch (Exception ex)
        {
            System.out.println("jCls_Metodos.LlenarJTable Error:\n" + ex);
        }
        return modelo;
    }

    
    
}
