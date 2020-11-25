import React, { useState, useEffect } from 'react';
import styled from 'styled-components';
import PosterItem from './PosterItem';
import axios from 'axios';

const PosterListBlock = styled.div`
    box-sizing: border-box;
    padding-bottom: 3rem;
    width: 768px;
    margin: 0 auto;
    margin-top: 2rem;
    @media screen and (max-width: 768px) {
        width: 100%;
        padding-left: 1rem;
        padding-right: 1rem;
    }
`;

const sampleMain = {
    posterTitle: '제목',
    posterContent: '내용',
    posterRegister: '2'
};

const PosterList = () => {
    const [category, setCategory] = useState(null);
    const[loading, setLoading] = useState(false);

    useEffect(() => {
    
        //async를 사용하는 함수 따로 선언
        const fetchData = async() => {
            setLoading(true);
            try {
                const response = await axios.get('/api/category',);
                setCategory(response.data.category);
            } catch (e) {
                console.log(e);
            }
            setLoading(false);
        };
        fetchData();
    }, []);

    // 대기 중일 때
    if(loading) {
        return <PosterListBlock>대기 중...</PosterListBlock>
    }
    // 아직 item 값이 설정되지 않았을 때
    if (!category) {
        return null;
    }

    // item 값이 유효할 때
    return(
        <PosterListBlock>
            {category.map( category => (
                <PosterItem key={category.ctgryNo} category={category} />
            ))}
        </PosterListBlock>
    )
}

export default PosterList;