package com.example.jdbcdemo.service;

import java.sql.Connection;
import java.util.List;

import com.example.jdbcdemo.domain.Flower;

public interface BallManager {	
	int addBall(Ball ball);
	int updateBall(Ball ball);
	Connection getConnection();
	void addAll(List<Ball> balls);
	void deleteAll(List<Ball> balls);
	List<Ball> getAllBalls();
	Ball searchBall(String s);
	void clearBalls();
}
