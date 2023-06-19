package com.cropdata.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WriterDTO {

	private Integer wId;

	private String name;

//	private List<CourseDTO> coursesDTO;

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

	public Integer getcId() {
		return cId;
	}

	public void setcId(Integer cId) {
		this.cId = cId;
	}

	public WriterDTO(Integer wId, String name, Integer cId) {
		super();
		this.wId = wId;
		this.name = name;
		this.cId = cId;
	}

	public WriterDTO() {
		super();
	}
	
	
	
	
	
}
