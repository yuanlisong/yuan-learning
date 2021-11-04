package com.yuanlisong.boot1.mbg.mapper;

import com.yuanlisong.boot1.mbg.model.Bookshelf;
import com.yuanlisong.boot1.mbg.model.BookshelfExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BookshelfMapper {
    int countByExample(BookshelfExample example);

    int deleteByExample(BookshelfExample example);

    int insert(Bookshelf record);

    int insertSelective(Bookshelf record);

    List<Bookshelf> selectByExample(BookshelfExample example);

    int updateByExampleSelective(@Param("record") Bookshelf record, @Param("example") BookshelfExample example);

    int updateByExample(@Param("record") Bookshelf record, @Param("example") BookshelfExample example);
}