package com.github.baby.owspace.di.modules;

import com.github.baby.owspace.presenter.ArticalContract;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Mr.Yangxiufeng
 * DATE 2016/10/22
 * owspace
 */
@Module
public class ArtModule {
    private ArticalContract.View mView;

    public ArtModule(ArticalContract.View mView) {
        this.mView = mView;
    }
    @Provides
    public ArticalContract.View provideView(){
        return mView;
    }
}
