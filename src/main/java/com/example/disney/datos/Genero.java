package com.example.disney.datos;

import javax.validation.constraints.NotNull;

import org.hibernate.annotations.Type;

import java.util.Date;
import java.util.Set;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Genero {
	@Id
	@SequenceGenerator(name = "seq_genero", sequenceName = "seq_genero")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_genero")
	private Long id;
	
	private String nombre;
	
	@Lob
	@Column(name="BLOB_COLUMN_GENERO")
	@Type(type = "org.hibernate.type.ImageType")
	private byte[] imageGenero;
	
}
