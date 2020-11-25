// page/lp.js
import React from "react";

function ItemCard({ key, ImageURL, ctgryNm }) {
  return (
    <li className="component component--item_card" key={key}>
      <img src={ImageURL} className="image--itemcard" alt="" />
      <p>
        카테고리명 : <span className="text--brand">{ctgryNm}</span>
      </p>
    </li>
  );
}
export default ItemCard;
