package sg.bigo.ads.core.p962d.p963a;

import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import sg.bigo.ads.api.core.C43579q;
import sg.bigo.ads.common.InterfaceC43710k;
import sg.bigo.ads.common.p926n.C43727d;
import sg.bigo.ads.common.p932t.C43782a;
import sg.bigo.ads.common.utils.C43834p;
import sg.bigo.ads.core.p962d.p963a.C44175f;

/* renamed from: sg.bigo.ads.core.d.a.c */
/* loaded from: classes10.dex */
public final class C44168c {

    /* renamed from: e */
    private static boolean f115921e = false;

    /* renamed from: f */
    private static final C44168c f115922f = new C44168c();

    /* renamed from: c */
    public C43579q f115925c;

    /* renamed from: d */
    public InterfaceC43710k f115926d;

    /* renamed from: a */
    public final Set<C44173e> f115923a = C43834p.m4848a(50);

    /* renamed from: b */
    public final AtomicBoolean f115924b = new AtomicBoolean(false);

    /* renamed from: g */
    private final Runnable f115927g = new Runnable() { // from class: sg.bigo.ads.core.d.a.c.2
        {
            C44168c.this = this;
        }

        /* JADX WARN: Removed duplicated region for block: B:132:0x00af  */
        /* JADX WARN: Removed duplicated region for block: B:135:0x00b7  */
        /* JADX WARN: Removed duplicated region for block: B:152:0x0134  */
        /* JADX WARN: Removed duplicated region for block: B:155:0x013c  */
        /* JADX WARN: Removed duplicated region for block: B:172:0x01b9  */
        /* JADX WARN: Removed duplicated region for block: B:174:0x01c0  */
        /* JADX WARN: Removed duplicated region for block: B:191:0x024e  */
        /* JADX WARN: Removed duplicated region for block: B:200:0x0271  */
        /* JADX WARN: Removed duplicated region for block: B:202:0x0295  */
        @Override // java.lang.Runnable
        @android.annotation.SuppressLint({"ConcurrentModification", "IteratorRemove"})
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void run() {
            /*
                Method dump skipped, instructions count: 826
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.core.p962d.p963a.C44168c.RunnableC441702.run():void");
        }
    };

    /* renamed from: d */
    public void m3779d() {
        f115921e = true;
        m3784b();
        C43782a.m5010a(0, 3, "RetryTrackerManager", "startCheckRetryTrack");
        C43727d.m5107a(1, this.f115927g, 20000L);
    }

    /* renamed from: a */
    public static C44168c m3787a() {
        return f115922f;
    }

    /* renamed from: c */
    static /* synthetic */ boolean m3781c() {
        f115921e = false;
        return false;
    }

    /* renamed from: b */
    public final void m3784b() {
        C43782a.m5010a(0, 3, "RetryTrackerManager", "stopCheckRetryTrack");
        C43727d.m5106a(this.f115927g);
    }

    /* renamed from: a */
    public final void m3785a(C44173e c44173e) {
        if (!f115921e) {
            m3779d();
        }
        this.f115923a.add(c44173e);
        C44175f c44175f = C44175f.C44176a.f115962a;
        C44175f.m3748a(c44173e);
    }

    /* renamed from: b */
    public final void m3782b(final C44173e c44173e) {
        C43727d.m5108a(1, new Runnable() { // from class: sg.bigo.ads.core.d.a.c.1
            {
                C44168c.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C44175f c44175f = C44175f.C44176a.f115962a;
                C44175f.m3747b(c44173e);
            }
        });
    }
}
