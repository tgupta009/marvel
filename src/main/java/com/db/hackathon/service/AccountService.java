package com.db.hackathon.service;

import com.db.hackathon.repository.TxnRepository;
import com.db.hackathon.sqlObject.Txn;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

@Component
public class AccountService {


    @Autowired
    TxnRepository txnRepository;


    public List<Txn> getTxDtls(int acctNo) {
        List<Txn> txnList = new ArrayList<>();

        Txn txn1 = new Txn();
        txn1.setTxnid(101);
        txn1.setAcctno(9999);
        txn1.setAmount(0);
        txn1.setBalance(10000);
        txn1.setGreenFlag("");
        txn1.setTxtext("Internal");
        txn1.setTxtype("OpBal");
        txn1.setTxtime("2019-10-01 01:00:00");
        txnList.add(txn1);

        Txn txn2 = new Txn();
        txn2.setTxnid(102);
        txn2.setAcctno(9999);
        txn2.setAmount(9.5);
        txn2.setBalance(9990.5);
        txn2.setGreenFlag("");
        txn2.setTxtext("Fuel");
        txn2.setTxtype("D");
        txn2.setTxtime("2019-10-02 09:30:00");
        txnList.add(txn2);

        Txn txn3 = new Txn();
        txn3.setTxnid(103);
        txn3.setAcctno(9999);
        txn3.setAmount(0.5);
        txn3.setBalance(9990);
        txn3.setGreenFlag("Y");
        txn3.setTxtext("GreenTxn");
        txn3.setTxtype("D");
        txn3.setTxtime("2019-10-02 09:31:00");
        txnList.add(txn3);

        Txn txn4 = new Txn();
        txn4.setTxnid(104);
        txn4.setAcctno(9999);
        txn4.setAmount(5.5);
        txn4.setBalance(9990);
        txn4.setGreenFlag("");
        txn4.setTxtext("Food");
        txn4.setTxtype("D");
        txn4.setTxtime("2019-10-09 20:28:28");
        txnList.add(txn4);

        return txnList;
    }
}
