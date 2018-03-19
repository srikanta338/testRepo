package com.example.crudSpringBoot.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@Entity
//It is used to mark the class as a persistent Java class.
@Table(name = "notes")
//@Table annotation is used to provide the details of the 
//table that this entity will be mapped to

@EntityListeners(AuditingEntityListener.class)

@JsonIgnoreProperties(value= {"createdAt", "updatedAt"}, allowGetters=true)
//@JsonIgnoreProperties annotation is a Jackson annotation.
//Spring Boot uses Jackson for Serializing and Deserializing Java objects to and from JSON.
public class Note implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@NotBlank
	private String title;
	
	@NotBlank
	private String content;
	
	
	@Column(nullable=false, updatable=false)
	@Temporal(TemporalType.TIMESTAMP)
	//@Temporal annotation is used with java.util.Date and java.util.Calendar classes. 
	//It converts the date and time values from Java  Object to compatible database type and vice versa
	@CreatedDate
	private Date createdAt;
	
    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @LastModifiedDate
    private Date updatedAt;

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

	public String getContent() {
		return content;
	}

	@Override
	public String toString() {
		return "Note [title=" + title + ", content=" + content + "]";
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

}
