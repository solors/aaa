package com.meevii.soniclib.util;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Log;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;
import com.meevii.soniclib.util.InstallRefUtils;
import com.unity3d.player.UnityPlayer;

/* loaded from: classes5.dex */
public class InstallRefUtils {
    private static final String BRIDGE_OBJECT_NAME = "InstallReferrerObject";
    private static Handler mHandler;

    static /* synthetic */ Handler access$000() {
        return getHandler();
    }

    private static Handler getHandler() {
        if (mHandler == null) {
            initHandler();
        }
        return mHandler;
    }

    private static void initHandler() {
        if (mHandler == null) {
            HandlerThread handlerThread = new HandlerThread("InstallRefUtilsHandlerThread");
            handlerThread.start();
            mHandler = new Handler(handlerThread.getLooper());
        }
    }

    public static /* synthetic */ void lambda$queryInstallReferrer$0(Context context) {
        try {
            queryInstallReferrerAsync(context);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void queryInstallReferrer(final Context context) {
        getHandler().post(new Runnable() { // from class: com.meevii.soniclib.util.a
            @Override // java.lang.Runnable
            public final void run() {
                InstallRefUtils.lambda$queryInstallReferrer$0(context);
            }
        });
    }

    private static void queryInstallReferrerAsync(Context context) {
        String name = Thread.currentThread().getName();
        Log.i("InstallRefUtils", "Thread name: " + name);
        InstallReferrerClient build = InstallReferrerClient.newBuilder(context).build();
        build.startConnection(new C23351a(build));
    }

    public static void releaseHandler() {
        Handler handler = mHandler;
        if (handler != null) {
            handler.getLooper().quit();
            mHandler = null;
        }
    }

    /* renamed from: com.meevii.soniclib.util.InstallRefUtils$a */
    /* loaded from: classes5.dex */
    public class C23351a implements InstallReferrerStateListener {

        /* renamed from: a */
        final /* synthetic */ InstallReferrerClient f61632a;

        C23351a(InstallReferrerClient installReferrerClient) {
            this.f61632a = installReferrerClient;
        }

        /* renamed from: b */
        public static /* synthetic */ void m47842b(int i, InstallReferrerClient installReferrerClient) {
            String name = Thread.currentThread().getName();
            Log.i("InstallRefUtils", "onInstallReferrerSetupFinished Thread name: " + name + " responseCode: " + i);
            if (i == 0) {
                try {
                    ReferrerDetails installReferrer = installReferrerClient.getInstallReferrer();
                    String installReferrer2 = installReferrer.getInstallReferrer();
                    long referrerClickTimestampSeconds = installReferrer.getReferrerClickTimestampSeconds();
                    long installBeginTimestampSeconds = installReferrer.getInstallBeginTimestampSeconds();
                    boolean googlePlayInstantParam = installReferrer.getGooglePlayInstantParam();
                    Log.i("InstallRefUtils", "referrerUrl: " + installReferrer2 + " referrerClickTime: " + referrerClickTimestampSeconds + " appInstallTime: " + installBeginTimestampSeconds + " instantExperienceLaunched: " + googlePlayInstantParam);
                    UnityPlayer.UnitySendMessage(InstallRefUtils.BRIDGE_OBJECT_NAME, "OnInstallReferrerReceived", installReferrer2);
                    Log.i("InstallRefUtils", "OnInstallReferrerReceived sent");
                    installReferrerClient.endConnection();
                } catch (Exception e) {
                    Log.e("InstallRefUtils", "Exception: " + e.getMessage());
                    e.printStackTrace();
                }
            }
            InstallRefUtils.releaseHandler();
        }

        @Override // com.android.installreferrer.api.InstallReferrerStateListener
        public void onInstallReferrerSetupFinished(final int i) {
            Handler access$000 = InstallRefUtils.access$000();
            final InstallReferrerClient installReferrerClient = this.f61632a;
            access$000.post(new Runnable() { // from class: com.meevii.soniclib.util.b
                @Override // java.lang.Runnable
                public final void run() {
                    InstallRefUtils.C23351a.m47842b(i, installReferrerClient);
                }
            });
        }

        @Override // com.android.installreferrer.api.InstallReferrerStateListener
        public void onInstallReferrerServiceDisconnected() {
        }
    }
}
