package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.AbstractC30484hp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.NoWhenBranchMatchedException;

/* renamed from: com.yandex.mobile.ads.impl.fp */
/* loaded from: classes8.dex */
public final class C30330fp implements a22 {
    /* renamed from: b */
    private static AbstractC30484hp m34108b(sp0 sp0Var, EnumC29955ap enumC29955ap) {
        AbstractC30484hp c30487c;
        String m35814a = enumC29955ap.m35814a();
        if (m35814a == null) {
            return null;
        }
        try {
            int ordinal = enumC29955ap.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal != 3) {
                            if (ordinal != 4) {
                                if (ordinal == 5) {
                                    return null;
                                }
                                throw new NoWhenBranchMatchedException();
                            }
                            c30487c = new AbstractC30484hp.C30490f(sp0Var.mo29082d(m35814a));
                        } else {
                            c30487c = new AbstractC30484hp.C30489e(sp0Var.mo29082d(m35814a));
                        }
                    } else {
                        c30487c = new AbstractC30484hp.C30486b(sp0Var.mo29089a(m35814a, false));
                    }
                } else {
                    c30487c = new AbstractC30484hp.C30488d(sp0Var.mo29082d(m35814a));
                }
            } else {
                c30487c = new AbstractC30484hp.C30487c(sp0Var.mo29082d(m35814a));
            }
            return c30487c;
        } catch (ClassCastException unused) {
            return null;
        }
    }

    @Override // com.yandex.mobile.ads.impl.a22
    @Nullable
    /* renamed from: a */
    public final AbstractC30484hp mo33808a(@NotNull sp0 localStorage, @NotNull EnumC29955ap type) {
        Intrinsics.checkNotNullParameter(localStorage, "localStorage");
        Intrinsics.checkNotNullParameter(type, "type");
        if (type.m35814a() == null || !localStorage.mo29083c(type.m35814a())) {
            type = null;
        }
        if (type != null) {
            return m34108b(localStorage, type);
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.a22
    @Nullable
    /* renamed from: a */
    public final AbstractC30484hp mo33807a(@NotNull sp0 localStorage, @NotNull String v1) {
        EnumC29955ap enumC29955ap;
        Intrinsics.checkNotNullParameter(localStorage, "localStorage");
        Intrinsics.checkNotNullParameter(v1, "key");
        if (!localStorage.mo29083c(v1)) {
            v1 = null;
        }
        if (v1 != null) {
            EnumC29955ap.f76866d.getClass();
            Intrinsics.checkNotNullParameter(v1, "v1");
            EnumC29955ap[] values = EnumC29955ap.values();
            int length = values.length;
            for (int i = 0; i < length; i++) {
                enumC29955ap = values[i];
                if (Intrinsics.m17075f(enumC29955ap.m35814a(), v1)) {
                    break;
                }
            }
        }
        enumC29955ap = null;
        if (enumC29955ap != null) {
            return m34108b(localStorage, enumC29955ap);
        }
        return null;
    }
}
