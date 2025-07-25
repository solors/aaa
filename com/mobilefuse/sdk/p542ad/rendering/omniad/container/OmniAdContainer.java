package com.mobilefuse.sdk.p542ad.rendering.omniad.container;

import android.graphics.Point;
import com.mobilefuse.sdk.p542ad.rendering.FloatingContainer;
import com.mobilefuse.sdk.p542ad.rendering.omniad.modifier.PositionModifier;
import com.mobilefuse.sdk.p542ad.rendering.omniad.modifier.ScaleModifier;
import com.mobilefuse.sdk.p542ad.rendering.omniad.modifier.SizeModifier;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: OmniAdContainer.kt */
@Metadata
/* renamed from: com.mobilefuse.sdk.ad.rendering.omniad.container.OmniAdContainer */
/* loaded from: classes7.dex */
public interface OmniAdContainer {
    void changePosition(int i, int i2);

    void changeScale(float f);

    void changeSize(int i, int i2);

    void destroy();

    @NotNull
    Point getCurrentPosition();

    float getCurrentScale();

    @NotNull
    Point getCurrentSize();

    @NotNull
    PositionModifier getDefaultPositionModifier();

    @NotNull
    ScaleModifier getDefaultScaleModifier();

    @NotNull
    SizeModifier getDefaultSizeModifier();

    @NotNull
    FloatingContainer getFloatingContainer();
}
