package com.cropdata.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LanguageDTO {

	private Integer lId;

	private String name;

	private Integer cId;

	public Integer getlId() {
		return lId;
	}

	public void setlId(Integer lId) {
		this.lId = lId;
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

	public LanguageDTO(Integer lId, String name, Integer cId) {
		super();
		this.lId = lId;
		this.name = name;
		this.cId = cId;
	}

	public LanguageDTO() {
		super();
	}

	
	
	
	
	
	
	
	
	
//	private List<CourseDTO> coursesDTO;
}
