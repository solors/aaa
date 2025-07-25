package androidx.compose.p015ui.layout;

import androidx.compose.p015ui.unit.Density;
import androidx.compose.p015ui.unit.LayoutDirection;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: IntrinsicMeasureScope.kt */
@Metadata
/* renamed from: androidx.compose.ui.layout.IntrinsicMeasureScope */
/* loaded from: classes.dex */
public interface IntrinsicMeasureScope extends Density {
    @NotNull
    LayoutDirection getLayoutDirection();
}
