package com.ironsource;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: com.ironsource.bu */
/* loaded from: classes6.dex */
public final class C19659bu implements InterfaceC20093ic {
    @NotNull

    /* renamed from: a */
    private final C21143vn f49352a;
    @NotNull

    /* renamed from: b */
    private final String f49353b;

    public C19659bu(@NotNull C21143vn folderRootUrl, @NotNull String version) {
        Intrinsics.checkNotNullParameter(folderRootUrl, "folderRootUrl");
        Intrinsics.checkNotNullParameter(version, "version");
        this.f49352a = folderRootUrl;
        this.f49353b = version;
    }

    @NotNull
    /* renamed from: a */
    public final String m59258a() {
        return this.f49353b;
    }

    @Override // com.ironsource.InterfaceC20093ic
    @NotNull
    public String value() {
        return this.f49352a.m54397a() + "/versions/" + this.f49353b + "/mobileController.html";
    }
}
