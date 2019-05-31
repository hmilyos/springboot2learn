package com.hmily.basic.designmode.principle.compositionaggregation;


import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ProductDao {

    private DBConnection dbConnection;

    public void setDbConnection(DBConnection dbConnection) {
        this.dbConnection = dbConnection;
    }

    public void addProduct() {
        String conn = dbConnection.getConnection();
        log.info("使用 {} 增加产品", conn);
    }


    public static void main(String[] args) {
        ProductDao productDao = new ProductDao();
        productDao.setDbConnection(new PostgreSQLConnection());
        productDao.addProduct();
    }
}
