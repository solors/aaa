package com.chartboost.sdk.impl;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: com.chartboost.sdk.impl.b0 */
/* loaded from: classes3.dex */
public final class C9688b0 implements InterfaceC9664a {

    /* renamed from: a */
    public final List f21586a = new ArrayList();

    @Override // com.chartboost.sdk.impl.InterfaceC9664a
    /* renamed from: a */
    public JSONObject mo82086a(JSONObject response) {
        Intrinsics.checkNotNullParameter(response, "response");
        for (InterfaceC9664a interfaceC9664a : this.f21586a) {
            response = (JSONObject) interfaceC9664a.mo82086a(response);
        }
        return response;
    }
}
