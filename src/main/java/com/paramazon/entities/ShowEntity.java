package com.paramazon.entities;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "tb_shows")
public class ShowEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@DateTimeFormat(iso = ISO.DATE_TIME)
	@JsonFormat(pattern = "dd-MM-yyyy'T'HH:mm'Z'", timezone = "GMT")
	private LocalDateTime date;
	
	@OneToMany(mappedBy = "show", cascade = {CascadeType.REFRESH, CascadeType.MERGE})
	private List<SingerEntity> singers = new ArrayList<>();
	
	public ShowEntity() {
	}

	

	public ShowEntity(Long id, LocalDateTime date, List<SingerEntity> singers) {
		super();
		this.id = id;
		this.date = date;
		this.singers = singers;
	}


	public LocalDateTime getDate() {
		return date;
	}


	public void setDate(LocalDateTime date) {
		this.date = date;
	}



	public void setSingers(List<SingerEntity> singers) {
		this.singers = singers;
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}


	public List<SingerEntity> getSingers() {
		return singers;
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
		ShowEntity other = (ShowEntity) obj;
		return Objects.equals(id, other.id);
	}
	
}
