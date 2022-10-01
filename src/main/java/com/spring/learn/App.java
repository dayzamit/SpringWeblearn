package com.spring.learn;

import com.spring.learn.auto.wire.annotation.Emp;
import com.spring.learn.javaconfig.JavaConfig;
import com.spring.learn.spel.Demo;
import com.spring.learn.standalone.collections.Person;
import com.spring.learn.injectbyref.A;
import com.spring.learn.lifecycle.Samosa;

import com.spring.learn.javaconfig.bean.annotation.Student;
import com.spring.learn.stereotype.Teacher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
         loadbeanviaconfig();

    }

    public static void loadbeanviaconfig()
    {

        AbstractApplicationContext applicationContext = new AnnotationConfigApplicationContext(JavaConfig.class);
        Student studentobj =applicationContext.getBean("getStudent",Student.class);
        System.out.println(studentobj);
        studentobj.doStudy();
        applicationContext.registerShutdownHook();
    }

    public static void loadBeanViaStereotype() {
        AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("stereotypeconfig.xml");
//        Student student =applicationContext.getBean("stuObj",Student.class);
//        System.out.println(student.hashCode());
        Teacher teacherOBJ =applicationContext.getBean("teacherObj", Teacher.class);
        System.out.println(teacherOBJ.hashCode());

        Teacher teacherOBJ1 =applicationContext.getBean("teacherObj", Teacher.class);
        System.out.println(teacherOBJ1.hashCode());
        applicationContext.registerShutdownHook();


    }

    public static void loadCollectionViaSpel() {
        AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("spelconfig.xml");
        Demo dempSpel =applicationContext.getBean(Demo.class);
        System.out.println(dempSpel);
        applicationContext.registerShutdownHook();


    }


    public static void loadCollectionViaXML() {
        AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("aloncollectionconfig.xml");
        Person person =applicationContext.getBean(Person.class);
        System.out.println(person);
        applicationContext.registerShutdownHook();


    }
    public static void loadBeanViaAutoWireAnnotation() {
        AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("autowireannotation.xml");
        Emp emp2 =applicationContext.getBean(Emp.class);
        System.out.println(emp2.toString());
        applicationContext.registerShutdownHook();


    }


    public static void loadBeanViaAutoWire() {
        AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("autoconfig.xml");
            Emp emp1 =applicationContext.getBean(Emp.class);
        Emp emp2 =applicationContext.getBean(Emp.class);
        System.out.println(emp1.toString());
        applicationContext.registerShutdownHook();


    }

    public static void loadBeanLifecycle() {
        AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("beanlifecylceconfig.xml");
        System.out.println(((Samosa) applicationContext.getBean("sobj")).getPrice());
        applicationContext.registerShutdownHook();


    }


    public static void loadRefObjViaIOC() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("refconfig.xml");
        System.out.println(((A) applicationContext.getBean("aref")).getOb().getY());


    }


    public static void loadPerViaConIoc() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ciconfig.xml");

        Person person = (Person) applicationContext.getBean("personObj");
        System.out.println(person);

        Person person1 = (Person) applicationContext.getBean("personObj1");
        System.out.println(person1);
//        System.out.println(((A) applicationContext.getBean("aref")).getOb().getY());
    }

    public static void loadEmpViaIOC() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");
        Student student = (Student) applicationContext.getBean("student1");
     //   System.out.println(student.getStudentName());
        student = (Student) applicationContext.getBean("student2");
       // System.out.println(student.getStudentName());
    }

}
