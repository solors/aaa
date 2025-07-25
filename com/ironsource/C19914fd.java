package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.metadata.C20419a;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

@Metadata
/* renamed from: com.ironsource.fd */
/* loaded from: classes6.dex */
public final class C19914fd {
    @NotNull

    /* renamed from: a */
    private final C21137vi f50085a;

    public C19914fd(@NotNull C21137vi globalDataWriter) {
        Intrinsics.checkNotNullParameter(globalDataWriter, "globalDataWriter");
        this.f50085a = globalDataWriter;
    }

    /* renamed from: a */
    public final void m58590a(@NotNull JSONObject metaDataJson) {
        Intrinsics.checkNotNullParameter(metaDataJson, "metaDataJson");
        if (metaDataJson.has(C20419a.f51685i)) {
            try {
                Object remove = metaDataJson.remove(C20419a.f51685i);
                Intrinsics.m17073h(remove, "null cannot be cast to non-null type java.util.ArrayList<*>{ kotlin.collections.TypeAliasesKt.ArrayList<*> }");
                ArrayList arrayList = (ArrayList) remove;
                if (!arrayList.isEmpty()) {
                    Object obj = arrayList.get(0);
                    Intrinsics.m17073h(obj, "null cannot be cast to non-null type kotlin.String");
                    this.f50085a.m54418d((String) obj);
                }
            } catch (ClassCastException e) {
                C20086i9.m57997d().m58003a(e);
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.error("got the following error " + e.getMessage());
            }
        }
    }
}
