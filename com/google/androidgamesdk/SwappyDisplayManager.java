package com.google.androidgamesdk;

import android.app.Activity;
import android.hardware.display.DisplayManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.Display;
import android.view.Window;
import android.view.WindowManager;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes5.dex */
public class SwappyDisplayManager implements DisplayManager.DisplayListener {
    private Activity mActivity;
    private long mCookie;
    private Display.Mode mCurrentMode;
    private C16633b mLooper;
    private WindowManager mWindowManager;
    private final String LOG_TAG = "SwappyDisplayManager";
    private final boolean DEBUG = false;
    private final long ONE_MS_IN_NS = 1000000;
    private final long ONE_S_IN_NS = 1000000000;

    /* renamed from: com.google.androidgamesdk.SwappyDisplayManager$a */
    /* loaded from: classes5.dex */
    class RunnableC16632a implements Runnable {

        /* renamed from: b */
        final /* synthetic */ int f39295b;

        RunnableC16632a(int i) {
            this.f39295b = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            Window window = SwappyDisplayManager.this.mActivity.getWindow();
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.preferredDisplayModeId = this.f39295b;
            window.setAttributes(attributes);
        }
    }

    /* renamed from: com.google.androidgamesdk.SwappyDisplayManager$b */
    /* loaded from: classes5.dex */
    private class C16633b extends Thread {

        /* renamed from: a */
        public Handler f39297a;

        /* renamed from: b */
        private Lock f39298b;

        /* renamed from: c */
        private Condition f39299c;

        private C16633b(SwappyDisplayManager swappyDisplayManager) {
            ReentrantLock reentrantLock = new ReentrantLock();
            this.f39298b = reentrantLock;
            this.f39299c = reentrantLock.newCondition();
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            Log.i("SwappyDisplayManager", "Starting looper thread");
            this.f39298b.lock();
            Looper.prepare();
            this.f39297a = new Handler();
            this.f39299c.signal();
            this.f39298b.unlock();
            Looper.loop();
            Log.i("SwappyDisplayManager", "Terminating looper thread");
        }

        @Override // java.lang.Thread
        public void start() {
            this.f39298b.lock();
            super.start();
            try {
                this.f39299c.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.f39298b.unlock();
        }
    }

    public SwappyDisplayManager(long j, Activity activity) {
        String string;
        try {
            Bundle bundle = activity.getPackageManager().getActivityInfo(activity.getIntent().getComponent(), 128).metaData;
            if (bundle != null && (string = bundle.getString("android.app.lib_name")) != null) {
                System.loadLibrary(string);
            }
        } catch (Throwable th) {
            Log.e("SwappyDisplayManager", th.getMessage());
        }
        this.mCookie = j;
        this.mActivity = activity;
        WindowManager windowManager = (WindowManager) activity.getSystemService(WindowManager.class);
        this.mWindowManager = windowManager;
        Display defaultDisplay = windowManager.getDefaultDisplay();
        this.mCurrentMode = defaultDisplay.getMode();
        updateSupportedRefreshRates(defaultDisplay);
        DisplayManager displayManager = (DisplayManager) this.mActivity.getSystemService(DisplayManager.class);
        synchronized (this) {
            C16633b c16633b = new C16633b();
            this.mLooper = c16633b;
            c16633b.start();
            displayManager.registerDisplayListener(this, this.mLooper.f39297a);
        }
    }

    private boolean modeMatchesCurrentResolution(Display.Mode mode) {
        if (mode.getPhysicalHeight() == this.mCurrentMode.getPhysicalHeight() && mode.getPhysicalWidth() == this.mCurrentMode.getPhysicalWidth()) {
            return true;
        }
        return false;
    }

    private native void nOnRefreshPeriodChanged(long j, long j2, long j3, long j4);

    private native void nSetSupportedRefreshPeriods(long j, long[] jArr, int[] iArr);

    private void updateSupportedRefreshRates(Display display) {
        Display.Mode[] supportedModes = display.getSupportedModes();
        int i = 0;
        for (Display.Mode mode : supportedModes) {
            if (modeMatchesCurrentResolution(mode)) {
                i++;
            }
        }
        long[] jArr = new long[i];
        int[] iArr = new int[i];
        int i2 = 0;
        for (int i3 = 0; i3 < supportedModes.length; i3++) {
            if (modeMatchesCurrentResolution(supportedModes[i3])) {
                jArr[i2] = 1.0E9f / supportedModes[i3].getRefreshRate();
                iArr[i2] = supportedModes[i3].getModeId();
                i2++;
            }
        }
        nSetSupportedRefreshPeriods(this.mCookie, jArr, iArr);
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public void onDisplayChanged(int i) {
        boolean z;
        boolean z2;
        synchronized (this) {
            Display defaultDisplay = this.mWindowManager.getDefaultDisplay();
            float refreshRate = defaultDisplay.getRefreshRate();
            Display.Mode mode = defaultDisplay.getMode();
            boolean z3 = true;
            if (mode.getPhysicalWidth() != this.mCurrentMode.getPhysicalWidth()) {
                z = true;
            } else {
                z = false;
            }
            if (mode.getPhysicalHeight() != this.mCurrentMode.getPhysicalHeight()) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean z4 = z | z2;
            if (refreshRate == this.mCurrentMode.getRefreshRate()) {
                z3 = false;
            }
            this.mCurrentMode = mode;
            if (z4) {
                updateSupportedRefreshRates(defaultDisplay);
            }
            if (z3) {
                long j = 1.0E9f / refreshRate;
                nOnRefreshPeriodChanged(this.mCookie, j, defaultDisplay.getAppVsyncOffsetNanos(), j - (this.mWindowManager.getDefaultDisplay().getPresentationDeadlineNanos() - 1000000));
            }
        }
    }

    public void setPreferredDisplayModeId(int i) {
        this.mActivity.runOnUiThread(new RunnableC16632a(i));
    }

    public void terminate() {
        this.mLooper.f39297a.getLooper().quit();
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public void onDisplayAdded(int i) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public void onDisplayRemoved(int i) {
    }
}
