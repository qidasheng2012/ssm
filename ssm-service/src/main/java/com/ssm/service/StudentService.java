package com.ssm.service;

import com.ssm.pojo.ResponseEntity;
import com.ssm.vo.StudentVO;

import java.util.List;

/**
 * @author qp
 * @date 2019/5/1
 */
public interface StudentService {

    /**
     * 分页查询 学生信息
     * @param stu
     * @return
     */
    ResponseEntity<List<StudentVO>> findStudentListByPage(StudentVO stu);

    /**
     * 查询 学生信息
     * @param stuId 学生编号
     * @return
     */
    ResponseEntity<StudentVO> findStudentInfoByStuId(Integer stuId);

    /**
     * 添加 学生信息
     * @param stu
     * @return
     */
    ResponseEntity<Object> insertStudent(StudentVO stu);

    /**
     * 更新 学生信息
     * @param stu
     * @return
     */
    ResponseEntity<Object> updateStudentByStuId(StudentVO stu);

    /**
     * 删除 学生信息
     * @param stuId
     * @return
     */
    ResponseEntity<Object> deleteStudentByStuId(Integer stuId);

}