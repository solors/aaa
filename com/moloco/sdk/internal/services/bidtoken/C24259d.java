package com.moloco.sdk.internal.services.bidtoken;

import com.moloco.sdk.C23858c;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.moloco.sdk.internal.services.bidtoken.d */
/* loaded from: classes7.dex */
public final class C24259d {
    @NotNull

    /* renamed from: a */
    public static final C24260e f62830a;
    @NotNull

    /* renamed from: b */
    public static final C24266j f62831b;

    static {
        C24260e c24260e = new C24260e(false);
        f62830a = c24260e;
        f62831b = new C24266j("", "", c24260e);
    }

    @NotNull
    /* renamed from: a */
    public static final C24260e m46703a() {
        return f62830a;
    }

    @NotNull
    /* renamed from: b */
    public static final C24260e m46702b(@NotNull C23858c c23858c) {
        Intrinsics.checkNotNullParameter(c23858c, "<this>");
        if (c23858c.m47605e()) {
            return new C24260e(c23858c.m47607c().m47601c());
        }
        return f62830a;
    }

    @NotNull
    /* renamed from: c */
    public static final C24266j m46701c() {
        return f62831b;
    }
}
