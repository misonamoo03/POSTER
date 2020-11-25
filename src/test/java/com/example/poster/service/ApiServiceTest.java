package com.example.poster.service;

import com.example.poster.domain.Category;
import com.example.poster.domain.Poster;
import com.example.poster.repository.ApiRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class ApiServiceTest {

    @Autowired ApiService apiService;
    @Autowired ApiRepository apiRepository;
    @Autowired EntityManager em;

    @Test
    @Rollback(false)
    public void 카테고리저장() throws Exception {
        Category category = new Category();
        category.setCtgryNm("운동");

        Long savedNo = apiService.join(category);

        assertEquals(category, apiRepository.findOne(savedNo));
    }

    @Test
    public void 중복_회원_예외() throws Exception {

        Category category1 = new Category();
        category1.setCtgryNm("운동");

        Category category2 = new Category();
        category2.setCtgryNm("운동");

        apiService.join(category1);
        try {
            apiService.join(category2);
        } catch (IllegalStateException e) {
            return;
        }

        fail("예외가 발생한다.");
    }

    @Test
    @Rollback(false)
    public void 포스터저장() throws Exception {
        Poster poster = new Poster();
        poster.setPosterTitle("포스터제목");
        poster.setPosterContent("포스터내용");
        poster.setPosterRegister(1L);

        Long savedNo = apiService.joinPoster(poster);

        assertEquals(poster, apiRepository.findOnePoster(savedNo));
    }
}
