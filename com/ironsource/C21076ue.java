package com.ironsource;

import com.ironsource.sdk.utils.SDKUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: com.ironsource.ue */
/* loaded from: classes6.dex */
public final class C21076ue {
    @NotNull
    /* renamed from: a */
    public final String m54654a() {
        String OMID_LIB_VERSION = C21322zm.f54776f;
        Intrinsics.checkNotNullExpressionValue(OMID_LIB_VERSION, "OMID_LIB_VERSION");
        return OMID_LIB_VERSION;
    }

    @NotNull
    /* renamed from: b */
    public final String m54653b() {
        return "7";
    }

    @NotNull
    /* renamed from: c */
    public final String m54652c() {
        String sDKVersion = SDKUtils.getSDKVersion();
        Intrinsics.checkNotNullExpressionValue(sDKVersion, "getSDKVersion()");
        return sDKVersion;
    }
}
