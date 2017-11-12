package com.android.dagger2;

import dagger.Component;

@Component(modules = { AppModule.class, GithubApiModule.class})
public interface AppComponent {

    void inject(ReposListActivity activity);
}