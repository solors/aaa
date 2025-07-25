package androidx.compose.p015ui.graphics;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: GraphicsLayerScope.kt */
@Metadata
/* renamed from: androidx.compose.ui.graphics.GraphicsLayerScopeKt */
/* loaded from: classes.dex */
public final class GraphicsLayerScopeKt {
    public static final float DefaultCameraDistance = 8.0f;
    private static final long DefaultShadowColor = Color.Companion.m107553getBlack0d7_KjU();

    @NotNull
    public static final GraphicsLayerScope GraphicsLayerScope() {
        return new ReusableGraphicsLayerScope();
    }

    public static final long getDefaultShadowColor() {
        return DefaultShadowColor;
    }
}
