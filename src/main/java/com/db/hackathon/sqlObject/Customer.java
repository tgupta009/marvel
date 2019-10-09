package com.db.hackathon.sqlObject;



public class Customer {

    String name;
    int acctno;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAcctno() {
        return acctno;
    }

    public void setAcctno(int acctno) {
        this.acctno = acctno;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", acctno=" + acctno +
                '}';
    }
}


