package com.rcacao.myhome.di;

import android.app.Application;

import com.rcacao.myhome.utils.DrawUtils;
import com.rcacao.myhome.utils.DrawUtilsImpl;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class DrawUtilsModule {

    @Provides
    @Singleton
    DrawUtils providesDrawUtils(Application application) {
        return new DrawUtilsImpl(application);
    }
}
