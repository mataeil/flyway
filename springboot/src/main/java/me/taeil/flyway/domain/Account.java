package me.taeil.flyway.domain;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter@Setter
@EqualsAndHashCode
public class Account {
	@Id
	@GeneratedValue
	private Long id;

	@Column(length = 50)
	private String username;

	private String password;

	private String email;
}
