package com.luoxiao.service;

import java.util.List;

import com.luoxiao.model.Blog;

public interface BlogService {

	void insert(Blog blog);
	
	Blog selectById(Integer id);
	
	List<Blog> selectAllbyUserId(Integer userId,Integer page,Integer rows);
	
	//搜索
	List<Blog> selectByKeyword(String keyword,Integer page,Integer rows);
}
