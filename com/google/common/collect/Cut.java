package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import com.google.common.primitives.Booleans;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.io.Serializable;
import java.lang.Comparable;
import java.util.NoSuchElementException;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
public abstract class Cut<C extends Comparable> implements Comparable<Cut<C>>, Serializable {

    /* renamed from: b */
    final C f39894b;

    /* renamed from: com.google.common.collect.Cut$1 */
    /* loaded from: classes4.dex */
    static /* synthetic */ class C167321 {

        /* renamed from: a */
        static final /* synthetic */ int[] f39895a;

        static {
            int[] iArr = new int[BoundType.values().length];
            f39895a = iArr;
            try {
                iArr[BoundType.CLOSED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f39895a[BoundType.OPEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class AboveAll extends Cut<Comparable<?>> {

        /* renamed from: c */
        private static final AboveAll f39896c = new AboveAll();

        private AboveAll() {
            super("");
        }

        private Object readResolve() {
            return f39896c;
        }

        @Override // com.google.common.collect.Cut, java.lang.Comparable
        public int compareTo(Cut<Comparable<?>> cut) {
            return cut == this ? 0 : 1;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Cut
        /* renamed from: g */
        public void mo69584g(StringBuilder sb2) {
            throw new AssertionError();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Cut
        /* renamed from: h */
        public void mo69583h(StringBuilder sb2) {
            sb2.append("+∞)");
        }

        @Override // com.google.common.collect.Cut
        public int hashCode() {
            return System.identityHashCode(this);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Cut
        /* renamed from: i */
        public Comparable<?> mo69586i() {
            throw new IllegalStateException("range unbounded on this side");
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Cut
        /* renamed from: j */
        public Comparable<?> mo69582j(DiscreteDomain<Comparable<?>> discreteDomain) {
            return discreteDomain.maxValue();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Cut
        /* renamed from: k */
        public boolean mo69581k(Comparable<?> comparable) {
            return false;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Cut
        /* renamed from: l */
        public Comparable<?> mo69580l(DiscreteDomain<Comparable<?>> discreteDomain) {
            throw new AssertionError();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Cut
        /* renamed from: m */
        public BoundType mo69579m() {
            throw new AssertionError("this statement should be unreachable");
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Cut
        /* renamed from: n */
        public BoundType mo69578n() {
            throw new IllegalStateException();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Cut
        /* renamed from: o */
        public Cut<Comparable<?>> mo69577o(BoundType boundType, DiscreteDomain<Comparable<?>> discreteDomain) {
            throw new AssertionError("this statement should be unreachable");
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Cut
        /* renamed from: p */
        public Cut<Comparable<?>> mo69576p(BoundType boundType, DiscreteDomain<Comparable<?>> discreteDomain) {
            throw new IllegalStateException();
        }

        public String toString() {
            return "+∞";
        }
    }

    /* loaded from: classes4.dex */
    public static final class AboveValue<C extends Comparable> extends Cut<C> {
        AboveValue(C c) {
            super((Comparable) Preconditions.checkNotNull(c));
        }

        @Override // com.google.common.collect.Cut, java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(Object obj) {
            return super.compareTo((Cut) ((Cut) obj));
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Cut
        /* renamed from: f */
        public Cut<C> mo69587f(DiscreteDomain<C> discreteDomain) {
            C mo69580l = mo69580l(discreteDomain);
            if (mo69580l != null) {
                return Cut.m69589e(mo69580l);
            }
            return Cut.m69592b();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Cut
        /* renamed from: g */
        public void mo69584g(StringBuilder sb2) {
            sb2.append('(');
            sb2.append(this.f39894b);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Cut
        /* renamed from: h */
        public void mo69583h(StringBuilder sb2) {
            sb2.append(this.f39894b);
            sb2.append(']');
        }

        @Override // com.google.common.collect.Cut
        public int hashCode() {
            return ~this.f39894b.hashCode();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Cut
        /* renamed from: j */
        public C mo69582j(DiscreteDomain<C> discreteDomain) {
            return this.f39894b;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Cut
        /* renamed from: k */
        public boolean mo69581k(C c) {
            if (Range.m68853a(this.f39894b, c) < 0) {
                return true;
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Cut
        /* renamed from: l */
        public C mo69580l(DiscreteDomain<C> discreteDomain) {
            return discreteDomain.next(this.f39894b);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Cut
        /* renamed from: m */
        public BoundType mo69579m() {
            return BoundType.OPEN;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Cut
        /* renamed from: n */
        public BoundType mo69578n() {
            return BoundType.CLOSED;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Cut
        /* renamed from: o */
        public Cut<C> mo69577o(BoundType boundType, DiscreteDomain<C> discreteDomain) {
            int i = C167321.f39895a[boundType.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    return this;
                }
                throw new AssertionError();
            }
            C next = discreteDomain.next(this.f39894b);
            if (next == null) {
                return Cut.m69590d();
            }
            return Cut.m69589e(next);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Cut
        /* renamed from: p */
        public Cut<C> mo69576p(BoundType boundType, DiscreteDomain<C> discreteDomain) {
            int i = C167321.f39895a[boundType.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    C next = discreteDomain.next(this.f39894b);
                    if (next == null) {
                        return Cut.m69592b();
                    }
                    return Cut.m69589e(next);
                }
                throw new AssertionError();
            }
            return this;
        }

        public String toString() {
            String valueOf = String.valueOf(this.f39894b);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 2);
            sb2.append(RemoteSettings.FORWARD_SLASH_STRING);
            sb2.append(valueOf);
            sb2.append("\\");
            return sb2.toString();
        }
    }

    /* loaded from: classes4.dex */
    public static final class BelowAll extends Cut<Comparable<?>> {

        /* renamed from: c */
        private static final BelowAll f39897c = new BelowAll();

        private BelowAll() {
            super("");
        }

        private Object readResolve() {
            return f39897c;
        }

        @Override // com.google.common.collect.Cut, java.lang.Comparable
        public int compareTo(Cut<Comparable<?>> cut) {
            return cut == this ? 0 : -1;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Cut
        /* renamed from: f */
        public Cut<Comparable<?>> mo69587f(DiscreteDomain<Comparable<?>> discreteDomain) {
            try {
                return Cut.m69589e(discreteDomain.minValue());
            } catch (NoSuchElementException unused) {
                return this;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Cut
        /* renamed from: g */
        public void mo69584g(StringBuilder sb2) {
            sb2.append("(-∞");
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Cut
        /* renamed from: h */
        public void mo69583h(StringBuilder sb2) {
            throw new AssertionError();
        }

        @Override // com.google.common.collect.Cut
        public int hashCode() {
            return System.identityHashCode(this);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Cut
        /* renamed from: i */
        public Comparable<?> mo69586i() {
            throw new IllegalStateException("range unbounded on this side");
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Cut
        /* renamed from: j */
        public Comparable<?> mo69582j(DiscreteDomain<Comparable<?>> discreteDomain) {
            throw new AssertionError();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Cut
        /* renamed from: k */
        public boolean mo69581k(Comparable<?> comparable) {
            return true;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Cut
        /* renamed from: l */
        public Comparable<?> mo69580l(DiscreteDomain<Comparable<?>> discreteDomain) {
            return discreteDomain.minValue();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Cut
        /* renamed from: m */
        public BoundType mo69579m() {
            throw new IllegalStateException();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Cut
        /* renamed from: n */
        public BoundType mo69578n() {
            throw new AssertionError("this statement should be unreachable");
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Cut
        /* renamed from: o */
        public Cut<Comparable<?>> mo69577o(BoundType boundType, DiscreteDomain<Comparable<?>> discreteDomain) {
            throw new IllegalStateException();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Cut
        /* renamed from: p */
        public Cut<Comparable<?>> mo69576p(BoundType boundType, DiscreteDomain<Comparable<?>> discreteDomain) {
            throw new AssertionError("this statement should be unreachable");
        }

        public String toString() {
            return "-∞";
        }
    }

    /* loaded from: classes4.dex */
    public static final class BelowValue<C extends Comparable> extends Cut<C> {
        BelowValue(C c) {
            super((Comparable) Preconditions.checkNotNull(c));
        }

        @Override // com.google.common.collect.Cut, java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(Object obj) {
            return super.compareTo((Cut) ((Cut) obj));
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Cut
        /* renamed from: g */
        public void mo69584g(StringBuilder sb2) {
            sb2.append('[');
            sb2.append(this.f39894b);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Cut
        /* renamed from: h */
        public void mo69583h(StringBuilder sb2) {
            sb2.append(this.f39894b);
            sb2.append(')');
        }

        @Override // com.google.common.collect.Cut
        public int hashCode() {
            return this.f39894b.hashCode();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Cut
        /* renamed from: j */
        public C mo69582j(DiscreteDomain<C> discreteDomain) {
            return discreteDomain.previous(this.f39894b);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Cut
        /* renamed from: k */
        public boolean mo69581k(C c) {
            if (Range.m68853a(this.f39894b, c) <= 0) {
                return true;
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Cut
        /* renamed from: l */
        public C mo69580l(DiscreteDomain<C> discreteDomain) {
            return this.f39894b;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Cut
        /* renamed from: m */
        public BoundType mo69579m() {
            return BoundType.CLOSED;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Cut
        /* renamed from: n */
        public BoundType mo69578n() {
            return BoundType.OPEN;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Cut
        /* renamed from: o */
        public Cut<C> mo69577o(BoundType boundType, DiscreteDomain<C> discreteDomain) {
            int i = C167321.f39895a[boundType.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    C previous = discreteDomain.previous(this.f39894b);
                    if (previous == null) {
                        return Cut.m69590d();
                    }
                    return new AboveValue(previous);
                }
                throw new AssertionError();
            }
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Cut
        /* renamed from: p */
        public Cut<C> mo69576p(BoundType boundType, DiscreteDomain<C> discreteDomain) {
            int i = C167321.f39895a[boundType.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    return this;
                }
                throw new AssertionError();
            }
            C previous = discreteDomain.previous(this.f39894b);
            if (previous == null) {
                return Cut.m69592b();
            }
            return new AboveValue(previous);
        }

        public String toString() {
            String valueOf = String.valueOf(this.f39894b);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 2);
            sb2.append("\\");
            sb2.append(valueOf);
            sb2.append(RemoteSettings.FORWARD_SLASH_STRING);
            return sb2.toString();
        }
    }

    Cut(C c) {
        this.f39894b = c;
    }

    /* renamed from: b */
    public static <C extends Comparable> Cut<C> m69592b() {
        return AboveAll.f39896c;
    }

    /* renamed from: c */
    public static <C extends Comparable> Cut<C> m69591c(C c) {
        return new AboveValue(c);
    }

    /* renamed from: d */
    public static <C extends Comparable> Cut<C> m69590d() {
        return BelowAll.f39897c;
    }

    /* renamed from: e */
    public static <C extends Comparable> Cut<C> m69589e(C c) {
        return new BelowValue(c);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return compareTo((Cut) ((Cut) obj));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Cut)) {
            return false;
        }
        try {
            if (compareTo((Cut) ((Cut) obj)) != 0) {
                return false;
            }
            return true;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    /* renamed from: g */
    public abstract void mo69584g(StringBuilder sb2);

    /* renamed from: h */
    public abstract void mo69583h(StringBuilder sb2);

    public abstract int hashCode();

    /* renamed from: i */
    public C mo69586i() {
        return this.f39894b;
    }

    /* renamed from: j */
    public abstract C mo69582j(DiscreteDomain<C> discreteDomain);

    /* renamed from: k */
    public abstract boolean mo69581k(C c);

    /* renamed from: l */
    public abstract C mo69580l(DiscreteDomain<C> discreteDomain);

    /* renamed from: m */
    public abstract BoundType mo69579m();

    /* renamed from: n */
    public abstract BoundType mo69578n();

    /* renamed from: o */
    public abstract Cut<C> mo69577o(BoundType boundType, DiscreteDomain<C> discreteDomain);

    /* renamed from: p */
    public abstract Cut<C> mo69576p(BoundType boundType, DiscreteDomain<C> discreteDomain);

    public int compareTo(Cut<C> cut) {
        if (cut == m69590d()) {
            return 1;
        }
        if (cut == m69592b()) {
            return -1;
        }
        int m68853a = Range.m68853a(this.f39894b, cut.f39894b);
        return m68853a != 0 ? m68853a : Booleans.compare(this instanceof AboveValue, cut instanceof AboveValue);
    }

    /* renamed from: f */
    public Cut<C> mo69587f(DiscreteDomain<C> discreteDomain) {
        return this;
    }
}
