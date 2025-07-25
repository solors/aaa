package androidx.compose.p015ui.input.pointer.util;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: VelocityTracker.kt */
@Metadata
/* renamed from: androidx.compose.ui.input.pointer.util.Vector */
/* loaded from: classes.dex */
final class Vector {
    @NotNull
    private final Float[] elements;
    private final int length;

    public Vector(int i) {
        this.length = i;
        Float[] fArr = new Float[i];
        for (int i2 = 0; i2 < i; i2++) {
            fArr[i2] = Float.valueOf(0.0f);
        }
        this.elements = fArr;
    }

    public final float get(int i) {
        return this.elements[i].floatValue();
    }

    @NotNull
    public final Float[] getElements() {
        return this.elements;
    }

    public final int getLength() {
        return this.length;
    }

    public final float norm() {
        return (float) Math.sqrt(times(this));
    }

    public final void set(int i, float f) {
        this.elements[i] = Float.valueOf(f);
    }

    public final float times(@NotNull Vector a) {
        Intrinsics.checkNotNullParameter(a, "a");
        int i = this.length;
        float f = 0.0f;
        for (int i2 = 0; i2 < i; i2++) {
            f += get(i2) * a.get(i2);
        }
        return f;
    }
}
