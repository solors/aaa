package com.ironsource;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

@Metadata
/* renamed from: com.ironsource.e1 */
/* loaded from: classes6.dex */
public final class C19797e1 {
    @NotNull

    /* renamed from: a */
    private final ArrayList<String> f49850a = new ArrayList<>(new C19745d1().m58980a());
    @NotNull

    /* renamed from: b */
    private final C19696cd f49851b = new C19696cd();

    @NotNull
    /* renamed from: a */
    public final JSONObject m58832a() {
        JSONObject m59166a = this.f49851b.m59166a(this.f49850a);
        Intrinsics.checkNotNullExpressionValue(m59166a, "mGlobalDataReader.getDataByKeys(mAdQualityKeyList)");
        return m59166a;
    }
}
