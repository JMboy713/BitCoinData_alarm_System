package com.springbatch.fastcampus.cryptoautomation.repository;

import com.springbatch.fastcampus.cryptoautomation.entity.ReportHistory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class ReportHistoryRepository {
    private final ReportHistoryJpaRepository repository;

    public void save(String market,String price) {
        repository.save(new ReportHistory(market,price));
    }

}
