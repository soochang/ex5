package com.choa.member.student;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.choa.ex5.MyAbstractTestUnit;

public class StudentDAOImplTest extends MyAbstractTestUnit{
   
   @Autowired
   private StudentDAOImpl studentDAOImpl;
   @Autowired
   private StudentServiceImpl studentServiceImpl;
   private static StudentDTO studentDTO;
   
   @Test
   public void test() throws Exception{
      /*int result=studentServiceImpl.memberJoin(studentDTO);
      assertEquals(1, result);*/
   }
   /*@BeforeClass
   public static void makeStudent(){
      studentDTO = new StudentDTO();
      studentDTO.setId("choachoa");
      studentDTO.setPw("choachoa");
      studentDTO.setName("choachoa");
      studentDTO.setAge(20);
      studentDTO.setGrade("s");
      studentDTO.setFileName("choachoa");
      studentDTO.setOriName("choachoa");
      studentDTO.setSid("choachoa");
      studentDTO.setPhone("choachoa");
      studentDTO.setTid("choachoa");
   }*/

}