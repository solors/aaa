package androidx.compose.p015ui.draw;

import androidx.compose.p015ui.unit.Density;
import androidx.compose.p015ui.unit.LayoutDirection;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: DrawModifier.kt */
@Metadata
/* renamed from: androidx.compose.ui.draw.BuildDrawCacheParams */
/* loaded from: classes.dex */
public interface BuildDrawCacheParams {
    @NotNull
    Density getDensity();

    @NotNull
    LayoutDirection getLayoutDirection();

    /* renamed from: getSize-NH-jbRc  reason: not valid java name */
    long mo107213getSizeNHjbRc();
}
