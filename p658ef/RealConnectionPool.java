package p658ef;

import af.Util;
import java.lang.ref.Reference;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p1077ze.Address;
import p1077ze.Route;
import p643df.AbstractC32871a;
import p643df.C32872d;
import p643df.TaskRunner;
import p658ef.C33060e;
import p747jf.C37357h;

@Metadata
/* renamed from: ef.g */
/* loaded from: classes10.dex */
public final class RealConnectionPool {
    @NotNull

    /* renamed from: f */
    public static final C33068a f90215f = new C33068a(null);

    /* renamed from: a */
    private final int f90216a;

    /* renamed from: b */
    private final long f90217b;
    @NotNull

    /* renamed from: c */
    private final C32872d f90218c;
    @NotNull

    /* renamed from: d */
    private final C33069b f90219d;
    @NotNull

    /* renamed from: e */
    private final ConcurrentLinkedQueue<RealConnection> f90220e;

    /* compiled from: RealConnectionPool.kt */
    @Metadata
    /* renamed from: ef.g$a */
    /* loaded from: classes10.dex */
    public static final class C33068a {
        private C33068a() {
        }

        public /* synthetic */ C33068a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: RealConnectionPool.kt */
    @Metadata
    /* renamed from: ef.g$b */
    /* loaded from: classes10.dex */
    public static final class C33069b extends AbstractC32871a {
        C33069b(String str) {
            super(str, false, 2, null);
        }

        @Override // p643df.AbstractC32871a
        /* renamed from: f */
        public long mo23439f() {
            return RealConnectionPool.this.m25056b(System.nanoTime());
        }
    }

    public RealConnectionPool(@NotNull TaskRunner taskRunner, int i, long j, @NotNull TimeUnit timeUnit) {
        boolean z;
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        this.f90216a = i;
        this.f90217b = timeUnit.toNanos(j);
        this.f90218c = taskRunner.m25625i();
        this.f90219d = new C33069b(Intrinsics.m17064q(Util.f171i, " ConnectionPool"));
        this.f90220e = new ConcurrentLinkedQueue<>();
        if (j > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return;
        }
        throw new IllegalArgumentException(Intrinsics.m17064q("keepAliveDuration <= 0: ", Long.valueOf(j)).toString());
    }

    /* renamed from: d */
    private final int m25054d(RealConnection realConnection, long j) {
        if (Util.f170h && !Thread.holdsLock(realConnection)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST hold lock on " + realConnection);
        }
        List<Reference<C33060e>> m25072n = realConnection.m25072n();
        int i = 0;
        while (i < m25072n.size()) {
            Reference<C33060e> reference = m25072n.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                C37357h.f98616a.m18318g().mo18328n("A connection to " + realConnection.m25060z().m338a().m496l() + " was leaked. Did you forget to close a response body?", ((C33060e.C33062b) reference).m25090a());
                m25072n.remove(i);
                realConnection.m25087C(true);
                if (m25072n.isEmpty()) {
                    realConnection.m25088B(j - this.f90217b);
                    return 0;
                }
            }
        }
        return m25072n.size();
    }

    /* renamed from: a */
    public final boolean m25057a(@NotNull Address address, @NotNull C33060e call, @Nullable List<Route> list, boolean z) {
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(call, "call");
        Iterator<RealConnection> it = this.f90220e.iterator();
        while (it.hasNext()) {
            RealConnection connection = it.next();
            Intrinsics.checkNotNullExpressionValue(connection, "connection");
            synchronized (connection) {
                if (z) {
                    if (!connection.m25064v()) {
                        Unit unit = Unit.f99208a;
                    }
                }
                if (connection.m25066t(address, list)) {
                    call.m25118d(connection);
                    return true;
                }
                Unit unit2 = Unit.f99208a;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final long m25056b(long j) {
        Iterator<RealConnection> it = this.f90220e.iterator();
        int i = 0;
        long j2 = Long.MIN_VALUE;
        RealConnection realConnection = null;
        int i2 = 0;
        while (it.hasNext()) {
            RealConnection connection = it.next();
            Intrinsics.checkNotNullExpressionValue(connection, "connection");
            synchronized (connection) {
                if (m25054d(connection, j) > 0) {
                    i2++;
                } else {
                    i++;
                    long m25071o = j - connection.m25071o();
                    if (m25071o > j2) {
                        realConnection = connection;
                        j2 = m25071o;
                    }
                    Unit unit = Unit.f99208a;
                }
            }
        }
        long j3 = this.f90217b;
        if (j2 < j3 && i <= this.f90216a) {
            if (i > 0) {
                return j3 - j2;
            }
            if (i2 > 0) {
                return j3;
            }
            return -1L;
        }
        Intrinsics.m17074g(realConnection);
        synchronized (realConnection) {
            if (!realConnection.m25072n().isEmpty()) {
                return 0L;
            }
            if (realConnection.m25071o() + j2 != j) {
                return 0L;
            }
            realConnection.m25087C(true);
            this.f90220e.remove(realConnection);
            Util.m105725n(realConnection.socket());
            if (this.f90220e.isEmpty()) {
                this.f90218c.m25648a();
            }
            return 0L;
        }
    }

    /* renamed from: c */
    public final boolean m25055c(@NotNull RealConnection connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        if (Util.f170h && !Thread.holdsLock(connection)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST hold lock on " + connection);
        } else if (!connection.m25070p() && this.f90216a != 0) {
            C32872d.m25639j(this.f90218c, this.f90219d, 0L, 2, null);
            return false;
        } else {
            connection.m25087C(true);
            this.f90220e.remove(connection);
            if (this.f90220e.isEmpty()) {
                this.f90218c.m25648a();
            }
            return true;
        }
    }

    /* renamed from: e */
    public final void m25053e(@NotNull RealConnection connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        if (Util.f170h && !Thread.holdsLock(connection)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST hold lock on " + connection);
        }
        this.f90220e.add(connection);
        C32872d.m25639j(this.f90218c, this.f90219d, 0L, 2, null);
    }
}
