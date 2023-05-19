package kodlama.io.rentACar.entities.concretes;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name="brands") //table karşılık gelen yeri gösterdik
@Data //Getter ve Setter ları oluştur
@AllArgsConstructor //Counstructor oluşturdu
@NoArgsConstructor
@Entity
public class Brand {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "name")
	private String name;
	
	 
}
//Brand -->id,name,quantity
//GetAllBrandsResponse-->id,name
//mapping