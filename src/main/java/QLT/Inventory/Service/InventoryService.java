package QLT.Inventory.Service;
/*Aunque no es estrictamente necesario, es una buena práctica separar la lógica de negocio en una
capa de servicio.*/
import QLT.Inventory.Model.InventoryItem;
import QLT.Inventory.Repository.InventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service//@Service: Indica que esta clase es un servicio, parte de la capa de lógica de negocio.
public class InventoryService {

    @Autowired//@Autowired: Spring inyecta automáticamente la instancia de ItemRepository.
    private InventoryRepository inventoryRepository;

    // Listar todos los ítems
    public List<InventoryItem> listAll() {
        return inventoryRepository.findAll();
    }

    // Guardar o actualizar un ítem
    public void save(InventoryItem inventoryItem) {
        inventoryRepository.save(inventoryItem);
    }

    // Obtener un ítem por su ID
    public InventoryItem get(Long id) {
        return inventoryRepository.findById(id).get();
    }

    // Eliminar un ítem
    public void delete(Long id) {
        inventoryRepository.deleteById(id);
    }
}
