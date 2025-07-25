package com.yandex.mobile.ads.impl;

import com.pubmatic.sdk.nativead.POBNativeConstants;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class tg0 {
    @NotNull

    /* renamed from: a */
    private final l32 f85654a;
    @NotNull

    /* renamed from: b */
    private final bw1 f85655b;

    public /* synthetic */ tg0() {
        this(new l32(), new bw1());
    }

    @NotNull
    /* renamed from: a */
    public final bh0 m29173b(@NotNull JSONObject imageObject) throws JSONException, i31 {
        aw1 aw1Var;
        String str;
        Intrinsics.checkNotNullParameter(imageObject, "imageObject");
        int i = imageObject.getInt(POBNativeConstants.NATIVE_IMAGE_WIDTH);
        int i2 = imageObject.getInt("h");
        this.f85654a.getClass();
        String m32360a = l32.m32360a("url", imageObject);
        if (imageObject.has("smartCenterSettings")) {
            bw1 bw1Var = this.f85655b;
            JSONObject jSONObject = imageObject.getJSONObject("smartCenterSettings");
            Intrinsics.checkNotNullExpressionValue(jSONObject, "getJSONObject(...)");
            aw1Var = bw1Var.m35426a(jSONObject);
        } else {
            aw1Var = null;
        }
        String optString = imageObject.optString("sizeType");
        Intrinsics.m17074g(optString);
        if (optString.length() <= 0) {
            optString = null;
        }
        boolean optBoolean = imageObject.optBoolean("preload", true);
        String optString2 = imageObject.optString("preview");
        Intrinsics.m17074g(optString2);
        if (optString2.length() > 0) {
            str = optString2;
        } else {
            str = null;
        }
        return new bh0(i, i2, m32360a, optString, aw1Var, optBoolean, str);
    }

    public tg0(@NotNull l32 urlJsonParser, @NotNull bw1 smartCenterSettingsParser) {
        Intrinsics.checkNotNullParameter(urlJsonParser, "urlJsonParser");
        Intrinsics.checkNotNullParameter(smartCenterSettingsParser, "smartCenterSettingsParser");
        this.f85654a = urlJsonParser;
        this.f85655b = smartCenterSettingsParser;
    }
}
