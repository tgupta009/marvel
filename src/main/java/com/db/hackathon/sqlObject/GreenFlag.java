package com.db.hackathon.sqlObject;


import java.time.Instant;
public class GreenFlag {
    int acctno;
    int txid;
    Instant startTime;
    Instant endTime;

    public int getAcctno() {
        return acctno;
    }

    public void setAcctno(int acctno) {
        this.acctno = acctno;
    }

    @Override
    public String toString() {
        return "GreenFlag{" +
                "acctno=" + acctno +
                ", txid=" + txid +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                '}';
    }

    public int getTxid() {
        return txid;
    }

    public void setTxid(int txid) {
        this.txid = txid;
    }

    public Instant getStartTime() {
        return startTime;
    }

    public void setStartTime(Instant startTime) {
        this.startTime = startTime;
    }

    public Instant getEndTime() {
        return endTime;
    }

    public void setEndTime(Instant endTime) {
        this.endTime = endTime;
    }
}
