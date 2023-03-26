package com.slavamashkov.inventoryservice.inventory;

import com.slavamashkov.inventoryservice.model.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryRepository extends JpaRepository<Inventory, Long> {
}
