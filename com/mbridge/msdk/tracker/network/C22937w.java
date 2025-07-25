package com.mbridge.msdk.tracker.network;

import com.mbridge.msdk.tracker.network.InterfaceC22902b;

/* compiled from: Response.java */
/* renamed from: com.mbridge.msdk.tracker.network.w */
/* loaded from: classes6.dex */
public final class C22937w<T> {

    /* renamed from: a */
    public final T f59881a;

    /* renamed from: b */
    public final InterfaceC22902b.C22903a f59882b;

    /* renamed from: c */
    public final AbstractC22898ad f59883c;

    /* renamed from: d */
    public boolean f59884d;

    /* compiled from: Response.java */
    /* renamed from: com.mbridge.msdk.tracker.network.w$a */
    /* loaded from: classes6.dex */
    public interface InterfaceC22938a {
        /* renamed from: a */
        void mo49372a(AbstractC22898ad abstractC22898ad);
    }

    /* compiled from: Response.java */
    /* renamed from: com.mbridge.msdk.tracker.network.w$b */
    /* loaded from: classes6.dex */
    public interface InterfaceC22939b<T> {
        /* renamed from: a */
        void mo49371a(T t);
    }

    private C22937w(T t, InterfaceC22902b.C22903a c22903a) {
        this.f59884d = false;
        this.f59881a = t;
        this.f59882b = c22903a;
        this.f59883c = null;
    }

    /* renamed from: a */
    public static <T> C22937w<T> m49373a(T t, InterfaceC22902b.C22903a c22903a) {
        return new C22937w<>(t, c22903a);
    }

    /* renamed from: a */
    public static <T> C22937w<T> m49374a(AbstractC22898ad abstractC22898ad) {
        return new C22937w<>(abstractC22898ad);
    }

    private C22937w(AbstractC22898ad abstractC22898ad) {
        this.f59884d = false;
        this.f59881a = null;
        this.f59882b = null;
        this.f59883c = abstractC22898ad;
    }
}
