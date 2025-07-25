package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import androidx.annotation.VisibleForTesting;
import com.yandex.mobile.ads.impl.g42;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.Tuples;
import kotlin.collections.C37566w;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.C38513v;

/* loaded from: classes8.dex */
public final class xz0 implements w91 {
    @NotNull

    /* renamed from: a */
    private final Context f87949a;
    @NotNull

    /* renamed from: b */
    private final s91 f87950b;
    @NotNull

    /* renamed from: c */
    private final g12 f87951c;
    @NotNull

    /* renamed from: d */
    private final String f87952d;
    @NotNull

    /* renamed from: e */
    private final EnumC30451h9 f87953e;
    @NotNull

    /* renamed from: f */
    private final HandlerC31861a f87954f;
    @NotNull

    /* renamed from: g */
    private final C30710k9 f87955g;
    @NotNull

    /* renamed from: h */
    private final as1 f87956h;
    @NotNull

    /* renamed from: i */
    private final o12 f87957i;
    @NotNull

    /* renamed from: j */
    private final ArrayList f87958j;
    @Nullable

    /* renamed from: k */
    private yh0 f87959k;

    /* renamed from: l */
    private boolean f87960l;

    /* renamed from: m */
    private boolean f87961m;

    @VisibleForTesting
    /* renamed from: com.yandex.mobile.ads.impl.xz0$a */
    /* loaded from: classes8.dex */
    public static final class HandlerC31861a extends Handler {
        @NotNull

        /* renamed from: a */
        private final s91 f87962a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HandlerC31861a(@NotNull Looper looper, @NotNull s91 noticeReportController) {
            super(looper);
            Intrinsics.checkNotNullParameter(looper, "looper");
            Intrinsics.checkNotNullParameter(noticeReportController, "noticeReportController");
            this.f87962a = noticeReportController;
        }

        @Override // android.os.Handler
        public final void handleMessage(@NotNull Message msg) {
            int m17154x;
            long elapsedRealtime;
            Intrinsics.checkNotNullParameter(msg, "msg");
            int i = msg.what;
            if (i != 1) {
                if (i == 2) {
                    Object obj = msg.obj;
                    Intrinsics.m17073h(obj, "null cannot be cast to non-null type java.lang.ref.WeakReference<com.monetization.ads.base.impression.tracking.MrcNoticeTrackingManager?>");
                    xz0 xz0Var = (xz0) ((WeakReference) obj).get();
                    if (xz0Var != null) {
                        um0.m28725d(Integer.valueOf(xz0Var.f87958j.size()), xz0Var.f87952d);
                        Iterator it = xz0Var.f87958j.iterator();
                        while (it.hasNext()) {
                            n12 n12Var = (n12) it.next();
                            g42 m27146a = xz0.m27146a(xz0Var, n12Var);
                            if (xz0.m27149a(m27146a)) {
                                Long m31712b = n12Var.m31712b();
                                if (m31712b != null) {
                                    elapsedRealtime = m31712b.longValue();
                                } else {
                                    elapsedRealtime = SystemClock.elapsedRealtime();
                                    n12Var.m31713a(Long.valueOf(elapsedRealtime));
                                }
                                if (SystemClock.elapsedRealtime() - elapsedRealtime >= n12Var.m31714a()) {
                                    xz0Var.f87954f.sendMessage(Message.obtain(xz0Var.f87954f, 1, C38513v.m14532a(new WeakReference(xz0Var), n12Var)));
                                }
                                xz0Var.m27135f();
                                this.f87962a.mo29669a(n12Var.m31711c());
                            } else {
                                n12Var.m31713a(null);
                                this.f87962a.mo29668a(n12Var.m31711c(), m27146a);
                            }
                        }
                        if (xz0Var.m27138d()) {
                            xz0Var.f87954f.sendMessageDelayed(Message.obtain(xz0Var.f87954f, 2, new WeakReference(xz0Var)), 200L);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            Object obj2 = msg.obj;
            Intrinsics.m17073h(obj2, "null cannot be cast to non-null type kotlin.Pair<java.lang.ref.WeakReference<com.monetization.ads.base.impression.tracking.MrcNoticeTrackingManager>, com.monetization.ads.base.impression.tracking.model.TrackingNotice>");
            Tuples tuples = (Tuples) obj2;
            xz0 xz0Var2 = (xz0) ((WeakReference) tuples.m17630c()).get();
            if (xz0Var2 != null) {
                n12 n12Var2 = (n12) tuples.m17629d();
                um0.m28725d(xz0Var2.f87952d);
                g42 m27146a2 = xz0.m27146a(xz0Var2, n12Var2);
                xz0Var2.m27148a(n12Var2, m27146a2);
                if (xz0.m27149a(m27146a2)) {
                    xz0Var2.f87958j.remove(n12Var2);
                    xz0Var2.m27136e();
                    s91 s91Var = this.f87962a;
                    pt1 m31711c = n12Var2.m31711c();
                    ArrayList arrayList = xz0Var2.f87958j;
                    m17154x = C37566w.m17154x(arrayList, 10);
                    ArrayList arrayList2 = new ArrayList(m17154x);
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(((n12) it2.next()).m31711c());
                    }
                    s91Var.mo29667a(m31711c, arrayList2);
                    return;
                }
                n12Var2.m31713a(null);
                xz0Var2.mo27142b();
            }
        }
    }

    public xz0(@NotNull Context context, @NotNull C30359g3 adConfiguration, @NotNull s91 noticeReportController, @NotNull g12 trackingChecker, @NotNull String viewControllerDescription, @NotNull EnumC30451h9 adStructureType, @NotNull HandlerC31861a handler, @NotNull C30710k9 adTracker, @NotNull as1 sdkSettings, @NotNull o12 trackingNoticeBuilder) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(noticeReportController, "noticeReportController");
        Intrinsics.checkNotNullParameter(trackingChecker, "trackingChecker");
        Intrinsics.checkNotNullParameter(viewControllerDescription, "viewControllerDescription");
        Intrinsics.checkNotNullParameter(adStructureType, "adStructureType");
        Intrinsics.checkNotNullParameter(handler, "handler");
        Intrinsics.checkNotNullParameter(adTracker, "adTracker");
        Intrinsics.checkNotNullParameter(sdkSettings, "sdkSettings");
        Intrinsics.checkNotNullParameter(trackingNoticeBuilder, "trackingNoticeBuilder");
        this.f87949a = context;
        this.f87950b = noticeReportController;
        this.f87951c = trackingChecker;
        this.f87952d = viewControllerDescription;
        this.f87953e = adStructureType;
        this.f87954f = handler;
        this.f87955g = adTracker;
        this.f87956h = sdkSettings;
        this.f87957i = trackingNoticeBuilder;
        this.f87958j = new ArrayList();
    }

    /* renamed from: e */
    public final void m27136e() {
        if (!this.f87961m && this.f87958j.isEmpty()) {
            this.f87961m = true;
            yh0 yh0Var = this.f87959k;
            if (yh0Var != null) {
                yh0Var.mo26907g();
            }
        }
    }

    /* renamed from: f */
    public final void m27135f() {
        if (!this.f87960l) {
            this.f87960l = true;
            yh0 yh0Var = this.f87959k;
            if (yh0Var != null) {
                yh0Var.mo26908c();
            }
        }
    }

    /* renamed from: a */
    public static final boolean m27149a(g42 g42Var) {
        return g42Var.m33929b() == g42.EnumC30362a.f79483c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public final synchronized boolean m27138d() {
        return this.f87958j.size() > 0;
    }

    @Override // com.yandex.mobile.ads.impl.w91
    /* renamed from: b */
    public final synchronized void mo27142b() {
        um0.m28725d(new Object[0]);
        if (id1.f80423h.m33296a(this.f87949a).m33300b() && !this.f87958j.isEmpty() && m27138d() && !this.f87954f.hasMessages(2)) {
            HandlerC31861a handlerC31861a = this.f87954f;
            handlerC31861a.sendMessage(Message.obtain(handlerC31861a, 2, new WeakReference(this)));
        }
    }

    @Override // com.yandex.mobile.ads.impl.w91
    /* renamed from: c */
    public final synchronized void mo27140c() {
        g42 mo31160a;
        int m17154x;
        um0.m28725d(Integer.valueOf(this.f87958j.size()), this.f87952d);
        mo27152a();
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f87958j.iterator();
        while (it.hasNext()) {
            n12 n12Var = (n12) it.next();
            yp1 m35796a = this.f87956h.m35796a(this.f87949a);
            if (m35796a != null && m35796a.m26771Z()) {
                mo31160a = this.f87951c.mo31159b(n12Var.m31709e());
            } else {
                mo31160a = this.f87951c.mo31160a(n12Var.m31709e());
            }
            um0.m28725d(mo31160a.m33929b().m33928a());
            m27148a(n12Var, mo31160a);
            if (mo31160a.m33929b() == g42.EnumC30362a.f79483c) {
                it.remove();
                m27135f();
                m27136e();
                this.f87950b.mo29669a(n12Var.m31711c());
                s91 s91Var = this.f87950b;
                pt1 m31711c = n12Var.m31711c();
                ArrayList arrayList2 = this.f87958j;
                m17154x = C37566w.m17154x(arrayList2, 10);
                ArrayList arrayList3 = new ArrayList(m17154x);
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(((n12) it2.next()).m31711c());
                }
                s91Var.mo29667a(m31711c, arrayList3);
            } else {
                arrayList.add(new y91(n12Var, mo31160a));
            }
        }
        this.f87950b.mo29666a(arrayList);
        mo27142b();
    }

    /* renamed from: a */
    public static final g42 m27146a(xz0 xz0Var, n12 n12Var) {
        g42 mo31159b = xz0Var.f87951c.mo31159b(n12Var.m31709e());
        um0.m28725d(mo31159b.m33929b().m33928a());
        return mo31159b;
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x00d7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a7 A[SYNTHETIC] */
    @androidx.annotation.VisibleForTesting
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void m27143a(@org.jetbrains.annotations.NotNull java.util.List<com.yandex.mobile.ads.impl.ot1> r10) {
        /*
            r9 = this;
            monitor-enter(r9)
            java.lang.String r0 = "showNotices"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)     // Catch: java.lang.Throwable -> Le8
            java.util.ArrayList r0 = r9.f87958j     // Catch: java.lang.Throwable -> Le8
            r0.clear()     // Catch: java.lang.Throwable -> Le8
            com.yandex.mobile.ads.impl.o12 r0 = r9.f87957i     // Catch: java.lang.Throwable -> Le8
            com.yandex.mobile.ads.impl.h9 r1 = r9.f87953e     // Catch: java.lang.Throwable -> Le8
            r0.getClass()     // Catch: java.lang.Throwable -> Le8
            java.lang.String r0 = "adStructureType"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)     // Catch: java.lang.Throwable -> Le8
            java.lang.String r0 = "showNotices"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)     // Catch: java.lang.Throwable -> Le8
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Le8
            r2 = 10
            int r2 = kotlin.collections.C37561t.m17185x(r10, r2)     // Catch: java.lang.Throwable -> Le8
            r0.<init>(r2)     // Catch: java.lang.Throwable -> Le8
            java.util.Iterator r2 = r10.iterator()     // Catch: java.lang.Throwable -> Le8
        L2b:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> Le8
            if (r3 == 0) goto L3f
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> Le8
            com.yandex.mobile.ads.impl.ot1 r3 = (com.yandex.mobile.ads.impl.ot1) r3     // Catch: java.lang.Throwable -> Le8
            com.yandex.mobile.ads.impl.pt1 r3 = r3.m30887b()     // Catch: java.lang.Throwable -> Le8
            r0.add(r3)     // Catch: java.lang.Throwable -> Le8
            goto L2b
        L3f:
            java.util.Set r0 = kotlin.collections.C37561t.m17215e1(r0)     // Catch: java.lang.Throwable -> Le8
            int r1 = r1.ordinal()     // Catch: java.lang.Throwable -> Le8
            if (r1 == 0) goto L5b
            r0 = 1
            if (r1 == r0) goto L58
            r0 = 2
            if (r1 != r0) goto L52
            com.yandex.mobile.ads.impl.pt1 r0 = com.yandex.mobile.ads.impl.pt1.f84073b     // Catch: java.lang.Throwable -> Le8
            goto L7e
        L52:
            nd.o r10 = new nd.o     // Catch: java.lang.Throwable -> Le8
            r10.<init>()     // Catch: java.lang.Throwable -> Le8
            throw r10     // Catch: java.lang.Throwable -> Le8
        L58:
            com.yandex.mobile.ads.impl.pt1 r0 = com.yandex.mobile.ads.impl.pt1.f84074c     // Catch: java.lang.Throwable -> Le8
            goto L7e
        L5b:
            boolean r1 = r0 instanceof java.util.Collection     // Catch: java.lang.Throwable -> Le8
            if (r1 == 0) goto L66
            boolean r1 = r0.isEmpty()     // Catch: java.lang.Throwable -> Le8
            if (r1 == 0) goto L66
            goto L7c
        L66:
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> Le8
        L6a:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> Le8
            if (r1 == 0) goto L7c
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> Le8
            com.yandex.mobile.ads.impl.pt1 r1 = (com.yandex.mobile.ads.impl.pt1) r1     // Catch: java.lang.Throwable -> Le8
            com.yandex.mobile.ads.impl.pt1 r2 = com.yandex.mobile.ads.impl.pt1.f84074c     // Catch: java.lang.Throwable -> Le8
            if (r1 != r2) goto L6a
            r0 = 0
            goto L7e
        L7c:
            com.yandex.mobile.ads.impl.pt1 r0 = com.yandex.mobile.ads.impl.pt1.f84073b     // Catch: java.lang.Throwable -> Le8
        L7e:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Le8
            r1.<init>()     // Catch: java.lang.Throwable -> Le8
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Le8
            r2.<init>()     // Catch: java.lang.Throwable -> Le8
            java.util.Iterator r10 = r10.iterator()     // Catch: java.lang.Throwable -> Le8
        L8c:
            boolean r3 = r10.hasNext()     // Catch: java.lang.Throwable -> Le8
            if (r3 == 0) goto La3
            java.lang.Object r3 = r10.next()     // Catch: java.lang.Throwable -> Le8
            r4 = r3
            com.yandex.mobile.ads.impl.ot1 r4 = (com.yandex.mobile.ads.impl.ot1) r4     // Catch: java.lang.Throwable -> Le8
            java.lang.String r4 = r4.m30886c()     // Catch: java.lang.Throwable -> Le8
            if (r4 == 0) goto L8c
            r2.add(r3)     // Catch: java.lang.Throwable -> Le8
            goto L8c
        La3:
            java.util.Iterator r10 = r2.iterator()     // Catch: java.lang.Throwable -> Le8
        La7:
            boolean r2 = r10.hasNext()     // Catch: java.lang.Throwable -> Le8
            if (r2 == 0) goto Le1
            java.lang.Object r2 = r10.next()     // Catch: java.lang.Throwable -> Le8
            com.yandex.mobile.ads.impl.ot1 r2 = (com.yandex.mobile.ads.impl.ot1) r2     // Catch: java.lang.Throwable -> Le8
            java.lang.String r8 = r2.m30886c()     // Catch: java.lang.Throwable -> Le8
            long r5 = r2.m30888a()     // Catch: java.lang.Throwable -> Le8
            int r4 = r2.m30885d()     // Catch: java.lang.Throwable -> Le8
            com.yandex.mobile.ads.impl.pt1 r3 = r2.m30887b()     // Catch: java.lang.Throwable -> Le8
            com.yandex.mobile.ads.impl.pt1 r7 = com.yandex.mobile.ads.impl.pt1.f84075d     // Catch: java.lang.Throwable -> Le8
            if (r3 != r7) goto Ld0
            if (r0 != 0) goto Lce
            com.yandex.mobile.ads.impl.pt1 r2 = r2.m30887b()     // Catch: java.lang.Throwable -> Le8
            goto Ld4
        Lce:
            r7 = r0
            goto Ld5
        Ld0:
            com.yandex.mobile.ads.impl.pt1 r2 = r2.m30887b()     // Catch: java.lang.Throwable -> Le8
        Ld4:
            r7 = r2
        Ld5:
            if (r8 == 0) goto La7
            com.yandex.mobile.ads.impl.n12 r2 = new com.yandex.mobile.ads.impl.n12     // Catch: java.lang.Throwable -> Le8
            r3 = r2
            r3.<init>(r4, r5, r7, r8)     // Catch: java.lang.Throwable -> Le8
            r1.add(r2)     // Catch: java.lang.Throwable -> Le8
            goto La7
        Le1:
            java.util.ArrayList r10 = r9.f87958j     // Catch: java.lang.Throwable -> Le8
            r10.addAll(r1)     // Catch: java.lang.Throwable -> Le8
            monitor-exit(r9)
            return
        Le8:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.xz0.m27143a(java.util.List):void");
    }

    /* renamed from: a */
    public final synchronized void m27150a(@NotNull fd1 phoneState, boolean z) {
        Intrinsics.checkNotNullParameter(phoneState, "phoneState");
        Objects.toString(phoneState);
        um0.m28725d(new Object[0]);
        int ordinal = phoneState.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                mo27152a();
            } else if (ordinal != 2) {
            }
        }
        if (z) {
            mo27142b();
        }
    }

    @Override // com.yandex.mobile.ads.impl.w91
    /* renamed from: a */
    public final void mo27144a(@NotNull yh0 impressionTrackingListener) {
        Intrinsics.checkNotNullParameter(impressionTrackingListener, "impressionTrackingListener");
        this.f87959k = impressionTrackingListener;
    }

    @Override // com.yandex.mobile.ads.impl.w91
    /* renamed from: a */
    public final synchronized void mo27152a() {
        um0.m28725d(new Object[0]);
        this.f87954f.removeMessages(2);
        this.f87954f.removeMessages(1);
        Iterator it = this.f87958j.iterator();
        while (it.hasNext()) {
            ((n12) it.next()).m31713a(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public final synchronized void m27148a(n12 n12Var, g42 g42Var) {
        if (g42Var.m33929b() == g42.EnumC30362a.f79483c) {
            this.f87955g.m32625a(n12Var.m31710d());
        } else {
            this.f87950b.mo29668a(n12Var.m31711c(), g42Var);
        }
    }

    @Override // com.yandex.mobile.ads.impl.w91
    /* renamed from: a */
    public final synchronized void mo27151a(@NotNull C30149d8<?> adResponse, @NotNull List<ot1> showNotices) {
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        Intrinsics.checkNotNullParameter(showNotices, "showNotices");
        um0.m28725d(new Object[0]);
        this.f87950b.mo29670a(adResponse);
        this.f87958j.clear();
        this.f87950b.invalidate();
        this.f87961m = false;
        mo27152a();
        m27143a(showNotices);
    }
}
