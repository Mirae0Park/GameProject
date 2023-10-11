package com.no3.gameproject.repository;

import com.no3.gameproject.dto.ItemSearchDto;
import com.no3.gameproject.dto.MainItemDto;
import com.no3.gameproject.entity.Item;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ItemRepositoryCustom {

    Page<Item> getAdminItemPage(ItemSearchDto itemSearchDto, Pageable pageable);

    Page<MainItemDto> getMainItemPage(ItemSearchDto itemSearchDto, Pageable pageable);

}
