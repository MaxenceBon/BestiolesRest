package fr.diginamic.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Species {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
		
	@Column(name="common_name")
	private String commonName;
		
	@Column(name="latin_name")
	private String latinName;
	
	@Override
    public String toString() {
        return commonName;
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

	/** Getter pour common_name
	 * @return the common_name
	 */
	public String getCommonName() {
		return commonName;
	}

	/** Setter pour common_name
	 * @param common_name the common_name to set
	 */
	public void setCommon_name(String commonName) {
		this.commonName = commonName;
	}

	/** Getter pour latinName
	 * @return the latinName
	 */
	public String getLatinName() {
		return latinName;
	}

	/** Setter pour latinName
	 * @param latinName the latinName to set
	 */
	public void setLatinName(String latinName) {
		this.latinName = latinName;
	}
	
	
	
}
