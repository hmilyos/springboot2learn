package com.hmily.basic.designmode.principle.compositionaggregation;


public class PostgreSQLConnection implements DBConnection {
    @Override
    public String getConnection() {
        return "PostgreSQL数据库连接";
    }
}
