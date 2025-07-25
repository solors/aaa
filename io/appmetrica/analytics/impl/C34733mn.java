package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: io.appmetrica.analytics.impl.mn */
/* loaded from: classes9.dex */
public final class C34733mn implements InterfaceC33965Ia {
    @Override // io.appmetrica.analytics.impl.InterfaceC33965Ia
    @Nullable
    /* renamed from: a */
    public final String mo21315a(@NotNull Context context) {
        ProtobufStateStorage<Object> mo22149a;
        C34758nl c34758nl;
        try {
            AbstractC34287Vl m22163a = C34263Ul.m22163a(C34758nl.class);
            if (m22163a != null && (mo22149a = m22163a.mo22149a(context, m22163a.mo22147c(context))) != null && (c34758nl = (C34758nl) mo22149a.read()) != null) {
                return c34758nl.f95040a;
            }
        } catch (Throwable unused) {
        }
        return null;
    }
}
