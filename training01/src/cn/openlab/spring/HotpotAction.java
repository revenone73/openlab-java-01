package cn.openlab.spring;

import com.opensymphony.xwork2.ActionSupport;

public class HotpotAction extends ActionSupport {

	private Hotspot hotspot;
	private int calori;

	public int getCalori() {
		return calori;
	}

	public void setHotspot(Hotspot hotspot) {
		this.hotspot = hotspot;
	}

	@Override
	public String execute() throws Exception {
		calori = hotspot.getC();
		return SUCCESS;
	}
}
