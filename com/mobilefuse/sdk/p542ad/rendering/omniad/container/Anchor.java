package com.mobilefuse.sdk.p542ad.rendering.omniad.container;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: com.mobilefuse.sdk.ad.rendering.omniad.container.PositionAnchor */
/* loaded from: classes7.dex */
public final class Anchor {
    public static final int BOTTOM_LEFT = 2;
    public static final int BOTTOM_RIGHT = 3;
    @NotNull
    public static final Anchor INSTANCE = new Anchor();
    public static final int TOP_LEFT = 0;
    public static final int TOP_RIGHT = 1;

    private Anchor() {
    }
}
