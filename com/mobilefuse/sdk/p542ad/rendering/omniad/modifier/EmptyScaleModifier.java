package com.mobilefuse.sdk.p542ad.rendering.omniad.modifier;

import com.mobilefuse.sdk.p542ad.rendering.omniad.container.OmniAdContainer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: EmptyScaleModifier.kt */
@Metadata
/* renamed from: com.mobilefuse.sdk.ad.rendering.omniad.modifier.EmptyScaleModifier */
/* loaded from: classes7.dex */
public final class EmptyScaleModifier implements ScaleModifier {
    @NotNull
    private final OmniAdContainer omniAdContainer;

    public EmptyScaleModifier(@NotNull OmniAdContainer omniAdContainer) {
        Intrinsics.checkNotNullParameter(omniAdContainer, "omniAdContainer");
        this.omniAdContainer = omniAdContainer;
    }

    @Override // com.mobilefuse.sdk.p542ad.rendering.omniad.modifier.ScaleModifier
    public void changeScale(float f, @NotNull Functions<Unit> completeAction) {
        Intrinsics.checkNotNullParameter(completeAction, "completeAction");
    }

    @Override // com.mobilefuse.sdk.p542ad.rendering.omniad.modifier.ScaleModifier
    @NotNull
    public OmniAdContainer getOmniAdContainer() {
        return this.omniAdContainer;
    }
}
