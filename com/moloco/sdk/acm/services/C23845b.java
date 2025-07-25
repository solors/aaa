package com.moloco.sdk.acm.services;

import android.text.TextUtils;
import com.amazon.p047a.p048a.p071o.KiwiConstants;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.moloco.sdk.acm.services.b */
/* loaded from: classes7.dex */
public final class C23845b {
    @NotNull

    /* renamed from: a */
    public static final C23845b f61883a = new C23845b();

    /* renamed from: a */
    public final boolean m47635a(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return Boolean.parseBoolean(m47634b(key));
    }

    /* renamed from: b */
    public final String m47634b(String str) {
        try {
            Object invoke = Class.forName(KiwiConstants.f2713ar).getMethod(KiwiConstants.f2714as, String.class).invoke(null, str);
            Intrinsics.m17073h(invoke, "null cannot be cast to non-null type kotlin.String");
            String str2 = (String) invoke;
            try {
                if (TextUtils.isEmpty(str2)) {
                    return null;
                }
            } catch (Exception unused) {
            }
            return str2;
        } catch (Exception unused2) {
            return null;
        }
    }
}
