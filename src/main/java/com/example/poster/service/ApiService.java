package com.example.poster.service;

import com.example.poster.domain.Category;
import com.example.poster.domain.Poster;
import com.example.poster.repository.ApiRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class ApiService {

    private final ApiRepository apiRepository;

    //카테고리 저장
    @Transactional
    public Long join(Category category) {

        validateDuplicateCategory(category);
        apiRepository.save(category);
        return category.getCtgryNo();
    }

    private void validateDuplicateCategory(Category category) {
    List<Category> findCategories = apiRepository.findByName(category.getCtgryNm());
    if(!findCategories.isEmpty()) {
        throw new IllegalStateException("이미 존재하는 회원입니다.");
        }
    }

    //카테고리 전체 조회
    public List<Category> findCategories() {
        return apiRepository.findCategoryAll();
    }

    public Category findOne(Long ctgryNo) {
        return apiRepository.findOne(ctgryNo);
    }

    public List<Poster> findPosterMains() {
        return apiRepository.findPosterAll();
    }

    public Long joinPoster(Poster poster) {
        apiRepository.savePoster(poster);
        return poster.getPosterNo();
    }
}
