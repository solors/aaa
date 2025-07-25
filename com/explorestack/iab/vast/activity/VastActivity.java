package com.explorestack.iab.vast.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.core.view.ViewCompat;
import com.explorestack.iab.utils.C10512g;
import com.explorestack.iab.utils.InterfaceC10505b;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p678g1.C33182b;
import p708i1.InterfaceC33594b;
import p708i1.InterfaceC33595c;
import p734j1.C37248c;
import p734j1.C37250e;
import p734j1.C37273m;
import p734j1.InterfaceC37247b;
import p734j1.InterfaceC37249d;
import p734j1.InterfaceC37267i;

/* loaded from: classes3.dex */
public class VastActivity extends Activity {
    @VisibleForTesting

    /* renamed from: j */
    static final Map<String, WeakReference<InterfaceC37247b>> f24126j = new ConcurrentHashMap();
    @VisibleForTesting

    /* renamed from: k */
    static final Map<String, WeakReference<VastView>> f24127k = new ConcurrentHashMap();
    @Nullable

    /* renamed from: l */
    private static WeakReference<InterfaceC37249d> f24128l;
    @Nullable

    /* renamed from: m */
    private static WeakReference<InterfaceC33595c> f24129m;
    @Nullable

    /* renamed from: n */
    private static WeakReference<InterfaceC33594b> f24130n;
    @Nullable

    /* renamed from: b */
    private C37250e f24131b;
    @Nullable

    /* renamed from: c */
    private VastView f24132c;
    @Nullable

    /* renamed from: d */
    private InterfaceC37247b f24133d;

    /* renamed from: g */
    private boolean f24135g;

    /* renamed from: h */
    private boolean f24136h;

    /* renamed from: f */
    private boolean f24134f = false;

    /* renamed from: i */
    private final InterfaceC37267i f24137i = new C10548b();

    /* renamed from: com.explorestack.iab.vast.activity.VastActivity$a */
    /* loaded from: classes3.dex */
    public static class C10547a {
        @Nullable

        /* renamed from: a */
        private C37250e f24138a;
        @Nullable

        /* renamed from: b */
        private InterfaceC37247b f24139b;
        @Nullable

        /* renamed from: c */
        private VastView f24140c;
        @Nullable

        /* renamed from: d */
        private InterfaceC37249d f24141d;
        @Nullable

        /* renamed from: e */
        private InterfaceC33595c f24142e;
        @Nullable

        /* renamed from: f */
        private InterfaceC33594b f24143f;

        @VisibleForTesting
        /* renamed from: a */
        Intent m79143a(Context context) {
            Intent intent = new Intent(context, VastActivity.class);
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            return intent;
        }

        @Nullable
        /* renamed from: b */
        public C33182b m79142b(Context context) {
            C37250e c37250e = this.f24138a;
            if (c37250e == null) {
                C37248c.m18679c("VastActivity", "VastRequest is null", new Object[0]);
                return C33182b.m24484f("VastRequest is null");
            }
            try {
                C37273m.m18596b(c37250e);
                Intent m79143a = m79143a(context);
                m79143a.putExtra("vast_request_id", this.f24138a.m18670H());
                InterfaceC37247b interfaceC37247b = this.f24139b;
                if (interfaceC37247b != null) {
                    VastActivity.m79150p(this.f24138a, interfaceC37247b);
                }
                VastView vastView = this.f24140c;
                if (vastView != null) {
                    VastActivity.m79151o(this.f24138a, vastView);
                }
                if (this.f24141d != null) {
                    WeakReference unused = VastActivity.f24128l = new WeakReference(this.f24141d);
                } else {
                    WeakReference unused2 = VastActivity.f24128l = null;
                }
                if (this.f24142e != null) {
                    WeakReference unused3 = VastActivity.f24129m = new WeakReference(this.f24142e);
                } else {
                    WeakReference unused4 = VastActivity.f24129m = null;
                }
                if (this.f24143f != null) {
                    WeakReference unused5 = VastActivity.f24130n = new WeakReference(this.f24143f);
                } else {
                    WeakReference unused6 = VastActivity.f24130n = null;
                }
                context.startActivity(m79143a);
                return null;
            } catch (Throwable th) {
                C37248c.m18680b("VastActivity", th);
                VastActivity.m79145u(this.f24138a);
                VastActivity.m79144v(this.f24138a);
                WeakReference unused7 = VastActivity.f24128l = null;
                WeakReference unused8 = VastActivity.f24129m = null;
                WeakReference unused9 = VastActivity.f24130n = null;
                return C33182b.m24480j("Exception during displaying VastActivity", th);
            }
        }

        /* renamed from: c */
        public C10547a m79141c(@Nullable InterfaceC33595c interfaceC33595c) {
            this.f24142e = interfaceC33595c;
            return this;
        }

        /* renamed from: d */
        public C10547a m79140d(@Nullable InterfaceC37247b interfaceC37247b) {
            this.f24139b = interfaceC37247b;
            return this;
        }

        /* renamed from: e */
        public C10547a m79139e(@Nullable InterfaceC37249d interfaceC37249d) {
            this.f24141d = interfaceC37249d;
            return this;
        }

        /* renamed from: f */
        public C10547a m79138f(@Nullable InterfaceC33594b interfaceC33594b) {
            this.f24143f = interfaceC33594b;
            return this;
        }

        /* renamed from: g */
        public C10547a m79137g(@NonNull C37250e c37250e) {
            this.f24138a = c37250e;
            return this;
        }

        /* renamed from: h */
        public C10547a m79136h(@Nullable VastView vastView) {
            this.f24140c = vastView;
            return this;
        }
    }

    /* renamed from: com.explorestack.iab.vast.activity.VastActivity$b */
    /* loaded from: classes3.dex */
    class C10548b implements InterfaceC37267i {
        C10548b() {
        }

        @Override // p734j1.InterfaceC37267i
        /* renamed from: a */
        public void mo18611a(@NonNull VastView vastView, @NonNull C37250e c37250e) {
            if (VastActivity.this.f24133d != null) {
                VastActivity.this.f24133d.onVastShown(VastActivity.this, c37250e);
            }
        }

        @Override // p734j1.InterfaceC37267i
        /* renamed from: b */
        public void mo18610b(@NonNull VastView vastView, @NonNull C37250e c37250e, boolean z) {
            VastActivity.this.m79154l(c37250e, z);
        }

        @Override // p734j1.InterfaceC37267i
        /* renamed from: c */
        public void mo18609c(@NonNull VastView vastView, @Nullable C37250e c37250e, @NonNull C33182b c33182b) {
            VastActivity.this.m79156j(c37250e, c33182b);
        }

        @Override // p734j1.InterfaceC37267i
        /* renamed from: d */
        public void mo18608d(@NonNull VastView vastView, @NonNull C37250e c37250e, int i) {
            int m18672F = c37250e.m18672F();
            if (m18672F > -1) {
                i = m18672F;
            }
            VastActivity.this.m79163c(i);
        }

        @Override // p734j1.InterfaceC37267i
        /* renamed from: e */
        public void mo18607e(@NonNull VastView vastView, @NonNull C37250e c37250e) {
            if (VastActivity.this.f24133d != null) {
                VastActivity.this.f24133d.onVastComplete(VastActivity.this, c37250e);
            }
        }

        @Override // p734j1.InterfaceC37267i
        /* renamed from: f */
        public void mo18606f(@NonNull VastView vastView, @NonNull C37250e c37250e, @NonNull InterfaceC10505b interfaceC10505b, String str) {
            if (VastActivity.this.f24133d != null) {
                VastActivity.this.f24133d.onVastClick(VastActivity.this, c37250e, interfaceC10505b, str);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public void m79163c(int i) {
        int i2;
        if (i == 1) {
            i2 = 7;
        } else if (i == 2) {
            i2 = 6;
        } else {
            i2 = 4;
        }
        setRequestedOrientation(i2);
    }

    /* renamed from: g */
    private void m79159g(@NonNull VastView vastView) {
        C10512g.m79311f(this);
        C10512g.m79321L(vastView);
        setContentView(vastView);
        C10512g.m79309h(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public void m79156j(@Nullable C37250e c37250e, @NonNull C33182b c33182b) {
        InterfaceC37247b interfaceC37247b = this.f24133d;
        if (interfaceC37247b != null) {
            interfaceC37247b.onVastShowFailed(c37250e, c33182b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public void m79154l(@Nullable C37250e c37250e, boolean z) {
        InterfaceC37247b interfaceC37247b = this.f24133d;
        if (interfaceC37247b != null && !this.f24136h) {
            interfaceC37247b.onVastDismiss(this, c37250e, z);
        }
        this.f24136h = true;
        try {
            getWindow().clearFlags(128);
        } catch (Exception e) {
            C37248c.m18679c("VastActivity", e.getMessage(), new Object[0]);
        }
        if (c37250e != null) {
            m79163c(c37250e.m18666L());
        }
        finish();
        C10512g.m79320M(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public static void m79151o(@NonNull C37250e c37250e, @NonNull VastView vastView) {
        f24127k.put(c37250e.m18670H(), new WeakReference<>(vastView));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public static void m79150p(@NonNull C37250e c37250e, @NonNull InterfaceC37247b interfaceC37247b) {
        f24126j.put(c37250e.m18670H(), new WeakReference<>(interfaceC37247b));
    }

    @Nullable
    /* renamed from: q */
    private Integer m79149q(@NonNull C37250e c37250e) {
        int m18672F = c37250e.m18672F();
        if (m18672F > -1) {
            return Integer.valueOf(m18672F);
        }
        int m18667K = c37250e.m18667K();
        if (m18667K != 0 && m18667K != getResources().getConfiguration().orientation) {
            return Integer.valueOf(m18667K);
        }
        return null;
    }

    @Nullable
    /* renamed from: s */
    private static InterfaceC37247b m79147s(@NonNull C37250e c37250e) {
        WeakReference<InterfaceC37247b> weakReference = f24126j.get(c37250e.m18670H());
        if (weakReference != null && weakReference.get() != null) {
            return weakReference.get();
        }
        m79145u(c37250e);
        return null;
    }

    @Nullable
    /* renamed from: t */
    private static VastView m79146t(@NonNull C37250e c37250e) {
        WeakReference<VastView> weakReference = f24127k.get(c37250e.m18670H());
        if (weakReference != null && weakReference.get() != null) {
            return weakReference.get();
        }
        m79144v(c37250e);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u */
    public static void m79145u(@NonNull C37250e c37250e) {
        f24126j.remove(c37250e.m18670H());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public static void m79144v(@NonNull C37250e c37250e) {
        f24127k.remove(c37250e.m18670H());
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        VastView vastView = this.f24132c;
        if (vastView != null) {
            vastView.handleBackPress();
        }
    }

    @Override // android.app.Activity
    protected void onCreate(@Nullable Bundle bundle) {
        Integer m79149q;
        C10512g.m79319N(getWindow(), ViewCompat.MEASURED_STATE_MASK);
        C10512g.m79320M(this);
        super.onCreate(bundle);
        this.f24131b = C37273m.m18597a(getIntent().getStringExtra("vast_request_id"));
        if (bundle != null && bundle.getBoolean("isFinishedPerformed")) {
            finish();
            return;
        }
        C37250e c37250e = this.f24131b;
        if (c37250e == null) {
            m79156j(null, C33182b.m24484f("VastRequest is null"));
            m79154l(null, false);
            return;
        }
        if (bundle == null && (m79149q = m79149q(c37250e)) != null) {
            m79163c(m79149q.intValue());
            try {
                if ((getPackageManager().getActivityInfo(getComponentName(), 65536).configChanges & 128) == 0) {
                    return;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        this.f24133d = m79147s(this.f24131b);
        VastView m79146t = m79146t(this.f24131b);
        this.f24132c = m79146t;
        if (m79146t == null) {
            this.f24134f = true;
            this.f24132c = new VastView(this);
        }
        this.f24132c.setId(1);
        this.f24132c.setListener(this.f24137i);
        WeakReference<InterfaceC37249d> weakReference = f24128l;
        if (weakReference != null) {
            this.f24132c.setPlaybackListener(weakReference.get());
        }
        WeakReference<InterfaceC33595c> weakReference2 = f24129m;
        if (weakReference2 != null) {
            this.f24132c.setAdMeasurer(weakReference2.get());
        }
        WeakReference<InterfaceC33594b> weakReference3 = f24130n;
        if (weakReference3 != null) {
            this.f24132c.setPostBannerAdMeasurer(weakReference3.get());
        }
        if (bundle == null || !bundle.getBoolean("isLoadPerformed")) {
            this.f24135g = true;
            if (!this.f24132c.display(this.f24131b, Boolean.TRUE)) {
                return;
            }
        }
        m79159g(this.f24132c);
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        C37250e c37250e;
        boolean z;
        VastView vastView;
        super.onDestroy();
        if (!isChangingConfigurations() && (c37250e = this.f24131b) != null) {
            VastView vastView2 = this.f24132c;
            if (vastView2 != null && vastView2.isFinished()) {
                z = true;
            } else {
                z = false;
            }
            m79154l(c37250e, z);
            if (this.f24134f && (vastView = this.f24132c) != null) {
                vastView.destroy();
            }
            m79145u(this.f24131b);
            m79144v(this.f24131b);
            f24128l = null;
            f24129m = null;
            f24130n = null;
        }
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("isLoadPerformed", this.f24135g);
        bundle.putBoolean("isFinishedPerformed", this.f24136h);
    }
}
