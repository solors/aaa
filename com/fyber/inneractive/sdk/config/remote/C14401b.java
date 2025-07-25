package com.fyber.inneractive.sdk.config.remote;

import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.config.remote.b */
/* loaded from: classes4.dex */
public final class C14401b {

    /* renamed from: a */
    public UnitDisplayType f27237a;

    /* renamed from: b */
    public Boolean f27238b;

    /* renamed from: c */
    public Integer f27239c;

    /* renamed from: d */
    public Integer f27240d;

    /* renamed from: a */
    public static C14401b m77915a(JSONObject jSONObject) {
        Boolean bool;
        Integer num = null;
        if (jSONObject == null) {
            return null;
        }
        C14401b c14401b = new C14401b();
        int optInt = jSONObject.optInt("hide", Integer.MIN_VALUE);
        Integer valueOf = Integer.valueOf(optInt);
        int optInt2 = jSONObject.optInt(ToolBar.REFRESH, Integer.MIN_VALUE);
        Integer valueOf2 = Integer.valueOf(optInt2);
        c14401b.f27237a = UnitDisplayType.fromValue(jSONObject.optString("unitDisplayType"));
        if (jSONObject.has("close")) {
            bool = Boolean.valueOf(jSONObject.optBoolean("close", true));
        } else {
            bool = null;
        }
        c14401b.f27238b = bool;
        if (optInt == Integer.MIN_VALUE) {
            valueOf = null;
        }
        c14401b.f27240d = valueOf;
        if (optInt2 != Integer.MIN_VALUE) {
            num = valueOf2;
        }
        c14401b.f27239c = num;
        return c14401b;
    }
}
