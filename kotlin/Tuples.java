package kotlin;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: kotlin.Pair */
/* loaded from: classes5.dex */
public final class Tuples<A, B> implements Serializable {

    /* renamed from: b */
    private final A f99206b;

    /* renamed from: c */
    private final B f99207c;

    public Tuples(A a, B b) {
        this.f99206b = a;
        this.f99207c = b;
    }

    /* renamed from: a */
    public final A m17632a() {
        return this.f99206b;
    }

    /* renamed from: b */
    public final B m17631b() {
        return this.f99207c;
    }

    /* renamed from: c */
    public final A m17630c() {
        return this.f99206b;
    }

    /* renamed from: d */
    public final B m17629d() {
        return this.f99207c;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Tuples)) {
            return false;
        }
        Tuples tuples = (Tuples) obj;
        if (Intrinsics.m17075f(this.f99206b, tuples.f99206b) && Intrinsics.m17075f(this.f99207c, tuples.f99207c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        A a = this.f99206b;
        int i = 0;
        if (a == null) {
            hashCode = 0;
        } else {
            hashCode = a.hashCode();
        }
        int i2 = hashCode * 31;
        B b = this.f99207c;
        if (b != null) {
            i = b.hashCode();
        }
        return i2 + i;
    }

    @NotNull
    public String toString() {
        return '(' + this.f99206b + ", " + this.f99207c + ')';
    }
}
