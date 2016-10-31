package com.course.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="role")
public class Role {
	
	private Integer roleId;
	private String name;
	
	private Set<Power> powers=new HashSet<Power>(0);

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getRoleId() {
		return roleId;
	}
	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@ManyToMany(cascade=CascadeType.PERSIST)
	@JoinTable(
			name="rolepowerall",
			joinColumns={@JoinColumn(name="roleId")},
			inverseJoinColumns={@JoinColumn(name="powerId")})
	public Set<Power> getPowers() {
		return powers;
	}
	public void setPowers(Set<Power> powers) {
		this.powers = powers;
	}
	

}
