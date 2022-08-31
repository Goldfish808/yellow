package site.metacoding.yellow.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Products { //Entity
	@Id
	private Integer id;
	private String name;
	private Integer price;
	private Integer qty;
	
}
