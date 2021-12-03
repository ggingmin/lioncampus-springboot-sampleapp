package com.ggingmin.lioncampus.Repository;

import com.ggingmin.lioncampus.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course, Long> {

    List<Course> findByPaid(boolean paid);

    List<Course> findByTitleContaining(String title);

}
