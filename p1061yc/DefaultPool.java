package p1061yc;

import com.google.common.util.concurrent.C17170p;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p1061yc.InterfaceC45101f;

@Metadata
/* renamed from: yc.c */
/* loaded from: classes9.dex */
public abstract class DefaultPool<T> implements InterfaceC45101f<T> {
    @NotNull

    /* renamed from: h */
    public static final C45099b f118614h = new C45099b(null);
    @NotNull

    /* renamed from: i */
    private static final AtomicLongFieldUpdater<DefaultPool<?>> f118615i;

    /* renamed from: b */
    private final int f118616b;

    /* renamed from: c */
    private final int f118617c;

    /* renamed from: d */
    private final int f118618d;
    @NotNull

    /* renamed from: f */
    private final AtomicReferenceArray<T> f118619f;
    @NotNull

    /* renamed from: g */
    private final int[] f118620g;
    private volatile long top;

    /* compiled from: DefaultPool.kt */
    @Metadata
    /* renamed from: yc.c$b */
    /* loaded from: classes9.dex */
    public static final class C45099b {
        private C45099b() {
        }

        public /* synthetic */ C45099b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        AtomicLongFieldUpdater<DefaultPool<?>> newUpdater = AtomicLongFieldUpdater.newUpdater(DefaultPool.class, new MutablePropertyReference1Impl() { // from class: yc.c.a
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty1
            @Nullable
            public Object get(@Nullable Object obj) {
                return Long.valueOf(((DefaultPool) obj).top);
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KMutableProperty1
            public void set(@Nullable Object obj, @Nullable Object obj2) {
                ((DefaultPool) obj).top = ((Number) obj2).longValue();
            }
        }.getName());
        Intrinsics.checkNotNullExpressionValue(newUpdater, "newUpdater(Owner::class.java, p.name)");
        f118615i = newUpdater;
    }

    public DefaultPool(int i) {
        boolean z;
        this.f118616b = i;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (i <= 536870911) {
                int highestOneBit = Integer.highestOneBit((i * 4) - 1) * 2;
                this.f118617c = highestOneBit;
                this.f118618d = Integer.numberOfLeadingZeros(highestOneBit) + 1;
                this.f118619f = new AtomicReferenceArray<>(highestOneBit + 1);
                this.f118620g = new int[highestOneBit + 1];
                return;
            }
            throw new IllegalArgumentException(("capacity should be less or equal to 536870911 but it is " + i).toString());
        }
        throw new IllegalArgumentException(("capacity should be positive but it is " + i).toString());
    }

    /* renamed from: h */
    private final int m926h() {
        long j;
        long j2;
        int i;
        do {
            j = this.top;
            if (j == 0) {
                return 0;
            }
            j2 = ((j >> 32) & 4294967295L) + 1;
            i = (int) (4294967295L & j);
            if (i == 0) {
                return 0;
            }
        } while (!f118615i.compareAndSet(this, j, (j2 << 32) | this.f118620g[i]));
        return i;
    }

    /* renamed from: k */
    private final void m925k(int i) {
        boolean z;
        long j;
        long j2;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            do {
                j = this.top;
                j2 = i | ((((j >> 32) & 4294967295L) + 1) << 32);
                this.f118620g[i] = (int) (4294967295L & j);
            } while (!f118615i.compareAndSet(this, j, j2));
            return;
        }
        throw new IllegalArgumentException("index should be positive".toString());
    }

    /* renamed from: l */
    private final T m924l() {
        int m926h = m926h();
        if (m926h == 0) {
            return null;
        }
        return this.f118619f.getAndSet(m926h, null);
    }

    /* renamed from: m */
    private final boolean m923m(T t) {
        int identityHashCode = ((System.identityHashCode(t) * (-1640531527)) >>> this.f118618d) + 1;
        for (int i = 0; i < 8; i++) {
            if (C17170p.m67426a(this.f118619f, identityHashCode, null, t)) {
                m925k(identityHashCode);
                return true;
            }
            identityHashCode--;
            if (identityHashCode == 0) {
                identityHashCode = this.f118617c;
            }
        }
        return false;
    }

    @Override // p1061yc.InterfaceC45101f
    @NotNull
    /* renamed from: L */
    public final T mo916L() {
        T mo922e;
        T m924l = m924l();
        if (m924l == null || (mo922e = mo922e(m924l)) == null) {
            return mo921i();
        }
        return mo922e;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        InterfaceC45101f.C45102a.m914a(this);
    }

    @Override // p1061yc.InterfaceC45101f
    public final void dispose() {
        while (true) {
            T m924l = m924l();
            if (m924l == null) {
                return;
            }
            mo927f(m924l);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @NotNull
    /* renamed from: e */
    public T mo922e(@NotNull T instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        return instance;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: f */
    public void mo927f(@NotNull T instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
    }

    @NotNull
    /* renamed from: i */
    protected abstract T mo921i();

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: n */
    public void mo920n(@NotNull T instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
    }

    @Override // p1061yc.InterfaceC45101f
    /* renamed from: p */
    public final void mo915p(@NotNull T instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        mo920n(instance);
        if (!m923m(instance)) {
            mo927f(instance);
        }
    }
}
