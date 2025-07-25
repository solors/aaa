package com.ironsource;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

@Metadata
/* renamed from: com.ironsource.pj */
/* loaded from: classes6.dex */
public final class C20643pj implements InterfaceC19656br<JSONObject> {
    @NotNull

    /* renamed from: a */
    private final InterfaceC19656br<String> f52424a;

    public C20643pj(@NotNull InterfaceC19656br<String> serverResponse) {
        Intrinsics.checkNotNullParameter(serverResponse, "serverResponse");
        this.f52424a = serverResponse;
    }

    @Override // com.ironsource.InterfaceC19656br
    @NotNull
    /* renamed from: b */
    public JSONObject mo54807a() {
        return new JSONObject(this.f52424a.mo54807a());
    }
}
