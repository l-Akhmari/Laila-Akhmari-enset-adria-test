package com.lAkhmari.transferservice.model;

import lombok.Data;

import java.util.Date;

@Data
public class Wallet {
    private String id;
    private double solde;
    private Date createdAt;
    private String devise;
}
