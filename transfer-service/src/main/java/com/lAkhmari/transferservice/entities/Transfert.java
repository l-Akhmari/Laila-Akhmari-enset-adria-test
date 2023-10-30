package com.lAkhmari.transferservice.entities;

import com.lAkhmari.transferservice.enums.Etat;
import com.lAkhmari.transferservice.model.Wallet;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name="transfers")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Transfert {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date date;
    private Wallet walletSource;
    private Wallet walletDistination;
    private double monatant;
    private Etat etat;

}
