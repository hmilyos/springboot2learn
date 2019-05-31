package com.hmily.basic.designmode.principle.compositionaggregation;


public class MySQLConnection implements DBConnection {

    @Override
    public String getConnection() {
        return "MySQL数据库连接";
    }
}
