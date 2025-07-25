package sg.bigo.ads.common.p912f;

import android.os.SystemClock;

/* renamed from: sg.bigo.ads.common.f.b */
/* loaded from: classes10.dex */
public final class C43618b {

    /* renamed from: e */
    private static final C43618b f114192e = new C43618b();

    /* renamed from: a */
    boolean f114193a = true;

    /* renamed from: b */
    long f114194b;

    /* renamed from: c */
    long f114195c;

    /* renamed from: d */
    public InterfaceC43619a f114196d;

    /* renamed from: sg.bigo.ads.common.f.b$a */
    /* loaded from: classes10.dex */
    public interface InterfaceC43619a {
        /* renamed from: a */
        void mo4106a(long j, long j2);

        /* renamed from: a */
        void mo4103a(boolean z, long j, long j2, long j3);
    }

    private C43618b() {
        m5304b();
    }

    /* renamed from: a */
    public static C43618b m5305a() {
        return f114192e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final void m5304b() {
        this.f114194b = SystemClock.elapsedRealtime();
        this.f114195c = System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final boolean m5303c() {
        if (this.f114194b > 0) {
            return true;
        }
        return false;
    }
}
