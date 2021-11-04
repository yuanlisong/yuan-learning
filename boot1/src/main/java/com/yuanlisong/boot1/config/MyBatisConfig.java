package com.yuanlisong.boot1.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * MyBatis配置类
 */
@Configuration
@MapperScan("com.yuanlisong.boot1.mbg.mapper")
public class MyBatisConfig {
}
