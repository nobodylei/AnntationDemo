package com.lei.anntationdemo;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.util.Log;

import org.androidannotations.annotations.EService;

/**
 * Created by yanle on 2018/2/11.
 */

@EService
public class MyService extends Service{

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.i("tag","MyService");
        return super.onStartCommand(intent, flags, startId);
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
