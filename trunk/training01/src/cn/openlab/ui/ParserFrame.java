package cn.openlab.ui;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class ParserFrame {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(200,200);
		frame.setLayout(new GridLayout(4,1));
		JLabel lblTip = new JLabel();
		lblTip.setText("请输入一段文本");
		frame.add(lblTip);
		JTextArea txtMsg = new JTextArea();
		frame.add(txtMsg);
		JButton btn = new JButton();
		btn.setText("解析");
		frame.add(btn);
		JLabel lblMsg = new JLabel();
		lblMsg.setText("");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
