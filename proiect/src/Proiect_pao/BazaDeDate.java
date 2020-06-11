package Proiect_pao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BazaDeDate {

    public void setUp() throws SQLException {
        String createStation = "CREATE TABLE IF NOT EXISTS statie" +
                "(id int PRIMARY KEY AUTO_INCREMENT, nume varchar(35))";

        Connection dbCon = Data.getDatabaseConnection();
        RepositoryHelper repositoryHelper = RepositoryHelper.getRepositoryHelper();


        repositoryHelper.executeSql(dbCon,createStation);

    }



    public void addStation(String a) throws SQLException {

        Connection dbCon = Data.getDatabaseConnection();

        String add = "INSERT INTO statie(nume)" + " VALUES(?)";

        PreparedStatement prepstmt = dbCon.prepareStatement(add);

        prepstmt.setString(1,a);


        prepstmt.execute();


    }


}
