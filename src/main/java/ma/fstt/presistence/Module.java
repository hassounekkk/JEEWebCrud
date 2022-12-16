package ma.fstt.presistence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "module")
class Module {
	
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false )
	private Long id_module ;
	
	
	@Column(nullable = true , length = 255  )
	private String nom ;
	
	@ManyToOne
	@JoinColumn(name="id_etudiant")
	Etudiant etudiant ; 
	
	public Module() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Module(Long id_module, String nom, Integer coef) {
		super();
		this.id_module = id_module;
		this.nom = nom;
		this.coef = coef;
	}

	@Column(nullable = true )
	private Integer coef ;

	public Long getId_module() {
		return id_module;
	}

	public void setId_module(Long id_module) {
		this.id_module = id_module;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Integer getCoef() {
		return coef;
	}

	public void setCoef(Integer coef) {
		this.coef = coef;
	} 

}
