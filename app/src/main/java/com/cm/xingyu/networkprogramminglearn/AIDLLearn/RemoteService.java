package com.cm.xingyu.networkprogramminglearn.AIDLLearn;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.Process;
import android.os.RemoteException;
import android.support.annotation.Nullable;

import com.cm.xingyu.networkprogramminglearn.IRemoteService;

/**
 * Created by Administrator on 2017/8/12.
 */
public class RemoteService extends Service {
    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return mBinder;
    }
    private final IRemoteService.Stub mBinder = new IRemoteService.Stub() {
        @Override
        public int getPid() throws RemoteException {
            return 666666;
        }

        @Override
        public void basicTypes(int anInt, long aLong, boolean aBoolean, float aFloat, double aDouble, String aString) throws RemoteException {

        }
    };
}
