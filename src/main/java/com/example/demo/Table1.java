package com.example.demo;

import java.sql.Timestamp;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Table1 {
    @Id
    // @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
	private Timestamp column1;
	
	protected Table1 () { }
	
	public Table1(Long id, Timestamp column1) {
		this.id = id;
		this.column1 = column1;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Timestamp getColumn1() {
		return column1;
	}

	public void setColumn1(Timestamp column1) {
		this.column1 = column1;
	}
}
