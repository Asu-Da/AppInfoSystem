package cn.dao;

import org.apache.ibatis.annotations.Param;

public interface LoginMapper {
	/*
	 * ��¼
	 */
	int toLogin(@Param("devCode")String devCode,
				@Param("devPassword")String devPassword);
}
