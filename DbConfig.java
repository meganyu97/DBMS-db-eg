import java.sql.Connection;
import java.sql.DriverManager;


public class DbConfig
{
    //using jdbcodbc bridge -- slow not widely supported
    //Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
    //con = DriverManager.getConnection("jdbc:odbc:Driver={SQL Server};Server=WIN-876TBFIEOB0;Address=192.168.2.112,1433;Network=DBMSSOCN;Database=PizzaDb;Uid=rene;Pwd=test123;");

    private Connection pgSqlConnection = null;

    public static Connection getMySqlConnection()
    {
        Connection mysqlConnection = null;
        try
        {
            //returns the Class object associated with the class or interface with the given string name
            Class.forName("com.mysql.jdbc.Driver");
            String connectionUrl = "jdbc:mysql://localhost:3306/cpsc408";
            mysqlConnection = DriverManager.getConnection(connectionUrl, "root", "Chapman2018!");
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        return mysqlConnection;
    }
}