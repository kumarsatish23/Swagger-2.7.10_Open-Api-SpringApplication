package in.Ecommerce.service;

import java.util.List;

import in.Ecommerce.binding.Course;

public interface CourseService {
	public String upsert(Course course);
	public Course getById(Integer cid);
	public List<Course> getAllCourse();
	public String deleteById(Integer cid);
}
