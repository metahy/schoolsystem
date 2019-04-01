package com.school.system.dao;

import com.school.system.domain.CourseStudent;
import com.school.system.domain.CourseStudentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CourseStudentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course_student
     *
     * @mbg.generated Mon Apr 01 19:33:34 CST 2019
     */
    long countByExample(CourseStudentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course_student
     *
     * @mbg.generated Mon Apr 01 19:33:34 CST 2019
     */
    int deleteByExample(CourseStudentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course_student
     *
     * @mbg.generated Mon Apr 01 19:33:34 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course_student
     *
     * @mbg.generated Mon Apr 01 19:33:34 CST 2019
     */
    int insert(CourseStudent record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course_student
     *
     * @mbg.generated Mon Apr 01 19:33:34 CST 2019
     */
    int insertSelective(CourseStudent record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course_student
     *
     * @mbg.generated Mon Apr 01 19:33:34 CST 2019
     */
    List<CourseStudent> selectByExample(CourseStudentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course_student
     *
     * @mbg.generated Mon Apr 01 19:33:34 CST 2019
     */
    CourseStudent selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course_student
     *
     * @mbg.generated Mon Apr 01 19:33:34 CST 2019
     */
    int updateByExampleSelective(@Param("record") CourseStudent record, @Param("example") CourseStudentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course_student
     *
     * @mbg.generated Mon Apr 01 19:33:34 CST 2019
     */
    int updateByExample(@Param("record") CourseStudent record, @Param("example") CourseStudentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course_student
     *
     * @mbg.generated Mon Apr 01 19:33:34 CST 2019
     */
    int updateByPrimaryKeySelective(CourseStudent record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course_student
     *
     * @mbg.generated Mon Apr 01 19:33:34 CST 2019
     */
    int updateByPrimaryKey(CourseStudent record);
}