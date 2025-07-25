package com.ironsource;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

@Metadata
/* renamed from: com.ironsource.tb */
/* loaded from: classes6.dex */
public final class C21009tb {
    @NotNull

    /* renamed from: a */
    private final ArrayList<String> f53558a = new ArrayList<>(new C20796sb().m55360a());
    @NotNull

    /* renamed from: b */
    private final C19696cd f53559b = new C19696cd();

    @NotNull
    /* renamed from: a */
    public final JSONObject m54804a() {
        JSONObject m59166a = this.f53559b.m59166a(this.f53558a);
        Intrinsics.checkNotNullExpressionValue(m59166a, "mGlobalDataReader.getDataByKeys(mEventsKeyList)");
        return m59166a;
    }
}
