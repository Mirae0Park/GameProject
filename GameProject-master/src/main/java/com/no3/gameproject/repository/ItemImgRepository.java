package com.no3.gameproject.repository;

import com.no3.gameproject.entity.Item;
import com.no3.gameproject.entity.ItemImg;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ItemImgRepository extends JpaRepository<ItemImg, Long> {

    List<ItemImg> findByItemIdOrderByIdAsc(Long itemId);

    ItemImg findByItemIdAndRepimgYn(Long itemId, String repimgYn); // 상품의 대표 이미지를 찾음
}
