package com.ironsource.sdk.controller;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.core.view.InputDeviceCompat;
import com.ironsource.C19821el;
import com.ironsource.C20086i9;
import com.ironsource.C20232l;
import com.ironsource.C20301m;
import com.ironsource.C20510n5;
import com.ironsource.C20517nb;
import com.ironsource.C20635pf;
import com.ironsource.C20696qi;
import com.ironsource.C20968sf;
import com.ironsource.C20997t2;
import com.ironsource.C21114v8;
import com.ironsource.C21145vp;
import com.ironsource.C21223xf;
import com.ironsource.C21281yu;
import com.ironsource.InterfaceC19697ce;
import com.ironsource.InterfaceC19732cu;
import com.ironsource.InterfaceC20214kn;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.controller.C20903v;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.sdk.utils.SDKUtils;

/* loaded from: classes6.dex */
public class ControllerActivity extends Activity implements InterfaceC20214kn, InterfaceC19732cu {

    /* renamed from: n */
    private static final String f52889n = "ControllerActivity";

    /* renamed from: o */
    private static final int f52890o = 1;

    /* renamed from: p */
    private static String f52891p = "removeWebViewContainerView | mContainer is null";

    /* renamed from: q */
    private static String f52892q = "removeWebViewContainerView | view is null";

    /* renamed from: a */
    private String f52893a;

    /* renamed from: b */
    private C20903v f52894b;

    /* renamed from: c */
    private RelativeLayout f52895c;

    /* renamed from: d */
    private FrameLayout f52896d;

    /* renamed from: e */
    private InterfaceC19697ce f52897e;

    /* renamed from: g */
    private String f52899g;

    /* renamed from: k */
    private C20997t2 f52903k;

    /* renamed from: l */
    private boolean f52904l;

    /* renamed from: m */
    private boolean f52905m;
    public int currentRequestedRotation = -1;

    /* renamed from: f */
    private boolean f52898f = false;

    /* renamed from: h */
    private Handler f52900h = new Handler();

    /* renamed from: i */
    private final Runnable f52901i = new RunnableC20799a();

    /* renamed from: j */
    final RelativeLayout.LayoutParams f52902j = new RelativeLayout.LayoutParams(-1, -1);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.ironsource.sdk.controller.ControllerActivity$a */
    /* loaded from: classes6.dex */
    public class RunnableC20799a implements Runnable {
        RunnableC20799a() {
            ControllerActivity.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            ControllerActivity.this.getWindow().getDecorView().setSystemUiVisibility(SDKUtils.getActivityUIFlags(ControllerActivity.this.f52898f));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.ironsource.sdk.controller.ControllerActivity$b */
    /* loaded from: classes6.dex */
    public class View$OnSystemUiVisibilityChangeListenerC20800b implements View.OnSystemUiVisibilityChangeListener {
        View$OnSystemUiVisibilityChangeListenerC20800b() {
            ControllerActivity.this = r1;
        }

        @Override // android.view.View.OnSystemUiVisibilityChangeListener
        public void onSystemUiVisibilityChange(int i) {
            if ((i & InputDeviceCompat.SOURCE_TOUCHSCREEN) == 0) {
                ControllerActivity.this.f52900h.removeCallbacks(ControllerActivity.this.f52901i);
                ControllerActivity.this.f52900h.postDelayed(ControllerActivity.this.f52901i, 500L);
            }
        }
    }

    /* renamed from: com.ironsource.sdk.controller.ControllerActivity$c */
    /* loaded from: classes6.dex */
    public class RunnableC20801c implements Runnable {
        RunnableC20801c() {
            ControllerActivity.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            ControllerActivity.this.getWindow().addFlags(128);
        }
    }

    /* renamed from: com.ironsource.sdk.controller.ControllerActivity$d */
    /* loaded from: classes6.dex */
    public class RunnableC20802d implements Runnable {
        RunnableC20802d() {
            ControllerActivity.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            ControllerActivity.this.getWindow().clearFlags(128);
        }
    }

    /* renamed from: a */
    private View m55355a(ViewGroup viewGroup) {
        return m55346d() ? viewGroup.findViewById(1) : C20635pf.m55832a().mo54697a(this.f52893a).getPresentingView();
    }

    /* renamed from: d */
    private boolean m55346d() {
        if (this.f52893a == null) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    private void m55345e() {
        runOnUiThread(new RunnableC20801c());
    }

    /* renamed from: f */
    private void m55344f() {
        ViewGroup viewGroup;
        try {
            if (this.f52895c != null) {
                ViewGroup viewGroup2 = (ViewGroup) this.f52896d.getParent();
                View m55355a = m55355a(viewGroup2);
                if (m55355a != null) {
                    if (isFinishing() && (viewGroup = (ViewGroup) m55355a.getParent()) != null) {
                        viewGroup.removeView(m55355a);
                    }
                    viewGroup2.removeView(this.f52896d);
                    return;
                }
                throw new Exception(f52892q);
            }
            throw new Exception(f52891p);
        } catch (Exception e) {
            C20086i9.m57997d().m58003a(e);
            C21223xf.m54137a(C21145vp.f54253s, new C20968sf().m54959a(C20517nb.f52154A, e.getMessage()).m54960a());
            String str = f52889n;
            Logger.m54970i(str, "removeWebViewContainerView fail " + e.getMessage());
        }
    }

    /* renamed from: g */
    private void m55343g() {
        String str;
        String str2;
        int mo57168I = this.f52897e.mo57168I(this);
        String str3 = f52889n;
        Logger.m54970i(str3, "setInitiateLandscapeOrientation");
        if (mo57168I == 0) {
            str = "ROTATION_0";
        } else {
            if (mo57168I == 2) {
                str2 = "ROTATION_180";
            } else if (mo57168I == 3) {
                str2 = "ROTATION_270 Right Landscape";
            } else if (mo57168I == 1) {
                str = "ROTATION_90 Left Landscape";
            } else {
                Logger.m54970i(str3, "No Rotation");
                return;
            }
            Logger.m54970i(str3, str2);
            setRequestedOrientation(8);
            return;
        }
        Logger.m54970i(str3, str);
        setRequestedOrientation(0);
    }

    @SuppressLint({"SourceLockedOrientationActivity"})
    /* renamed from: h */
    private void m55342h() {
        String str;
        int mo57168I = this.f52897e.mo57168I(this);
        String str2 = f52889n;
        Logger.m54970i(str2, "setInitiatePortraitOrientation");
        if (mo57168I == 0) {
            str = "ROTATION_0";
        } else if (mo57168I == 2) {
            Logger.m54970i(str2, "ROTATION_180");
            setRequestedOrientation(9);
            return;
        } else if (mo57168I == 1) {
            str = "ROTATION_270 Right Landscape";
        } else if (mo57168I == 3) {
            str = "ROTATION_90 Left Landscape";
        } else {
            Logger.m54970i(str2, "No Rotation");
            return;
        }
        Logger.m54970i(str2, str);
        setRequestedOrientation(1);
    }

    @Override // com.ironsource.InterfaceC20214kn
    public boolean onBackButtonPressed() {
        onBackPressed();
        return true;
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        Logger.m54970i(f52889n, "onBackPressed");
        if (!C20510n5.m56196a().m56195a(this)) {
            super.onBackPressed();
        }
    }

    @Override // com.ironsource.InterfaceC20214kn
    public void onCloseRequested() {
        finish();
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f52897e = C19821el.m58797N().mo57096f();
        try {
            new C20301m(this).mo57334a();
            new C20232l(this).mo57334a();
            C20903v c20903v = (C20903v) C20696qi.m55649a((Context) this).mo54338a().m55263j();
            this.f52894b = c20903v;
            c20903v.m55019s().setId(1);
            this.f52894b.m55156a((InterfaceC20214kn) this);
            this.f52894b.m55162a((InterfaceC19732cu) this);
            Intent intent = getIntent();
            this.f52899g = intent.getStringExtra(C21114v8.C21122h.f54077m);
            this.f52898f = intent.getBooleanExtra(C21114v8.C21122h.f54095v, false);
            this.f52893a = intent.getStringExtra("adViewId");
            this.f52904l = false;
            this.f52905m = intent.getBooleanExtra(C21114v8.C21122h.f54104z0, false);
            if (this.f52898f) {
                getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(new View$OnSystemUiVisibilityChangeListenerC20800b());
                runOnUiThread(this.f52901i);
            }
            RelativeLayout relativeLayout = new RelativeLayout(this);
            this.f52895c = relativeLayout;
            setContentView(relativeLayout, this.f52902j);
            this.f52896d = m55353a(this.f52893a);
            if (this.f52895c.findViewById(1) == null && this.f52896d.getParent() != null) {
                finish();
            }
            m55348c();
            this.f52895c.addView(this.f52896d, this.f52902j);
        } catch (Exception e) {
            C20086i9.m57997d().m58003a(e);
            IronLog.INTERNAL.error(e.toString());
            finish();
        }
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        String str = f52889n;
        Logger.m54970i(str, "onDestroy");
        m55344f();
        if (!this.f52904l) {
            Logger.m54970i(str, "onDestroy | destroyedFromBackground");
            m55351b();
        }
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4 && this.f52894b.m55007y()) {
            this.f52894b.m55009x();
            return true;
        }
        if (this.f52898f && (i == 25 || i == 24)) {
            this.f52900h.removeCallbacks(this.f52901i);
            this.f52900h.postDelayed(this.f52901i, 500L);
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // com.ironsource.InterfaceC20214kn
    public void onOrientationChanged(String str, int i) {
        m55352a(str, i);
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        String str = f52889n;
        Logger.m54970i(str, "onPause, isFinishing=" + isFinishing());
        C20897t.m55196a(this);
        C20903v c20903v = this.f52894b;
        if (c20903v != null) {
            c20903v.mo55166a((Context) this);
            if (!this.f52905m) {
                this.f52894b.m55184B();
            }
            this.f52894b.m55103a(false, C21114v8.C21122h.f54053Z);
            this.f52894b.m55049g(this.f52899g, C21114v8.C21122h.f54092t0);
        }
        if (isFinishing()) {
            this.f52904l = true;
            m55351b();
        }
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        Logger.m54970i(f52889n, C21114v8.C21122h.f54094u0);
        C20903v c20903v = this.f52894b;
        if (c20903v != null) {
            c20903v.mo55101b(this);
            if (!this.f52905m) {
                this.f52894b.m55176F();
            }
            this.f52894b.m55103a(true, C21114v8.C21122h.f54053Z);
            this.f52894b.m55049g(this.f52899g, C21114v8.C21122h.f54094u0);
        }
        C20897t.m55194b(this);
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        Logger.m54970i(f52889n, "onStart");
        C20903v c20903v = this.f52894b;
        if (c20903v != null) {
            c20903v.m55049g(this.f52899g, "onStart");
        }
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        Logger.m54970i(f52889n, "onStop");
        C20903v c20903v = this.f52894b;
        if (c20903v != null) {
            c20903v.m55049g(this.f52899g, "onStop");
        }
    }

    @Override // android.app.Activity
    protected void onUserLeaveHint() {
        super.onUserLeaveHint();
        Logger.m54970i(f52889n, "onUserLeaveHint");
        C20903v c20903v = this.f52894b;
        if (c20903v != null) {
            c20903v.m55049g(this.f52899g, "onUserLeaveHint");
        }
    }

    @Override // com.ironsource.InterfaceC19732cu
    public void onVideoEnded() {
        toggleKeepScreen(false);
    }

    @Override // com.ironsource.InterfaceC19732cu
    public void onVideoPaused() {
        toggleKeepScreen(false);
    }

    @Override // com.ironsource.InterfaceC19732cu
    public void onVideoResumed() {
        toggleKeepScreen(true);
    }

    @Override // com.ironsource.InterfaceC19732cu
    public void onVideoStarted() {
        toggleKeepScreen(true);
    }

    @Override // com.ironsource.InterfaceC19732cu
    public void onVideoStopped() {
        toggleKeepScreen(false);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (this.f52898f && z) {
            runOnUiThread(this.f52901i);
        }
    }

    @Override // android.app.Activity
    public void setRequestedOrientation(int i) {
        if (this.currentRequestedRotation != i) {
            String str = f52889n;
            Logger.m54970i(str, "Rotation: Req = " + i + " Curr = " + this.currentRequestedRotation);
            this.currentRequestedRotation = i;
            super.setRequestedOrientation(i);
        }
    }

    public void toggleKeepScreen(boolean z) {
        if (z) {
            m55345e();
        } else {
            m55356a();
        }
    }

    /* renamed from: a */
    private FrameLayout m55353a(String str) {
        return !m55349b(str) ? this.f52894b.m55019s() : C21281yu.m53937a(getApplicationContext(), C20635pf.m55832a().mo54697a(str).getPresentingView());
    }

    /* renamed from: b */
    private void m55351b() {
        String str = f52889n;
        Logger.m54970i(str, "clearWebviewController");
        C20903v c20903v = this.f52894b;
        if (c20903v == null) {
            Logger.m54970i(str, "clearWebviewController, null");
            return;
        }
        c20903v.m55141a(C20903v.EnumC20948u.Gone);
        this.f52894b.m55182C();
        this.f52894b.m55180D();
        this.f52894b.m55049g(this.f52899g, "onDestroy");
    }

    /* renamed from: c */
    private void m55348c() {
        Intent intent = getIntent();
        m55352a(intent.getStringExtra(C21114v8.C21122h.f54016A), intent.getIntExtra(C21114v8.C21122h.f54018B, 0));
    }

    /* renamed from: a */
    private void m55356a() {
        runOnUiThread(new RunnableC20802d());
    }

    /* renamed from: b */
    private boolean m55349b(String str) {
        return (TextUtils.isEmpty(str) || str.equals(Integer.toString(1))) ? false : true;
    }

    @SuppressLint({"SourceLockedOrientationActivity"})
    /* renamed from: a */
    private void m55352a(String str, int i) {
        int i2;
        if (str != null) {
            if ("landscape".equalsIgnoreCase(str)) {
                m55343g();
            } else if ("portrait".equalsIgnoreCase(str)) {
                m55342h();
            } else {
                if ("device".equalsIgnoreCase(str)) {
                    if (!this.f52897e.mo57175B(this)) {
                        return;
                    }
                    i2 = 1;
                } else if (getRequestedOrientation() != -1) {
                    return;
                } else {
                    i2 = 4;
                }
                setRequestedOrientation(i2);
            }
        }
    }
}
