package ma.fstt.presistence;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "client")
public class Client {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false )
	private Long id_client ;
	
	@Column(nullable = true , length = 255  )
	private String nom ;
	
	@Column(nullable = true , length = 255  )
	private String prenom ; 
	
	@Column(nullable = true , length = 255  )
	private String adresse ;
	
	@Column(nullable = true   )
	private String phone ;
	
	@OneToMany
	@JoinColumn(name="id_client")
	List<Commande> lisCommande ;
	
	
	
	public Client() {
	}



	public Client( String nom, String prenom, String adresse, String phone ) {
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.phone = phone;
	}

	
	
	public Long getId_client() {
		return id_client;
	}

	public void setId_client(Long id_client) {
		this.id_client = id_client;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public List<Commande> getLisCommande() {
		return lisCommande;
	}

	public void setLisCommande(List<Commande> lisCommande) {
		this.lisCommande = lisCommande;
	}


	
	
}
