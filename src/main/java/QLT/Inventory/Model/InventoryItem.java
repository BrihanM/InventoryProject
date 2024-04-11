package QLT.Inventory.Model;
/*El modelo de dominio representa la entidad de tu aplicación. En este caso, un objeto Item de inventario.
Usarías anotaciones de JPA para mapear esta clase a una tabla en tu base de datos.*/
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity //@Entity: Indica que esta clase es una entidad JPA.
public class InventoryItem {

        @Id //@Id: Marca el campo que se utilizará como clave primaria.
        //@GeneratedValue: Especifica la estrategia de generación de identificadores.
        @GeneratedValue(strategy = GenerationType.IDENTITY /*Indica que el ID debe ser generado automáticamente
        por la base de datos.*/)
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
