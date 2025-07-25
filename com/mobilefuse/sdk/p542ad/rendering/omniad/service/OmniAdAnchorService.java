package com.mobilefuse.sdk.p542ad.rendering.omniad.service;

import com.mobilefuse.sdk.p542ad.rendering.omniad.modifier.PositionModifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: OmniAdAnchorService.kt */
@Metadata
/* renamed from: com.mobilefuse.sdk.ad.rendering.omniad.service.OmniAdAnchorService */
/* loaded from: classes7.dex */
public final class OmniAdAnchorService {
    private int anchor;
    private final int marginDp;
    @NotNull
    private final OmniAdPropertyService propertyService;

    public OmniAdAnchorService(@NotNull OmniAdPropertyService propertyService, int i, int i2) {
        Intrinsics.checkNotNullParameter(propertyService, "propertyService");
        this.propertyService = propertyService;
        this.marginDp = i;
        this.anchor = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void changePositionToAnchor$default(OmniAdAnchorService omniAdAnchorService, PositionModifier positionModifier, Functions functions, int i, Object obj) {
        if ((i & 2) != 0) {
            functions = OmniAdAnchorService$changePositionToAnchor$1.INSTANCE;
        }
        omniAdAnchorService.changePositionToAnchor(positionModifier, functions);
    }

    public final void changePositionToAnchor(@NotNull PositionModifier modifier, @NotNull Functions<Unit> completeAction) {
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(completeAction, "completeAction");
        this.propertyService.changePosition(OmniAdAnchorServiceKt.getAnchorPosition(this), modifier, completeAction);
    }

    public final int getAnchor() {
        return this.anchor;
    }

    public final int getMarginDp() {
        return this.marginDp;
    }

    @NotNull
    public final OmniAdPropertyService getPropertyService() {
        return this.propertyService;
    }

    public final void setAnchor(int i) {
        this.anchor = i;
    }

    public /* synthetic */ OmniAdAnchorService(OmniAdPropertyService omniAdPropertyService, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(omniAdPropertyService, i, (i3 & 4) != 0 ? 3 : i2);
    }
}
