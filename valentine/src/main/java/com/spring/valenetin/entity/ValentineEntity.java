package com.spring.valenetin.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

@Entity
@Table(name = "valentine")
public class ValentineEntity implements Serializable {
	
	@Id
	@GenericGenerator(name= "anil", strategy="increment")
	@GeneratedValue(generator = "anil")

	@Column(name = "id")
	private int id;
	@Column(name = "name")
	private String name; 
	@Column(name = "status")
	private String status;
	@Column(name = "amt_spent")
	private	double ammountSpent;
	@Column(name = "gift")
	private	String gift;
	
	public ValentineEntity() 
	{
		System.out.println("create\t"+this.getClass().getSimpleName());
	}

	public ValentineEntity( String name, String status, double ammountSpent, String gift) {
		super();
		this.name = name;
		this.status = status;
		this.ammountSpent = ammountSpent;
		this.gift = gift;
	}
	
	
}
