package com.jun.mybatis.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Member {
	private Integer id;
	private String username;
	private String userid;
	private String email;
}
