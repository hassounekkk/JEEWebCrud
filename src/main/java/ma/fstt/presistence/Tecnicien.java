package ma.fstt.presistence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tecnicien")

public class Tecnicien  extends Personne{
	
	@Column(nullable = false)
	private Long duree ;

}
