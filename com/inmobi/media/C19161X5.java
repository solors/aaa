package com.inmobi.media;

import android.content.Context;
import com.inmobi.media.C19161X5;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections._Collections;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.X5 */
/* loaded from: classes6.dex */
public final class C19161X5 {

    /* renamed from: a */
    public final String f47959a;

    /* renamed from: b */
    public final long f47960b;

    /* renamed from: c */
    public final long f47961c;

    /* renamed from: d */
    public final int f47962d;

    /* renamed from: e */
    public final int f47963e;

    /* renamed from: f */
    public final WeakReference f47964f;

    /* renamed from: g */
    public final AtomicBoolean f47965g;

    public C19161X5(Context context, String url, long j, long j2, int i, int i2) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(url, "url");
        this.f47959a = url;
        this.f47960b = j;
        this.f47961c = j2;
        this.f47962d = i;
        this.f47963e = i2;
        this.f47964f = new WeakReference(context);
        this.f47965g = new AtomicBoolean(false);
        m60562a();
    }

    /* renamed from: a */
    public final void m60562a() {
        final Context context = (Context) this.f47964f.get();
        if (context != null) {
            ScheduledExecutorService scheduledExecutorService = AbstractC19243d6.f48160a;
            Runnable runnable = new Runnable() { // from class: o3.q2
                {
                    C19161X5.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C19161X5.m60560a(C19161X5.this, context);
                }
            };
            Intrinsics.checkNotNullParameter(runnable, "runnable");
            AbstractC19243d6.f48160a.submit(runnable);
        }
    }

    /* renamed from: a */
    public static final void m60560a(C19161X5 this$0, Context context) {
        List<Object> m17534m0;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(context, "$context");
        if (this$0.f47965g.get()) {
            return;
        }
        Intrinsics.checkNotNullParameter(context, "context");
        if (!this$0.f47965g.get()) {
            int m59595a = AbstractC19518x1.m59595a((AbstractC19518x1) AbstractC19541ya.m59535d());
            C19083R5 m59535d = AbstractC19541ya.m59535d();
            m59535d.getClass();
            ArrayList m59594a = AbstractC19518x1.m59594a(m59535d, "hasLoggerFinished=1", null, null, null, null, Integer.valueOf(m59595a), 30);
            C19148W5 action = new C19148W5(this$0, context);
            Intrinsics.checkNotNullParameter(m59594a, "<this>");
            Intrinsics.checkNotNullParameter(action, "action");
            m17534m0 = _Collections.m17534m0(m59594a);
            for (Object obj : m17534m0) {
                action.invoke(obj);
            }
        }
        ScheduledExecutorService scheduledExecutorService = AbstractC19243d6.f48160a;
        AbstractC19229c6.m60397a(AbstractC19541ya.m59535d(), Calendar.getInstance().getTimeInMillis() - this$0.f47961c, this$0.f47963e);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00c0, code lost:
        r13 = kotlin.collections._Arrays.m17348D0(r13);
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m60561a(final android.content.Context r13, final java.lang.String r14, com.inmobi.media.C19071Q5 r15) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C19161X5.m60561a(android.content.Context, java.lang.String, com.inmobi.media.Q5):void");
    }

    /* renamed from: a */
    public static final void m60559a(C19161X5 this$0, Context context, String url, C19071Q5 updatedData) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(url, "$url");
        Intrinsics.checkNotNullParameter(updatedData, "$updatedData");
        this$0.m60561a(context, url, updatedData);
    }
}
