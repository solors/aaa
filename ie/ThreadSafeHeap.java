package ie;

import ie.InterfaceC33650q0;
import java.lang.Comparable;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: ie.p0 */
/* loaded from: classes8.dex */
public class ThreadSafeHeap<T extends InterfaceC33650q0 & Comparable<? super T>> {
    @NotNull

    /* renamed from: b */
    private static final AtomicIntegerFieldUpdater f92126b = AtomicIntegerFieldUpdater.newUpdater(ThreadSafeHeap.class, "_size");
    private volatile int _size;
    @Nullable

    /* renamed from: a */
    private T[] f92127a;

    /* renamed from: f */
    private final T[] m22925f() {
        T[] tArr = this.f92127a;
        if (tArr == null) {
            T[] tArr2 = (T[]) new InterfaceC33650q0[4];
            this.f92127a = tArr2;
            return tArr2;
        } else if (m22928c() >= tArr.length) {
            Object[] copyOf = Arrays.copyOf(tArr, m22928c() * 2);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            T[] tArr3 = (T[]) ((InterfaceC33650q0[]) copyOf);
            this.f92127a = tArr3;
            return tArr3;
        } else {
            return tArr;
        }
    }

    /* renamed from: j */
    private final void m22921j(int i) {
        f92126b.set(this, i);
    }

    /* renamed from: k */
    private final void m22920k(int i) {
        while (true) {
            int i2 = (i * 2) + 1;
            if (i2 >= m22928c()) {
                return;
            }
            T[] tArr = this.f92127a;
            Intrinsics.m17074g(tArr);
            int i3 = i2 + 1;
            if (i3 < m22928c()) {
                T t = tArr[i3];
                Intrinsics.m17074g(t);
                T t2 = tArr[i2];
                Intrinsics.m17074g(t2);
                if (((Comparable) t).compareTo(t2) < 0) {
                    i2 = i3;
                }
            }
            T t3 = tArr[i];
            Intrinsics.m17074g(t3);
            T t4 = tArr[i2];
            Intrinsics.m17074g(t4);
            if (((Comparable) t3).compareTo(t4) <= 0) {
                return;
            }
            m22918m(i, i2);
            i = i2;
        }
    }

    /* renamed from: l */
    private final void m22919l(int i) {
        while (i > 0) {
            T[] tArr = this.f92127a;
            Intrinsics.m17074g(tArr);
            int i2 = (i - 1) / 2;
            T t = tArr[i2];
            Intrinsics.m17074g(t);
            T t2 = tArr[i];
            Intrinsics.m17074g(t2);
            if (((Comparable) t).compareTo(t2) <= 0) {
                return;
            }
            m22918m(i, i2);
            i = i2;
        }
    }

    /* renamed from: m */
    private final void m22918m(int i, int i2) {
        T[] tArr = this.f92127a;
        Intrinsics.m17074g(tArr);
        T t = tArr[i2];
        Intrinsics.m17074g(t);
        T t2 = tArr[i];
        Intrinsics.m17074g(t2);
        tArr[i] = t;
        tArr[i2] = t2;
        t.setIndex(i);
        t2.setIndex(i2);
    }

    /* renamed from: a */
    public final void m22930a(@NotNull T t) {
        t.mo16181d(this);
        T[] m22925f = m22925f();
        int m22928c = m22928c();
        m22921j(m22928c + 1);
        m22925f[m22928c] = t;
        t.setIndex(m22928c);
        m22919l(m22928c);
    }

    @Nullable
    /* renamed from: b */
    public final T m22929b() {
        T[] tArr = this.f92127a;
        if (tArr != null) {
            return tArr[0];
        }
        return null;
    }

    /* renamed from: c */
    public final int m22928c() {
        return f92126b.get(this);
    }

    /* renamed from: d */
    public final boolean m22927d() {
        if (m22928c() == 0) {
            return true;
        }
        return false;
    }

    @Nullable
    /* renamed from: e */
    public final T m22926e() {
        T m22929b;
        synchronized (this) {
            m22929b = m22929b();
        }
        return m22929b;
    }

    /* renamed from: g */
    public final boolean m22924g(@NotNull T t) {
        boolean z;
        synchronized (this) {
            if (t.mo16182c() == null) {
                z = false;
            } else {
                m22923h(t.getIndex());
                z = true;
            }
        }
        return z;
    }

    @NotNull
    /* renamed from: h */
    public final T m22923h(int i) {
        T[] tArr = this.f92127a;
        Intrinsics.m17074g(tArr);
        m22921j(m22928c() - 1);
        if (i < m22928c()) {
            m22918m(i, m22928c());
            int i2 = (i - 1) / 2;
            if (i > 0) {
                T t = tArr[i];
                Intrinsics.m17074g(t);
                T t2 = tArr[i2];
                Intrinsics.m17074g(t2);
                if (((Comparable) t).compareTo(t2) < 0) {
                    m22918m(i, i2);
                    m22919l(i2);
                }
            }
            m22920k(i);
        }
        T t3 = tArr[m22928c()];
        Intrinsics.m17074g(t3);
        t3.mo16181d(null);
        t3.setIndex(-1);
        tArr[m22928c()] = null;
        return t3;
    }

    @Nullable
    /* renamed from: i */
    public final T m22922i() {
        T t;
        synchronized (this) {
            if (m22928c() > 0) {
                t = m22923h(0);
            } else {
                t = null;
            }
        }
        return t;
    }
}
