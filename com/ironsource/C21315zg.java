package com.ironsource;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

@Metadata
/* renamed from: com.ironsource.zg */
/* loaded from: classes6.dex */
public final class C21315zg {
    @NotNull

    /* renamed from: a */
    private final ArrayList<String> f54755a = new ArrayList<>(new C21266yg().m53979a());
    @NotNull

    /* renamed from: b */
    private final C19696cd f54756b = new C19696cd();

    @NotNull
    /* renamed from: a */
    public final JSONObject m53846a() {
        JSONObject m59166a = this.f54756b.m59166a(this.f54755a);
        Intrinsics.checkNotNullExpressionValue(m59166a, "mGlobalDataReader.getDataByKeys(mInitKeyList)");
        return m59166a;
    }
}
