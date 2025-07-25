package com.ironsource.mediationsdk.testSuite;

import android.app.Activity;
import android.os.Bundle;
import android.widget.RelativeLayout;
import com.ironsource.C19598at;
import com.ironsource.C19938ft;
import com.ironsource.C20722qs;
import com.ironsource.InterfaceC20694qg;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata
/* loaded from: classes6.dex */
public final class TestSuiteActivity extends Activity implements InterfaceC20694qg {

    /* renamed from: a */
    private RelativeLayout f51932a;

    /* renamed from: b */
    private C19938ft f51933b;

    /* renamed from: c */
    private C19598at f51934c;

    /* renamed from: a */
    private final String m56473a() {
        Bundle extras;
        if (getIntent() == null || getIntent().getExtras() == null || (extras = getIntent().getExtras()) == null) {
            return null;
        }
        return extras.getString("controllerUrl");
    }

    /* renamed from: b */
    private final JSONObject m56471b() {
        if (getIntent() != null && getIntent().getExtras() != null) {
            Bundle extras = getIntent().getExtras();
            String string = extras != null ? extras.getString(C20722qs.f52656a) : null;
            if (!(string == null || string.length() == 0)) {
                return new JSONObject(string);
            }
        }
        return new JSONObject();
    }

    /* renamed from: c */
    public static /* synthetic */ void m56468c(TestSuiteActivity testSuiteActivity) {
        m56470b(testSuiteActivity);
    }

    /* renamed from: d */
    public static /* synthetic */ void m56467d(TestSuiteActivity testSuiteActivity) {
        m56472a(testSuiteActivity);
    }

    @NotNull
    public final RelativeLayout getContainer() {
        RelativeLayout relativeLayout = this.f51932a;
        if (relativeLayout == null) {
            Intrinsics.m17056y("mContainer");
            return null;
        }
        return relativeLayout;
    }

    @Override // com.ironsource.InterfaceC20694qg
    public void onClosed() {
        runOnUiThread(new Runnable() { // from class: com.ironsource.mediationsdk.testSuite.b
            @Override // java.lang.Runnable
            public final void run() {
                TestSuiteActivity.m56467d(TestSuiteActivity.this);
            }
        });
    }

    @Override // android.app.Activity
    protected void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        RelativeLayout relativeLayout = new RelativeLayout(this);
        this.f51932a = relativeLayout;
        setContentView(relativeLayout, m56469c());
        C19938ft c19938ft = new C19938ft(this, this, m56471b(), m56473a());
        this.f51933b = c19938ft;
        C19598at c19598at = new C19598at(c19938ft);
        this.f51934c = c19598at;
        c19598at.m59391d();
        RelativeLayout relativeLayout2 = this.f51932a;
        C19938ft c19938ft2 = null;
        if (relativeLayout2 == null) {
            Intrinsics.m17056y("mContainer");
            relativeLayout2 = null;
        }
        C19938ft c19938ft3 = this.f51933b;
        if (c19938ft3 == null) {
            Intrinsics.m17056y("mWebViewWrapper");
        } else {
            c19938ft2 = c19938ft3;
        }
        relativeLayout2.addView(c19938ft2.m58503d(), m56469c());
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        C19598at c19598at = this.f51934c;
        C19938ft c19938ft = null;
        if (c19598at == null) {
            Intrinsics.m17056y("mNativeBridge");
            c19598at = null;
        }
        c19598at.m59396a();
        RelativeLayout relativeLayout = this.f51932a;
        if (relativeLayout == null) {
            Intrinsics.m17056y("mContainer");
            relativeLayout = null;
        }
        relativeLayout.removeAllViews();
        C19938ft c19938ft2 = this.f51933b;
        if (c19938ft2 == null) {
            Intrinsics.m17056y("mWebViewWrapper");
        } else {
            c19938ft = c19938ft2;
        }
        c19938ft.m58517a();
        super.onDestroy();
    }

    @Override // com.ironsource.InterfaceC20694qg
    public void onUIReady() {
        runOnUiThread(new Runnable() { // from class: com.ironsource.mediationsdk.testSuite.a
            @Override // java.lang.Runnable
            public final void run() {
                TestSuiteActivity.m56468c(TestSuiteActivity.this);
            }
        });
    }

    /* renamed from: a */
    public static final void m56472a(TestSuiteActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.finish();
    }

    /* renamed from: b */
    public static final void m56470b(TestSuiteActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        C19938ft c19938ft = this$0.f51933b;
        C19938ft c19938ft2 = null;
        if (c19938ft == null) {
            Intrinsics.m17056y("mWebViewWrapper");
            c19938ft = null;
        }
        if (c19938ft.m58506c().getParent() == null) {
            RelativeLayout relativeLayout = this$0.f51932a;
            if (relativeLayout == null) {
                Intrinsics.m17056y("mContainer");
                relativeLayout = null;
            }
            C19938ft c19938ft3 = this$0.f51933b;
            if (c19938ft3 == null) {
                Intrinsics.m17056y("mWebViewWrapper");
                c19938ft3 = null;
            }
            relativeLayout.removeView(c19938ft3.m58503d());
            RelativeLayout relativeLayout2 = this$0.f51932a;
            if (relativeLayout2 == null) {
                Intrinsics.m17056y("mContainer");
                relativeLayout2 = null;
            }
            C19938ft c19938ft4 = this$0.f51933b;
            if (c19938ft4 == null) {
                Intrinsics.m17056y("mWebViewWrapper");
                c19938ft4 = null;
            }
            relativeLayout2.addView(c19938ft4.m58506c(), this$0.m56469c());
            C19938ft c19938ft5 = this$0.f51933b;
            if (c19938ft5 == null) {
                Intrinsics.m17056y("mWebViewWrapper");
            } else {
                c19938ft2 = c19938ft5;
            }
            c19938ft2.m58509b();
        }
    }

    /* renamed from: c */
    private final RelativeLayout.LayoutParams m56469c() {
        return new RelativeLayout.LayoutParams(-1, -1);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
    }
}
