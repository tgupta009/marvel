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
        txn1.setTxnid(1);
        txn1.setAcctno(9999);
        txn1.setAmount(20000);
        txn1.setBalance(30000);
        txn1.setGreenFlag("T");
        txn1.setTxtext("");
        txn1.setTxtype("");
        txn1.setTxtime(Instant.now());
        txnList.add(txn1);

        Txn txn2 = new Txn();
        txn2.setTxnid(2);
        txn2.setAcctno(9999);
        txn2.setAmount(20000);
        txn2.setBalance(30000);
        txn2.setGreenFlag("T");
        txn2.setTxtext("");
        txn2.setTxtype("");
        txn2.setTxtime(Instant.now());
        txnList.add(txn2);

        Txn txn3 = new Txn();
        txn3.setTxnid(3);
        txn3.setAcctno(9999);
        txn3.setAmount(20000);
        txn3.setBalance(31000);
        txn3.setGreenFlag("T");
        txn3.setTxtext("");
        txn3.setTxtype("");
        txn3.setTxtime(Instant.now());
        txnList.add(txn3);

        Txn txn4 = new Txn();
        txn4.setTxnid(4);
        txn4.setAcctno(9999);
        txn4.setAmount(21000);
        txn4.setBalance(39000);
        txn4.setGreenFlag("T");
        txn4.setTxtext("");
        txn4.setTxtype("");
        txn4.setTxtime(Instant.now());
        txnList.add(txn4);

        return txnList;
    }
}
