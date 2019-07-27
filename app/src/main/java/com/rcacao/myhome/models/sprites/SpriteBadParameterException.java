package com.rcacao.myhome.models.sprites;

public class SpriteBadParameterException extends Exception {

    SpriteBadParameterException(String info) {
        super(String.format("Sprite bad parameter received: %s", info));
    }
}
