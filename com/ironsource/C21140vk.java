package com.ironsource;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.ironsource.vk */
/* loaded from: classes6.dex */
public final class C21140vk implements InterfaceC19695cc<C21082uk> {
    @NotNull

    /* renamed from: a */
    private final String f54226a;
    @NotNull

    /* renamed from: b */
    private final InterfaceC20599oo f54227b;
    @NotNull

    /* renamed from: c */
    private final InterfaceC21208x2 f54228c;

    /* renamed from: d */
    private final boolean f54229d;

    public C21140vk(@NotNull String adm, @NotNull InterfaceC20599oo providerName, @NotNull InterfaceC21208x2 adapterConfigs, boolean z) {
        Intrinsics.checkNotNullParameter(adm, "adm");
        Intrinsics.checkNotNullParameter(providerName, "providerName");
        Intrinsics.checkNotNullParameter(adapterConfigs, "adapterConfigs");
        this.f54226a = adm;
        this.f54227b = providerName;
        this.f54228c = adapterConfigs;
        this.f54229d = z;
    }

    @Override // com.ironsource.InterfaceC19695cc
    @Nullable
    /* renamed from: b */
    public C21082uk mo54400a() throws C19934fq, Exception {
        InterfaceC19817eh mo54197a = this.f54228c.mo54197a(this.f54227b);
        new C20555o0(this.f54226a, mo54197a, this.f54229d).mo54173a();
        if (mo54197a != null) {
            return new C21082uk(mo54197a.mo53945c(), mo54197a.mo53946b(), mo54197a.mo53943e(), mo54197a.mo53947a(), false, 16, null);
        }
        return null;
    }
}
