package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.EnumC24574a;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.InterfaceC24576c;
import ge.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.b */
/* loaded from: classes7.dex */
public interface InterfaceC24521b {

    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.b$a */
    /* loaded from: classes7.dex */
    public interface InterfaceC24522a {
        /* renamed from: a */
        void mo46071a();

        /* renamed from: a */
        void mo46070a(@NotNull InterfaceC24576c interfaceC24576c);

        /* renamed from: b */
        void mo46069b(@NotNull EnumC24574a enumC24574a);
    }

    /* renamed from: a */
    void mo44632a(long j, @Nullable InterfaceC24522a interfaceC24522a);

    @NotNull
    StateFlow<Boolean> isLoaded();
}
