package QLT.Inventory.Repository;

import QLT.Inventory.Model.InventoryItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryRepository extends JpaRepository<InventoryItem, Long> {
    // Spring Data JPA utiliza este repositorio para realizar operaciones CRUD
}
