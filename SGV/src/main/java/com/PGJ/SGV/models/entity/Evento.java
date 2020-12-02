package com.PGJ.SGV.models.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;




@Entity
@Table(name = "eventos")
public class Evento implements Serializable {

	@Id
	private Long id;

	@Column(name = "id_adscripcion")
	private Long id_adscripcion;
	@Column(name = "titulo")
	private String title;
	@Column(name = "inicio")
	private String start;
	@Column(name = "fin")
	private String end;


	public Long getId_adscripcion() {
		return id_adscripcion;
	}

	public void setId_adscripcion(Long id_adscripcion) {
		this.id_adscripcion = id_adscripcion;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getStart() {
		return start;
	}

	public void setStart(String start) {
		this.start = start;
	}

	public String getEnd() {
		return end;
	}

	public void setEnd(String end) {
		this.end = end;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	private static final long serialVersionUID = 1L;
}
