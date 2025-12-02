package it.unipegaso.dbconnection.command;

import it.unipegaso.dbconnection.DbConnection;

import java.sql.ResultSet;

public class ReadOperation implements IDbOperation {

    private DbConnection dbConnection = DbConnection.getInstance();
    private String sql;

    public ReadOperation(String sql) {
        this.sql = sql;
    }

    @Override
    public DbOperationResult execute() {

        DbOperationResult result = new DbOperationResult();
        ResultSet resultSet = dbConnection.executeQuery(sql);
        result.setResultSet(resultSet);

        return result;
    }
}
