package com.chartboost.sdk.view;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.chartboost.sdk.Chartboost;
import com.chartboost.sdk.impl.AbstractC10358xb;
import com.chartboost.sdk.impl.C10127p9;
import com.chartboost.sdk.impl.C10287v5;
import com.chartboost.sdk.impl.C10374y2;
import com.chartboost.sdk.impl.C9763c7;
import com.chartboost.sdk.impl.InterfaceC10214t5;
import com.chartboost.sdk.impl.InterfaceC9675a9;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
/* loaded from: classes3.dex */
public final class CBImpressionActivity extends Activity implements InterfaceC10214t5 {

    /* renamed from: a */
    public C10287v5 f23793a;

    @Override // com.chartboost.sdk.impl.InterfaceC10214t5
    /* renamed from: a */
    public CBImpressionActivity mo79713a() {
        return this;
    }

    @Override // com.chartboost.sdk.impl.InterfaceC10214t5
    /* renamed from: b */
    public void mo79711b() {
        finish();
    }

    @Override // com.chartboost.sdk.impl.InterfaceC10214t5
    /* renamed from: c */
    public boolean mo79710c() {
        View decorView;
        Window window = getWindow();
        if (window != null && (decorView = window.getDecorView()) != null) {
            return decorView.isHardwareAccelerated();
        }
        return false;
    }

    @Override // com.chartboost.sdk.impl.InterfaceC10214t5
    /* renamed from: d */
    public void mo79709d() {
        View view;
        WindowInsetsController insetsController;
        int statusBars;
        int navigationBars;
        try {
            int i = Build.VERSION.SDK_INT;
            WindowManager.LayoutParams layoutParams = null;
            if (i >= 30) {
                Window window = getWindow();
                if (window != null) {
                    window.setDecorFitsSystemWindows(true);
                    insetsController = window.getInsetsController();
                    if (insetsController != null) {
                        statusBars = WindowInsets.Type.statusBars();
                        navigationBars = WindowInsets.Type.navigationBars();
                        insetsController.hide(statusBars | navigationBars);
                        insetsController.setSystemBarsBehavior(2);
                    }
                }
            } else {
                Window window2 = getWindow();
                if (window2 != null) {
                    view = window2.getDecorView();
                } else {
                    view = null;
                }
                if (view != null) {
                    view.setSystemUiVisibility(3846);
                }
            }
            if (i >= 28) {
                Window window3 = getWindow();
                if (window3 != null) {
                    layoutParams = window3.getAttributes();
                }
                if (layoutParams != null) {
                    layoutParams.layoutInDisplayCutoutMode = 1;
                }
            }
        } catch (Exception e) {
            C9763c7.m81923a("Cannot set view to fullscreen", e);
        }
    }

    /* renamed from: e */
    public final void m79708e() {
        if (this.f23793a == null) {
            if (Chartboost.isSdkStarted()) {
                C10374y2 c10374y2 = C10374y2.f23595b;
                InterfaceC9675a9 mo79792a = c10374y2.m79911j().mo79792a();
                Object obj = c10374y2.m79917d().mo79835b().get();
                Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
                this.f23793a = new C10287v5(this, mo79792a, (C10127p9) obj, c10374y2.m79922a().mo80134h());
                return;
            }
            C9763c7.m81919b("Cannot start Chartboost activity due to SDK not being initialized.", null, 2, null);
            finish();
        }
    }

    /* renamed from: f */
    public final boolean m79707f() {
        Intent intent = getIntent();
        if (intent == null) {
            return false;
        }
        return intent.getBooleanExtra("isChartboost", false);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C10287v5 c10287v5 = this.f23793a;
        if (c10287v5 != null) {
            c10287v5.m80260i();
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        C10287v5 c10287v5 = this.f23793a;
        if (c10287v5 != null) {
            c10287v5.m80266c();
        }
        super.onConfigurationChanged(newConfig);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m79706g();
        if (!m79707f()) {
            C9763c7.m81919b("This activity cannot be called from outside chartboost SDK", null, 2, null);
            finish();
            return;
        }
        requestWindowFeature(1);
        getWindow().setWindowAnimations(0);
        m79708e();
        C10287v5 c10287v5 = this.f23793a;
        if (c10287v5 != null) {
            c10287v5.m80265d();
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        C10287v5 c10287v5 = this.f23793a;
        if (c10287v5 != null) {
            c10287v5.m80264e();
        }
        this.f23793a = null;
        super.onDestroy();
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        C10287v5 c10287v5 = this.f23793a;
        if (c10287v5 != null) {
            c10287v5.m80263f();
        }
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        m79708e();
        C10287v5 c10287v5 = this.f23793a;
        if (c10287v5 != null) {
            c10287v5.m80262g();
        }
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        C10287v5 c10287v5 = this.f23793a;
        if (c10287v5 != null) {
            c10287v5.m80261h();
        }
    }

    @Override // com.chartboost.sdk.impl.InterfaceC10214t5
    /* renamed from: a */
    public void mo79712a(AbstractC10358xb view) {
        Intrinsics.checkNotNullParameter(view, "view");
        try {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view);
            }
            addContentView(view, new FrameLayout.LayoutParams(-1, -1));
        } catch (Exception e) {
            C9763c7.m81923a("Cannot attach view to activity", e);
        }
    }

    /* renamed from: g */
    public final void m79706g() {
    }

    @Override // android.app.Activity
    public void onBackPressed() {
    }
}
