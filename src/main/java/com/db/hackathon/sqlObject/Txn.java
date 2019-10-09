package com.db.hackathon.sqlObject;

import javax.persistence.*;
import java.time.Instant;

public class Txn {
    int txnid;
    int acctno;
    String txtime;
    String txtype;
    double amount;
    double balance;
    String txtext;

    @Override
    public String toString() {
        return "Txn{" +
                "txnid=" + txnid +
                ", acctno=" + acctno +
                ", txtime='" + txtime + '\'' +
                ", txtype='" + txtype + '\'' +
                ", amount=" + amount +
                ", balance=" + balance +
                ", txtext='" + txtext + '\'' +
                ", greenFlag='" + greenFlag + '\'' +
                '}';
    }

    String greenFlag;

    public String getTxtime() {
        return txtime;
    }

    public void setTxtime(String txtime) {
        this.txtime = txtime;
    }

    public int getTxnid() {
        return txnid;
    }

    public void setTxnid(int txnid) {
        this.txnid = txnid;
    }

    public int getAcctno() {
        return acctno;
    }

    public void setAcctno(int acctno) {
        this.acctno = acctno;
    }



    public String getTxtype() {
        return txtype;
    }

    public void setTxtype(String txtype) {
        this.txtype = txtype;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getTxtext() {
        return txtext;
    }

    public void setTxtext(String txtext) {
        this.txtext = txtext;
    }

    public String getGreenFlag() {
        return greenFlag;
    }

    public void setGreenFlag(String greenFlag) {
        this.greenFlag = greenFlag;
    }


}
