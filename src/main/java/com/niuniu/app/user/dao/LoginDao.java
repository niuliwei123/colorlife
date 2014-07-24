package com.niuniu.app.user.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import com.niuniu.app.user.domain.LoginKey;

@Component
public interface LoginDao {
	public void addLoginner(@Param("loginner") LoginKey loginner);
}
