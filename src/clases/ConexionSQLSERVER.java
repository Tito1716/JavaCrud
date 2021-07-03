package clases;


import java.sql.Connection;
import java.sql.*;

class ConexionSQLSERVER
{


    /**
     * Realiza la conexion con la base de datos de SGMT
     *
     * @param opcion Opcion de metodo de conexion 1-Usando autentificación de
     * windows(LOCAL) 2-Usando usuarios de sql(LOCAL) 3-Usando usuarios de
     * sql(REMOTO)
     * @return Connection variable de la conexion que permite la comunicación
     * entre el programa y la base de datos
     */
    public Connection conectar(int opcion)
    {
        Connection cn = null;
        try
        {
            //variables a utilizar
            String Nombre_Servidor = "SQLSERVERNI";
            String Nombre_Base = "Incapacidad";
            String Usuario = "incapacidad_user";
            String Clave = "1752";
            String Nombre_PC = "Tito-PC";
            String Ip_Servidor = "192.168.1.3";

            String connectionUrl = "";
            switch (opcion)
            {
                case 1:
                    connectionUrl = "jdbc:sqlserver://" + Nombre_PC + "\\" + Nombre_Servidor + ";databaseName = " + Nombre_Base + ";integratedSecurity=true;";
                    break;

                case 2:
                    connectionUrl = "jdbc:sqlserver://" + Nombre_PC + "\\" + Nombre_Servidor + ":1433;databaseName=" + Nombre_Base + ";user=" + Usuario + ";password=" + Clave + ";";
                    break;

                case 3:
                    connectionUrl = "jdbc:sqlserver://" + Ip_Servidor + "\\" + Nombre_Servidor + ":1433;databaseName=" + Nombre_Base + ";user=" + Usuario + ";password=" + Clave + ";";
                   
                    break;
            }

            //cargando el drive (.dll)
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            //estableciendo la conexion....
            cn = DriverManager.getConnection(connectionUrl);
            if (cn == null)
            {
                System.out.println(" ############# El metodo ha devuelto nula la conexion ############# ");
            }
        }
        catch (Exception ex)
        {
            
        }
        return cn;
    }
}
