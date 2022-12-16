package ma.fstt.presistence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "produit")
public class Produit {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false )
	private Long id_produit ;
	
	
	@Column(nullable = false  )
	private Long code;
	
	@Column(nullable = false , length = 255  )
	private String nameProduit ;
	
	@Column(nullable = false )
	private Integer	prix ;
	
 
}
