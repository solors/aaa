package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.AbstractC30484hp;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.NoWhenBranchMatchedException;

/* renamed from: com.yandex.mobile.ads.impl.gp */
/* loaded from: classes8.dex */
public final class C30407gp implements a22 {
    /* renamed from: b */
    private static AbstractC30484hp m33806b(sp0 sp0Var, EnumC29955ap enumC29955ap) {
        AbstractC30484hp c30487c;
        String str;
        String m35813b = enumC29955ap.m35813b();
        try {
            int ordinal = enumC29955ap.ordinal();
            if (ordinal != 0) {
                boolean z = true;
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal != 3) {
                            if (ordinal != 4) {
                                if (ordinal == 5) {
                                    c30487c = new AbstractC30484hp.C30485a(sp0Var.mo29082d(m35813b));
                                } else {
                                    throw new NoWhenBranchMatchedException();
                                }
                            } else {
                                c30487c = new AbstractC30484hp.C30490f(sp0Var.mo29082d(m35813b));
                            }
                        } else {
                            c30487c = new AbstractC30484hp.C30489e(sp0Var.mo29082d(m35813b));
                        }
                    } else {
                        if (sp0Var.mo29088b(-1, m35813b) == -1) {
                            z = false;
                        }
                        c30487c = new AbstractC30484hp.C30486b(z);
                    }
                } else {
                    int mo29088b = sp0Var.mo29088b(-1, m35813b);
                    Integer valueOf = Integer.valueOf(mo29088b);
                    if (mo29088b == -1) {
                        valueOf = null;
                    }
                    if (valueOf != null) {
                        str = String.valueOf(valueOf.intValue());
                    } else {
                        str = null;
                    }
                    c30487c = new AbstractC30484hp.C30488d(str);
                }
            } else {
                c30487c = new AbstractC30484hp.C30487c(sp0Var.mo29082d(m35813b));
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
        if (!localStorage.mo29083c(type.m35813b())) {
            type = null;
        }
        if (type != null) {
            return m33806b(localStorage, type);
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.a22
    @Nullable
    /* renamed from: a */
    public final AbstractC30484hp mo33807a(@NotNull sp0 localStorage, @NotNull String v2) {
        EnumC29955ap enumC29955ap;
        Intrinsics.checkNotNullParameter(localStorage, "localStorage");
        Intrinsics.checkNotNullParameter(v2, "key");
        if (!localStorage.mo29083c(v2)) {
            v2 = null;
        }
        if (v2 != null) {
            EnumC29955ap.f76866d.getClass();
            Intrinsics.checkNotNullParameter(v2, "v2");
            EnumC29955ap[] values = EnumC29955ap.values();
            int length = values.length;
            for (int i = 0; i < length; i++) {
                enumC29955ap = values[i];
                if (Intrinsics.m17075f(enumC29955ap.m35813b(), v2)) {
                    break;
                }
            }
        }
        enumC29955ap = null;
        if (enumC29955ap != null) {
            return m33806b(localStorage, enumC29955ap);
        }
        return null;
    }
}
