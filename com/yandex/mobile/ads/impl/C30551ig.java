package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.pubmatic.sdk.nativead.POBNativeConstants;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.yandex.mobile.ads.impl.ig */
/* loaded from: classes8.dex */
public final class C30551ig {
    @NotNull

    /* renamed from: a */
    private final C31885yf f80448a;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ C30551ig(android.content.Context r1, com.yandex.mobile.ads.impl.jl1 r2, com.yandex.mobile.ads.impl.yo0 r3, int r4) {
        /*
            r0 = this;
            r4 = r4 & 4
            if (r4 == 0) goto L9
            com.yandex.mobile.ads.impl.yo0 r3 = new com.yandex.mobile.ads.impl.yo0
            r3.<init>(r2)
        L9:
            com.yandex.mobile.ads.impl.yf r4 = new com.yandex.mobile.ads.impl.yf
            r4.<init>(r1, r2, r3)
            r0.<init>(r1, r2, r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C30551ig.<init>(android.content.Context, com.yandex.mobile.ads.impl.jl1, com.yandex.mobile.ads.impl.yo0, int):void");
    }

    @NotNull
    /* renamed from: a */
    public final ArrayList m33279a(@NotNull JSONObject jsonNative) throws JSONException, i31 {
        Intrinsics.checkNotNullParameter(jsonNative, "jsonNative");
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = jsonNative.getJSONArray(POBNativeConstants.NATIVE_ASSETS);
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            boolean z = jSONObject.getBoolean("required");
            try {
                C31885yf c31885yf = this.f80448a;
                Intrinsics.m17074g(jSONObject);
                arrayList.add(c31885yf.m26935a(jSONObject));
            } catch (Throwable th) {
                if (z) {
                    throw th;
                }
            }
        }
        return arrayList;
    }

    public C30551ig(@NotNull Context context, @NotNull jl1 reporter, @NotNull yo0 linkJsonParser, @NotNull C31885yf assetJsonParser) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        Intrinsics.checkNotNullParameter(linkJsonParser, "linkJsonParser");
        Intrinsics.checkNotNullParameter(assetJsonParser, "assetJsonParser");
        this.f80448a = assetJsonParser;
    }
}
