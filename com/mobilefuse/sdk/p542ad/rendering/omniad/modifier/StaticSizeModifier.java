package com.mobilefuse.sdk.p542ad.rendering.omniad.modifier;

import com.mobilefuse.sdk.p542ad.rendering.omniad.container.OmniAdContainer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: StaticSizeModifier.kt */
@Metadata
/* renamed from: com.mobilefuse.sdk.ad.rendering.omniad.modifier.StaticSizeModifier */
/* loaded from: classes7.dex */
public final class StaticSizeModifier implements SizeModifier {
    @NotNull
    private final OmniAdContainer omniAdContainer;

    public StaticSizeModifier(@NotNull OmniAdContainer omniAdContainer) {
        Intrinsics.checkNotNullParameter(omniAdContainer, "omniAdContainer");
        this.omniAdContainer = omniAdContainer;
    }

    @Override // com.mobilefuse.sdk.p542ad.rendering.omniad.modifier.SizeModifier
    public void changeSize(int i, int i2, @NotNull Functions<Unit> completeAction) {
        Intrinsics.checkNotNullParameter(completeAction, "completeAction");
        getOmniAdContainer().changeSize(i, i2);
        completeAction.invoke();
    }

    @Override // com.mobilefuse.sdk.p542ad.rendering.omniad.modifier.SizeModifier
    @NotNull
    public OmniAdContainer getOmniAdContainer() {
        return this.omniAdContainer;
    }
}
