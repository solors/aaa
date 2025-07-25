package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import com.google.common.math.IntMath;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
public final class TopKSelector<T> {

    /* renamed from: a */
    private final int f40772a;

    /* renamed from: b */
    private final Comparator<? super T> f40773b;

    /* renamed from: c */
    private final T[] f40774c;

    /* renamed from: d */
    private int f40775d;

    /* renamed from: e */
    private T f40776e;

    private TopKSelector(Comparator<? super T> comparator, int i) {
        boolean z;
        this.f40773b = (Comparator) Preconditions.checkNotNull(comparator, "comparator");
        this.f40772a = i;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "k (%s) must be >= 0", i);
        Preconditions.checkArgument(i <= 1073741823, "k (%s) must be <= Integer.MAX_VALUE / 2", i);
        this.f40774c = (T[]) new Object[IntMath.checkedMultiply(i, 2)];
        this.f40775d = 0;
        this.f40776e = null;
    }

    /* renamed from: a */
    private int m68684a(int i, int i2, int i3) {
        Object m68906a = NullnessCasts.m68906a(this.f40774c[i3]);
        T[] tArr = this.f40774c;
        tArr[i3] = tArr[i2];
        int i4 = i;
        while (i < i2) {
            if (this.f40773b.compare((Object) NullnessCasts.m68906a(this.f40774c[i]), m68906a) < 0) {
                m68683b(i4, i);
                i4++;
            }
            i++;
        }
        T[] tArr2 = this.f40774c;
        tArr2[i2] = tArr2[i4];
        tArr2[i4] = m68906a;
        return i4;
    }

    /* renamed from: b */
    private void m68683b(int i, int i2) {
        T[] tArr = this.f40774c;
        T t = tArr[i];
        tArr[i] = tArr[i2];
        tArr[i2] = t;
    }

    /* renamed from: c */
    private void m68682c() {
        int i = (this.f40772a * 2) - 1;
        int log2 = IntMath.log2(i + 0, RoundingMode.CEILING) * 3;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i2 < i) {
                int m68684a = m68684a(i2, i, ((i2 + i) + 1) >>> 1);
                int i5 = this.f40772a;
                if (m68684a > i5) {
                    i = m68684a - 1;
                } else if (m68684a >= i5) {
                    break;
                } else {
                    i2 = Math.max(m68684a, i2 + 1);
                    i4 = m68684a;
                }
                i3++;
                if (i3 >= log2) {
                    Arrays.sort(this.f40774c, i2, i + 1, this.f40773b);
                    break;
                }
            } else {
                break;
            }
        }
        this.f40775d = this.f40772a;
        this.f40776e = (T) NullnessCasts.m68906a(this.f40774c[i4]);
        while (true) {
            i4++;
            if (i4 < this.f40772a) {
                if (this.f40773b.compare((Object) NullnessCasts.m68906a(this.f40774c[i4]), (Object) NullnessCasts.m68906a(this.f40776e)) > 0) {
                    this.f40776e = this.f40774c[i4];
                }
            } else {
                return;
            }
        }
    }

    public static <T extends Comparable<? super T>> TopKSelector<T> greatest(int i) {
        return greatest(i, Ordering.natural());
    }

    public static <T extends Comparable<? super T>> TopKSelector<T> least(int i) {
        return least(i, Ordering.natural());
    }

    public void offer(@ParametricNullness T t) {
        int i = this.f40772a;
        if (i == 0) {
            return;
        }
        int i2 = this.f40775d;
        if (i2 == 0) {
            this.f40774c[0] = t;
            this.f40776e = t;
            this.f40775d = 1;
        } else if (i2 < i) {
            T[] tArr = this.f40774c;
            this.f40775d = i2 + 1;
            tArr[i2] = t;
            if (this.f40773b.compare(t, (Object) NullnessCasts.m68906a(this.f40776e)) > 0) {
                this.f40776e = t;
            }
        } else if (this.f40773b.compare(t, (Object) NullnessCasts.m68906a(this.f40776e)) < 0) {
            T[] tArr2 = this.f40774c;
            int i3 = this.f40775d;
            int i4 = i3 + 1;
            this.f40775d = i4;
            tArr2[i3] = t;
            if (i4 == this.f40772a * 2) {
                m68682c();
            }
        }
    }

    public void offerAll(Iterable<? extends T> iterable) {
        offerAll(iterable.iterator());
    }

    public List<T> topK() {
        Arrays.sort(this.f40774c, 0, this.f40775d, this.f40773b);
        int i = this.f40775d;
        int i2 = this.f40772a;
        if (i > i2) {
            T[] tArr = this.f40774c;
            Arrays.fill(tArr, i2, tArr.length, (Object) null);
            int i3 = this.f40772a;
            this.f40775d = i3;
            this.f40776e = this.f40774c[i3 - 1];
        }
        return Collections.unmodifiableList(Arrays.asList(Arrays.copyOf(this.f40774c, this.f40775d)));
    }

    public static <T> TopKSelector<T> greatest(int i, Comparator<? super T> comparator) {
        return new TopKSelector<>(Ordering.from(comparator).reverse(), i);
    }

    public static <T> TopKSelector<T> least(int i, Comparator<? super T> comparator) {
        return new TopKSelector<>(comparator, i);
    }

    public void offerAll(Iterator<? extends T> it) {
        while (it.hasNext()) {
            offer(it.next());
        }
    }
}
