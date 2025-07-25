package androidx.compose.p015ui.graphics;

import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Brush.kt */
@Immutable
@Metadata
/* renamed from: androidx.compose.ui.graphics.SolidColor */
/* loaded from: classes.dex */
public final class SolidColor extends Brush {
    private final long value;

    public /* synthetic */ SolidColor(long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(j);
    }

    @Override // androidx.compose.p015ui.graphics.Brush
    /* renamed from: applyTo-Pq9zytI */
    public void mo107474applyToPq9zytI(long j, @NotNull Paint p, float f) {
        boolean z;
        long j2;
        Intrinsics.checkNotNullParameter(p, "p");
        p.setAlpha(1.0f);
        if (f == 1.0f) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            long j3 = this.value;
            j2 = Color.m107526copywmQWz5c$default(j3, Color.m107529getAlphaimpl(j3) * f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j2 = this.value;
        }
        p.mo107411setColor8_81llA(j2);
        if (p.getShader() != null) {
            p.setShader(null);
        }
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof SolidColor) && Color.m107528equalsimpl0(this.value, ((SolidColor) obj).value)) {
            return true;
        }
        return false;
    }

    /* renamed from: getValue-0d7_KjU */
    public final long m107813getValue0d7_KjU() {
        return this.value;
    }

    public int hashCode() {
        return Color.m107534hashCodeimpl(this.value);
    }

    @NotNull
    public String toString() {
        return "SolidColor(value=" + ((Object) Color.m107535toStringimpl(this.value)) + ')';
    }

    private SolidColor(long j) {
        super(null);
        this.value = j;
    }
}
