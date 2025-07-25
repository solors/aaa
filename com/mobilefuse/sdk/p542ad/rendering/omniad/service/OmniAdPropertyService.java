package com.mobilefuse.sdk.p542ad.rendering.omniad.service;

import android.app.Activity;
import android.graphics.Point;
import com.mobilefuse.sdk.StabilityHelper;
import com.mobilefuse.sdk.exception.ExceptionHandlingStrategy;
import com.mobilefuse.sdk.exception.TryKt;
import com.mobilefuse.sdk.p542ad.rendering.omniad.container.OmniAdContainer;
import com.mobilefuse.sdk.p542ad.rendering.omniad.modifier.PositionModifier;
import com.mobilefuse.sdk.p542ad.rendering.omniad.modifier.ScaleModifier;
import com.mobilefuse.sdk.p542ad.rendering.omniad.modifier.SizeModifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p804nd.NoWhenBranchMatchedException;

/* compiled from: OmniAdPropertyService.kt */
@Metadata
/* renamed from: com.mobilefuse.sdk.ad.rendering.omniad.service.OmniAdPropertyService */
/* loaded from: classes7.dex */
public final class OmniAdPropertyService {
    @NotNull
    private final Activity activity;
    @NotNull
    private final PositionModifier defaultPositionModifier;
    @NotNull
    private final SizeModifier defaultSizeModifier;
    private PositionModifier lastModifier;
    @NotNull
    private final Point lastPosition;
    @NotNull
    private final OmniAdContainer omniAdContainer;
    @NotNull
    private final Point sizePx;

    public OmniAdPropertyService(@NotNull Activity activity, @NotNull Point sizePx, @NotNull OmniAdContainer omniAdContainer, @NotNull PositionModifier defaultPositionModifier, @NotNull SizeModifier defaultSizeModifier) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(sizePx, "sizePx");
        Intrinsics.checkNotNullParameter(omniAdContainer, "omniAdContainer");
        Intrinsics.checkNotNullParameter(defaultPositionModifier, "defaultPositionModifier");
        Intrinsics.checkNotNullParameter(defaultSizeModifier, "defaultSizeModifier");
        this.activity = activity;
        this.sizePx = sizePx;
        this.omniAdContainer = omniAdContainer;
        this.defaultPositionModifier = defaultPositionModifier;
        this.defaultSizeModifier = defaultSizeModifier;
        this.lastPosition = new Point(0, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void changePosition$default(OmniAdPropertyService omniAdPropertyService, Point point, PositionModifier positionModifier, Functions functions, int i, Object obj) {
        if ((i & 2) != 0) {
            positionModifier = omniAdPropertyService.defaultPositionModifier;
        }
        if ((i & 4) != 0) {
            functions = OmniAdPropertyService$changePosition$1.INSTANCE;
        }
        omniAdPropertyService.changePosition(point, positionModifier, functions);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void changeScale$default(OmniAdPropertyService omniAdPropertyService, float f, ScaleModifier scaleModifier, Functions functions, int i, Object obj) {
        if ((i & 4) != 0) {
            functions = OmniAdPropertyService$changeScale$1.INSTANCE;
        }
        omniAdPropertyService.changeScale(f, scaleModifier, functions);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void changeSize$default(OmniAdPropertyService omniAdPropertyService, int i, int i2, SizeModifier sizeModifier, Functions functions, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            sizeModifier = omniAdPropertyService.defaultSizeModifier;
        }
        if ((i3 & 8) != 0) {
            functions = OmniAdPropertyService$changeSize$1.INSTANCE;
        }
        omniAdPropertyService.changeSize(i, i2, sizeModifier, functions);
    }

    public final void changePosition(@NotNull Point position, @NotNull PositionModifier modifier, @NotNull Functions<Unit> completeAction) {
        Intrinsics.checkNotNullParameter(position, "position");
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(completeAction, "completeAction");
        changePosition(position.x, position.y, modifier, completeAction);
    }

    public final void changeScale(float f, @NotNull ScaleModifier modifier, @NotNull Functions<Unit> completeAction) {
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(completeAction, "completeAction");
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            modifier.changeScale(f, completeAction);
        } catch (Throwable th) {
            int i = TryKt.WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                return;
            }
            StabilityHelper.logException("[Automatically caught]", th);
        }
    }

    public final void changeSize(int i, int i2, @NotNull SizeModifier modifier, @NotNull Functions<Unit> completeAction) {
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(completeAction, "completeAction");
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            modifier.changeSize(i, i2, completeAction);
        } catch (Throwable th) {
            int i3 = TryKt.WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                return;
            }
            StabilityHelper.logException("[Automatically caught]", th);
        }
    }

    @NotNull
    public final Activity getActivity() {
        return this.activity;
    }

    @NotNull
    public final PositionModifier getDefaultPositionModifier() {
        return this.defaultPositionModifier;
    }

    @NotNull
    public final SizeModifier getDefaultSizeModifier() {
        return this.defaultSizeModifier;
    }

    @NotNull
    public final Point getLastPosition() {
        return this.lastPosition;
    }

    @NotNull
    public final OmniAdContainer getOmniAdContainer() {
        return this.omniAdContainer;
    }

    @NotNull
    public final Point getSizePx() {
        return this.sizePx;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void changePosition$default(OmniAdPropertyService omniAdPropertyService, int i, int i2, PositionModifier positionModifier, Functions functions, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            positionModifier = omniAdPropertyService.defaultPositionModifier;
        }
        if ((i3 & 8) != 0) {
            functions = OmniAdPropertyService$changePosition$2.INSTANCE;
        }
        omniAdPropertyService.changePosition(i, i2, positionModifier, functions);
    }

    public final void changePosition(int i, int i2, @NotNull PositionModifier modifier, @NotNull Functions<Unit> completeAction) {
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(completeAction, "completeAction");
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            PositionModifier positionModifier = this.lastModifier;
            if (positionModifier != null) {
                positionModifier.cancel();
            }
            this.lastModifier = modifier;
            Point point = this.lastPosition;
            point.x = i;
            point.y = i2;
            modifier.changePosition(i, i2, completeAction);
        } catch (Throwable th) {
            int i3 = TryKt.WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i3 == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            } else if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
    }
}
