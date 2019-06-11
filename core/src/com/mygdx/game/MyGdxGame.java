package com.mygdx.game;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
public class MyGdxGame implements ApplicationListener {
	private SpriteBatch batch;
	private BitmapFont font;
	private Robot player;
	private Robot enemy;

	@Override
	public void create() {
		batch = new SpriteBatch();
		font = new BitmapFont();
		font.setColor(Color.RED);
	}

	@Override
	public void dispose() {
		batch.dispose();
		font.dispose();
	}

	@Override
	public void render() {
		Gdx.gl.glClearColor(1, 1, 1, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);


		batch.begin();
		font.draw(batch, "Mcr Project", 200, 200);
		batch.end();
	}

	@Override
	public void resize(int width, int height) {
	}

	@Override
	public void pause() {
	}

	@Override
	public void resume() {
	}

	private void update(){
		long currentTime = System.currentTimeMillis();
		long playerElapsedTime = player.getTimeOfLastAttack() - currentTime;
		long enemyElapsedTime = enemy.getTimeOfLastAttack() - currentTime;

		if(player.getAttackSpeedLeft() >= playerElapsedTime){
			player.shootLeft(enemy);
			player.setTimeOfLastAttack(currentTime);
		}
		if(player.getAttackSpeedRight() >= playerElapsedTime){
			player.shootRight(enemy);
			player.setTimeOfLastAttack(currentTime);
		}
		if(enemy.getAttackSpeedLeft() >= playerElapsedTime){
			enemy.shootLeft(player);
			enemy.setTimeOfLastAttack(currentTime);
		}
		if(enemy.getAttackSpeedLeft() >= playerElapsedTime){
			enemy.shootRight(player);
			enemy.setTimeOfLastAttack(currentTime);
		}

	}

}