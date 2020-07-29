package com.xiaojz.profile.web.controller;

import com.xiaojz.profile.repository.entity.Area;
import com.xiaojz.profile.repository.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/area")
public class AreaController {

    @Autowired
    private AreaService areaService;

    @GetMapping("/list")
    public List<Area> list() {
        return areaService.list();
    }
}
