package com.xiaojz.profile.web.controller;

import com.xiaojz.profile.commons.CommonsProperties;
import com.xiaojz.profile.repository.ServiceProperties;
import com.xiaojz.profile.utils.UtilsProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/profile")
public class ProfileController {

    @Autowired
    private CommonsProperties commonsProperties;
    @Autowired
    private ServiceProperties serviceProperties;
    @Autowired
    private UtilsProperties utilsProperties;

    @GetMapping("/properties")
    public Map<String, String> properties() {
        Map<String, String> map = new HashMap<>();
        map.put("commons1", commonsProperties.getProp1());
        map.put("commons2", commonsProperties.getProp2());
        map.put("commons3", commonsProperties.getProp3());
        map.put("service1", serviceProperties.getProp1());
        map.put("service2", serviceProperties.getProp2());
        map.put("service3", serviceProperties.getProp3());
        map.put("utils1", utilsProperties.getProp1());
        map.put("utils2", utilsProperties.getProp2());
        map.put("utils3", utilsProperties.getProp3());
        return map;
    }
}
