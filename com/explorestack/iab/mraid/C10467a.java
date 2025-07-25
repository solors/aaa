package com.explorestack.iab.mraid;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.explorestack.iab.mraid.MraidView;
import com.explorestack.iab.utils.C10507d;
import com.explorestack.iab.utils.C10512g;
import com.explorestack.iab.utils.InterfaceC10505b;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import p678g1.C33182b;
import p678g1.EnumC33181a;
import p708i1.InterfaceC33594b;

/* renamed from: com.explorestack.iab.mraid.a */
/* loaded from: classes3.dex */
public class C10467a {
    @NonNull

    /* renamed from: k */
    private static final AtomicInteger f23895k = new AtomicInteger(0);

    /* renamed from: l */
    static final /* synthetic */ boolean f23896l = true;
    @Nullable
    @VisibleForTesting

    /* renamed from: d */
    MraidView f23900d;
    @Nullable

    /* renamed from: e */
    private InterfaceC10471b f23901e;

    /* renamed from: a */
    public final int f23897a = f23895k.getAndIncrement();

    /* renamed from: f */
    private boolean f23902f = false;

    /* renamed from: g */
    private boolean f23903g = false;

    /* renamed from: h */
    private boolean f23904h = false;

    /* renamed from: i */
    private boolean f23905i = true;

    /* renamed from: j */
    private boolean f23906j = false;
    @NonNull

    /* renamed from: b */
    private final AtomicBoolean f23898b = new AtomicBoolean(false);
    @VisibleForTesting

    /* renamed from: c */
    final InterfaceC10483k f23899c = new C10470c();

    /* renamed from: com.explorestack.iab.mraid.a$a */
    /* loaded from: classes3.dex */
    public class C10468a {
        @NonNull

        /* renamed from: a */
        private final MraidView.C10460a f23907a = new MraidView.C10460a(EnumC10479g.INTERSTITIAL);

        public C10468a() {
        }

        /* renamed from: a */
        public C10467a m79546a(@NonNull Context context) {
            this.f23907a.m79602B(C10467a.this.f23899c);
            C10467a.this.f23900d = this.f23907a.m79593c(context);
            return C10467a.this;
        }

        /* renamed from: b */
        public C10468a m79545b(boolean z) {
            this.f23907a.m79588h(z);
            return this;
        }

        /* renamed from: c */
        public C10468a m79544c(@Nullable InterfaceC33594b interfaceC33594b) {
            this.f23907a.m79576t(interfaceC33594b);
            return this;
        }

        /* renamed from: d */
        public C10468a m79543d(String str) {
            this.f23907a.m79575u(str);
            return this;
        }

        /* renamed from: e */
        public C10468a m79542e(@NonNull EnumC33181a enumC33181a) {
            this.f23907a.m79574v(enumC33181a);
            return this;
        }

        /* renamed from: f */
        public C10468a m79541f(@Nullable C10507d c10507d) {
            this.f23907a.m79573w(c10507d);
            return this;
        }

        /* renamed from: g */
        public C10468a m79540g(float f) {
            this.f23907a.m79572x(f);
            return this;
        }

        /* renamed from: h */
        public C10468a m79539h(@Nullable C10507d c10507d) {
            this.f23907a.m79571y(c10507d);
            return this;
        }

        /* renamed from: i */
        public C10468a m79538i(float f) {
            this.f23907a.m79570z(f);
            return this;
        }

        /* renamed from: j */
        public C10468a m79537j(boolean z) {
            this.f23907a.m79603A(z);
            return this;
        }

        /* renamed from: k */
        public C10468a m79536k(InterfaceC10471b interfaceC10471b) {
            C10467a.this.f23901e = interfaceC10471b;
            return this;
        }

        /* renamed from: l */
        public C10468a m79535l(@Nullable C10507d c10507d) {
            this.f23907a.m79601C(c10507d);
            return this;
        }

        /* renamed from: m */
        public C10468a m79534m(float f) {
            this.f23907a.m79600D(f);
            return this;
        }

        /* renamed from: n */
        public C10468a m79533n(String str) {
            this.f23907a.m79599E(str);
            return this;
        }

        /* renamed from: o */
        public C10468a m79532o(@Nullable C10507d c10507d) {
            this.f23907a.m79598F(c10507d);
            return this;
        }

        /* renamed from: p */
        public C10468a m79531p(boolean z) {
            this.f23907a.m79597G(z);
            return this;
        }

        /* renamed from: q */
        public C10468a m79530q(boolean z) {
            this.f23907a.m79596H(z);
            return this;
        }
    }

    private C10467a() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public void m79567c() {
        MraidView mraidView;
        Activity peekActivity;
        if (this.f23906j && (mraidView = this.f23900d) != null && (peekActivity = mraidView.peekActivity()) != null) {
            C10512g.m79301p(peekActivity);
        }
    }

    @NonNull
    /* renamed from: u */
    public static C10468a m79549u() {
        return new C10468a();
    }

    /* renamed from: d */
    void m79566d(@Nullable Activity activity, @NonNull ViewGroup viewGroup, boolean z, boolean z2) {
        if (!m79553q()) {
            if (activity != null && z) {
                C10512g.m79301p(activity);
            }
            m79559k(C33182b.m24485e("Interstitial is not ready"));
            C10472c.m79523g("MraidInterstitial", "Show failed: interstitial is not ready", new Object[0]);
        } else if (!f23896l && this.f23900d == null) {
            throw new AssertionError();
        } else {
            this.f23905i = z2;
            this.f23906j = z;
            C10512g.m79321L(this.f23900d);
            viewGroup.addView(this.f23900d, new ViewGroup.LayoutParams(-1, -1));
            this.f23900d.show(activity);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m79565e(@NonNull Activity activity, boolean z) {
        m79566d(activity, (ViewGroup) activity.findViewById(16908290), true, z);
    }

    /* renamed from: f */
    void m79564f(@NonNull C33182b c33182b) {
        this.f23902f = false;
        this.f23904h = true;
        InterfaceC10471b interfaceC10471b = this.f23901e;
        if (interfaceC10471b != null) {
            interfaceC10471b.onLoadFailed(this, c33182b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public void m79563g() {
        if (m79554p()) {
            return;
        }
        this.f23903g = true;
        InterfaceC10471b interfaceC10471b = this.f23901e;
        if (interfaceC10471b != null) {
            interfaceC10471b.onClose(this);
        }
        if (this.f23905i) {
            m79556n();
        }
    }

    /* renamed from: i */
    void m79561i(@NonNull C33182b c33182b) {
        this.f23902f = false;
        this.f23904h = true;
        m79559k(c33182b);
    }

    /* renamed from: j */
    void m79560j() {
        this.f23902f = true;
        InterfaceC10471b interfaceC10471b = this.f23901e;
        if (interfaceC10471b != null) {
            interfaceC10471b.onLoaded(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public void m79559k(@NonNull C33182b c33182b) {
        InterfaceC10471b interfaceC10471b = this.f23901e;
        if (interfaceC10471b != null) {
            interfaceC10471b.onShowFailed(this, c33182b);
        }
    }

    /* renamed from: l */
    public boolean m79558l() {
        MraidView mraidView = this.f23900d;
        if (mraidView != null && !mraidView.canBeClosed() && !m79552r()) {
            return false;
        }
        return true;
    }

    /* renamed from: m */
    void m79557m() {
        this.f23898b.set(true);
        InterfaceC10471b interfaceC10471b = this.f23901e;
        if (interfaceC10471b != null) {
            interfaceC10471b.onShown(this);
        }
    }

    /* renamed from: n */
    public void m79556n() {
        C10472c.m79529a("MraidInterstitial", "destroy", new Object[0]);
        this.f23902f = false;
        this.f23901e = null;
        MraidView mraidView = this.f23900d;
        if (mraidView != null) {
            mraidView.destroy();
            this.f23900d = null;
        }
    }

    /* renamed from: o */
    public void m79555o() {
        if (this.f23900d != null && m79558l()) {
            this.f23900d.m79640P();
        }
    }

    /* renamed from: p */
    public boolean m79554p() {
        return this.f23903g;
    }

    /* renamed from: q */
    public boolean m79553q() {
        if (this.f23902f && this.f23900d != null) {
            return true;
        }
        return false;
    }

    /* renamed from: r */
    public boolean m79552r() {
        return this.f23904h;
    }

    /* renamed from: s */
    public boolean m79551s() {
        return this.f23898b.get();
    }

    /* renamed from: t */
    public void m79550t(@Nullable String str) {
        MraidView mraidView = this.f23900d;
        if (mraidView != null) {
            mraidView.load(str);
            return;
        }
        throw new IllegalStateException("MraidView not created (mraidView == null)");
    }

    /* renamed from: v */
    public void m79548v(@Nullable Context context, @Nullable EnumC10482j enumC10482j) {
        MraidActivity.show(context, this, enumC10482j);
    }

    /* renamed from: w */
    public void m79547w(@NonNull ViewGroup viewGroup, boolean z) {
        m79566d(null, viewGroup, false, z);
    }

    /* renamed from: com.explorestack.iab.mraid.a$c */
    /* loaded from: classes3.dex */
    private class C10470c implements InterfaceC10483k {
        private C10470c() {
        }

        @Override // com.explorestack.iab.mraid.InterfaceC10483k
        public void onClose(@NonNull MraidView mraidView) {
            C10472c.m79529a("MraidInterstitial", "ViewListener - onClose", new Object[0]);
            C10467a.this.m79567c();
            C10467a.this.m79563g();
        }

        @Override // com.explorestack.iab.mraid.InterfaceC10483k
        public void onExpired(@NonNull MraidView mraidView, @NonNull C33182b c33182b) {
            C10472c.m79529a("MraidInterstitial", "ViewListener - onExpired (%s)", c33182b);
            if (C10467a.this.f23901e != null) {
                C10467a.this.f23901e.onExpired(C10467a.this, c33182b);
            }
        }

        @Override // com.explorestack.iab.mraid.InterfaceC10483k
        public void onLoadFailed(@NonNull MraidView mraidView, @NonNull C33182b c33182b) {
            C10472c.m79529a("MraidInterstitial", "ViewListener - onLoadFailed (%s)", c33182b);
            C10467a.this.m79567c();
            C10467a.this.m79564f(c33182b);
        }

        @Override // com.explorestack.iab.mraid.InterfaceC10483k
        public void onLoaded(@NonNull MraidView mraidView) {
            C10472c.m79529a("MraidInterstitial", "ViewListener - onLoaded", new Object[0]);
            C10467a.this.m79560j();
        }

        @Override // com.explorestack.iab.mraid.InterfaceC10483k
        public void onOpenBrowser(@NonNull MraidView mraidView, @NonNull String str, @NonNull InterfaceC10505b interfaceC10505b) {
            C10472c.m79529a("MraidInterstitial", "ViewListener - onOpenBrowser (%s)", str);
            if (C10467a.this.f23901e != null) {
                C10467a.this.f23901e.onOpenBrowser(C10467a.this, str, interfaceC10505b);
            }
        }

        @Override // com.explorestack.iab.mraid.InterfaceC10483k
        public void onPlayVideo(@NonNull MraidView mraidView, @NonNull String str) {
            C10472c.m79529a("MraidInterstitial", "ViewListener - onPlayVideo (%s)", str);
            if (C10467a.this.f23901e != null) {
                C10467a.this.f23901e.onPlayVideo(C10467a.this, str);
            }
        }

        @Override // com.explorestack.iab.mraid.InterfaceC10483k
        public void onShowFailed(@NonNull MraidView mraidView, @NonNull C33182b c33182b) {
            C10472c.m79529a("MraidInterstitial", "ViewListener - onShowFailed (%s)", c33182b);
            C10467a.this.m79567c();
            C10467a.this.m79561i(c33182b);
        }

        @Override // com.explorestack.iab.mraid.InterfaceC10483k
        public void onShown(@NonNull MraidView mraidView) {
            C10472c.m79529a("MraidInterstitial", "ViewListener - onShown", new Object[0]);
            C10467a.this.m79557m();
        }

        @Override // com.explorestack.iab.mraid.InterfaceC10483k
        public void onExpand(@NonNull MraidView mraidView) {
        }
    }
}
