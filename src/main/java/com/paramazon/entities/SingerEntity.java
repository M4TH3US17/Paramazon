package com.paramazon.entities;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_singers")
public class SingerEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String photograph;
	
	@ManyToOne
	private ShowEntity show;
	
	public SingerEntity() {
	}

	public SingerEntity(Long id, String name, String photograph, ShowEntity show) {
		this.id = id;
		this.name = name;
		this.photograph = photograph;
		this.show = show;
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

	public String getPhotograph() {
		return photograph;
	}

	public void setPhotograph(String photograph) {
		this.photograph = photograph;
	}

	public ShowEntity getShow() {
		return show;
	}

	public void setShow(ShowEntity show) {
		this.show = show;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SingerEntity other = (SingerEntity) obj;
		return Objects.equals(id, other.id);
	}
}
