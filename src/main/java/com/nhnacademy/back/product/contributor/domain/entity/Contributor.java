package com.nhnacademy.back.product.contributor.domain.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Contributor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long contributorId;

	@Column(length = 20, nullable = false)
	private String contributorName;

	@ManyToOne(optional = false)
	@JoinColumn(name = "position_id")
	private Position position;

	public Contributor(String contributorName, Position position) {
		this.contributorName = contributorName;
		this.position = position;
	}

	public void setContributorName(String contributorName) {
		this.contributorName = contributorName;
	}

	public void setPosition(Position position) {
		this.position = position;
	}
}
