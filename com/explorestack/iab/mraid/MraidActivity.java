package com.explorestack.iab.mraid;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.Window;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.core.view.ViewCompat;
import com.explorestack.iab.utils.C10512g;
import p678g1.C33182b;

/* loaded from: classes3.dex */
public class MraidActivity extends Activity {
    @NonNull

    /* renamed from: f */
    private static final SparseArray<C10467a> f23794f = new SparseArray<>();
    @Nullable

    /* renamed from: b */
    private Integer f23795b;
    @Nullable

    /* renamed from: c */
    private C10467a f23796c;

    /* renamed from: d */
    private boolean f23797d = false;

    /* renamed from: com.explorestack.iab.mraid.MraidActivity$a */
    /* loaded from: classes3.dex */
    static /* synthetic */ class C10448a {

        /* renamed from: a */
        static final /* synthetic */ int[] f23798a;

        static {
            int[] iArr = new int[EnumC10482j.values().length];
            f23798a = iArr;
            try {
                iArr[EnumC10482j.Static.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23798a[EnumC10482j.Video.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23798a[EnumC10482j.Rewarded.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @NonNull
    @VisibleForTesting
    /* renamed from: a */
    static Intent m79705a(@NonNull Context context, @NonNull EnumC10482j enumC10482j, int i) {
        Intent m79704b = m79704b(context, MraidActivity.class, enumC10482j, i);
        m79704b.addFlags(268435456);
        m79704b.addFlags(8388608);
        return m79704b;
    }

    @NonNull
    /* renamed from: b */
    public static Intent m79704b(@NonNull Context context, @NonNull Class<?> cls, @NonNull EnumC10482j enumC10482j, int i) {
        Intent intent = new Intent(context, cls);
        intent.putExtra("InterstitialId", i);
        intent.putExtra("InterstitialType", enumC10482j);
        return intent;
    }

    /* renamed from: c */
    private void m79703c() {
        m79701e(this.f23795b);
    }

    /* renamed from: d */
    public static void m79702d(@NonNull C10467a c10467a) {
        f23794f.put(c10467a.f23897a, c10467a);
    }

    /* renamed from: e */
    public static void m79701e(@Nullable Integer num) {
        if (num == null) {
            return;
        }
        f23794f.remove(num.intValue());
    }

    public static void show(@Nullable Context context, @Nullable C10467a c10467a, @Nullable EnumC10482j enumC10482j) {
        if (c10467a == null) {
            C10472c.m79526d(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.MraidActivity.f63766g, "MraidInterstitial is null during showing MraidActivity", new Object[0]);
        } else if (context == null) {
            C10472c.m79526d(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.MraidActivity.f63766g, "Context is null during showing MraidActivity", new Object[0]);
            c10467a.m79559k(C33182b.m24482h("Context is null during showing MraidActivity"));
        } else if (enumC10482j == null) {
            C10472c.m79526d(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.MraidActivity.f63766g, "MraidType is null during showing MraidActivity", new Object[0]);
            c10467a.m79559k(C33182b.m24482h("MraidType is null during showing MraidActivity"));
        } else {
            try {
                m79702d(c10467a);
                context.startActivity(m79705a(context, enumC10482j, c10467a.f23897a));
            } catch (Throwable th) {
                C10472c.m79528b("Exception during showing MraidActivity", th);
                c10467a.m79559k(C33182b.m24480j("Exception during showing MraidActivity", th));
                m79701e(Integer.valueOf(c10467a.f23897a));
            }
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        if (this.f23797d) {
            C10467a c10467a = this.f23796c;
            if (c10467a != null) {
                c10467a.m79555o();
            } else {
                C10512g.m79301p(this);
            }
        }
    }

    public void onBeforeCreate(@Nullable Window window) {
        C10512g.m79319N(window, ViewCompat.MEASURED_STATE_MASK);
    }

    public void onBeforeShowContent() {
        C10512g.m79311f(this);
    }

    @Override // android.app.Activity
    protected void onCreate(@Nullable Bundle bundle) {
        onBeforeCreate(getWindow());
        C10512g.m79320M(this);
        super.onCreate(bundle);
        if (!getIntent().hasExtra("InterstitialId")) {
            C10472c.m79526d(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.MraidActivity.f63766g, "Mraid display cache id not provided", new Object[0]);
            C10512g.m79301p(this);
            return;
        }
        Integer valueOf = Integer.valueOf(getIntent().getIntExtra("InterstitialId", 0));
        this.f23795b = valueOf;
        C10467a c10467a = f23794f.get(valueOf.intValue());
        this.f23796c = c10467a;
        if (c10467a == null) {
            C10472c.m79526d(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.MraidActivity.f63766g, "Mraid interstitial not found in display cache, id=%s", this.f23795b);
            C10512g.m79301p(this);
            return;
        }
        EnumC10482j enumC10482j = (EnumC10482j) getIntent().getSerializableExtra("InterstitialType");
        if (enumC10482j == null) {
            C10472c.m79526d(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.MraidActivity.f63766g, "MraidType is null", new Object[0]);
            C10512g.m79301p(this);
            this.f23796c.m79559k(C33182b.m24484f("MraidType is null"));
            return;
        }
        onBeforeShowContent();
        int i = C10448a.f23798a[enumC10482j.ordinal()];
        if (i != 1 && i != 2) {
            if (i == 3) {
                this.f23797d = false;
            }
        } else {
            this.f23797d = true;
        }
        try {
            this.f23796c.m79565e(this, false);
        } catch (Exception e) {
            C10472c.m79528b("Exception during showing MraidInterstial in MraidActivity", e);
            C10512g.m79301p(this);
            this.f23796c.m79559k(C33182b.m24480j("Exception during showing MraidInterstial in MraidActivity", e));
            m79703c();
        }
        C10512g.m79309h(this);
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        if (this.f23796c != null && !isChangingConfigurations()) {
            this.f23796c.m79563g();
            m79703c();
        }
    }
}
