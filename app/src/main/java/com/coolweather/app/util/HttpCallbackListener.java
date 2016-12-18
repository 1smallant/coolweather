package com.coolweather.app.util;

/**
 * Created by Administrator on 2016/12/17 0017.
 */

public interface HttpCallbackListener {
    void onFinish(String response);

    void onError(Exception e);
}
