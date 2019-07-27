package com.rcacao.myhome.di;

import com.rcacao.myhome.drawers.ObjectSpriteDrawerImpl;
import com.rcacao.myhome.drawers.TileMapDrawerImpl;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {DrawUtilsModule.class, AppModule.class})
public interface DrawUtilsComponent {
    void inject(TileMapDrawerImpl tileMapDrawer);

    void inject(ObjectSpriteDrawerImpl objectSpriteDrawer);
}
