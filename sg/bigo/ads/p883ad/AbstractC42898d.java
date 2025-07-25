package sg.bigo.ads.p883ad;

import android.graphics.Rect;
import android.os.SystemClock;
import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import java.util.concurrent.TimeUnit;
import sg.bigo.ads.api.InterfaceC43501Ad;
import sg.bigo.ads.api.core.C43549b;
import sg.bigo.ads.api.core.C43562g;
import sg.bigo.ads.api.core.InterfaceC43550c;
import sg.bigo.ads.api.core.InterfaceC43573o;
import sg.bigo.ads.api.p904b.AbstractC43534a;
import sg.bigo.ads.common.p907ab.C43593a;
import sg.bigo.ads.common.p926n.C43727d;
import sg.bigo.ads.common.utils.C43836q;
import sg.bigo.ads.common.utils.C43841u;
import sg.bigo.ads.core.p958c.C44136b;

/* renamed from: sg.bigo.ads.ad.d */
/* loaded from: classes10.dex */
public abstract class AbstractC42898d<T extends InterfaceC43501Ad, U extends InterfaceC43550c> extends AbstractC42869c<T, U> {
    @NonNull

    /* renamed from: s */
    protected AbstractC42898d<T, U>.C42899a f112342s;

    /* renamed from: t */
    private boolean f112343t;

    /* renamed from: sg.bigo.ads.ad.d$a */
    /* loaded from: classes10.dex */
    protected final class C42899a {

        /* renamed from: f */
        private long f112349f;

        /* renamed from: g */
        private long f112350g;

        /* renamed from: h */
        private int f112351h;

        /* renamed from: i */
        private long f112352i = 0;

        /* renamed from: j */
        private long f112353j = 0;

        /* renamed from: k */
        private boolean f112354k = false;

        /* renamed from: a */
        int f112344a = -1;

        /* renamed from: b */
        boolean f112345b = false;

        /* renamed from: c */
        boolean f112346c = false;

        /* renamed from: l */
        private boolean f112355l = false;

        /* renamed from: d */
        final Runnable f112347d = new Runnable() { // from class: sg.bigo.ads.ad.d.a.1
            @Override // java.lang.Runnable
            public final void run() {
                View view;
                boolean z;
                C42899a c42899a = C42899a.this;
                AbstractC42898d abstractC42898d = AbstractC42898d.this;
                if (!abstractC42898d.f112251h && ((!c42899a.f112345b || !c42899a.f112346c) && (view = abstractC42898d.f112246c) != null)) {
                    Rect rect = new Rect();
                    if (!C43593a.m5331a(view, rect) && (!AbstractC42898d.this.mo5730n() || !C43549b.m5418b(AbstractC42898d.this.m6446o()))) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (z) {
                        C42899a c42899a2 = C42899a.this;
                        if (c42899a2.f112344a == -1) {
                            c42899a2.f112344a = C43841u.m4806a(view) ? 1 : 0;
                        }
                    }
                    if (z) {
                        C42899a c42899a3 = C42899a.this;
                        if (!c42899a3.f112345b) {
                            C42899a.m6384a(c42899a3, rect);
                        }
                        C42899a c42899a4 = C42899a.this;
                        if (!c42899a4.f112346c) {
                            C42899a.m6382b(c42899a4, rect);
                        }
                    }
                    C42899a c42899a5 = C42899a.this;
                    if (c42899a5.f112345b && c42899a5.f112346c) {
                        c42899a5.m6388a();
                        return;
                    } else {
                        C43727d.m5107a(2, c42899a5.f112347d, 500L);
                        return;
                    }
                }
                c42899a.m6388a();
            }
        };

        protected C42899a() {
        }

        /* renamed from: a */
        private float m6387a(@NonNull Rect rect) {
            AbstractC42898d abstractC42898d = AbstractC42898d.this;
            if (abstractC42898d.f112246c == null || C43549b.m5418b(abstractC42898d.f112245b.f114090a.mo4326x())) {
                return 0.0f;
            }
            float height = AbstractC42898d.this.f112246c.getHeight() * 1.0f * AbstractC42898d.this.f112246c.getWidth();
            float height2 = rect.height() * 1.0f * rect.width();
            if (height <= 0.0f) {
                return 0.0f;
            }
            return height2 / height;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0053, code lost:
            if (r2 != 2) goto L22;
         */
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void m6383b() {
            /*
                r6 = this;
                boolean r0 = r6.f112355l
                if (r0 == 0) goto L5
                return
            L5:
                sg.bigo.ads.ad.d r0 = sg.bigo.ads.p883ad.AbstractC42898d.this
                int r0 = r0.m6445p()
                r1 = 2
                if (r0 != r1) goto L15
                sg.bigo.ads.ad.d r0 = sg.bigo.ads.p883ad.AbstractC42898d.this
                long r2 = sg.bigo.ads.p883ad.AbstractC42898d.m6395a(r0)
                goto L1b
            L15:
                sg.bigo.ads.ad.d r0 = sg.bigo.ads.p883ad.AbstractC42898d.this
                long r2 = sg.bigo.ads.p883ad.AbstractC42898d.m6394b(r0)
            L1b:
                r6.f112349f = r2
                sg.bigo.ads.ad.d r0 = sg.bigo.ads.p883ad.AbstractC42898d.this
                int r0 = r0.m6445p()
                if (r0 != r1) goto L2c
                sg.bigo.ads.ad.d r0 = sg.bigo.ads.p883ad.AbstractC42898d.this
                int r0 = sg.bigo.ads.p883ad.AbstractC42898d.m6393c(r0)
                goto L32
            L2c:
                sg.bigo.ads.ad.d r0 = sg.bigo.ads.p883ad.AbstractC42898d.this
                int r0 = sg.bigo.ads.p883ad.AbstractC42898d.m6391d(r0)
            L32:
                r6.f112351h = r0
                sg.bigo.ads.ad.d r0 = sg.bigo.ads.p883ad.AbstractC42898d.this
                int r0 = r0.m6446o()
                sg.bigo.ads.ad.d r2 = sg.bigo.ads.p883ad.AbstractC42898d.this
                int r2 = r2.m6445p()
                r3 = 1000(0x3e8, float:1.401E-42)
                r4 = 1
                if (r0 == r4) goto L53
                if (r0 == r1) goto L58
                r5 = 3
                if (r0 == r5) goto L58
                r5 = 4
                if (r0 == r5) goto L56
                r5 = 12
                if (r0 == r5) goto L53
                r3 = 0
                goto L58
            L53:
                if (r2 == r1) goto L56
                goto L58
            L56:
                r3 = 2000(0x7d0, float:2.803E-42)
            L58:
                long r2 = (long) r3
                r6.f112350g = r2
                java.lang.Runnable r0 = r6.f112347d
                sg.bigo.ads.common.p926n.C43727d.m5108a(r1, r0)
                r6.f112355l = r4
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.p883ad.AbstractC42898d.C42899a.m6383b():void");
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x004e, code lost:
            if (r0 != 12) goto L46;
         */
        /* JADX WARN: Removed duplicated region for block: B:41:0x0074  */
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        static /* synthetic */ void m6382b(sg.bigo.ads.p883ad.AbstractC42898d.C42899a r10, android.graphics.Rect r11) {
            /*
                long r0 = r10.f112353j
                r2 = 0
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 != 0) goto Le
                long r0 = android.os.SystemClock.elapsedRealtime()
                r10.f112353j = r0
            Le:
                float r11 = r10.m6387a(r11)
                sg.bigo.ads.ad.d r0 = sg.bigo.ads.p883ad.AbstractC42898d.this
                android.view.View r1 = r0.f112246c
                int r0 = r0.m6446o()
                sg.bigo.ads.ad.d r2 = sg.bigo.ads.p883ad.AbstractC42898d.this
                int r2 = r2.m6445p()
                r3 = 0
                r4 = 1
                if (r1 == 0) goto L71
                int r5 = r1.getMeasuredWidth()
                if (r5 <= 0) goto L71
                int r5 = r1.getMeasuredHeight()
                if (r5 <= 0) goto L71
                int r5 = r1.getHeight()
                int r1 = r1.getWidth()
                int r5 = r5 * r1
                r1 = 1050253722(0x3e99999a, float:0.3)
                r6 = 242000(0x3b150, float:3.39114E-40)
                r7 = 2
                r8 = 1056964608(0x3f000000, float:0.5)
                if (r0 == r4) goto L5e
                if (r0 == r7) goto L51
                r9 = 3
                if (r0 == r9) goto L57
                r9 = 4
                if (r0 == r9) goto L57
                r9 = 12
                if (r0 == r9) goto L5e
                goto L71
            L51:
                if (r5 <= r6) goto L59
                int r0 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
                if (r0 <= 0) goto L71
            L57:
                r0 = r4
                goto L72
            L59:
                int r0 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
                if (r0 <= 0) goto L71
                goto L57
            L5e:
                if (r2 != r7) goto L65
                int r0 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
                if (r0 <= 0) goto L71
                goto L57
            L65:
                if (r5 <= r6) goto L6c
                int r0 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
                if (r0 <= 0) goto L71
                goto L57
            L6c:
                int r0 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
                if (r0 <= 0) goto L71
                goto L57
            L71:
                r0 = r3
            L72:
                if (r0 != 0) goto L86
                sg.bigo.ads.ad.d r0 = sg.bigo.ads.p883ad.AbstractC42898d.this
                int r0 = r0.m6446o()
                boolean r0 = sg.bigo.ads.api.core.C43549b.m5418b(r0)
                if (r0 == 0) goto La8
                sg.bigo.ads.ad.d r0 = sg.bigo.ads.p883ad.AbstractC42898d.this
                boolean r0 = r0.f112250g
                if (r0 != 0) goto La8
            L86:
                long r0 = android.os.SystemClock.elapsedRealtime()
                long r5 = r10.f112353j
                long r0 = r0 - r5
                long r5 = r10.f112350g
                int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
                if (r0 < 0) goto La8
                sg.bigo.ads.ad.d r0 = sg.bigo.ads.p883ad.AbstractC42898d.this
                java.lang.Object[] r1 = new java.lang.Object[r4]
                java.lang.Float r11 = java.lang.Float.valueOf(r11)
                r1[r3] = r11
                java.lang.String r11 = "%.4f"
                java.lang.String r11 = sg.bigo.ads.common.utils.C43836q.m4830a(r11, r1)
                r0.m6392d(r11)
                r10.f112346c = r4
            La8:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.p883ad.AbstractC42898d.C42899a.m6382b(sg.bigo.ads.ad.d$a, android.graphics.Rect):void");
        }

        /* renamed from: a */
        public final void m6388a() {
            C43727d.m5106a(this.f112347d);
            this.f112355l = false;
        }

        /* renamed from: a */
        public final void m6386a(final View view, boolean z) {
            AbstractC42898d.this.f112246c = view;
            if (view == null) {
                return;
            }
            if (z) {
                C43727d.m5108a(2, new Runnable() { // from class: sg.bigo.ads.ad.d.a.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        C42899a.this.m6383b();
                    }
                });
            } else {
                view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: sg.bigo.ads.ad.d.a.3
                    @Override // android.view.View.OnAttachStateChangeListener
                    public final void onViewAttachedToWindow(View view2) {
                        C42899a.this.m6383b();
                        view.removeOnAttachStateChangeListener(this);
                    }

                    @Override // android.view.View.OnAttachStateChangeListener
                    public final void onViewDetachedFromWindow(View view2) {
                        C42899a.this.m6388a();
                    }
                });
            }
        }

        /* renamed from: a */
        static /* synthetic */ void m6384a(C42899a c42899a, Rect rect) {
            float f;
            if (c42899a.f112352i == 0) {
                c42899a.f112352i = SystemClock.elapsedRealtime();
            }
            if (c42899a.f112354k) {
                f = 0.0f;
            } else {
                f = c42899a.m6387a(rect);
                View view = AbstractC42898d.this.f112246c;
                int i = c42899a.f112351h;
                if ((view != null && view.getMeasuredHeight() > 0 && view.getMeasuredWidth() > 0 && (i == 0 || ((float) i) <= 100.0f * f)) || (C43549b.m5418b(AbstractC42898d.this.m6446o()) && !AbstractC42898d.this.f112250g)) {
                    c42899a.f112354k = true;
                }
            }
            long max = c42899a.f112344a == 1 ? Math.max(TimeUnit.SECONDS.toMillis(1L), c42899a.f112349f) : c42899a.f112349f;
            if (!c42899a.f112354k || SystemClock.elapsedRealtime() - c42899a.f112352i < max) {
                return;
            }
            if (f == 0.0f) {
                f = c42899a.m6387a(rect);
            }
            AbstractC42898d.this.m6460a("show_proportion", C43836q.m4830a("%.4f", Float.valueOf(f)));
            AbstractC42898d.this.m6456a_();
            c42899a.f112345b = true;
        }
    }

    public AbstractC42898d(@NonNull C43562g c43562g) {
        super(c43562g);
        this.f112343t = false;
        this.f112342s = new C42899a();
    }

    /* renamed from: a */
    static /* synthetic */ long m6395a(AbstractC42898d abstractC42898d) {
        InterfaceC43573o.InterfaceC43575b mo4253ay;
        InterfaceC43550c interfaceC43550c = abstractC42898d.f112245b.f114090a;
        if (!(interfaceC43550c instanceof InterfaceC43573o) || (mo4253ay = ((InterfaceC43573o) interfaceC43550c).mo4253ay()) == null) {
            return 0L;
        }
        return mo4253ay.mo4304b();
    }

    /* renamed from: b */
    static /* synthetic */ long m6394b(AbstractC42898d abstractC42898d) {
        InterfaceC43573o.InterfaceC43575b mo4253ay;
        InterfaceC43550c interfaceC43550c = abstractC42898d.f112245b.f114090a;
        if ((interfaceC43550c instanceof InterfaceC43573o) && (mo4253ay = ((InterfaceC43573o) interfaceC43550c).mo4253ay()) != null) {
            return mo4253ay.mo4302d();
        }
        return 0L;
    }

    /* renamed from: c */
    static /* synthetic */ int m6393c(AbstractC42898d abstractC42898d) {
        InterfaceC43573o.InterfaceC43575b mo4253ay;
        InterfaceC43550c interfaceC43550c = abstractC42898d.f112245b.f114090a;
        if ((interfaceC43550c instanceof InterfaceC43573o) && (mo4253ay = ((InterfaceC43573o) interfaceC43550c).mo4253ay()) != null) {
            return mo4253ay.mo4305a();
        }
        return 0;
    }

    /* renamed from: d */
    static /* synthetic */ int m6391d(AbstractC42898d abstractC42898d) {
        InterfaceC43573o.InterfaceC43575b mo4253ay;
        InterfaceC43550c interfaceC43550c = abstractC42898d.f112245b.f114090a;
        if (!(interfaceC43550c instanceof InterfaceC43573o) || (mo4253ay = ((InterfaceC43573o) interfaceC43550c).mo4253ay()) == null) {
            return 0;
        }
        return mo4253ay.mo4303c();
    }

    @Override // sg.bigo.ads.p883ad.AbstractC42869c, sg.bigo.ads.api.InterfaceC43501Ad
    public void destroy() {
        super.destroy();
        this.f112342s.m6388a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // sg.bigo.ads.p883ad.AbstractC42869c
    @CallSuper
    /* renamed from: k */
    public final void mo6390k() {
        super.mo6390k();
        this.f112342s.m6388a();
    }

    /* renamed from: w */
    public final void m6389w() {
        this.f112342s.m6383b();
    }

    @Override // sg.bigo.ads.p883ad.AbstractC42869c
    /* renamed from: a */
    public void mo6397a() {
        super.mo6397a();
        AbstractC42898d<T, U>.C42899a c42899a = this.f112342s;
        if (c42899a != null) {
            c42899a.m6388a();
        }
        this.f112343t = false;
        this.f112342s = new C42899a();
    }

    /* renamed from: d */
    protected final void m6392d(String str) {
        if (this.f112343t) {
            return;
        }
        this.f112343t = true;
        String mo6448i = mo6448i();
        int intValue = ((Integer) mo5515b("render_style", 0)).intValue();
        if (m6461a("06002029")) {
            C44136b.m3886a(this, str, mo6448i, intValue);
        }
        AbstractC43534a abstractC43534a = this.f114063P;
        if (abstractC43534a != null) {
            abstractC43534a.mo5448a(str, mo6448i, intValue);
        }
    }

    /* renamed from: a */
    public final void m6396a(View view, boolean z) {
        this.f112342s.m6386a(view, z);
    }
}
