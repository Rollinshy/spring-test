package org.example.jdbcTemplate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.util.List;

public class StudentaddImpl implements Studentadd{
    @Autowired
   private  JdbcTemplate jdbcTemplate;


    @Override
    public void addStudent(Student student) {
        Object[] args={student.getId(),student.getName(),student.getSex()};
        String sql="insert into stu values(?,?,?)";
       int update= jdbcTemplate.update(sql,args);
        System.out.println(update);
    }

    @Override
    public void deleteStudent(String id) {
        Object[] args={id};
        String sql="delete from stu where stuid=?";
        int update= jdbcTemplate.update(sql,args);
        System.out.println(update);
    }

    @Override
    public int selectCount() {
        String sql="select count(*)from stu";
        int update=jdbcTemplate.queryForObject(sql,Integer.class);

        return update;
    }

    @Override
    public void updateStudent(Student student,String id) {
        Object[] args={student.getId(),student.getName(),student.getSex(),id};
        String sql="update stu set stuid=?,stuname=?,stusex=?where stuid=?";
        int update= jdbcTemplate.update(sql,args);
        System.out.println(update);
    }

    @Override
    public List<Student> queryStudentBySex(String sex) {
        String sql="select *from stu where sex=?";
        List<Student> list=jdbcTemplate.query(sql, new BeanPropertyRowMapper<Student>(Student.class),sex);
        return list;
    }

    @Override
    public void addBatchUpdate(List<Object[]> list) {
        String sql="insert into stu values(?,?,?)";
        jdbcTemplate.batchUpdate(sql,list);
    }
}
