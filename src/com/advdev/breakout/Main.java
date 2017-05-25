package com.advdev.breakout;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import com.advdev.codesnippets.cde.FullScreenFrame;
import com.advdev.codesnippets.cde.engine.Engine;
import com.advdev.codesnippets.cde.engine.LogicEngine;
import com.advdev.codesnippets.cde.engine.PaintEngine;

public class Main {

	private static Main main = new Main();

	private FullScreenFrame frame;
	private Engine engine, lEngine;
	private Game game;

	private Main() {
		frame = new FullScreenFrame("Breakout");
		frame.disableMenuBar();
		game = new Game();
		final Paddle player = game.getPlayer();
		JPanel panel = new JPanel() {
			@Override
			public void paintComponent(Graphics g) {
				super.paintComponent(g);
				g.setColor(Color.black);
				g.fillRect(0, 0, getWidth(), getHeight());
				g.setColor(Color.white);
				g.fillRect(player.getX(), player.getY(), player.getWidth(), player.getHeight());
			}
		};
		frame.addPanel(panel);
		engine = new PaintEngine(panel, 30);
		engine.startEngine();
		lEngine = new LogicEngine(game, 31);
		lEngine.startEngine();
	}

	public static Main getInstance() {
		return main;
	}

	public static void main(String[] args) {}

}
