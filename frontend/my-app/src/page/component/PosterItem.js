import React from 'react';
import styled from 'styled-components';

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
    const PosterItem = ({ main }) => {
        const { posterTitle, posterContent, posterRegister } = main;
        return (
            <PosterItemBlock>
                {posterTitle && (
                    <div className="thumbnail">

                    </div>
                )}
                <div className="contents">
                    <h2>
                        {posterContent}
                    </h2>
                <p>{posterRegister}</p>
                </div>
            </PosterItemBlock>
        );
    };

export default PosterItem;