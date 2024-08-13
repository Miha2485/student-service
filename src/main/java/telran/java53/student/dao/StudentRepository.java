package telran.java53.student.dao;

import java.util.stream.Stream;

import org.springframework.data.mongodb.repository.MongoRepository;

import telran.java53.student.model.Student;

public interface StudentRepository extends MongoRepository<Student, Long>{
	Stream<Student> getAllBy();
	
	Stream<Student> findByNameIgnoreCase(String name);
}
