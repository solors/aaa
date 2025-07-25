package androidx.compose.p015ui.layout;

import androidx.compose.runtime.Composer;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SubcomposeLayout.kt */
@Metadata
/* renamed from: androidx.compose.ui.layout.SubcomposeMeasureScope */
/* loaded from: classes.dex */
public interface SubcomposeMeasureScope extends MeasureScope {
    @NotNull
    List<Measurable> subcompose(@Nullable Object obj, @NotNull Function2<? super Composer, ? super Integer, Unit> function2);
}
