package com.example.mileage2;

import android.app.Application;

import com.kakao.sdk.common.KakaoSdk;

public class kakaoApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        KakaoSdk.init(this, "5591a45ed7c371ed386ccca9c663ec6e");
    }
}
