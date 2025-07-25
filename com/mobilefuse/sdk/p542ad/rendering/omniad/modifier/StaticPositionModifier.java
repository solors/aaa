package com.mobilefuse.sdk.p542ad.rendering.omniad.modifier;

import com.mobilefuse.sdk.p542ad.rendering.omniad.container.OmniAdContainer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: StaticPositionModifier.kt */
@Metadata
/* renamed from: com.mobilefuse.sdk.ad.rendering.omniad.modifier.StaticPositionModifier */
/* loaded from: classes7.dex */
public final class StaticPositionModifier implements PositionModifier {
    @NotNull
    private final OmniAdContainer omniAdContainer;

    public StaticPositionModifier(@NotNull OmniAdContainer omniAdContainer) {
        Intrinsics.checkNotNullParameter(omniAdContainer, "omniAdContainer");
        this.omniAdContainer = omniAdContainer;
    }

    @Override // com.mobilefuse.sdk.p542ad.rendering.omniad.modifier.PositionModifier
    public void changePosition(int i, int i2, @NotNull Functions<Unit> completeAction) {
        Intrinsics.checkNotNullParameter(completeAction, "completeAction");
        getOmniAdContainer().changePosition(i, i2);
        completeAction.invoke();
    }

    @Override // com.mobilefuse.sdk.p542ad.rendering.omniad.modifier.PositionModifier
    @NotNull
    public OmniAdContainer getOmniAdContainer() {
        return this.omniAdContainer;
    }

    @Override // com.mobilefuse.sdk.p542ad.rendering.omniad.modifier.PositionModifier
    public void cancel() {
    }
}
