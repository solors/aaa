package com.ironsource;

import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.ironsource.cn */
/* loaded from: classes6.dex */
public final class C19720cn implements InterfaceC19651bn {
    @Nullable

    /* renamed from: a */
    private InterfaceC21001t5 f49475a;
    @NotNull

    /* renamed from: b */
    private WeakReference<InterfaceC21111v5> f49476b = new WeakReference<>(null);

    /* renamed from: a */
    public final void m59075a(@NotNull InterfaceC21001t5 loadListener) {
        Intrinsics.checkNotNullParameter(loadListener, "loadListener");
        this.f49475a = loadListener;
    }

    @Override // com.ironsource.InterfaceC19651bn
    public void onBannerClick() {
        InterfaceC21111v5 interfaceC21111v5 = this.f49476b.get();
        if (interfaceC21111v5 != null) {
            interfaceC21111v5.onBannerClick();
        }
    }

    @Override // com.ironsource.InterfaceC19651bn
    public void onBannerLoadFail(@NotNull String description) {
        Intrinsics.checkNotNullParameter(description, "description");
        InterfaceC21001t5 interfaceC21001t5 = this.f49475a;
        if (interfaceC21001t5 != null) {
            interfaceC21001t5.onBannerLoadFail(description);
        }
    }

    @Override // com.ironsource.InterfaceC19651bn
    public void onBannerLoadSuccess(@NotNull C20473mi adInstance, @NotNull C20149jf adContainer) {
        Intrinsics.checkNotNullParameter(adInstance, "adInstance");
        Intrinsics.checkNotNullParameter(adContainer, "adContainer");
        InterfaceC21001t5 interfaceC21001t5 = this.f49475a;
        if (interfaceC21001t5 != null) {
            interfaceC21001t5.onBannerLoadSuccess(adInstance, adContainer);
        }
    }

    @Override // com.ironsource.InterfaceC19651bn
    public void onBannerShowSuccess() {
        InterfaceC21111v5 interfaceC21111v5 = this.f49476b.get();
        if (interfaceC21111v5 != null) {
            interfaceC21111v5.onBannerShowSuccess();
        }
    }

    /* renamed from: a */
    public final void m59074a(@NotNull InterfaceC21111v5 showListener) {
        Intrinsics.checkNotNullParameter(showListener, "showListener");
        this.f49476b = new WeakReference<>(showListener);
    }

    @Override // com.ironsource.InterfaceC19651bn
    public void onBannerInitSuccess() {
    }

    @Override // com.ironsource.InterfaceC19651bn
    public void onBannerInitFailed(@Nullable String str) {
    }
}
