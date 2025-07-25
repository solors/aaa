package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class ot0 {
    @NotNull

    /* renamed from: a */
    private final C31898yi f83603a;

    public /* synthetic */ ot0() {
        this(new C31898yi());
    }

    /* renamed from: a */
    public final Object m30889a(JSONObject jsonValue) {
        Intrinsics.checkNotNullParameter(jsonValue, "jsonValue");
        String m26899a = this.f83603a.m26899a("html", jsonValue);
        float f = (float) jsonValue.getDouble("aspectRatio");
        if (f == 0.0f) {
            f = 1.7777778f;
        }
        return new xr0(m26899a, f);
    }

    public ot0(@NotNull C31898yi base64Parser) {
        Intrinsics.checkNotNullParameter(base64Parser, "base64Parser");
        this.f83603a = base64Parser;
    }
}
