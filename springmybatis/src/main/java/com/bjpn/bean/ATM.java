package com.bjpn.bean;

import java.util.Objects;

public class ATM {
    private int atmId;
    private String atmName;
    private String atmCode;
    private String atmMoney;

    public int getAtmId() {
        return atmId;
    }

    public void setAtmId(int atmId) {
        this.atmId = atmId;
    }

    public String getAtmName() {
        return atmName;
    }

    public void setAtmName(String atmName) {
        this.atmName = atmName;
    }

    public String getAtmCode() {
        return atmCode;
    }

    public void setAtmCode(String atmCode) {
        this.atmCode = atmCode;
    }

    public String getAtmMoney() {
        return atmMoney;
    }

    public void setAtmMoney(String atmMoney) {
        this.atmMoney = atmMoney;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ATM atm = (ATM) o;
        return atmId == atm.atmId &&
                Objects.equals(atmName, atm.atmName) &&
                Objects.equals(atmCode, atm.atmCode) &&
                Objects.equals(atmMoney, atm.atmMoney);
    }

    @Override
    public int hashCode() {
        return Objects.hash(atmId, atmName, atmCode, atmMoney);
    }

    @Override
    public String toString() {
        return "ATM{" +
                "atmId=" + atmId +
                ", atmName='" + atmName + '\'' +
                ", atmCode='" + atmCode + '\'' +
                ", atmMoney='" + atmMoney + '\'' +
                '}';
    }

    public ATM(int atmId, String atmName, String atmCode, String atmMoney) {
        this.atmId = atmId;
        this.atmName = atmName;
        this.atmCode = atmCode;
        this.atmMoney = atmMoney;
    }
    public ATM(){}
}
