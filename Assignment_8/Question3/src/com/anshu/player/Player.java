package com.anshu.player;

import java.util.Scanner;

public class Player  {
	
	private int player_id;
	private String PLayer_name;
	private int age;
	private int matches_played;
	
	public Player() {
	 this(0,"",0,0);
	}
	public Player(int player_id, String pLayer_name, int age, int matches_played) {
		
		this.player_id = player_id;
		PLayer_name = pLayer_name;
		this.age = age;
		this.matches_played = matches_played;
	}
	public int getPlayer_id() {
		return player_id;
	}
	public void setPlayer_id(int player_id) {
		this.player_id = player_id;
	}
	public String getPLayer_name() {
		return PLayer_name;
	}
	public void setPLayer_name(String pLayer_name) {
		PLayer_name = pLayer_name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getMatches_played() {
		return matches_played;
	}
	public void setMatches_played(int matches_played) {
		this.matches_played = matches_played;
	}
	
	public void accept() {
		Scanner sc= new Scanner(System.in);
		System.out.println("ENTER PLAYER ID =");
		player_id=sc.nextInt();
		System.out.println("ENTER PLAYER name =");
		PLayer_name=sc.next();
		System.out.println("ENTER PLAYER age=");
		age=sc.nextInt();
		System.out.println("ENTER PLAYER no of matched played =");
		matches_played=sc.nextInt();
		
		
	}
	@Override
	public String toString() {
		return "Player [player_id=" + player_id + ", PLayer_name=" + PLayer_name + ", age=" + age + ", matches_played="
				+ matches_played + "]";
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	
	
	
	
	

}
