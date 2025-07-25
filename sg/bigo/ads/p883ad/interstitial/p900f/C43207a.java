package sg.bigo.ads.p883ad.interstitial.p900f;

import android.view.MotionEvent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.ref.WeakReference;
import sg.bigo.ads.controller.landing.LandingPageStyleConfig;

/* renamed from: sg.bigo.ads.ad.interstitial.f.a */
/* loaded from: classes10.dex */
public final class C43207a {

    /* renamed from: a */
    public static WeakReference<InterfaceC43209b> f113104a;

    /* renamed from: b */
    protected final int f113105b;

    /* renamed from: c */
    protected final int f113106c;

    /* renamed from: d */
    protected final int f113107d;

    /* renamed from: e */
    protected final float f113108e;

    /* renamed from: sg.bigo.ads.ad.interstitial.f.a$a */
    /* loaded from: classes10.dex */
    public interface InterfaceC43208a {
        /* renamed from: a */
        boolean mo5916a();
    }

    /* renamed from: sg.bigo.ads.ad.interstitial.f.a$b */
    /* loaded from: classes10.dex */
    public interface InterfaceC43209b {
        /* renamed from: a */
        void mo5674a(int i);

        /* renamed from: a */
        void mo5941a(int i, int i2, int i3, int i4, int i5);

        /* renamed from: a */
        boolean mo5671a(@NonNull MotionEvent motionEvent, @Nullable InterfaceC43208a interfaceC43208a, int i);

        /* renamed from: b */
        void mo5940b(int i);

        /* renamed from: c */
        void mo5939c(int i);

        /* renamed from: d */
        void mo5638d(int i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C43207a(int i, int i2, int i3, float f) {
        this.f113105b = i;
        this.f113106c = i2;
        this.f113107d = i3;
        this.f113108e = f;
    }

    /* renamed from: a */
    public final void m5952a() {
        int i = this.f113105b;
        WeakReference<InterfaceC43209b> weakReference = f113104a;
        InterfaceC43209b interfaceC43209b = weakReference != null ? weakReference.get() : null;
        if (interfaceC43209b != null) {
            interfaceC43209b.mo5940b(i);
        }
    }

    /* renamed from: b */
    public final void m5947b() {
        InterfaceC43209b interfaceC43209b;
        int i = this.f113105b;
        WeakReference<InterfaceC43209b> weakReference = f113104a;
        if (weakReference != null) {
            interfaceC43209b = weakReference.get();
        } else {
            interfaceC43209b = null;
        }
        if (interfaceC43209b != null) {
            interfaceC43209b.mo5939c(i);
        }
    }

    /* renamed from: c */
    public final void m5946c() {
        InterfaceC43209b interfaceC43209b;
        int i = this.f113105b;
        WeakReference<InterfaceC43209b> weakReference = f113104a;
        if (weakReference != null) {
            interfaceC43209b = weakReference.get();
        } else {
            interfaceC43209b = null;
        }
        if (interfaceC43209b != null) {
            interfaceC43209b.mo5638d(i);
        }
    }

    /* renamed from: d */
    public final int m5945d() {
        return this.f113107d;
    }

    /* renamed from: e */
    public final float m5944e() {
        return this.f113108e;
    }

    /* renamed from: f */
    public final boolean m5943f() {
        int i = this.f113106c;
        if (i != 2 && i != 4 && i != 6) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public final boolean m5942g() {
        int i = this.f113106c;
        if (i != 3 && i != 4 && i != 5 && i != 6) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void m5950a(int i, int i2, int i3, int i4) {
        int i5 = this.f113105b;
        WeakReference<InterfaceC43209b> weakReference = f113104a;
        InterfaceC43209b interfaceC43209b = weakReference != null ? weakReference.get() : null;
        if (interfaceC43209b != null) {
            interfaceC43209b.mo5941a(i, i2, i3, i4, i5);
        }
    }

    /* renamed from: a */
    public static void m5948a(LandingPageStyleConfig landingPageStyleConfig) {
        if (landingPageStyleConfig == null || !landingPageStyleConfig.m4062a() || landingPageStyleConfig.m4061b()) {
            return;
        }
        WeakReference<InterfaceC43209b> weakReference = f113104a;
        InterfaceC43209b interfaceC43209b = weakReference != null ? weakReference.get() : null;
        if (interfaceC43209b != null) {
            interfaceC43209b.mo5674a(landingPageStyleConfig.f115591c);
        }
    }

    /* renamed from: a */
    public final boolean m5949a(@NonNull MotionEvent motionEvent, InterfaceC43208a interfaceC43208a) {
        int i = this.f113105b;
        WeakReference<InterfaceC43209b> weakReference = f113104a;
        InterfaceC43209b interfaceC43209b = weakReference != null ? weakReference.get() : null;
        if (interfaceC43209b != null) {
            return interfaceC43209b.mo5671a(motionEvent, interfaceC43208a, i);
        }
        return false;
    }
}
