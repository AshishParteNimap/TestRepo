package com.role_base.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "User")
public class User {
	@Id
	@GeneratedValue
	
	private Long id;
	private String UsertName;
	private String Password;
	
	@ManyToMany
	@JoinTable(name = "User_Role",joinColumns = @JoinColumn(name="U_id"),
	inverseJoinColumns = @JoinColumn(name="R_id"))
	private Set<Role> roles=new HashSet<>();
	
}
