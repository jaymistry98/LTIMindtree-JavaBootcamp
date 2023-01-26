package com.app;

public class StudentScore {
	
	public IDatabase database;
	
	public StudentScore(IDatabase database) {
		this.database = database;
	}
	
	public void calculateAndStore(String sid, int[] scores) {
		int total = 0;
		for(int score : scores) {
			total = total + score;
		}
		database.updateScore(sid, total);
	}
}
