package androidx.compose.p015ui.layout;

import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ContentScale.kt */
@Immutable
@Metadata
/* renamed from: androidx.compose.ui.layout.FixedScale */
/* loaded from: classes.dex */
public final class FixedScale implements ContentScale {
    private final float value;

    public FixedScale(float f) {
        this.value = f;
    }

    public static /* synthetic */ FixedScale copy$default(FixedScale fixedScale, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            f = fixedScale.value;
        }
        return fixedScale.copy(f);
    }

    public final float component1() {
        return this.value;
    }

    @Override // androidx.compose.p015ui.layout.ContentScale
    /* renamed from: computeScaleFactor-H7hwNQA */
    public long mo109011computeScaleFactorH7hwNQA(long j, long j2) {
        float f = this.value;
        return ScaleFactorKt.ScaleFactor(f, f);
    }

    @NotNull
    public final FixedScale copy(float f) {
        return new FixedScale(f);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof FixedScale) && Intrinsics.m17075f(Float.valueOf(this.value), Float.valueOf(((FixedScale) obj).value))) {
            return true;
        }
        return false;
    }

    public final float getValue() {
        return this.value;
    }

    public int hashCode() {
        return Float.hashCode(this.value);
    }

    @NotNull
    public String toString() {
        return "FixedScale(value=" + this.value + ')';
    }
}
