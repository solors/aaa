package androidx.compose.p015ui.semantics;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SemanticsConfiguration.kt */
@Metadata
/* renamed from: androidx.compose.ui.semantics.SemanticsConfigurationKt */
/* loaded from: classes.dex */
public final class SemanticsConfigurationKt {
    @Nullable
    public static final <T> T getOrNull(@NotNull SemanticsConfiguration semanticsConfiguration, @NotNull SemanticsPropertyKey<T> key) {
        Intrinsics.checkNotNullParameter(semanticsConfiguration, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        return (T) semanticsConfiguration.getOrElseNullable(key, SemanticsConfigurationKt$getOrNull$1.INSTANCE);
    }
}
