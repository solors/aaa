package com.yandex.mobile.ads.impl;

import com.ironsource.C20517nb;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.fn */
/* loaded from: classes8.dex */
public final class C30328fn {
    @NotNull

    /* renamed from: a */
    private final String f79179a;
    @NotNull

    /* renamed from: b */
    private final Map<String, String> f79180b;

    public C30328fn(@NotNull String scheme, @NotNull Map<String, String> authParams) {
        String str;
        Intrinsics.checkNotNullParameter(scheme, "scheme");
        Intrinsics.checkNotNullParameter(authParams, "authParams");
        this.f79179a = scheme;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, String> entry : authParams.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (key != null) {
                Locale US = Locale.US;
                Intrinsics.checkNotNullExpressionValue(US, "US");
                str = key.toLowerCase(US);
                Intrinsics.checkNotNullExpressionValue(str, "toLowerCase(...)");
            } else {
                str = null;
            }
            linkedHashMap.put(str, value);
        }
        Map<String, String> unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        Intrinsics.checkNotNullExpressionValue(unmodifiableMap, "unmodifiableMap(...)");
        this.f79180b = unmodifiableMap;
    }

    @NotNull
    /* renamed from: a */
    public final Charset m34113a() {
        String str = this.f79180b.get(C20517nb.f52166M);
        if (str != null) {
            try {
                Charset forName = Charset.forName(str);
                Intrinsics.checkNotNullExpressionValue(forName, "forName(...)");
                return forName;
            } catch (Exception unused) {
            }
        }
        Charset ISO_8859_1 = StandardCharsets.ISO_8859_1;
        Intrinsics.checkNotNullExpressionValue(ISO_8859_1, "ISO_8859_1");
        return ISO_8859_1;
    }

    @Nullable
    /* renamed from: b */
    public final String m34112b() {
        return this.f79180b.get("realm");
    }

    @NotNull
    /* renamed from: c */
    public final String m34111c() {
        return this.f79179a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj instanceof C30328fn) {
            C30328fn c30328fn = (C30328fn) obj;
            if (Intrinsics.m17075f(c30328fn.f79179a, this.f79179a) && Intrinsics.m17075f(c30328fn.f79180b, this.f79180b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f79180b.hashCode() + C31014o3.m31189a(this.f79179a, 899, 31);
    }

    @NotNull
    public final String toString() {
        String str = this.f79179a;
        Map<String, String> map = this.f79180b;
        return str + " authParams=" + map;
    }
}
