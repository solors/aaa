package androidx.compose.p015ui.text;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TtsAnnotation.kt */
@Metadata
/* renamed from: androidx.compose.ui.text.VerbatimTtsAnnotation */
/* loaded from: classes.dex */
public final class VerbatimTtsAnnotation extends TtsAnnotation {
    @NotNull
    private final String verbatim;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerbatimTtsAnnotation(@NotNull String verbatim) {
        super(null);
        Intrinsics.checkNotNullParameter(verbatim, "verbatim");
        this.verbatim = verbatim;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof VerbatimTtsAnnotation) && Intrinsics.m17075f(this.verbatim, ((VerbatimTtsAnnotation) obj).verbatim)) {
            return true;
        }
        return false;
    }

    @NotNull
    public final String getVerbatim() {
        return this.verbatim;
    }

    public int hashCode() {
        return this.verbatim.hashCode();
    }

    @NotNull
    public String toString() {
        return "VerbatimTtsAnnotation(verbatim=" + this.verbatim + ')';
    }
}
