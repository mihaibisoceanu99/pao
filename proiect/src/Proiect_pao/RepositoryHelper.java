package Proiect_pao;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class RepositoryHelper {

    private static RepositoryHelper repositoryHelper = new RepositoryHelper();

    private RepositoryHelper(){}

    public static RepositoryHelper getRepositoryHelper(){
        return repositoryHelper;
    }

    public void executeSql(Connection connection, String sql) throws SQLException{
        Statement stmt = connection.createStatement();
        stmt.execute(sql);
        //no return (not select queries)
    }

    public ResultSet executeQuerySql(Connection connection, String sql) throws SQLException{
        Statement stmt = connection.createStatement();

        return stmt.executeQuery(sql);


    }
}
