package QLT.Inventory.Repository;
/*El repositorio extiende JpaRepository, proporcionando métodos CRUD para tu entidad, así como la capacidad de
definir otros métodos de consulta personalizados.*/
import QLT.Inventory.Model.InventoryItem;
import org.springframework.data.jpa.repository.JpaRepository;
//este es el lugar donde @Autowired se usará para inyectar el repositorio en otras partes de la aplicación
public interface InventoryRepository extends JpaRepository<InventoryItem, Long> {
    // Spring Data JPA utiliza este repositorio para realizar operaciones CRUD
}
