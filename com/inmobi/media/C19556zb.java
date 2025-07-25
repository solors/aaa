package com.inmobi.media;

import java.util.Iterator;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.zb */
/* loaded from: classes6.dex */
public final class C19556zb extends Lambda implements Function2 {

    /* renamed from: a */
    public static final C19556zb f48970a = new C19556zb();

    public C19556zb() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    /* renamed from: invoke */
    public final Object mo105910invoke(Object obj, Object obj2) {
        JSONObject param = (JSONObject) obj;
        int intValue = ((Number) obj2).intValue();
        Intrinsics.checkNotNullParameter(param, "param");
        Iterator<String> keys = param.keys();
        Intrinsics.checkNotNullExpressionValue(keys, "keys(...)");
        boolean z = true;
        while (keys.hasNext()) {
            if (param.getInt(keys.next()) < intValue) {
                z = false;
            }
        }
        return Boolean.valueOf(z);
    }
}
