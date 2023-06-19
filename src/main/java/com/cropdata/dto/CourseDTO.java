package com.cropdata.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CourseDTO {

	private Integer cId;
	private String name;

	private String description;

	private List<WriterDTO> writerDTOs;

	private List<LanguageDTO> languageDTOs;

	public Integer getcId() {
		return cId;
	}

	public void setcId(Integer cId) {
		this.cId = cId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<WriterDTO> getWriterDTOs() {
		return writerDTOs;
	}

	public void setWriterDTOs(List<WriterDTO> writerDTOs) {
		this.writerDTOs = writerDTOs;
	}

	public List<LanguageDTO> getLanguageDTOs() {
		return languageDTOs;
	}

	public void setLanguageDTOs(List<LanguageDTO> languageDTOs) {
		this.languageDTOs = languageDTOs;
	}

	public CourseDTO(Integer cId, String name, String description, List<WriterDTO> writerDTOs,
			List<LanguageDTO> languageDTOs) {
		super();
		this.cId = cId;
		this.name = name;
		this.description = description;
		this.writerDTOs = writerDTOs;
		this.languageDTOs = languageDTOs;
	}

	public CourseDTO() {
		super();
	}
	
	
	
	

}
