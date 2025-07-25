package com.yandex.mobile.ads.impl;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.NoWhenBranchMatchedException;

/* loaded from: classes8.dex */
public final class wu1 {

    /* renamed from: com.yandex.mobile.ads.impl.wu1$a */
    /* loaded from: classes8.dex */
    public /* synthetic */ class C31772a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f87422a;

        static {
            int[] iArr = new int[gv1.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                int i = gv1.f79777d;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f87422a = iArr;
        }
    }

    @NotNull
    /* renamed from: a */
    public static vu1 m27739a(@Nullable C30296f6 c30296f6) {
        gv1 gv1Var;
        int i;
        C30366g6 m34214b;
        if (c30296f6 != null && (m34214b = c30296f6.m34214b()) != null) {
            gv1Var = m34214b.m33916c();
        } else {
            gv1Var = null;
        }
        if (gv1Var == null) {
            i = -1;
        } else {
            i = C31772a.f87422a[gv1Var.ordinal()];
        }
        if (i != -1) {
            if (i != 1) {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                return new pc2();
            }
        }
        return new C32026zy();
    }
}
