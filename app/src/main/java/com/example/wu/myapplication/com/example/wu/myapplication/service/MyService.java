package com.example.wu.myapplication.com.example.wu.myapplication.service;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;

public class MyService extends Service {
    public MyService() {
        Log.d("MyService","constructor");
        Log.d("MyService",this.toString());
    }

    private  DownloadBinder mBinder=new DownloadBinder();
    class DownloadBinder extends Binder
    {
        public MyService getService(){
            return MyService.this;
        }
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d("MyService","onCreate");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.d("MyService","onStartCommand");
        return super.onStartCommand(intent, flags, startId);

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("MyService","onDestroy");
    }

    @Override
    public boolean onUnbind(Intent intent) {
        Log.d("MyService","onUnbind");
        return super.onUnbind(intent);

    }

    @Override
    public void onRebind(Intent intent) {
        super.onRebind(intent);
        Log.d("MyService","onRebind");
    }

    @Override
    public IBinder onBind(Intent intent) {
        // throw new UnsupportedOperationException("Not yet implemented");
        Log.d("MyService","onBind");
        return mBinder;
    }
}
