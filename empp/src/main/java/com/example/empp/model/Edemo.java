package com.example.empp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Edemo {
	
	@Id
	private int Id;
	private String Name;
	public int getId() {
		return Id;
	}
	public void setId(int Id) {
		this.Id = Id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String Name) {
		this.Name = Name;
	}
	@Override
	public String toString() {
		return "Edemo [Id=" + Id + ", Name=" + Name + "]";
	}
	
	

}
