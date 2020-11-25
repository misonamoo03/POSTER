import React from 'react';
import styled from 'styled-components';
import logo from '../../logo.svg';

const PosterItemBlock = styled.div`
    display: flex;
    .thumbnail {
        margin-right: 1rem;
        img {
            display: block;
            width: 160px;
            height: 100px;
            object-fit: cover;
        }
    }
    .contents {
        h2 {
            margin: 0;
            a {
                color: black;
            }
        }
        p {
            margin: 0;
            line-height: 1.5;
            margin-top: 0.5rem;
            white-space: normal;
        }
    }
    & + & {
        margin-top: 3rem;
    }
    `;
    const PosterItem = ({ category }) => {
        const { ctgryNo, ctgryNm } = category;
        return (
            <PosterItemBlock>
                    <div className="thumbnail">
                       <img src={logo} />
                    </div>
                <div className="contents">
                    <h2>
                        {ctgryNo}
                    </h2><br />
                        {ctgryNm}
                </div>
            </PosterItemBlock>
        );
    };

export default PosterItem;