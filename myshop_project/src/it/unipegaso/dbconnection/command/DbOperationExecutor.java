package it.unipegaso.dbconnection.command;

import java.util.ArrayList;
import java.util.List;

public class DbOperationExecutor {

    private List<IDbOperation> dbOperationList = new ArrayList<>();

    public DbOperationResult executeOperation(IDbOperation dbOperation) {
        dbOperationList.add(dbOperation);
        DbOperationResult result = dbOperation.execute();
        return result;
    }

}
