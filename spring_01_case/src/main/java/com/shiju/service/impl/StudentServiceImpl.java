package com.shiju.service.impl;

import com.shiju.domain.Student;
import com.shiju.mapper.StudentMapper;
import com.shiju.service.StudentService;

import java.io.IOException;
import java.util.List;

public class StudentServiceImpl implements StudentService {
    //注入的是mapper的代理对象
    private StudentMapper mapper;

    public void setMapper(StudentMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public List<Student> selectAll() throws IOException {
         return mapper.selectAll();
    }

    @Override
    public Student selectById(Integer id) throws IOException {
        return mapper.selectById(id);   //底层使用sqlSession.selectOne()方法
    }

    @Override
    public Integer insert(Student stu) throws IOException {
        return  mapper.insert(stu);   //底层使用sqlSession.selectOne()方法;
    }

    @Override
    public Integer update(Student stu) throws IOException {

        return mapper.update(stu);   //底层使用sqlSession.selectOne()方法;
    }

    @Override
    public Integer delete(Integer id) throws IOException {

        return  mapper.delete(id);
    }
}
