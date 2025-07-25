package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.inmobi.commons.core.configs.AdConfig;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.i4 */
/* loaded from: classes6.dex */
public final class C19311i4 {

    /* renamed from: a */
    public final Map f48352a;

    /* renamed from: b */
    public final Map f48353b;

    /* renamed from: c */
    public final AbstractC19515wc f48354c;

    /* renamed from: d */
    public final String f48355d;

    /* renamed from: e */
    public final Handler f48356e;

    /* renamed from: f */
    public final RunnableC19297h4 f48357f;

    /* renamed from: g */
    public final long f48358g;

    /* renamed from: h */
    public final InterfaceC19269f4 f48359h;

    public C19311i4(AdConfig.ViewabilityConfig viewabilityConfig, AbstractC19515wc visibilityTracker, InterfaceC19269f4 listener) {
        Intrinsics.checkNotNullParameter(viewabilityConfig, "viewabilityConfig");
        Intrinsics.checkNotNullParameter(visibilityTracker, "visibilityTracker");
        Intrinsics.checkNotNullParameter(listener, "listener");
        WeakHashMap weakHashMap = new WeakHashMap();
        WeakHashMap weakHashMap2 = new WeakHashMap();
        Handler handler = new Handler(Looper.getMainLooper());
        this.f48352a = weakHashMap;
        this.f48353b = weakHashMap2;
        this.f48354c = visibilityTracker;
        this.f48355d = C19311i4.class.getSimpleName();
        this.f48358g = viewabilityConfig.getImpressionPollIntervalMillis();
        C19255e4 c19255e4 = new C19255e4(this);
        InterfaceC18850A4 interfaceC18850A4 = visibilityTracker.f48849e;
        if (interfaceC18850A4 != null) {
            ((C18864B4) interfaceC18850A4).m61254c("VisibilityTracker", "setVisibilityTrackerListener logger");
        }
        visibilityTracker.f48854j = c19255e4;
        this.f48356e = handler;
        this.f48357f = new RunnableC19297h4(this);
        this.f48359h = listener;
    }

    /* renamed from: a */
    public final void m60245a(View view, Object token, int i, int i2) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(token, "token");
        C19283g4 c19283g4 = (C19283g4) this.f48352a.get(view);
        if (Intrinsics.m17075f(c19283g4 != null ? c19283g4.f48251a : null, token)) {
            return;
        }
        m60246a(view);
        this.f48352a.put(view, new C19283g4(token, i, i2));
        this.f48354c.m59602a(view, token, i);
    }

    /* renamed from: a */
    public final void m60246a(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f48352a.remove(view);
        this.f48353b.remove(view);
        this.f48354c.m59603a(view);
    }
}
