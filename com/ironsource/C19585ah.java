package com.ironsource;

import com.ironsource.mediationsdk.utils.IronSourceAES;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

@Metadata
/* renamed from: com.ironsource.ah */
/* loaded from: classes6.dex */
public final class C19585ah {
    @NotNull

    /* renamed from: a */
    public static final C19585ah f49169a = new C19585ah();

    private C19585ah() {
    }

    @NotNull
    /* renamed from: a */
    public static final JSONObject m59444a() {
        JSONObject put = new JSONObject().put("data", IronSourceAES.encode(C21218xa.m54153b().m54152c(), new C21315zg().m53846a().toString()));
        Intrinsics.checkNotNullExpressionValue(put, "InitProvider()\n        .…ATA_KEY, encryptedData) }");
        return put;
    }
}
