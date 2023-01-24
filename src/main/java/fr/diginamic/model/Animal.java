package fr.diginamic.model;

import fr.diginamic.enums.Sex;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;


@Entity
public class Animal {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
		
	@Column(name="color")
	private String color;
		
	@Column(name="name")
	private String name;
	
	@Enumerated(EnumType.STRING)
	private Sex sex;
		
	@ManyToOne
	private Species species;
	
	
	@Override
    public String toString() {
        return name;
    }

	/** Getter pour id
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/** Setter pour id
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/** Getter pour color
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/** Setter pour color
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/** Getter pour name
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/** Setter pour name
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/** Getter pour sexe
	 * @return the sexe
	 */
	public Sex getSexe() {
		return sex;
	}

	/** Setter pour sexe
	 * @param sexe the sexe to set
	 */
	public void setSexe(Sex sex) {
		this.sex = sex;
	}

	/** Getter pour specie
	 * @return the specie
	 */
	public Species getSpecie() {
		return species;
	}

	/** Setter pour specie
	 * @param specie the specie to set
	 */
	public void setSpecie(Species species) {
		this.species = species;
	}

	
	
}	