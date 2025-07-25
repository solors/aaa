package androidx.compose.p015ui.layout;

import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: AlignmentLine.kt */
@Immutable
@Metadata
/* renamed from: androidx.compose.ui.layout.AlignmentLine */
/* loaded from: classes.dex */
public abstract class AlignmentLine {
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int Unspecified = Integer.MIN_VALUE;
    @NotNull
    private final Function2<Integer, Integer, Integer> merger;

    /* compiled from: AlignmentLine.kt */
    @Metadata
    /* renamed from: androidx.compose.ui.layout.AlignmentLine$Companion */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ AlignmentLine(Function2 function2, DefaultConstructorMarker defaultConstructorMarker) {
        this(function2);
    }

    @NotNull
    public final Function2<Integer, Integer, Integer> getMerger$ui_release() {
        return this.merger;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private AlignmentLine(Function2<? super Integer, ? super Integer, Integer> function2) {
        this.merger = function2;
    }
}
