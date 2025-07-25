package com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p761kc.C37450c;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.b */
/* loaded from: classes7.dex */
public final class C25417b implements InterfaceC25416a {
    @NotNull

    /* renamed from: b */
    public final InterfaceC25420d f66003b;

    public C25417b(@NotNull InterfaceC25420d delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f66003b = delegate;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.InterfaceC25420d
    /* renamed from: a */
    public void mo44572a(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.f66003b.mo44572a(url);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.InterfaceC25420d
    /* renamed from: a */
    public void mo44571a(@NotNull String url, @NotNull byte[] body, @NotNull C37450c contentType) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        this.f66003b.mo44571a(url, body, contentType);
    }
}
