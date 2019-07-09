package cn.dao;

import org.apache.ibatis.annotations.Param;

public interface LoginMapper {
	/*
	 * µÇÂ¼
	 */
	int toLogin(@Param("devCode")String devCode,
				@Param("devPassword")String devPassword);
}
