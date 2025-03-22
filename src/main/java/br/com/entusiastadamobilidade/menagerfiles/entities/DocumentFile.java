package br.com.entusiastadamobilidade.menagerfiles.entities;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_documentfile")
public class DocumentFile {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String title;
	@Column(name = "path_url")
	private String pathUrl;
	private String shortDescription;
	private String longDescription;
	
	public DocumentFile() {
		
	}

	public DocumentFile(Long id, String name, String title, String pathUrl, String shortDescription,
			String longDescription) {

		this.id = id;
		this.name = name;
		this.title = title;
		this.pathUrl = pathUrl;
		this.shortDescription = shortDescription;
		this.longDescription = longDescription;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPathUrl() {
		return pathUrl;
	}

	public void setPathUrl(String pathUrl) {
		this.pathUrl = pathUrl;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	public String getLongDescription() {
		return longDescription;
	}

	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, pathUrl);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DocumentFile other = (DocumentFile) obj;
		return Objects.equals(id, other.id) && Objects.equals(name, other.name)
				&& Objects.equals(pathUrl, other.pathUrl);
	}
	
	
	
	
	
}
