package com.njit.lib.domain;


import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
@Entity
public class Area {
	private Long id;
	private String name;
	private Set<Floor> floors  = new HashSet<Floor>();
	
	@Id
	@GeneratedValue
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
	@OneToMany
	@JoinColumn(name="areaId")
	public Set<Floor> getFloors() {
		return floors;
	}
	public void setFloors(Set<Floor> floors) {
		this.floors = floors;
	}

}
