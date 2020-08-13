package databasePack;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-10-10T00:02:31")
@StaticMetamodel(Student.class)
public class Student_ { 

    public static volatile SingularAttribute<Student, String> firstName;
    public static volatile SingularAttribute<Student, String> lastName;
    public static volatile SingularAttribute<Student, Date> birthdate;
    public static volatile SingularAttribute<Student, String> address;
    public static volatile SingularAttribute<Student, String> phone;
    public static volatile SingularAttribute<Student, Character> sex;
    public static volatile SingularAttribute<Student, Integer> id;

}