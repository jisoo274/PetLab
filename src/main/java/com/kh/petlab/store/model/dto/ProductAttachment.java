package com.kh.petlab.store.model.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductAttachment {
	
	private int attachNo;
	private String productId;
	private String originalFilename;
	private String renamedFilename;
}