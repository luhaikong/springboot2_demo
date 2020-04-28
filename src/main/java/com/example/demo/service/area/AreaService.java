package com.example.demo.service.area;

import com.example.demo.entity.Area;

import java.util.List;

/**
 * Created by Administrator on 2020/4/7.
 *
 */
public interface AreaService {
    /**
     * 列出区域列表
     * @return
     */
    List<Area> getAreaList();

    /**
     * 根据Id 列出具体区域
     * @param areaId
     * @return
     */
    Area getAreaById(Long areaId);

    /**
     * 插入区域信息
     * @param area
     * @return
     */
    boolean addArea(Area area);

    /**
     * 更新区域信息
     * @param area
     * @return
     */
    boolean modifyArea(Area area);

    /**
     * 根据Id 删除区域信息
     * @param areaId
     * @return
     */
    boolean deleteArea(Long areaId);
}
