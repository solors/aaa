package com.unity3d.ads.core.extensions;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.C37653n;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

@Metadata
/* renamed from: com.unity3d.ads.core.extensions.JSONObjectExtensionsKt */
/* loaded from: classes7.dex */
public final class JSONObjectExtensions {
    @NotNull
    public static final Map<String, Object> toBuiltInMap(@NotNull JSONObject jSONObject) {
        Sequence m16841c;
        boolean z;
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        Iterator<String> keys = jSONObject.keys();
        Intrinsics.checkNotNullExpressionValue(keys, "keys()");
        m16841c = C37653n.m16841c(keys);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : m16841c) {
            Object opt = jSONObject.opt((String) obj);
            if (opt != null) {
                Intrinsics.checkNotNullExpressionValue(opt, "opt(value)");
                if (!Intrinsics.m17075f(String.valueOf(opt), "undefined") && !Intrinsics.m17075f(String.valueOf(opt), "null")) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    linkedHashMap.put(obj, opt);
                }
            }
            opt = null;
            linkedHashMap.put(obj, opt);
        }
        return linkedHashMap;
    }
}
