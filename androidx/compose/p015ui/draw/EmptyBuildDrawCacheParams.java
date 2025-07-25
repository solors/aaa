package androidx.compose.p015ui.draw;

import androidx.compose.p015ui.geometry.Size;
import androidx.compose.p015ui.unit.Density;
import androidx.compose.p015ui.unit.DensityKt;
import androidx.compose.p015ui.unit.LayoutDirection;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: DrawModifier.kt */
@Metadata
/* renamed from: androidx.compose.ui.draw.EmptyBuildDrawCacheParams */
/* loaded from: classes.dex */
final class EmptyBuildDrawCacheParams implements BuildDrawCacheParams {
    @NotNull
    public static final EmptyBuildDrawCacheParams INSTANCE = new EmptyBuildDrawCacheParams();
    private static final long size = Size.Companion.m107368getUnspecifiedNHjbRc();
    @NotNull
    private static final LayoutDirection layoutDirection = LayoutDirection.Ltr;
    @NotNull
    private static final Density density = DensityKt.Density(1.0f, 1.0f);

    private EmptyBuildDrawCacheParams() {
    }

    @Override // androidx.compose.p015ui.draw.BuildDrawCacheParams
    @NotNull
    public Density getDensity() {
        return density;
    }

    @Override // androidx.compose.p015ui.draw.BuildDrawCacheParams
    @NotNull
    public LayoutDirection getLayoutDirection() {
        return layoutDirection;
    }

    @Override // androidx.compose.p015ui.draw.BuildDrawCacheParams
    /* renamed from: getSize-NH-jbRc */
    public long mo107213getSizeNHjbRc() {
        return size;
    }
}
