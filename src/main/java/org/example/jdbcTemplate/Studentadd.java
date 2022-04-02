package org.example.jdbcTemplate;

import java.util.List;

public interface Studentadd {
    void addStudent( Student student);
    void deleteStudent( String id);
    void updateStudent( Student student ,String id);
    int selectCount();
    List<Student> queryStudentBySex(String sex);
    void addBatchUpdate(List <Object[]> list);
}
