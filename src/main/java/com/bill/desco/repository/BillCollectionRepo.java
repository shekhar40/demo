package com.bill.desco.repository;

import com.bill.desco.entity.BillCollectionEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BillCollectionRepo extends JpaRepository<BillCollectionEntity,Long> {
}
