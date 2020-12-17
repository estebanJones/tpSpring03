package bounceevent.entites;

import java.util.Date;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@DiscriminatorColumn(name = "TYPE")
public class Tache {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String description;
	@Temporal(TemporalType.DATE)
	private Date date;
	
	@ManyToOne()
	@JoinColumn(name = "id_intervenant")
	private  Intervenant intervenant;
	
	public Tache(String description, Date date) {
		this.description = description;
		this.date = date;
	}
	
	public Tache() {
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Intervenant getIntervenant() {
		return intervenant;
	}

	public void setIntervenant(Intervenant intervenant) {
		this.intervenant = intervenant;
	}
}
