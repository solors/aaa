package androidx.compose.p015ui.layout;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* compiled from: IntrinsicMeasurable.kt */
@Metadata
/* renamed from: androidx.compose.ui.layout.IntrinsicMeasurable */
/* loaded from: classes.dex */
public interface IntrinsicMeasurable {
    @Nullable
    Object getParentData();

    int maxIntrinsicHeight(int i);

    int maxIntrinsicWidth(int i);

    int minIntrinsicHeight(int i);

    int minIntrinsicWidth(int i);
}
