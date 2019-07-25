package com.rcacao.myhome.domain.sprites;

public class SpriteBadParameterException extends Exception {

    public SpriteBadParameterException(String info) {
        super(String.format("Sprite bad parameter received: %s", info));
    }
}
