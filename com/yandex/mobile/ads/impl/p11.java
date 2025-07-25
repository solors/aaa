package com.yandex.mobile.ads.impl;

import com.facebook.share.internal.ShareConstants;
import java.util.Map;
import kotlin.collections.MapsJVM;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class p11 {
    @NotNull

    /* renamed from: a */
    private final String f83681a;
    @NotNull

    /* renamed from: b */
    private final String f83682b;
    @Nullable

    /* renamed from: c */
    private final m41 f83683c;

    public p11(@NotNull String assetName, @NotNull String clickActionType, @Nullable m41 m41Var) {
        Intrinsics.checkNotNullParameter(assetName, "assetName");
        Intrinsics.checkNotNullParameter(clickActionType, "clickActionType");
        this.f83681a = assetName;
        this.f83682b = clickActionType;
        this.f83683c = m41Var;
    }

    @NotNull
    /* renamed from: a */
    public final Map<String, Object> m30855a() {
        Map m17294d;
        Map<String, Object> m17295c;
        m17294d = MapsJVM.m17294d();
        m17294d.put("asset_name", this.f83681a);
        m17294d.put(ShareConstants.WEB_DIALOG_PARAM_ACTION_TYPE, this.f83682b);
        m41 m41Var = this.f83683c;
        if (m41Var != null) {
            m17294d.putAll(m41Var.m32102a().m33815b());
        }
        m17295c = MapsJVM.m17295c(m17294d);
        return m17295c;
    }
}
