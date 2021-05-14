package iWhisper.firstApp.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@Data
@Entity
@Table(name="zaman")
public class Zaman {
	
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@Column(name="word")
	private String word;
	
	@Column(name="png_id")
	private int pngId;	
	
	
}
