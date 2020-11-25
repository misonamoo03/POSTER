import React from 'react';
import styled from 'styled-components';
import PosterItem from './PosterItem';

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
    return(
        <PosterListBlock>
            <PosterItem main={sampleMain} />
            <PosterItem main={sampleMain} />
            <PosterItem main={sampleMain} />
            <PosterItem main={sampleMain} />
            <PosterItem main={sampleMain} />
            <PosterItem main={sampleMain} />
        </PosterListBlock>
    )
}

export default PosterList;