package androidx.compose.p015ui.platform;

import kotlin.Metadata;
import kotlin.sequences.C37653n;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: InspectableValue.kt */
@Metadata
/* renamed from: androidx.compose.ui.platform.InspectableValue */
/* loaded from: classes.dex */
public interface InspectableValue {

    /* compiled from: InspectableValue.kt */
    @Metadata
    /* renamed from: androidx.compose.ui.platform.InspectableValue$DefaultImpls */
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @Deprecated
        @NotNull
        public static Sequence<ValueElement> getInspectableElements(@NotNull InspectableValue inspectableValue) {
            return InspectableValue.super.getInspectableElements();
        }

        @Deprecated
        @Nullable
        public static String getNameFallback(@NotNull InspectableValue inspectableValue) {
            return InspectableValue.super.getNameFallback();
        }

        @Deprecated
        @Nullable
        public static Object getValueOverride(@NotNull InspectableValue inspectableValue) {
            return InspectableValue.super.getValueOverride();
        }
    }

    @NotNull
    default Sequence<ValueElement> getInspectableElements() {
        Sequence<ValueElement> m16839e;
        m16839e = C37653n.m16839e();
        return m16839e;
    }

    @Nullable
    default String getNameFallback() {
        return null;
    }

    @Nullable
    default Object getValueOverride() {
        return null;
    }
}
