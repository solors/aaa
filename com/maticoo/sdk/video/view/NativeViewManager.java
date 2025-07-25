package com.maticoo.sdk.video.view;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import com.maticoo.sdk.video.util.ContextHolder;
import com.maticoo.sdk.videocache.ILog;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public class NativeViewManager {
    private static volatile NativeViewManager INSTANCE = null;
    private static final String TAG = "NativeViewManager";
    private final List<WeakReference<NativeVideoAdView>> listeners = new CopyOnWriteArrayList();
    private ScreenBroadcastReceiver mScreenReceiver;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes6.dex */
    public class ScreenBroadcastReceiver extends BroadcastReceiver {
        private String action;

        private ScreenBroadcastReceiver() {
            this.action = null;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            this.action = action;
            if ("android.intent.action.SCREEN_OFF".equals(action)) {
                Log.e(NativeViewManager.TAG, "onReceive: ACTION_SCREEN_OFF");
                NativeViewManager.this.notifyPause();
            } else if ("android.intent.action.USER_PRESENT".equals(this.action)) {
                Log.e(NativeViewManager.TAG, "onReceive: ACTION_USER_PRESENT");
                NativeViewManager.this.notifyPlay();
            }
        }
    }

    private NativeViewManager() {
        registerListener();
    }

    public static NativeViewManager getInstance() {
        NativeViewManager nativeViewManager = INSTANCE;
        if (nativeViewManager == null) {
            synchronized (NativeViewManager.class) {
                nativeViewManager = INSTANCE;
                if (nativeViewManager == null) {
                    nativeViewManager = new NativeViewManager();
                    INSTANCE = nativeViewManager;
                }
            }
        }
        return nativeViewManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyPause() {
        for (WeakReference<NativeVideoAdView> weakReference : this.listeners) {
            NativeVideoAdView nativeVideoAdView = weakReference.get();
            if (nativeVideoAdView == null) {
                ILog.m53548e(TAG, "notifyPause: adView is null");
            } else {
                nativeVideoAdView.pauseMe();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyPlay() {
        for (WeakReference<NativeVideoAdView> weakReference : this.listeners) {
            NativeVideoAdView nativeVideoAdView = weakReference.get();
            if (nativeVideoAdView != null) {
                nativeVideoAdView.resumeMe();
            }
        }
    }

    private void registerListener() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        this.mScreenReceiver = new ScreenBroadcastReceiver();
        ContextHolder.getGlobalAppContext().registerReceiver(this.mScreenReceiver, intentFilter);
    }

    public void add(NativeVideoAdView nativeVideoAdView) {
        this.listeners.add(new WeakReference<>(nativeVideoAdView));
    }

    protected void finalize() throws Throwable {
        super.finalize();
        unregisterListener();
    }

    public void remove(NativeVideoAdView nativeVideoAdView) {
        for (WeakReference<NativeVideoAdView> weakReference : this.listeners) {
            NativeVideoAdView nativeVideoAdView2 = weakReference.get();
            if (nativeVideoAdView2 == null) {
                this.listeners.remove(weakReference);
            } else if (nativeVideoAdView2 == nativeVideoAdView) {
                this.listeners.remove(weakReference);
                return;
            }
        }
    }

    public void unregisterListener() {
        ContextHolder.getGlobalAppContext().unregisterReceiver(this.mScreenReceiver);
    }
}
