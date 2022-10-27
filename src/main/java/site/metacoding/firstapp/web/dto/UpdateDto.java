package site.metacoding.firstapp.web.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UpdateDto {
	private String productName;
	private Integer productPrice;
	private Integer productQty;
}
