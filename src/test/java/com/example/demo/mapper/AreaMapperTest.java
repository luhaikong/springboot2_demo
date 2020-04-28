package com.example.demo.mapper;

import com.example.demo.entity.Area;
import jdk.nashorn.internal.ir.annotations.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by Administrator on 2020/4/7.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class AreaMapperTest {

    @Autowired
    private AreaMapper areaMapper;

    @Test
    public void queryArea() {
        List<Area> areaList = areaMapper.selectList(null);
        assertEquals(3,areaList.size());
    }

    @Test
    public void queryAreaById() {
        Area area = areaMapper.selectById(1L);
        assertEquals("南苑",area.getAreaName());
    }

    @Test
    @Ignore
    public void insertArea() {
        Area area = new Area();
        area.setAreaName("泰华苑");
        area.setPriority(1);
        int effectedNum = areaMapper.insertArea(area);
        assertEquals(1,effectedNum);
    }

    @Test
//    @Ignore
    public void updateArea() {
        Area area = new Area();
        area.setAreaName("西西苑");
        area.setAreaId(3L);
        area.setLastEditTime(new Date());
        int effectedNum = areaMapper.updateArea(area);
        assertEquals(1,effectedNum);
    }

    @Test
//    @Ignore
    public void deleteArea() {
        int effectedNum = areaMapper.deleteArea(3L);
        assertEquals(1,effectedNum);
    }
}