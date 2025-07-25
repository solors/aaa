package com.yandex.mobile.ads.impl;

import com.monetization.ads.nativeads.CustomizableMediaView;
import com.yandex.mobile.ads.impl.hu0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class pv0 extends hu0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pv0(@NotNull CustomizableMediaView mediaView, @NotNull ou0 mediaViewRenderController) {
        super(mediaView, mediaViewRenderController);
        Intrinsics.checkNotNullParameter(mediaView, "mediaView");
        Intrinsics.checkNotNullParameter(mediaViewRenderController, "mediaViewRenderController");
    }

    @Override // com.yandex.mobile.ads.impl.hu0
    /* renamed from: a */
    public final void mo30577a(@NotNull CustomizableMediaView mediaView) {
        Intrinsics.checkNotNullParameter(mediaView, "mediaView");
    }

    @Override // com.yandex.mobile.ads.impl.hu0, com.yandex.mobile.ads.impl.bb2
    /* renamed from: b */
    public final void mo27593b(CustomizableMediaView customizableMediaView, eu0 eu0Var) {
        CustomizableMediaView mediaView = customizableMediaView;
        eu0 mediaValue = eu0Var;
        Intrinsics.checkNotNullParameter(mediaView, "mediaView");
        Intrinsics.checkNotNullParameter(mediaValue, "mediaValue");
    }

    @Override // com.yandex.mobile.ads.impl.hu0
    @NotNull
    /* renamed from: d */
    public final hu0.EnumC30501a mo30574d() {
        return hu0.EnumC30501a.f80191g;
    }

    @Override // com.yandex.mobile.ads.impl.bb2
    /* renamed from: a */
    public final boolean mo27595a(CustomizableMediaView customizableMediaView, eu0 eu0Var) {
        CustomizableMediaView mediaView = customizableMediaView;
        eu0 mediaValue = eu0Var;
        Intrinsics.checkNotNullParameter(mediaView, "mediaView");
        Intrinsics.checkNotNullParameter(mediaValue, "mediaValue");
        return true;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.yandex.mobile.ads.impl.hu0
    /* renamed from: a */
    public final void mo30576a(@NotNull CustomizableMediaView mediaView, @NotNull eu0 mediaValue) {
        Intrinsics.checkNotNullParameter(mediaView, "mediaView");
        Intrinsics.checkNotNullParameter(mediaValue, "mediaValue");
    }

    @Override // com.yandex.mobile.ads.impl.hu0
    /* renamed from: a */
    public final void mo30575a(@NotNull eu0 mediaValue) {
        Intrinsics.checkNotNullParameter(mediaValue, "mediaValue");
    }
}
