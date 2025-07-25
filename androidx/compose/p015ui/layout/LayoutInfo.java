package androidx.compose.p015ui.layout;

import androidx.compose.p015ui.platform.ViewConfiguration;
import androidx.compose.p015ui.unit.Density;
import androidx.compose.p015ui.unit.LayoutDirection;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: LayoutInfo.kt */
@Metadata
/* renamed from: androidx.compose.ui.layout.LayoutInfo */
/* loaded from: classes.dex */
public interface LayoutInfo {
    @NotNull
    LayoutCoordinates getCoordinates();

    @NotNull
    Density getDensity();

    int getHeight();

    @NotNull
    LayoutDirection getLayoutDirection();

    @NotNull
    List<ModifierInfo> getModifierInfo();

    @Nullable
    LayoutInfo getParentInfo();

    @NotNull
    ViewConfiguration getViewConfiguration();

    int getWidth();

    boolean isAttached();

    boolean isPlaced();
}
