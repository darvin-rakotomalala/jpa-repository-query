package com.poc.repository;

import com.poc.model.domain.Tutorial;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Repository
public interface TutorialRepository extends JpaRepository<Tutorial, Long> {

    List<Tutorial> findAll();

    // JPA find by field
    Optional<Tutorial> findById(long id);
    List<Tutorial> findByLevel(int level);
    List<Tutorial> findByPublished(boolean isPublished);
    List<Tutorial> findByLevelIs(int level);
    List<Tutorial> findByLevelEquals(int level);
    List<Tutorial> findByLevelNot(int level);
    List<Tutorial> findByLevelIsNot(int level);

    // JPA find by multiple Columns
    List<Tutorial> findByLevelAndPublished(int level, boolean isPublished);
    List<Tutorial> findByTitleOrDescription(String title, String description);
    List<Tutorial> findByTitleContainingIgnoreCaseAndPublished(String title, boolean isPublished);

    // JPA Like Query
    List<Tutorial> findByTitleLike(String title);
    List<Tutorial> findByTitleStartingWith(String title);
    List<Tutorial> findByTitleEndingWith(String title);
    List<Tutorial> findByTitleContaining(String title);
    List<Tutorial> findByTitleContainingOrDescriptionContaining(String title, String description);
    List<Tutorial> findByTitleContainingAndPublished(String title, boolean isPublished);
    List<Tutorial> findByTitleContainingIgnoreCase(String title);

    // JPA Boolean Query
    List<Tutorial> findByPublishedTrue();
    List<Tutorial> findByPublishedFalse();

    // JPA Repository Query with Comparison
    List<Tutorial> findByLevelGreaterThan(int level);
    List<Tutorial> findByCreatedAtGreaterThanEqual(Date date);
    List<Tutorial> findByCreatedAtAfter(Date date);
    List<Tutorial> findByCreatedAtBefore(Date date);
    List<Tutorial> findByLevelBetween(int start, int end);
    List<Tutorial> findByLevelBetweenAndPublished(int start, int end, boolean isPublished);
    List<Tutorial> findByCreatedAtBetween(Date start, Date end);

    // JPA Repository Query with Sorting
    List<Tutorial> findByOrderByLevel();
    List<Tutorial> findByOrderByLevelAsc();
    List<Tutorial> findByOrderByLevelDesc();
    List<Tutorial> findByTitleContainingOrderByLevelDesc(String title);
    List<Tutorial> findByPublishedOrderByCreatedAtDesc(boolean isPublished);
    List<Tutorial> findByTitleContaining(String title, Sort sort); // ("at", Sort.by("level").descending())
    List<Tutorial> findByPublished(boolean isPublished, Sort sort); // (false, Sort.by("level").descending());

    // JPA Repository Query with Pagination and Sorting
    Page<Tutorial> findAll(Pageable pageable);
    Page<Tutorial> findByTitleContainingIgnoreCase(String title, Pageable pageable);

    // JPA Delete multiple Rows
    @Transactional
    void deleteAllByCreatedAtBefore(Date date);

}
