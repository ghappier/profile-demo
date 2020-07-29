package com.xiaojz.profile.repository.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xiaojz.profile.repository.entity.Area;
import com.xiaojz.profile.repository.mapper.AreaMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class AreaServiceImpl extends ServiceImpl<AreaMapper, Area> implements AreaService {
}
