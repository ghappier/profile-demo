package com.xiaojz.profile.repository.config;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class CustomMetaHandler implements MetaObjectHandler {

    /**
     * 新增数据执行
     * @param metaObject
     */
    @Override
    public void insertFill(MetaObject metaObject) {
        Date now = new Date();

        // this.setFieldValByName("createTime", now, metaObject); // 版本号3.0.6以及之前的版本
        // this.setFieldValByName("updateTime", now, metaObject); // 版本号3.0.6以及之前的版本

        // this.setInsertFieldValByName("createTime", now, metaObject); // 版本号3.0.6以后
        // this.setInsertFieldValByName("updateTime", now, metaObject); // 版本号3.0.6以后

        this.strictInsertFill(metaObject, "createTime", Date.class, now); // 起始版本 3.3.0(推荐使用)
        // this.fillStrategy(metaObject, "createTime", LocalDateTime.now()); // 也可以使用(3.3.0 该方法有bug请升级到之后的版本如`3.3.1.8-SNAPSHOT`)
        /* 上面选其一使用,下面的已过时(注意 strictInsertFill 有多个方法,详细查看源码) */
        //this.setFieldValByName("operator", "Jerry", metaObject);
        //this.setInsertFieldValByName("operator", "Jerry", metaObject);
    }

    /**
     * 更新数据执行
     * @param metaObject
     */
    @Override
    public void updateFill(MetaObject metaObject) {
        // this.setFieldValByName("updateTime", new Date(), metaObject); // 版本号3.0.6以及之前的版本
        // this.setUpdateFieldValByName("updateTime", new Date(), metaObject); // 版本号3.0.6以后

        this.strictUpdateFill(metaObject, "updateTime", Date.class, new Date()); // 起始版本 3.3.0(推荐使用)
        // this.fillStrategy(metaObject, "updateTime", LocalDateTime.now()); // 也可以使用(3.3.0 该方法有bug请升级到之后的版本如`3.3.1.8-SNAPSHOT`)
        /* 上面选其一使用,下面的已过时(注意 strictUpdateFill 有多个方法,详细查看源码) */
        //this.setFieldValByName("operator", "Tom", metaObject);
        //this.setUpdateFieldValByName("operator", "Tom", metaObject);
    }
}
