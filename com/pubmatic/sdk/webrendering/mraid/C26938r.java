package com.pubmatic.sdk.webrendering.mraid;

import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.POBError;
import org.json.JSONObject;

/* renamed from: com.pubmatic.sdk.webrendering.mraid.r */
/* loaded from: classes7.dex */
class C26938r implements InterfaceC26926f {
    @Override // com.pubmatic.sdk.webrendering.mraid.InterfaceC26926f
    /* renamed from: a */
    public String mo39853a() {
        return "playVideo";
    }

    @Override // com.pubmatic.sdk.webrendering.mraid.InterfaceC26926f
    /* renamed from: b */
    public boolean mo39851b() {
        return true;
    }

    @Override // com.pubmatic.sdk.webrendering.mraid.InterfaceC26926f
    @Nullable
    /* renamed from: a */
    public POBError mo39852a(JSONObject jSONObject, InterfaceC26933m interfaceC26933m, boolean z) {
        JSONObject optJSONObject = jSONObject.optJSONObject("params");
        if (optJSONObject == null) {
            return new POBError(1009, "Invalid MRAID command for playVideo event");
        }
        String optString = optJSONObject.optString("url", null);
        if (optString != null) {
            interfaceC26933m.playVideo(optString, z);
            return null;
        }
        return new POBError(1009, "Invalid MRAID Url for playVideo event");
    }
}
