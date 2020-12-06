package com.test.ilern.chk.app.controller;

import com.test.ilern.chk.app.data.Course;
import com.test.ilern.chk.app.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {

    @Autowired
    CourseService courseService;

    @RequestMapping("/course")
    public List<Course> getAllCourses()
    {
        return courseService.getCourseList();
    }

    // @RequestMapping(method = RequestMethod.GET, value = "/course/{id}")
    @GetMapping("/course/{id}")
    public Course getCourseBasedOnID(@PathVariable("id") String course_id )
    {
        return courseService.getCourseBasedOnID(course_id);
    }

    // @RequestMapping(method = RequestMethod.POST, value = "/course")
    @PostMapping("/course")
    public Course addCourse(@RequestBody Course aCourse)
    {
        return courseService.addCourse(aCourse);
    }

    // @RequestMapping(method = RequestMethod.DELETE, value = "/course/id")
    @DeleteMapping("/course/{id}")
    public void deleteCourse(@PathVariable("id") String id)
    {
        courseService.deleteCourse(id);
    }

    @PutMapping("/course")
    public void updateCourse(@RequestBody Course aCourse)
    {
        courseService.updateCourse(aCourse);
    }
}
