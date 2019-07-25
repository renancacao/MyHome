package com.rcacao.myhome.di;

import com.rcacao.myhome.domain.sprites.SpriteMapDrawerImpl;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {DrawUtilsModule.class, AppModule.class})
public interface DrawUtilsComponent {
    void inject(SpriteMapDrawerImpl spriteMapDrawer);
}
