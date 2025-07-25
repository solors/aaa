package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.as1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C37690r;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class m32 {
    @NotNull

    /* renamed from: a */
    private final as1 f82032a;
    @NotNull

    /* renamed from: b */
    private final Context f82033b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m32(Context context) {
        this(context, as1.C29962a.m35776a());
        int i = as1.f76895l;
    }

    @NotNull
    /* renamed from: a */
    public final String m32106a(@NotNull String url) {
        int m16568d0;
        Intrinsics.checkNotNullParameter(url, "url");
        yp1 m35796a = this.f82032a.m35796a(this.f82033b);
        if (m35796a == null || m35796a.m26786K()) {
            String valueOf = String.valueOf(System.currentTimeMillis());
            m16568d0 = C37690r.m16568d0(url, '?', 0, false, 6, null);
            return m32105a(url, valueOf, m16568d0 == -1 ? '?' : '&');
        }
        return url;
    }

    public m32(@NotNull Context context, @NotNull as1 sdkSettings) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sdkSettings, "sdkSettings");
        this.f82032a = sdkSettings;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        this.f82033b = applicationContext;
    }

    /* renamed from: a */
    private static String m32105a(String str, String str2, char c) {
        String valueOf = str.length() == 0 ? "" : Character.valueOf(c);
        return str + valueOf + "ctime=" + str2;
    }
}
