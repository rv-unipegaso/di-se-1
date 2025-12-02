package it.unipegaso.dbconnection;

public class DbUser {

    private String schemaName;
    private String userName;
    private String pwd;

    public DbUser() {
        this.schemaName="myshop_db";
        this.userName="root";
        this.pwd="1234567890";
    }

    public String getSchemaName() {
        return schemaName;
    }

    public void setSchemaName(String schemaName) {
        this.schemaName = schemaName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
