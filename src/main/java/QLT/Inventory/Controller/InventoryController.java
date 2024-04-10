package QLT.Inventory.Controller;

import QLT.Inventory.Model.InventoryItem;
import QLT.Inventory.Service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/inventory")
public class InventoryController {
    @Autowired
    private InventoryService inventoryService;

    // Obtener todos los ítems
    @GetMapping("/")
    public List<InventoryItem> list() {
        return inventoryService.listAll();
    }

    // Agregar un nuevo ítem
    @PostMapping("/")
    public InventoryItem add(@RequestBody InventoryItem inventoryItem) {
        inventoryService.save(inventoryItem);
        return inventoryItem;
    }

    // Obtener un ítem por ID
    @GetMapping("/{id}")
    public ResponseEntity<InventoryItem> get(@PathVariable Long id) {
        InventoryItem item = inventoryService.get(id);
        if (item != null) {
            return ResponseEntity.ok().body(item);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // Actualizar un ítem
    @PutMapping("/{id}")
    public ResponseEntity<?> update(@RequestBody InventoryItem updatedItem, @PathVariable Long id) {
        InventoryItem existingItem = inventoryService.get(id);
        if (existingItem != null) {
            // Actualiza los atributos del ítem existente con los valores del ítem recibido
            existingItem.setName(updatedItem.getName());
            existingItem.setQuantity(updatedItem.getQuantity());
            existingItem.setPrice(updatedItem.getPrice());
            existingItem.setDescription(updatedItem.getDescription());

            // Guarda el ítem actualizado en la base de datos
            inventoryService.save(existingItem);

            // Devuelve una respuesta indicando que la actualización fue exitosa
            return ResponseEntity.ok().body(existingItem);
        } else {
            // Devuelve una respuesta 404 si no se encuentra el ítem
            return ResponseEntity.notFound().build();
        }
    }

    // Eliminar un ítem
    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        InventoryItem item = inventoryService.get(id);
        if (item != null) {
            inventoryService.delete(id);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
