package com.android.dagger2;

import android.app.Application;

public class AppApplication extends Application {

    private static AppApplication sInstance;
    private AppComponent appComponent;

    public static AppApplication getsInstance() {
        return sInstance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        this.sInstance = this;
        setupCompoent();
    }

    private void setupCompoent() {
        appComponent = DaggerAppComponent.builder().
                githubApiModule(new GithubApiModule()).
                appModule(new AppModule(this)).build();
    }

    public AppComponent getAppComponent() {
        return appComponent;
    }
}
