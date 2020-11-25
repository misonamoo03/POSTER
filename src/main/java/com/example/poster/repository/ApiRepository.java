package com.example.poster.repository;

import com.example.poster.domain.Category;
import com.example.poster.domain.Poster;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class ApiRepository {

    private final EntityManager em;

    public void save(Category category) {
        em.persist(category);
    }

    public Category findOne(Long id) {
        return em.find(Category.class, id);
    }
    public List<Category> findCategoryAll() {
        return em.createQuery("select c from Category c", Category.class)
                .getResultList();
    }

    public List<Category> findByName(String name) {
        return em.createQuery("select c from Category c where c.ctgryNm = :ctgryNm", Category.class)
                .setParameter("ctgryNm", name)
                .getResultList();
    }

    public List<Poster> findPosterAll() {
        return em.createQuery("select m from posterMain m", Poster.class)
                .getResultList();
    }

    public Poster findOnePoster(Long id) {
        return em.find(Poster.class, id);
    }

    public void savePoster(Poster poster) {
        em.persist(poster);
    }
}
