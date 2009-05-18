package cn.openlab.oo;

public class InterfaceDemo {

	public static void main(String[] args) {
		FootballPlayer bPlayer = new BlackFootbalPlay();
		FootballPlayer wPlayer = new WhiteFootballPlay();
		if (bPlayer instanceof Black) {
			Black new_name = (Black) bPlayer;
			System.out.println(new_name);
		}
	}
}
