package QLT.Inventory.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class InventoryItem {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String name; // Nombre del ítem
        private int quantity; //Cantidad del ítem
        private double price; // Precio del ítem
        private String description; // Descripción del ítem

        // Constructors
        // Constructor vacío necesario para JPA
        public InventoryItem() {
        }

        // Constructor con parámetros
        public InventoryItem(String name, int quantity, double price, String description) {
                this.name = name;
                this.quantity = quantity;
                this.price = price;
                this.description = description;
        }

        // getters and setters are using lombok


}
