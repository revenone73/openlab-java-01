package cn.openlab.spring;

public class Hotspot {

	private Fishball f;
	private Beaf beaf;

	public void setFishball(Fishball fishball) {
		this.f = fishball;
	}
	public void setBeaf(Beaf beaf) {
		this.beaf = beaf;
	}
	
	public int getC() {
		int c = 0;
		if(f != null) {
			c += f.getC();
		}
		if(beaf != null) {
			c += beaf.getC();
		}
		return c;
	}
}
