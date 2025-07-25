package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC24530i;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.k */
/* loaded from: classes7.dex */
public final class C25266k implements InterfaceC24530i {
    @NotNull

    /* renamed from: b */
    public final AbstractC25263j f65604b;
    @Nullable

    /* renamed from: c */
    public final InterfaceC24530i f65605c;

    public C25266k(@NotNull AbstractC25263j resource, @Nullable InterfaceC24530i interfaceC24530i) {
        Intrinsics.checkNotNullParameter(resource, "resource");
        this.f65604b = resource;
        this.f65605c = interfaceC24530i;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.InterfaceC24530i
    public void destroy() {
        InterfaceC24530i interfaceC24530i = this.f65605c;
        if (interfaceC24530i != null) {
            interfaceC24530i.destroy();
        }
    }

    @NotNull
    /* renamed from: l */
    public final AbstractC25263j m44872l() {
        return this.f65604b;
    }
}
