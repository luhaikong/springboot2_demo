package com.example.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.entity.Area;

import java.util.List;

/**
 * Created by Administrator on 2020/4/7.
 *
 */
public interface AreaMapper extends BaseMapper<Area> {

    /**
     * 列出区域列表
     * @return
     */
    List<Area> queryArea();

    /**
     * 根据Id 列出具体区域
     * @param areaId
     * @return
     */
    Area queryAreaById(Long areaId);

    /**
     * 插入区域信息
     * @param area
     * @return
     */
    int insertArea(Area area);

    /**
     * 更新区域信息
     * @param area
     * @return
     */
    int updateArea(Area area);

    /**
     * 根据Id 删除区域信息
     * @param areaId
     * @return
     */
    int deleteArea(Long areaId);
}
