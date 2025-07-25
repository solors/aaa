package p804nd;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Tuples.kt */
@Metadata
/* renamed from: nd.u */
/* loaded from: classes5.dex */
public final class C38512u<A, B, C> implements Serializable {

    /* renamed from: b */
    private final A f101881b;

    /* renamed from: c */
    private final B f101882c;

    /* renamed from: d */
    private final C f101883d;

    public C38512u(A a, B b, C c) {
        this.f101881b = a;
        this.f101882c = b;
        this.f101883d = c;
    }

    /* renamed from: a */
    public final A m14538a() {
        return this.f101881b;
    }

    /* renamed from: b */
    public final B m14537b() {
        return this.f101882c;
    }

    /* renamed from: c */
    public final C m14536c() {
        return this.f101883d;
    }

    /* renamed from: d */
    public final A m14535d() {
        return this.f101881b;
    }

    /* renamed from: e */
    public final B m14534e() {
        return this.f101882c;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38512u)) {
            return false;
        }
        C38512u c38512u = (C38512u) obj;
        if (Intrinsics.m17075f(this.f101881b, c38512u.f101881b) && Intrinsics.m17075f(this.f101882c, c38512u.f101882c) && Intrinsics.m17075f(this.f101883d, c38512u.f101883d)) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final C m14533f() {
        return this.f101883d;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        A a = this.f101881b;
        int i = 0;
        if (a == null) {
            hashCode = 0;
        } else {
            hashCode = a.hashCode();
        }
        int i2 = hashCode * 31;
        B b = this.f101882c;
        if (b == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = b.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        C c = this.f101883d;
        if (c != null) {
            i = c.hashCode();
        }
        return i3 + i;
    }

    @NotNull
    public String toString() {
        return '(' + this.f101881b + ", " + this.f101882c + ", " + this.f101883d + ')';
    }
}
