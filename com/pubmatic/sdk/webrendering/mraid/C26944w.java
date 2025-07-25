package com.pubmatic.sdk.webrendering.mraid;

import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.POBError;
import org.json.JSONObject;

/* renamed from: com.pubmatic.sdk.webrendering.mraid.w */
/* loaded from: classes7.dex */
class C26944w implements InterfaceC26926f {
    @Override // com.pubmatic.sdk.webrendering.mraid.InterfaceC26926f
    /* renamed from: a */
    public String mo39853a() {
        return "unload";
    }

    @Override // com.pubmatic.sdk.webrendering.mraid.InterfaceC26926f
    /* renamed from: b */
    public boolean mo39851b() {
        return false;
    }

    @Override // com.pubmatic.sdk.webrendering.mraid.InterfaceC26926f
    @Nullable
    /* renamed from: a */
    public POBError mo39852a(JSONObject jSONObject, InterfaceC26933m interfaceC26933m, boolean z) {
        interfaceC26933m.unload();
        return null;
    }
}
