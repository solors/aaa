package com.mbridge.msdk.activity;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.view.Display;
import android.view.OrientationEventListener;
import android.view.WindowManager;
import androidx.core.view.InputDeviceCompat;
import com.mbridge.msdk.foundation.p432d.FeedbackManager;
import com.mbridge.msdk.foundation.tools.SameLogTool;

/* loaded from: classes6.dex */
public abstract class MBBaseActivity extends Activity {

    /* renamed from: a */
    private Display f55056a;

    /* renamed from: b */
    private OrientationEventListener f55057b;

    /* renamed from: c */
    private int f55058c = -1;

    /* renamed from: e */
    static /* synthetic */ void m53520e(MBBaseActivity mBBaseActivity) {
        OrientationEventListener orientationEventListener = new OrientationEventListener(mBBaseActivity, 1) { // from class: com.mbridge.msdk.activity.MBBaseActivity.2
            @Override // android.view.OrientationEventListener
            public final void onOrientationChanged(int i) {
                int i2;
                if (MBBaseActivity.this.f55056a != null) {
                    i2 = MBBaseActivity.this.f55056a.getRotation();
                } else {
                    i2 = 0;
                }
                if (i2 == 1 && MBBaseActivity.this.f55058c != 1) {
                    MBBaseActivity.this.f55058c = 1;
                    MBBaseActivity.this.getNotchParams();
                    SameLogTool.m51824b("MBBaseActivity", "Orientation Left");
                } else if (i2 == 3 && MBBaseActivity.this.f55058c != 2) {
                    MBBaseActivity.this.f55058c = 2;
                    MBBaseActivity.this.getNotchParams();
                    SameLogTool.m51824b("MBBaseActivity", "Orientation Right");
                } else if (i2 == 0 && MBBaseActivity.this.f55058c != 3) {
                    MBBaseActivity.this.f55058c = 3;
                    MBBaseActivity.this.getNotchParams();
                    SameLogTool.m51824b("MBBaseActivity", "Orientation Top");
                } else if (i2 == 2 && MBBaseActivity.this.f55058c != 4) {
                    MBBaseActivity.this.f55058c = 4;
                    MBBaseActivity.this.getNotchParams();
                    SameLogTool.m51824b("MBBaseActivity", "Orientation Bottom");
                }
            }
        };
        mBBaseActivity.f55057b = orientationEventListener;
        if (orientationEventListener.canDetectOrientation()) {
            mBBaseActivity.f55057b.enable();
            return;
        }
        mBBaseActivity.f55057b.disable();
        mBBaseActivity.f55057b = null;
    }

    public void getNotchParams() {
        getWindow().getDecorView().postDelayed(new Runnable() { // from class: com.mbridge.msdk.activity.MBBaseActivity.1
            /* JADX WARN: Code restructure failed: missing block: B:7:0x001a, code lost:
                r1 = r2.getDisplayCutout();
             */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void run() {
                /*
                    Method dump skipped, instructions count: 230
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.activity.MBBaseActivity.RunnableC217681.run():void");
            }
        }, 500L);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            requestWindowFeature(1);
            getWindow().setFlags(1024, 1024);
            getWindow().addFlags(512);
            m53527a();
            m53524b();
            if (Build.VERSION.SDK_INT >= 28) {
                WindowManager.LayoutParams attributes = getWindow().getAttributes();
                attributes.layoutInDisplayCutoutMode = 1;
                getWindow().setAttributes(attributes);
            }
        } catch (Exception e) {
            SameLogTool.m51824b("MBBaseActivity", e.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        OrientationEventListener orientationEventListener = this.f55057b;
        if (orientationEventListener != null) {
            orientationEventListener.disable();
            this.f55057b = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        if (FeedbackManager.f56199c) {
            return;
        }
        getNotchParams();
        m53527a();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        m53527a();
    }

    public abstract void setTopControllerPadding(int i, int i2, int i3, int i4, int i5);

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public int m53524b() {
        if (this.f55056a == null) {
            if (Build.VERSION.SDK_INT >= 30) {
                this.f55056a = getDisplay();
            } else {
                this.f55056a = ((WindowManager) getSystemService("window")).getDefaultDisplay();
            }
        }
        Display display = this.f55056a;
        if (display != null) {
            return display.getRotation();
        }
        return -1;
    }

    /* renamed from: a */
    private void m53527a() {
        try {
            getWindow().addFlags(67108864);
            getWindow().getDecorView().setSystemUiVisibility(InputDeviceCompat.SOURCE_TOUCHSCREEN);
        } catch (Throwable th) {
            SameLogTool.m51824b("MBBaseActivity", th.getMessage());
        }
    }
}
