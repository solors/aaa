package com.ironsource;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

@Metadata
/* renamed from: com.ironsource.xg */
/* loaded from: classes6.dex */
public final class C21224xg {
    @NotNull

    /* renamed from: a */
    private final ArrayList<String> f54492a = new ArrayList<>(new C21180wg().m54341a());
    @NotNull

    /* renamed from: b */
    private final C19696cd f54493b = new C19696cd();

    @NotNull
    /* renamed from: a */
    public final JSONObject m54136a() {
        JSONObject m59166a = this.f54493b.m59166a(this.f54492a);
        Intrinsics.checkNotNullExpressionValue(m59166a, "mGlobalDataReader.getDat…mInitDeferredDataKeyList)");
        return m59166a;
    }
}
