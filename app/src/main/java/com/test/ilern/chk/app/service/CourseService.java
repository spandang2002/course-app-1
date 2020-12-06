package com.test.ilern.chk.app.service;

import com.test.ilern.chk.app.data.Course;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
@Data
public class CourseService {

    List<Course> courseList = new ArrayList<>(Arrays.asList(new Course("java", "java Course", "Description of java"),
            new Course("c", "c Course", "Description of c"),
            new Course("cpp", "cpp Course", "Description of cpp")));

    public Course getCourseBasedOnID(String course_id) {

        return courseList.stream().filter(
                t -> t.getId().equals(course_id)).findFirst().get();
    }

    public Course addCourse(Course aCourse) {
        courseList.add(aCourse);
        return aCourse;
    }

    public void deleteCourse(String id) {
        courseList.removeIf(t -> t.getId().equals(id));
    }

    public void updateCourse(Course aCourse) {

        for (int i = 0; i < courseList.size(); i++) {
            Course course = courseList.get(i);
            if (aCourse.getId().equals(course.getId())) {
                courseList.set(i, aCourse);
                return;
            }
        }
    }
}
