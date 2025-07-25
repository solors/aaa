package com.inmobi.media;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.inmobi.commons.core.configs.AdConfig;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.S6 */
/* loaded from: classes6.dex */
public final class C19097S6 {

    /* renamed from: a */
    public final byte f47693a;

    /* renamed from: b */
    public final InterfaceC18850A4 f47694b;

    /* renamed from: c */
    public final String f47695c = C19097S6.class.getSimpleName();

    /* renamed from: d */
    public final WeakHashMap f47696d = new WeakHashMap();

    /* renamed from: e */
    public final WeakHashMap f47697e = new WeakHashMap();

    /* renamed from: f */
    public final LinkedHashMap f47698f = new LinkedHashMap();

    /* renamed from: g */
    public final C19059P6 f47699g = new C19059P6();

    /* renamed from: h */
    public final C19084R6 f47700h = new C19084R6(this);

    /* renamed from: i */
    public final C19072Q6 f47701i = new C19072Q6();

    public C19097S6(byte b, InterfaceC18850A4 interfaceC18850A4) {
        this.f47693a = b;
        this.f47694b = interfaceC18850A4;
    }

    /* renamed from: a */
    public final void m60721a(Context context, View view, C19020M6 token, AdConfig.ViewabilityConfig viewabilityConfig) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(viewabilityConfig, "viewabilityConfig");
        C19311i4 c19311i4 = (C19311i4) this.f47696d.get(context);
        if (c19311i4 == null) {
            if (context instanceof Activity) {
                c19311i4 = new C19311i4(viewabilityConfig, new C19093S2(this.f47701i, (Activity) context, this.f47694b), this.f47699g);
            } else {
                c19311i4 = new C19311i4(viewabilityConfig, new C19386n9(this.f47701i, viewabilityConfig, (byte) 1, this.f47694b), this.f47699g);
            }
            this.f47696d.put(context, c19311i4);
        }
        byte b = this.f47693a;
        if (b == 0) {
            c19311i4.m60245a(view, token, viewabilityConfig.getVideoImpressionMinPercentageViewed(), viewabilityConfig.getVideoImpressionMinTimeViewed());
        } else if (b == 1) {
            c19311i4.m60245a(view, token, viewabilityConfig.getImpressionMinPercentageViewed(), viewabilityConfig.getImpressionMinTimeViewed());
        } else {
            c19311i4.m60245a(view, token, viewabilityConfig.getImpressionMinPercentageViewed(), viewabilityConfig.getImpressionMinTimeViewed());
        }
    }

    /* renamed from: a */
    public final void m60719a(Context context, C19020M6 token) {
        View view;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(token, "token");
        C19311i4 c19311i4 = (C19311i4) this.f47696d.get(context);
        if (c19311i4 != null) {
            Intrinsics.checkNotNullParameter(token, "token");
            Iterator it = c19311i4.f48352a.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    view = null;
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                if (Intrinsics.m17075f(((C19283g4) entry.getValue()).f48251a, token)) {
                    view = (View) entry.getKey();
                    break;
                }
            }
            if (view != null) {
                Intrinsics.checkNotNullParameter(view, "view");
                c19311i4.f48352a.remove(view);
                c19311i4.f48353b.remove(view);
                c19311i4.f48354c.m59603a(view);
            }
            if (!c19311i4.f48352a.isEmpty()) {
                return;
            }
            InterfaceC18850A4 interfaceC18850A4 = this.f47694b;
            if (interfaceC18850A4 != null) {
                String TAG = this.f47695c;
                Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                ((C18864B4) interfaceC18850A4).m61259a(TAG, "Impression tracker is free, removing it");
            }
            C19311i4 c19311i42 = (C19311i4) this.f47696d.remove(context);
            if (c19311i42 != null) {
                c19311i42.f48352a.clear();
                c19311i42.f48353b.clear();
                c19311i42.f48354c.m59604a();
                c19311i42.f48356e.removeMessages(0);
                c19311i42.f48354c.mo59601b();
            }
            if (context instanceof Activity) {
                this.f47696d.isEmpty();
            }
        }
    }

    /* renamed from: a */
    public final void m60722a(Context context, View view, C19020M6 token) {
        View view2;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(token, "token");
        AbstractC19515wc abstractC19515wc = (AbstractC19515wc) this.f47697e.get(context);
        if (abstractC19515wc != null) {
            if (token != null) {
                Iterator it = abstractC19515wc.f48845a.entrySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        view2 = null;
                        break;
                    }
                    Map.Entry entry = (Map.Entry) it.next();
                    if (Intrinsics.m17075f(((C19473tc) entry.getValue()).f48702d, token)) {
                        view2 = (View) entry.getKey();
                        break;
                    }
                }
                if (view2 != null) {
                    abstractC19515wc.m59603a(view2);
                }
            }
            if (!(!abstractC19515wc.f48845a.isEmpty())) {
                InterfaceC18850A4 interfaceC18850A4 = this.f47694b;
                if (interfaceC18850A4 != null) {
                    String TAG = this.f47695c;
                    Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                    ((C18864B4) interfaceC18850A4).m61259a(TAG, "Impression tracker is free, removing it");
                }
                AbstractC19515wc abstractC19515wc2 = (AbstractC19515wc) this.f47697e.remove(context);
                if (abstractC19515wc2 != null) {
                    abstractC19515wc2.mo59601b();
                }
                if (context instanceof Activity) {
                    this.f47697e.isEmpty();
                }
            }
        }
        this.f47698f.remove(view);
    }

    /* renamed from: a */
    public final void m60720a(Context context, View view, C19020M6 token, InterfaceC19417pc listener, AdConfig.ViewabilityConfig config) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(config, "config");
        AbstractC19515wc abstractC19515wc = (AbstractC19515wc) this.f47697e.get(context);
        if (abstractC19515wc == null) {
            if (context instanceof Activity) {
                abstractC19515wc = new C19093S2(this.f47701i, (Activity) context, this.f47694b);
            } else {
                abstractC19515wc = new C19386n9(this.f47701i, config, (byte) 1, this.f47694b);
            }
            C19084R6 c19084r6 = this.f47700h;
            InterfaceC18850A4 interfaceC18850A4 = abstractC19515wc.f48849e;
            if (interfaceC18850A4 != null) {
                ((C18864B4) interfaceC18850A4).m61254c("VisibilityTracker", "setVisibilityTrackerListener logger");
            }
            abstractC19515wc.f48854j = c19084r6;
            this.f47697e.put(context, abstractC19515wc);
        }
        this.f47698f.put(view, listener);
        byte b = this.f47693a;
        if (b == 0) {
            abstractC19515wc.m59602a(view, token, config.getVideoMinPercentagePlay());
        } else if (b == 1) {
            abstractC19515wc.m59602a(view, token, config.getDisplayMinPercentageAnimate());
        } else {
            abstractC19515wc.m59602a(view, token, config.getDisplayMinPercentageAnimate());
        }
    }
}
