package com.pubmatic.sdk.webrendering.mraid;

import androidx.annotation.Nullable;
import com.maticoo.sdk.mraid.Consts;
import com.pubmatic.sdk.common.POBError;
import org.json.JSONObject;

/* renamed from: com.pubmatic.sdk.webrendering.mraid.j */
/* loaded from: classes7.dex */
class C26930j implements InterfaceC26926f {
    @Override // com.pubmatic.sdk.webrendering.mraid.InterfaceC26926f
    /* renamed from: a */
    public String mo39853a() {
        return "resize";
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
            return new POBError(1009, "Invalid MRAID command for orientation event");
        }
        interfaceC26933m.resize(optJSONObject.optInt("width", 0), optJSONObject.optInt("height", 0), optJSONObject.optInt(Consts.ResizePropertiesOffsetX, 0), optJSONObject.optInt(Consts.ResizePropertiesOffsetY, 0), optJSONObject.optBoolean(Consts.ResizePropertiesAllowOffscreen, false), z);
        return null;
    }
}
