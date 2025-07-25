package com.inmobi.media;

import android.view.View;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.W3 */
/* loaded from: classes6.dex */
public final class C19146W3 {

    /* renamed from: k */
    public static final C19107T3 f47885k = new C19107T3();

    /* renamed from: a */
    public final byte f47886a;

    /* renamed from: b */
    public final String f47887b;

    /* renamed from: c */
    public final int f47888c;

    /* renamed from: d */
    public final int f47889d;

    /* renamed from: e */
    public final int f47890e;

    /* renamed from: f */
    public final InterfaceC18850A4 f47891f;

    /* renamed from: g */
    public C19311i4 f47892g;

    /* renamed from: h */
    public C19185Z3 f47893h;

    /* renamed from: i */
    public final LinkedHashMap f47894i = new LinkedHashMap();

    /* renamed from: j */
    public final C19120U3 f47895j = new C19120U3(this);

    public C19146W3(byte b, String str, int i, int i2, int i3, InterfaceC18850A4 interfaceC18850A4) {
        this.f47886a = b;
        this.f47887b = str;
        this.f47888c = i;
        this.f47889d = i2;
        this.f47890e = i3;
        this.f47891f = interfaceC18850A4;
    }

    /* renamed from: a */
    public final void m60610a(View view) {
        C19311i4 c19311i4;
        Intrinsics.checkNotNullParameter(view, "view");
        InterfaceC18850A4 interfaceC18850A4 = this.f47891f;
        if (interfaceC18850A4 != null) {
            ((C18864B4) interfaceC18850A4).m61254c("HtmlAdTracker", "stopTrackingForImpression");
        }
        if (Intrinsics.m17075f(this.f47887b, "video") || Intrinsics.m17075f(this.f47887b, "audio") || (c19311i4 = this.f47892g) == null) {
            return;
        }
        Intrinsics.checkNotNullParameter(view, "view");
        c19311i4.f48352a.remove(view);
        c19311i4.f48353b.remove(view);
        c19311i4.f48354c.m59603a(view);
        if (!c19311i4.f48352a.isEmpty()) {
            return;
        }
        InterfaceC18850A4 interfaceC18850A42 = this.f47891f;
        if (interfaceC18850A42 != null) {
            ((C18864B4) interfaceC18850A42).m61259a("HtmlAdTracker", "Impression tracker is free, removing it");
        }
        C19311i4 c19311i42 = this.f47892g;
        if (c19311i42 != null) {
            c19311i42.f48352a.clear();
            c19311i42.f48353b.clear();
            c19311i42.f48354c.m59604a();
            c19311i42.f48356e.removeMessages(0);
            c19311i42.f48354c.mo59601b();
        }
        this.f47892g = null;
    }

    /* renamed from: b */
    public final void m60608b(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        InterfaceC18850A4 interfaceC18850A4 = this.f47891f;
        if (interfaceC18850A4 != null) {
            ((C18864B4) interfaceC18850A4).m61254c("HtmlAdTracker", "stopTrackingForVisibility");
        }
        C19185Z3 c19185z3 = this.f47893h;
        if (c19185z3 != null) {
            c19185z3.m59603a(view);
            if (!(!c19185z3.f48845a.isEmpty())) {
                InterfaceC18850A4 interfaceC18850A42 = this.f47891f;
                if (interfaceC18850A42 != null) {
                    ((C18864B4) interfaceC18850A42).m61259a("HtmlAdTracker", "Visibility tracker is free, removing it");
                }
                C19185Z3 c19185z32 = this.f47893h;
                if (c19185z32 != null) {
                    c19185z32.mo59601b();
                }
                this.f47893h = null;
            }
        }
        this.f47894i.remove(view);
    }

    /* renamed from: b */
    public final void m60609b() {
        InterfaceC18850A4 interfaceC18850A4 = this.f47891f;
        if (interfaceC18850A4 != null) {
            ((C18864B4) interfaceC18850A4).m61254c("HtmlAdTracker", "onActivityStopped");
        }
        C19311i4 c19311i4 = this.f47892g;
        if (c19311i4 != null) {
            String TAG = c19311i4.f48355d;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            c19311i4.f48354c.m59604a();
            c19311i4.f48356e.removeCallbacksAndMessages(null);
            c19311i4.f48353b.clear();
        }
        C19185Z3 c19185z3 = this.f47893h;
        if (c19185z3 != null) {
            c19185z3.mo59598e();
        }
    }

    /* renamed from: a */
    public final void m60611a() {
        InterfaceC18850A4 interfaceC18850A4 = this.f47891f;
        if (interfaceC18850A4 != null) {
            ((C18864B4) interfaceC18850A4).m61254c("HtmlAdTracker", "onActivityStarted");
        }
        C19311i4 c19311i4 = this.f47892g;
        if (c19311i4 != null) {
            String TAG = c19311i4.f48355d;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            for (Map.Entry entry : c19311i4.f48352a.entrySet()) {
                C19283g4 c19283g4 = (C19283g4) entry.getValue();
                c19311i4.f48354c.m59602a((View) entry.getKey(), c19283g4.f48251a, c19283g4.f48252b);
            }
            if (!c19311i4.f48356e.hasMessages(0)) {
                c19311i4.f48356e.postDelayed(c19311i4.f48357f, c19311i4.f48358g);
            }
            c19311i4.f48354c.mo59597f();
        }
        C19185Z3 c19185z3 = this.f47893h;
        if (c19185z3 != null) {
            c19185z3.mo59597f();
        }
    }
}
