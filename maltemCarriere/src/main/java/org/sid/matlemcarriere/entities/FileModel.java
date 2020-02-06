package org.sid.matlemcarriere.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor @ToString
@Table(name="file_model")
public class FileModel {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;
  
    @Column(name = "name")
    private String name;
    
    @Column(name = "mimetype")
    private String mimetype;
  
    @Lob
    @Column(name="pic")
    private byte[] pic;
	@ManyToOne
	private Employee employee;
}

