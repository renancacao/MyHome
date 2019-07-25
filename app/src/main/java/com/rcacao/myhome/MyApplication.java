package com.rcacao.myhome;

import android.app.Application;

import com.rcacao.myhome.di.AppModule;
import com.rcacao.myhome.di.DaggerDrawUtilsComponent;
import com.rcacao.myhome.di.DrawUtilsComponent;
import com.rcacao.myhome.di.DrawUtilsModule;

public class MyApplication extends Application {

    private static DrawUtilsComponent drawUtilsComponent;

    public static DrawUtilsComponent getDrawUtilsComponent() {
        return drawUtilsComponent;
    }

    @Override
    public void onCreate() {
        super.onCreate();

        drawUtilsComponent = DaggerDrawUtilsComponent.builder()
                .appModule(new AppModule(this))
                .drawUtilsModule(new DrawUtilsModule())
                .build();
    }
}
