package cn.openlab.ui;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Test {

	public static void main(String[] args) {
		final JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setTitle("hello");
		frame.setVisible(true);
		JButton btn = new JButton();
		btn.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
		frame.addWindowStateListener(new WindowStateListener() {

			@Override
			public void windowStateChanged(WindowEvent e) {
				
			}
			
		});
		btn.setText("click");
		frame.add(btn);
		frame.setSize(100, 100);
	}
}
