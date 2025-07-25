package com.yandex.mobile.ads.impl;

/* loaded from: classes8.dex */
public interface v40 extends z02 {

    /* renamed from: com.yandex.mobile.ads.impl.v40$a */
    /* loaded from: classes8.dex */
    public static final class C31630a {

        /* renamed from: a */
        public final v02 f86555a;

        /* renamed from: b */
        public final int[] f86556b;

        /* renamed from: c */
        public final int f86557c;

        public C31630a(int i, v02 v02Var, int[] iArr) {
            if (iArr.length == 0) {
                gq0.m33797a("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
            }
            this.f86555a = v02Var;
            this.f86556b = iArr;
            this.f86557c = i;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.v40$b */
    /* loaded from: classes8.dex */
    public interface InterfaceC31631b {
    }

    /* renamed from: a */
    void mo28304a(float f);

    /* renamed from: c */
    void mo28301c();

    /* renamed from: d */
    void mo28300d();

    /* renamed from: e */
    v90 mo28299e();

    /* renamed from: f */
    default void m28533f() {
    }

    /* renamed from: g */
    default void m28532g() {
    }

    /* renamed from: a */
    default void m28534a(boolean z) {
    }
}
