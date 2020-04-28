package com.example.demo.service.area.impl;

import com.example.demo.entity.Area;
import com.example.demo.mapper.AreaMapper;
import com.example.demo.service.area.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2020/4/7.
 *
 */
@Service
public class AreaServiceImpl implements AreaService {

    @Autowired
    private AreaMapper areaMapper;

    @Override
    public List<Area> getAreaList() {
        return areaMapper.queryArea();
    }

    @Override
    public Area getAreaById(Long areaId) {
        return areaMapper.queryAreaById(areaId);
    }

    @Transactional
    @Override
    public boolean addArea(Area area) {
        if (area.getAreaName()!=null&&!"".equals(area.getAreaName())){
            area.setCreateTime(new Date());
            area.setLastEditTime(new Date());
            try {
                int effectedNum = areaMapper.insertArea(area);
                if (effectedNum>0){
                    return true;
                } else {
                    throw new RuntimeException("插入区域信息失败！");
                }
            } catch (Exception e){
                throw new RuntimeException("插入区域信息失败:"+e.getMessage());
            }
        } else {
            throw new RuntimeException("区域信息不能为空！");
        }
    }

    @Override
    public boolean modifyArea(Area area) {
        if (area.getAreaId()!=null&&!"".equals(area.getAreaId())){
            area.setLastEditTime(new Date());
            try {
                int effectedNum = areaMapper.updateArea(area);
                if (effectedNum>0){
                    return true;
                } else {
                    throw new RuntimeException("更新区域信息失败！");
                }
            } catch (Exception e){
                throw new RuntimeException("更新区域信息失败:"+e.getMessage());
            }
        } else {
            throw new RuntimeException("区域ID不能为空！");
        }
    }

    @Override
    public boolean deleteArea(Long areaId) {
        if(areaId>0){
            try {
                int effectedNum = areaMapper.deleteArea(areaId);
                if (effectedNum>0){
                    return true;
                } else {
                    throw new RuntimeException("删除区域信息失败！");
                }
            } catch (Exception e){
                throw new RuntimeException("删除区域信息失败:"+e.getMessage());
            }
        } else {
            throw new RuntimeException("区域ID不能为空！");
        }
    }
}
