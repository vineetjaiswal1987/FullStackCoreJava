package org.vineet.springjdbcex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.vineet.springjdbcex.model.Student;
import org.vineet.springjdbcex.service.StudentService;

import java.util.List;

@SpringBootApplication
public class SpringJdbcExApplication {

    public static void main(String[] args) {
        ApplicationContext context=  SpringApplication.run(SpringJdbcExApplication.class, args);
        Student s=context.getBean(Student.class);
        s.setRollNo(1);
        s.setName("Vineet");
        s.setMarks(100);

        StudentService service=context.getBean(StudentService.class);
        service.addStudent(s);

        List<Student> students= service.getStudents();
        System.out.println(students);
    }

}
