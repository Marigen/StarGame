package com.star.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Vector2;

public class Asteroid {
    private Texture texture;
    private Vector2 position;
    private Vector2 velocity;
    private float scale;

    public Asteroid(){
        this.texture = new Texture("asteroid.png");
        this.position = new Vector2(MathUtils.random(0, ScreenManager.SCREEN_WIDTH), MathUtils.random(0, ScreenManager.SCREEN_HEIGHT));
        this.velocity = new Vector2(MathUtils.random(-40, -5), 0);
        this.scale = Math.abs(velocity.x) / 40.0f * 0.7f;
    }

    public void update(float dt) {
        position.x += velocity.x * 7.5f * dt;
        position.y += velocity.y * 7.5f * dt;
        if (position.x < -20){
            position.x = ScreenManager.SCREEN_WIDTH + 20;
            position.y = MathUtils.random(0, ScreenManager.SCREEN_HEIGHT);
            scale = Math.abs(velocity.x) / 40.0f * 0.7f;
        }
    }

    public void render(SpriteBatch batch){
        batch.draw(texture, position.x - 128, position.y - 128, 128,128,256,256, scale, scale,0,0,0,256,256,false,false);
    }
}
