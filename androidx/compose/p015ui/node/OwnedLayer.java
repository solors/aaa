package androidx.compose.p015ui.node;

import androidx.compose.p015ui.geometry.MutableRect;
import androidx.compose.p015ui.graphics.Canvas;
import androidx.compose.p015ui.graphics.RenderEffect;
import androidx.compose.p015ui.graphics.Shape;
import androidx.compose.p015ui.unit.Density;
import androidx.compose.p015ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Functions;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: OwnedLayer.kt */
@Metadata
/* renamed from: androidx.compose.ui.node.OwnedLayer */
/* loaded from: classes.dex */
public interface OwnedLayer {
    void destroy();

    void drawLayer(@NotNull Canvas canvas);

    void invalidate();

    /* renamed from: isInLayer-k-4lQ0M  reason: not valid java name */
    boolean mo109187isInLayerk4lQ0M(long j);

    void mapBounds(@NotNull MutableRect mutableRect, boolean z);

    /* renamed from: mapOffset-8S9VItk  reason: not valid java name */
    long mo109188mapOffset8S9VItk(long j, boolean z);

    /* renamed from: move--gyyYBs  reason: not valid java name */
    void mo109189movegyyYBs(long j);

    /* renamed from: resize-ozmzZPI  reason: not valid java name */
    void mo109190resizeozmzZPI(long j);

    void reuseLayer(@NotNull Function1<? super Canvas, Unit> function1, @NotNull Functions<Unit> functions);

    void updateDisplayList();

    /* renamed from: updateLayerProperties-NHXXZp8  reason: not valid java name */
    void mo109191updateLayerPropertiesNHXXZp8(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, long j, @NotNull Shape shape, boolean z, @Nullable RenderEffect renderEffect, long j2, long j3, @NotNull LayoutDirection layoutDirection, @NotNull Density density);
}
