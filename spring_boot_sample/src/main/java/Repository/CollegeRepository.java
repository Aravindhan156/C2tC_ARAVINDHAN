package Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import model.College;

@Repository
public interface CollegeRepository extends JpaRepository<College, Long> {
    College findByCollegeCode(String collegeCode);
}
