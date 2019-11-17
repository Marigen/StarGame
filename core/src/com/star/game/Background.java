package com.star.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Background {

    private Texture textureCosmos;
    private Texture textureStar;

    public Background(){
        this.textureCosmos = new Texture("cosmos.jpg");
        this.textureStar = new Texture("star.jpg");
    }

    public void render(SpriteBatch batch){
        batch.draw(textureCosmos, 0,0);
    }

    public void update(float dt){

    }
}
