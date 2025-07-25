package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.util.Comparator;

/* JADX INFO: Access modifiers changed from: package-private */
@GwtCompatible(serializable = true)
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
public final class GeneralRange<T> implements Serializable {

    /* renamed from: b */
    private final Comparator<? super T> f39980b;

    /* renamed from: c */
    private final boolean f39981c;

    /* renamed from: d */
    private final T f39982d;

    /* renamed from: f */
    private final BoundType f39983f;

    /* renamed from: g */
    private final boolean f39984g;

    /* renamed from: h */
    private final T f39985h;

    /* renamed from: i */
    private final BoundType f39986i;

    private GeneralRange(Comparator<? super T> comparator, boolean z, T t, BoundType boundType, boolean z2, T t2, BoundType boundType2) {
        boolean z3;
        this.f39980b = (Comparator) Preconditions.checkNotNull(comparator);
        this.f39981c = z;
        this.f39984g = z2;
        this.f39982d = t;
        this.f39983f = (BoundType) Preconditions.checkNotNull(boundType);
        this.f39985h = t2;
        this.f39986i = (BoundType) Preconditions.checkNotNull(boundType2);
        if (z) {
            comparator.compare((Object) NullnessCasts.m68906a(t), (Object) NullnessCasts.m68906a(t));
        }
        if (z2) {
            comparator.compare((Object) NullnessCasts.m68906a(t2), (Object) NullnessCasts.m68906a(t2));
        }
        if (z && z2) {
            int compare = comparator.compare((Object) NullnessCasts.m68906a(t), (Object) NullnessCasts.m68906a(t2));
            boolean z4 = true;
            if (compare <= 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            Preconditions.checkArgument(z3, "lowerEndpoint (%s) > upperEndpoint (%s)", t, t2);
            if (compare == 0) {
                BoundType boundType3 = BoundType.OPEN;
                if (boundType == boundType3 && boundType2 == boundType3) {
                    z4 = false;
                }
                Preconditions.checkArgument(z4);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static <T> GeneralRange<T> m69504a(Comparator<? super T> comparator) {
        BoundType boundType = BoundType.OPEN;
        return new GeneralRange<>(comparator, false, null, boundType, false, null, boundType);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static <T> GeneralRange<T> m69501d(Comparator<? super T> comparator, @ParametricNullness T t, BoundType boundType) {
        return new GeneralRange<>(comparator, true, t, boundType, false, null, BoundType.OPEN);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public static <T> GeneralRange<T> m69491n(Comparator<? super T> comparator, @ParametricNullness T t, BoundType boundType) {
        return new GeneralRange<>(comparator, false, null, BoundType.OPEN, true, t, boundType);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public Comparator<? super T> m69503b() {
        return this.f39980b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean m69502c(@ParametricNullness T t) {
        if (!m69492m(t) && !m69493l(t)) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public BoundType m69500e() {
        return this.f39983f;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof GeneralRange)) {
            return false;
        }
        GeneralRange generalRange = (GeneralRange) obj;
        if (!this.f39980b.equals(generalRange.f39980b) || this.f39981c != generalRange.f39981c || this.f39984g != generalRange.f39984g || !m69500e().equals(generalRange.m69500e()) || !m69498g().equals(generalRange.m69498g()) || !Objects.equal(m69499f(), generalRange.m69499f()) || !Objects.equal(m69497h(), generalRange.m69497h())) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public T m69499f() {
        return this.f39982d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public BoundType m69498g() {
        return this.f39986i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public T m69497h() {
        return this.f39985h;
    }

    public int hashCode() {
        return Objects.hashCode(this.f39980b, m69499f(), m69500e(), m69497h(), m69498g());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public boolean m69496i() {
        return this.f39981c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public boolean m69495j() {
        return this.f39984g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public GeneralRange<T> m69494k(GeneralRange<T> generalRange) {
        int compare;
        int compare2;
        T t;
        BoundType boundType;
        BoundType boundType2;
        int compare3;
        BoundType boundType3;
        Preconditions.checkNotNull(generalRange);
        Preconditions.checkArgument(this.f39980b.equals(generalRange.f39980b));
        boolean z = this.f39981c;
        T m69499f = m69499f();
        BoundType m69500e = m69500e();
        if (!m69496i()) {
            z = generalRange.f39981c;
            m69499f = generalRange.m69499f();
            m69500e = generalRange.m69500e();
        } else if (generalRange.m69496i() && ((compare = this.f39980b.compare(m69499f(), generalRange.m69499f())) < 0 || (compare == 0 && generalRange.m69500e() == BoundType.OPEN))) {
            m69499f = generalRange.m69499f();
            m69500e = generalRange.m69500e();
        }
        boolean z2 = z;
        boolean z3 = this.f39984g;
        T m69497h = m69497h();
        BoundType m69498g = m69498g();
        if (!m69495j()) {
            z3 = generalRange.f39984g;
            m69497h = generalRange.m69497h();
            m69498g = generalRange.m69498g();
        } else if (generalRange.m69495j() && ((compare2 = this.f39980b.compare(m69497h(), generalRange.m69497h())) > 0 || (compare2 == 0 && generalRange.m69498g() == BoundType.OPEN))) {
            m69497h = generalRange.m69497h();
            m69498g = generalRange.m69498g();
        }
        boolean z4 = z3;
        T t2 = m69497h;
        if (z2 && z4 && ((compare3 = this.f39980b.compare(m69499f, t2)) > 0 || (compare3 == 0 && m69500e == (boundType3 = BoundType.OPEN) && m69498g == boundType3))) {
            boundType = BoundType.OPEN;
            boundType2 = BoundType.CLOSED;
            t = t2;
        } else {
            t = m69499f;
            boundType = m69500e;
            boundType2 = m69498g;
        }
        return new GeneralRange<>(this.f39980b, z2, t, boundType, z4, t2, boundType2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public boolean m69493l(@ParametricNullness T t) {
        boolean z;
        boolean z2;
        boolean z3 = false;
        if (!m69495j()) {
            return false;
        }
        int compare = this.f39980b.compare(t, NullnessCasts.m68906a(m69497h()));
        if (compare > 0) {
            z = true;
        } else {
            z = false;
        }
        if (compare == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (m69498g() == BoundType.OPEN) {
            z3 = true;
        }
        return (z2 & z3) | z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public boolean m69492m(@ParametricNullness T t) {
        boolean z;
        boolean z2;
        boolean z3 = false;
        if (!m69496i()) {
            return false;
        }
        int compare = this.f39980b.compare(t, NullnessCasts.m68906a(m69499f()));
        if (compare < 0) {
            z = true;
        } else {
            z = false;
        }
        if (compare == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (m69500e() == BoundType.OPEN) {
            z3 = true;
        }
        return (z2 & z3) | z;
    }

    public String toString() {
        char c;
        Object obj;
        Object obj2;
        char c2;
        String valueOf = String.valueOf(this.f39980b);
        BoundType boundType = this.f39983f;
        BoundType boundType2 = BoundType.CLOSED;
        if (boundType == boundType2) {
            c = '[';
        } else {
            c = '(';
        }
        if (this.f39981c) {
            obj = this.f39982d;
        } else {
            obj = "-∞";
        }
        String valueOf2 = String.valueOf(obj);
        if (this.f39984g) {
            obj2 = this.f39985h;
        } else {
            obj2 = "∞";
        }
        String valueOf3 = String.valueOf(obj2);
        if (this.f39986i == boundType2) {
            c2 = ']';
        } else {
            c2 = ')';
        }
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 4 + valueOf2.length() + valueOf3.length());
        sb2.append(valueOf);
        sb2.append(":");
        sb2.append(c);
        sb2.append(valueOf2);
        sb2.append(',');
        sb2.append(valueOf3);
        sb2.append(c2);
        return sb2.toString();
    }
}
