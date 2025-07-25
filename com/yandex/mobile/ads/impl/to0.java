package com.yandex.mobile.ads.impl;

import com.pubmatic.sdk.nativead.POBNativeConstants;
import com.yandex.mobile.ads.impl.so0;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes8.dex */
public final class to0 {
    @NotNull

    /* renamed from: a */
    private final C30551ig f85782a;
    @NotNull

    /* renamed from: b */
    private final gf2 f85783b;
    @NotNull

    /* renamed from: c */
    private final yo0 f85784c;

    public to0(@NotNull jl1 reporter, @NotNull C30551ig assetsJsonParser) {
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        Intrinsics.checkNotNullParameter(assetsJsonParser, "assetsJsonParser");
        this.f85782a = assetsJsonParser;
        this.f85783b = new gf2();
        this.f85784c = new yo0(reporter);
    }

    @NotNull
    /* renamed from: a */
    public final so0 m29099a(@NotNull XmlPullParser parser) throws JSONException {
        Intrinsics.checkNotNullParameter(parser, "parser");
        try {
            so0.C31384a c31384a = new so0.C31384a();
            this.f85783b.getClass();
            JSONObject jSONObject = new JSONObject(gf2.m33835c(parser));
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (Intrinsics.m17075f(POBNativeConstants.NATIVE_ASSETS, next)) {
                    c31384a.m29573a(this.f85782a.m33279a(jSONObject));
                } else if (Intrinsics.m17075f("link", next)) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                    yo0 yo0Var = this.f85784c;
                    Intrinsics.m17074g(jSONObject2);
                    c31384a.m29574a(yo0Var.m26822a(jSONObject2));
                }
            }
            return c31384a.m29575a();
        } catch (Exception e) {
            throw new JSONException(e.getMessage());
        }
    }
}
