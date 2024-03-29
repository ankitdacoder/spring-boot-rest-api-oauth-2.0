package com.fakeorder.foodorder.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

/**
 * See: https://stackoverflow.com/questions/48784923/is-using-id-field-in-allargsconstructor-while-using-spring-jpa-correct
 * @author developer
 */
@Entity
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public class BaseEntity {

	    @Id
	    @GeneratedValue
	    private Long id;

		public Long getId() {
			return id;
		}
}
