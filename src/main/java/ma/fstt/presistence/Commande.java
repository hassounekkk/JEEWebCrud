package ma.fstt.presistence;

import java.util.List;

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
@Table(name = "commande")
public class Commande {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false )
	private Long id_commande ;
	
	
	@Column(nullable = false  )
	private Long num ;
	
	@Column(nullable = true , length = 255  )
	private String adressLivraison ;
	
	@ManyToOne
	@JoinColumn(name="id_client")
	Client client;
	
	@OneToMany
	@JoinColumn(name="id_produit")
	List<Produit> lisProduit ;
	
}
