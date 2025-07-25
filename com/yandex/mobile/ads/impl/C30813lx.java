package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* renamed from: com.yandex.mobile.ads.impl.lx */
/* loaded from: classes8.dex */
public final class C30813lx implements InterfaceC29979b0<C30678jx> {
    @NotNull

    /* renamed from: a */
    private final l32 f81961a;
    @NotNull

    /* renamed from: b */
    private final bg1 f81962b;

    public C30813lx(@NotNull l32 urlJsonParser, @NotNull bg1 preferredPackagesParser) {
        Intrinsics.checkNotNullParameter(urlJsonParser, "urlJsonParser");
        Intrinsics.checkNotNullParameter(preferredPackagesParser, "preferredPackagesParser");
        this.f81961a = urlJsonParser;
        this.f81962b = preferredPackagesParser;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC29979b0
    /* renamed from: a */
    public final C30678jx mo26293a(JSONObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        String m27867a = wn0.m27867a(jsonObject, "jsonAsset", "type", "jsonAttribute", "type");
        if (m27867a != null && m27867a.length() != 0 && !Intrinsics.m17075f(m27867a, "null")) {
            Intrinsics.m17074g(m27867a);
            this.f81961a.getClass();
            return new C30678jx(m27867a, l32.m32360a("fallbackUrl", jsonObject), this.f81962b.m35477a(jsonObject.optJSONArray("preferredPackages")));
        }
        throw new i31("Native Ad json has not required attributes");
    }
}
