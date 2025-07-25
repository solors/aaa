package com.ironsource;

import com.ironsource.mediationsdk.model.BasePlacement;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.ironsource.b7 */
/* loaded from: classes6.dex */
public class C19619b7 extends BasePlacement {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19619b7(int i, @NotNull String placementName, boolean z, @Nullable C19721co c19721co) {
        super(i, placementName, z, c19721co);
        Intrinsics.checkNotNullParameter(placementName, "placementName");
    }

    @Override // com.ironsource.mediationsdk.model.BasePlacement
    @NotNull
    public String toString() {
        return super.toString() + ", placementId: " + getPlacementId();
    }
}
