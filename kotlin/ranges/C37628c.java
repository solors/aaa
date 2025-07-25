package kotlin.ranges;

import de.Ranges;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Ranges.kt */
@Metadata
/* renamed from: kotlin.ranges.c */
/* loaded from: classes7.dex */
final class C37628c implements Ranges<Float> {

    /* renamed from: b */
    private final float f99355b;

    /* renamed from: c */
    private final float f99356c;

    public C37628c(float f, float f2) {
        this.f99355b = f;
        this.f99356c = f2;
    }

    @Override // de.Ranges
    /* renamed from: a */
    public /* bridge */ /* synthetic */ boolean mo16958a(Float f, Float f2) {
        return m16954e(f.floatValue(), f2.floatValue());
    }

    /* renamed from: b */
    public boolean m16957b(float f) {
        if (f >= this.f99355b && f <= this.f99356c) {
            return true;
        }
        return false;
    }

    @Override // de.InterfaceC32867c
    @NotNull
    /* renamed from: c */
    public Float getEndInclusive() {
        return Float.valueOf(this.f99356c);
    }

    @Override // de.Ranges
    public /* bridge */ /* synthetic */ boolean contains(Float f) {
        return m16957b(f.floatValue());
    }

    @Override // de.InterfaceC32867c
    @NotNull
    /* renamed from: d */
    public Float getStart() {
        return Float.valueOf(this.f99355b);
    }

    /* renamed from: e */
    public boolean m16954e(float f, float f2) {
        if (f <= f2) {
            return true;
        }
        return false;
    }

    public boolean equals(@Nullable Object obj) {
        boolean z;
        boolean z2;
        if (!(obj instanceof C37628c)) {
            return false;
        }
        if (!isEmpty() || !((C37628c) obj).isEmpty()) {
            C37628c c37628c = (C37628c) obj;
            if (this.f99355b == c37628c.f99355b) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                return false;
            }
            if (this.f99356c == c37628c.f99356c) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (Float.hashCode(this.f99355b) * 31) + Float.hashCode(this.f99356c);
    }

    @Override // de.Ranges, de.InterfaceC32867c
    public boolean isEmpty() {
        if (this.f99355b > this.f99356c) {
            return true;
        }
        return false;
    }

    @NotNull
    public String toString() {
        return this.f99355b + ".." + this.f99356c;
    }
}
