package net.chenlin.dp.modules.sys.dao;

import net.chenlin.dp.modules.sys.entity.QuartzJobEntity;
import org.apache.ibatis.annotations.Mapper;


/**
 * 定时任务
 *
 */
@Mapper
public interface QuartzJobMapper extends BaseMapper<QuartzJobEntity> {

}
