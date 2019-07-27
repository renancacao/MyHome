package com.rcacao.myhome.models.objectsprite;

public class ObjectSpriteImpl implements ObjectSprite {

    private ObjectSpritePiece[] objectSpritePieces;

    public ObjectSpriteImpl(ObjectSpritePiece[] objectSpritePieces) {

        this.objectSpritePieces = objectSpritePieces;
    }

    @Override
    public ObjectSpritePiece[] getPieces() {
        return objectSpritePieces;
    }
}
