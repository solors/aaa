package com.ironsource;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: com.ironsource.qb */
/* loaded from: classes6.dex */
public abstract class AbstractC20682qb implements InterfaceC21162w1 {
    @NotNull
    /* renamed from: a */
    public final Map<String, Object> m55656a(@NotNull C19610b1 adProperties) {
        Intrinsics.checkNotNullParameter(adProperties, "adProperties");
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_PROGRAMMATIC, 1);
        String ad_unit = adProperties.m59389a().toString();
        Intrinsics.checkNotNullExpressionValue(ad_unit, "adProperties.adFormat.toString()");
        hashMap.put(C19645bk.f49298f, ad_unit);
        hashMap.put("adf", Integer.valueOf(C20220ks.m57608b(adProperties.m59389a())));
        hashMap.put(C19645bk.f49301i, adProperties.m59385d().m54336b());
        hashMap.put("mediationAdUnitId", adProperties.m59387b());
        hashMap.put("isMultipleAdUnits", 1);
        return hashMap;
    }
}
