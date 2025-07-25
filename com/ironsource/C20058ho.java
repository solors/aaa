package com.ironsource;

import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.ironsource.ho */
/* loaded from: classes6.dex */
public class C20058ho implements InterfaceC21162w1 {
    @NotNull

    /* renamed from: a */
    private final String f50486a;

    public C20058ho(@NotNull String placementName) {
        Intrinsics.checkNotNullParameter(placementName, "placementName");
        this.f50486a = placementName;
    }

    @Override // com.ironsource.InterfaceC21162w1
    @NotNull
    /* renamed from: a */
    public Map<String, Object> mo53886a(@Nullable EnumC21057u1 enumC21057u1) {
        HashMap hashMap = new HashMap();
        hashMap.put("placement", this.f50486a);
        return hashMap;
    }
}
