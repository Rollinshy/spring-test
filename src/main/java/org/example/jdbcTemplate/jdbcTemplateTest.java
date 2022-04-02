package org.example.jdbcTemplate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class jdbcTemplateTest {
    public static void main(String[] args) {
        ApplicationContext ac=new ClassPathXmlApplicationContext("beans2.xml");

        Studentadd s=(StudentaddImpl)ac.getBean("studentaddImpl");
////        s.addStudent(new Student("008","zhangsan","男"));
////        s.deleteStudent("008");
//          s.updateStudent(new Student("002","lisi","男"),"001");
//        System.out.println("stu表中有"+s.selectCount()+"条记录");
//        List<Object[]> list=new ArrayList<>();
//        list.add(new Object[]{"003","xiaoming","男"});
//        list.add(new Object[]{"004","xiaomei","女"});
//        list.add(new Object[]{"005","xiaoli","女"});
//        s.addBatchUpdate(list);
         List<Student> list=(List<Student>)s.queryStudentBySex("男");
        for (Student l :list
             ) {
            System.out.println(l.toString());
        }
    }
}
