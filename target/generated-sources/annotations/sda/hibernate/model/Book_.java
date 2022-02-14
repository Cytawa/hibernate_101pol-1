package sda.hibernate.model;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Book.class)
public abstract class Book_ {

	public static volatile SingularAttribute<Book, String> name;
	public static volatile SingularAttribute<Book, Integer> id;
	public static volatile SetAttribute<Book, Author> authors;

	public static final String NAME = "name";
	public static final String ID = "id";
	public static final String AUTHORS = "authors";

}

