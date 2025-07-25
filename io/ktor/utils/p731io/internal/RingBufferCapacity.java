package io.ktor.utils.p731io.internal;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p804nd.ExceptionsH;

@Metadata
/* renamed from: io.ktor.utils.io.internal.i */
/* loaded from: classes9.dex */
public final class RingBufferCapacity {

    /* renamed from: b */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f98238b = AtomicIntegerFieldUpdater.newUpdater(RingBufferCapacity.class, "_availableForRead$internal");

    /* renamed from: c */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f98239c = AtomicIntegerFieldUpdater.newUpdater(RingBufferCapacity.class, "_availableForWrite$internal");

    /* renamed from: d */
    static final /* synthetic */ AtomicIntegerFieldUpdater f98240d = AtomicIntegerFieldUpdater.newUpdater(RingBufferCapacity.class, "_pendingToFlush");
    @NotNull
    public volatile /* synthetic */ int _availableForWrite$internal;

    /* renamed from: a */
    private final int f98241a;
    @NotNull
    public volatile /* synthetic */ int _availableForRead$internal = 0;
    @NotNull
    volatile /* synthetic */ int _pendingToFlush = 0;

    public RingBufferCapacity(int i) {
        this.f98241a = i;
        this._availableForWrite$internal = i;
    }

    /* renamed from: b */
    private final Void m18768b(int i, int i2, int i3) {
        throw new IllegalArgumentException("Completed read overflow: " + i + " + " + i3 + " = " + i2 + " > " + this.f98241a);
    }

    /* renamed from: d */
    private final Void m18766d(int i, int i2) {
        throw new IllegalArgumentException("Complete write overflow: " + i + " + " + i2 + " > " + this.f98241a);
    }

    /* renamed from: a */
    public final void m18769a(int i) {
        int i2;
        int i3;
        do {
            i2 = this._availableForWrite$internal;
            i3 = i2 + i;
            if (i3 > this.f98241a) {
                m18768b(i2, i3, i);
                throw new ExceptionsH();
            }
        } while (!f98239c.compareAndSet(this, i2, i3));
    }

    /* renamed from: c */
    public final void m18767c(int i) {
        int i2;
        int i3;
        do {
            i2 = this._pendingToFlush;
            i3 = i2 + i;
            if (i3 > this.f98241a) {
                m18766d(i2, i);
                throw new ExceptionsH();
            }
        } while (!f98240d.compareAndSet(this, i2, i3));
    }

    /* renamed from: e */
    public final boolean m18765e() {
        int andSet = f98240d.getAndSet(this, 0);
        if (andSet == 0) {
            if (this._availableForRead$internal <= 0) {
                return false;
            }
            return true;
        } else if (f98238b.addAndGet(this, andSet) <= 0) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: f */
    public final void m18764f() {
        f98239c.getAndSet(this, 0);
    }

    /* renamed from: g */
    public final boolean m18763g() {
        if (this._availableForWrite$internal == this.f98241a) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public final boolean m18762h() {
        if (this._availableForWrite$internal == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public final void m18761i() {
        this._availableForRead$internal = this.f98241a;
        this._availableForWrite$internal = 0;
        this._pendingToFlush = 0;
    }

    /* renamed from: j */
    public final void m18760j() {
        this._availableForRead$internal = 0;
        this._pendingToFlush = 0;
        this._availableForWrite$internal = this.f98241a;
    }

    /* renamed from: k */
    public final boolean m18759k() {
        int i;
        do {
            i = this._availableForWrite$internal;
            if (this._pendingToFlush > 0 || this._availableForRead$internal > 0 || i != this.f98241a) {
                return false;
            }
        } while (!f98239c.compareAndSet(this, i, 0));
        return true;
    }

    /* renamed from: l */
    public final int m18758l(int i) {
        int i2;
        int min;
        do {
            i2 = this._availableForRead$internal;
            min = Math.min(i, i2);
            if (min == 0) {
                return 0;
            }
        } while (!f98238b.compareAndSet(this, i2, i2 - min));
        return Math.min(i, i2);
    }

    /* renamed from: m */
    public final boolean m18757m(int i) {
        int i2;
        do {
            i2 = this._availableForRead$internal;
            if (i2 < i) {
                return false;
            }
        } while (!f98238b.compareAndSet(this, i2, i2 - i));
        return true;
    }

    /* renamed from: n */
    public final int m18756n(int i) {
        int i2;
        int min;
        do {
            i2 = this._availableForWrite$internal;
            min = Math.min(i, i2);
            if (min == 0) {
                return 0;
            }
        } while (!f98239c.compareAndSet(this, i2, i2 - min));
        return Math.min(i, i2);
    }

    @NotNull
    public String toString() {
        return "RingBufferCapacity[read: " + this._availableForRead$internal + ", write: " + this._availableForWrite$internal + ", flush: " + this._pendingToFlush + ", capacity: " + this.f98241a + ']';
    }
}
