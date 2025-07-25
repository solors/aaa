package com.yandex.mobile.ads.impl;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class l41 {
    @NotNull

    /* renamed from: a */
    private static final Object f81685a = new Object();
    @Nullable

    /* renamed from: b */
    private static volatile l41 f81686b;

    /* renamed from: c */
    public static final /* synthetic */ int f81687c = 0;

    /* renamed from: com.yandex.mobile.ads.impl.l41$a */
    /* loaded from: classes8.dex */
    public static final class C30769a {
        @NotNull
        /* renamed from: a */
        public static l41 m32347a() {
            l41 l41Var;
            l41 l41Var2 = l41.f81686b;
            if (l41Var2 == null) {
                synchronized (l41.f81685a) {
                    l41Var = l41.f81686b;
                    if (l41Var == null) {
                        l41Var = new l41(0);
                        l41.f81686b = l41Var;
                    }
                }
                return l41Var;
            }
            return l41Var2;
        }
    }

    private l41() {
    }

    /* renamed from: c */
    public final boolean m32348c() {
        return true;
    }

    public /* synthetic */ l41(int i) {
        this();
    }
}
