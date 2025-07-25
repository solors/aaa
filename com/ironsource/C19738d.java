package com.ironsource;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: com.ironsource.d */
/* loaded from: classes6.dex */
public final class C19738d implements InterfaceC20093ic {
    @NotNull

    /* renamed from: a */
    private final C21143vn f49685a;

    public C19738d(@NotNull C21143vn folderRootUrl) {
        Intrinsics.checkNotNullParameter(folderRootUrl, "folderRootUrl");
        this.f49685a = folderRootUrl;
    }

    @Override // com.ironsource.InterfaceC20093ic
    @NotNull
    public String value() {
        return this.f49685a.m54397a() + "/abTestMap.json";
    }
}
