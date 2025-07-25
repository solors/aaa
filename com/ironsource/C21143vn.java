package com.ironsource;

import com.google.firebase.sessions.settings.RemoteSettings;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C37690r;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: com.ironsource.vn */
/* loaded from: classes6.dex */
public final class C21143vn {
    @NotNull

    /* renamed from: a */
    private final String f54230a;

    public C21143vn(@NotNull String baseControllerUrl) {
        Intrinsics.checkNotNullParameter(baseControllerUrl, "baseControllerUrl");
        this.f54230a = baseControllerUrl;
    }

    @NotNull
    /* renamed from: a */
    public final String m54397a() {
        int m16558k0;
        String str = this.f54230a;
        m16558k0 = C37690r.m16558k0(str, RemoteSettings.FORWARD_SLASH_STRING, 0, false, 6, null);
        String substring = str.substring(0, m16558k0);
        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }
}
