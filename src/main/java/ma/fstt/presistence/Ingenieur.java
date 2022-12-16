package ma.fstt.presistence;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "ingenieur")


public class Ingenieur extends  Personne{
	
	
	@Column(name = "statut")
	private String statut;

}
