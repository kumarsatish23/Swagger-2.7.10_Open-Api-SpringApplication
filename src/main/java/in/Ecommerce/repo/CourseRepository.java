package in.Ecommerce.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.Ecommerce.binding.Course;

public interface CourseRepository extends JpaRepository<Course, Serializable> {

}