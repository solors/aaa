package com.ironsource;

import com.ironsource.mediationsdk.C20348d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

@Metadata
/* renamed from: com.ironsource.ya */
/* loaded from: classes6.dex */
public final class C21259ya implements InterfaceC19778dl<String, C20348d.C20349a> {
    @Override // com.ironsource.InterfaceC19778dl
    @NotNull
    /* renamed from: a  reason: avoid collision after fix types in other method */
    public C20348d.C20349a mo53929a(@NotNull String input) {
        Intrinsics.checkNotNullParameter(input, "input");
        C20348d.C20349a m57012a = C20348d.m57010b().m57012a(new JSONObject(input));
        Intrinsics.checkNotNullExpressionValue(m57012a, "getInstance().getAuction…sponse(JSONObject(input))");
        return m57012a;
    }
}
