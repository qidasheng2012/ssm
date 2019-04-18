package com.ssm.dao;

import com.ssm.vo.StudentVO;

import java.util.List;

/**
 * @author qp
 * @date 2019/5/1
 */
public interface StudentMapper {

    List<StudentVO> findStudentListByPage(StudentVO stu);

    StudentVO findStudentInfoByStuId(Integer stuId);

    int insertStudent(StudentVO stu);

    int updateStudentByStuId(StudentVO stu);

    int deleteStudentByStuId(Integer stuId);

}