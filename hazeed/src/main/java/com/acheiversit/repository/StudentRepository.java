package com.acheiversit.repository;

import com.acheiversit.dto.StudentDTO;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class StudentRepository {



    private static List<StudentDTO> student;

    public StudentRepository(){

        student=new ArrayList<>();
        student.add(new StudentDTO(1,"hazz",11,"9734659346"));

    }
    public StudentDTO get(int id){
        return student.stream().filter(stu -> stu.getId()==id).findAny().get();
    }

    public void addStudent(StudentDTO s){
        student.add(s);
    }

    public void deleteStudent(int  id){

        StudentDTO s=student.stream().filter(stu -> stu.getId()==id).findAny().get();;
        student.remove(s);
    }

    public void updateStudent(StudentDTO s){
        StudentDTO s1= student.stream().filter(stu -> stu.getId()==stu.getId()).findAny().get();
        int index= student.indexOf(s1);
        student.set(index,s);
    }



}
