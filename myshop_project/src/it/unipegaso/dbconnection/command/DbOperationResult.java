package it.unipegaso.dbconnection.command;

import java.sql.ResultSet;

public class DbOperationResult {

    private ResultSet resultSet;
    private int rowsAffected;

    public ResultSet getResultSet() {
        return resultSet;
    }

    public void setResultSet(ResultSet resultSet) {
        this.resultSet = resultSet;
    }

    public int getRowsAffected() {
        return rowsAffected;
    }

    public void setRowsAffected(int rowsAffected) {
        this.rowsAffected = rowsAffected;
    }
}
