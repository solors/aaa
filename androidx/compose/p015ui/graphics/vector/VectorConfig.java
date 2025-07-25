package androidx.compose.p015ui.graphics.vector;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: VectorPainter.kt */
@Metadata
/* renamed from: androidx.compose.ui.graphics.vector.VectorConfig */
/* loaded from: classes.dex */
public interface VectorConfig {

    /* compiled from: VectorPainter.kt */
    @Metadata
    /* renamed from: androidx.compose.ui.graphics.vector.VectorConfig$DefaultImpls */
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @Deprecated
        public static <T> T getOrDefault(@NotNull VectorConfig vectorConfig, @NotNull VectorProperty<T> property, T t) {
            Intrinsics.checkNotNullParameter(property, "property");
            return (T) VectorConfig.super.getOrDefault(property, t);
        }
    }

    default <T> T getOrDefault(@NotNull VectorProperty<T> property, T t) {
        Intrinsics.checkNotNullParameter(property, "property");
        return t;
    }
}
