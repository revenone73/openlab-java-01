package cn.openlab.oo;

public abstract class AbstractPhone {

	public final void call() {
		dail();
		send();
	}

	public abstract void dail();

	public abstract void send();
}
