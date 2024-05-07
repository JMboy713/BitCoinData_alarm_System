package com.springbatch.fastcampus.cryptoautomation.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "report_history")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ReportHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Mysql auto_increment
    private int id;
    @Column
    private String market;
    @Column
    private String price;
    @Column
    private LocalDateTime reportedAt;

    public ReportHistory(String market, String price) {
        this.market = market;
        this.price = price;
        this.reportedAt= LocalDateTime.now();
    }
}
