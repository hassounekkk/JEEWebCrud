package ma.fstt.presistence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Table(name = "personne")
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Personne {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id") 
	private int id; 
	@Column(name = "nom")
	private String nom;
	@Column(name = "prenom") private String prenom;
}



