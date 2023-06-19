package com.cropdata.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Writer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer wId;

	private String name;

//	@OneToMany(mappedBy = "writer", cascade = CascadeType.ALL)
//	private List<Course> courses;
	
	@ManyToOne
	@JoinColumn(name = "course_id")
	private Course course;
	
	private Integer cId;

	public Integer getwId() {
		return wId;
	}

	public void setwId(Integer wId) {
		this.wId = wId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public Integer getcId() {
		return cId;
	}

	public void setcId(Integer cId) {
		this.cId = cId;
	}

	public Writer(Integer wId, String name, Course course, Integer cId) {
		super();
		this.wId = wId;
		this.name = name;
		this.course = course;
		this.cId = cId;
	}

	public Writer() {
		super();
	}
	
	
	
	
	
}
