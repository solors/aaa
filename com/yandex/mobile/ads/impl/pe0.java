package com.yandex.mobile.ads.impl;

import com.ironsource.C21114v8;
import com.yandex.mobile.ads.impl.ve0;
import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.C37607l0;
import kotlin.jvm.internal.C37609n0;
import kotlin.jvm.internal.Intrinsics;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.C39200e;
import okio.C39208h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class pe0 implements Closeable {
    @NotNull

    /* renamed from: D */
    private static final jt1 f83866D;
    @NotNull

    /* renamed from: A */
    private final xe0 f83867A;
    @NotNull

    /* renamed from: B */
    private final C31114c f83868B;
    @NotNull

    /* renamed from: C */
    private final LinkedHashSet f83869C;

    /* renamed from: b */
    private final boolean f83870b;
    @NotNull

    /* renamed from: c */
    private final AbstractC31112b f83871c;
    @NotNull

    /* renamed from: d */
    private final LinkedHashMap f83872d;
    @NotNull

    /* renamed from: e */
    private final String f83873e;

    /* renamed from: f */
    private int f83874f;

    /* renamed from: g */
    private int f83875g;

    /* renamed from: h */
    private boolean f83876h;
    @NotNull

    /* renamed from: i */
    private final mz1 f83877i;
    @NotNull

    /* renamed from: j */
    private final lz1 f83878j;
    @NotNull

    /* renamed from: k */
    private final lz1 f83879k;
    @NotNull

    /* renamed from: l */
    private final lz1 f83880l;
    @NotNull

    /* renamed from: m */
    private final xi1 f83881m;

    /* renamed from: n */
    private long f83882n;

    /* renamed from: o */
    private long f83883o;

    /* renamed from: p */
    private long f83884p;

    /* renamed from: q */
    private long f83885q;

    /* renamed from: r */
    private long f83886r;

    /* renamed from: s */
    private long f83887s;
    @NotNull

    /* renamed from: t */
    private final jt1 f83888t;
    @NotNull

    /* renamed from: u */
    private jt1 f83889u;

    /* renamed from: v */
    private long f83890v;

    /* renamed from: w */
    private long f83891w;

    /* renamed from: x */
    private long f83892x;

    /* renamed from: y */
    private long f83893y;
    @NotNull

    /* renamed from: z */
    private final Socket f83894z;

    /* renamed from: com.yandex.mobile.ads.impl.pe0$a */
    /* loaded from: classes8.dex */
    public static final class C31111a {

        /* renamed from: a */
        private boolean f83895a;
        @NotNull

        /* renamed from: b */
        private final mz1 f83896b;

        /* renamed from: c */
        public Socket f83897c;

        /* renamed from: d */
        public String f83898d;

        /* renamed from: e */
        public BufferedSource f83899e;

        /* renamed from: f */
        public BufferedSink f83900f;
        @NotNull

        /* renamed from: g */
        private AbstractC31112b f83901g;
        @NotNull

        /* renamed from: h */
        private xi1 f83902h;

        /* renamed from: i */
        private int f83903i;

        public C31111a(@NotNull mz1 taskRunner) {
            Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
            this.f83895a = true;
            this.f83896b = taskRunner;
            this.f83901g = AbstractC31112b.f83904a;
            this.f83902h = xi1.f87707a;
        }

        /* renamed from: a */
        public final boolean m30699a() {
            return this.f83895a;
        }

        @NotNull
        /* renamed from: b */
        public final String m30696b() {
            String str = this.f83898d;
            if (str != null) {
                return str;
            }
            Intrinsics.m17056y("connectionName");
            return null;
        }

        @NotNull
        /* renamed from: c */
        public final AbstractC31112b m30695c() {
            return this.f83901g;
        }

        /* renamed from: d */
        public final int m30694d() {
            return this.f83903i;
        }

        @NotNull
        /* renamed from: e */
        public final xi1 m30693e() {
            return this.f83902h;
        }

        @NotNull
        /* renamed from: f */
        public final BufferedSink m30692f() {
            BufferedSink bufferedSink = this.f83900f;
            if (bufferedSink != null) {
                return bufferedSink;
            }
            Intrinsics.m17056y("sink");
            return null;
        }

        @NotNull
        /* renamed from: g */
        public final Socket m30691g() {
            Socket socket = this.f83897c;
            if (socket != null) {
                return socket;
            }
            Intrinsics.m17056y("socket");
            return null;
        }

        @NotNull
        /* renamed from: h */
        public final BufferedSource m30690h() {
            BufferedSource bufferedSource = this.f83899e;
            if (bufferedSource != null) {
                return bufferedSource;
            }
            Intrinsics.m17056y("source");
            return null;
        }

        @NotNull
        /* renamed from: i */
        public final mz1 m30689i() {
            return this.f83896b;
        }

        @NotNull
        /* renamed from: j */
        public final C31111a m30688j() {
            this.f83903i = 0;
            return this;
        }

        @NotNull
        /* renamed from: a */
        public final C31111a m30698a(@NotNull AbstractC31112b listener) {
            Intrinsics.checkNotNullParameter(listener, "listener");
            this.f83901g = listener;
            return this;
        }

        @NotNull
        /* renamed from: a */
        public final C31111a m30697a(@NotNull Socket socket, @NotNull String peerName, @NotNull BufferedSource source, @NotNull BufferedSink sink) throws IOException {
            String str;
            Intrinsics.checkNotNullParameter(socket, "socket");
            Intrinsics.checkNotNullParameter(peerName, "peerName");
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(sink, "sink");
            Intrinsics.checkNotNullParameter(socket, "<set-?>");
            this.f83897c = socket;
            if (this.f83895a) {
                str = z32.f88703g + " " + peerName;
            } else {
                str = "MockWebServer " + peerName;
            }
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.f83898d = str;
            Intrinsics.checkNotNullParameter(source, "<set-?>");
            this.f83899e = source;
            Intrinsics.checkNotNullParameter(sink, "<set-?>");
            this.f83900f = sink;
            return this;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.pe0$b */
    /* loaded from: classes8.dex */
    public static abstract class AbstractC31112b {
        @NotNull

        /* renamed from: a */
        public static final C31113a f83904a = new C31113a();

        /* renamed from: com.yandex.mobile.ads.impl.pe0$b$a */
        /* loaded from: classes8.dex */
        public static final class C31113a extends AbstractC31112b {
            C31113a() {
            }

            @Override // com.yandex.mobile.ads.impl.pe0.AbstractC31112b
            /* renamed from: a */
            public final void mo30019a(@NotNull we0 stream) throws IOException {
                Intrinsics.checkNotNullParameter(stream, "stream");
                stream.m27962a(k30.f81257h, (IOException) null);
            }
        }

        /* renamed from: a */
        public void mo30022a(@NotNull pe0 connection, @NotNull jt1 settings) {
            Intrinsics.checkNotNullParameter(connection, "connection");
            Intrinsics.checkNotNullParameter(settings, "settings");
        }

        /* renamed from: a */
        public abstract void mo30019a(@NotNull we0 we0Var) throws IOException;
    }

    /* renamed from: com.yandex.mobile.ads.impl.pe0$d */
    /* loaded from: classes8.dex */
    public static final class C31116d extends iz1 {

        /* renamed from: e */
        final /* synthetic */ pe0 f83909e;

        /* renamed from: f */
        final /* synthetic */ int f83910f;

        /* renamed from: g */
        final /* synthetic */ List f83911g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C31116d(String str, pe0 pe0Var, int i, List list, boolean z) {
            super(str, true);
            this.f83909e = pe0Var;
            this.f83910f = i;
            this.f83911g = list;
        }

        @Override // com.yandex.mobile.ads.impl.iz1
        /* renamed from: e */
        public final long mo29204e() {
            xi1 xi1Var = this.f83909e.f83881m;
            List responseHeaders = this.f83911g;
            ((wi1) xi1Var).getClass();
            Intrinsics.checkNotNullParameter(responseHeaders, "responseHeaders");
            try {
                this.f83909e.m30703k().m27553a(this.f83910f, k30.f81258i);
                synchronized (this.f83909e) {
                    this.f83909e.f83869C.remove(Integer.valueOf(this.f83910f));
                }
                return -1L;
            } catch (IOException unused) {
                return -1L;
            }
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.pe0$e */
    /* loaded from: classes8.dex */
    public static final class C31117e extends iz1 {

        /* renamed from: e */
        final /* synthetic */ pe0 f83912e;

        /* renamed from: f */
        final /* synthetic */ int f83913f;

        /* renamed from: g */
        final /* synthetic */ List f83914g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C31117e(String str, pe0 pe0Var, int i, List list) {
            super(str, true);
            this.f83912e = pe0Var;
            this.f83913f = i;
            this.f83914g = list;
        }

        @Override // com.yandex.mobile.ads.impl.iz1
        /* renamed from: e */
        public final long mo29204e() {
            xi1 xi1Var = this.f83912e.f83881m;
            List requestHeaders = this.f83914g;
            ((wi1) xi1Var).getClass();
            Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
            try {
                this.f83912e.m30703k().m27553a(this.f83913f, k30.f81258i);
                synchronized (this.f83912e) {
                    this.f83912e.f83869C.remove(Integer.valueOf(this.f83913f));
                }
                return -1L;
            } catch (IOException unused) {
                return -1L;
            }
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.pe0$f */
    /* loaded from: classes8.dex */
    public static final class C31118f extends iz1 {

        /* renamed from: e */
        final /* synthetic */ pe0 f83915e;

        /* renamed from: f */
        final /* synthetic */ int f83916f;

        /* renamed from: g */
        final /* synthetic */ k30 f83917g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C31118f(String str, pe0 pe0Var, int i, k30 k30Var) {
            super(str, true);
            this.f83915e = pe0Var;
            this.f83916f = i;
            this.f83917g = k30Var;
        }

        @Override // com.yandex.mobile.ads.impl.iz1
        /* renamed from: e */
        public final long mo29204e() {
            xi1 xi1Var = this.f83915e.f83881m;
            k30 errorCode = this.f83917g;
            ((wi1) xi1Var).getClass();
            Intrinsics.checkNotNullParameter(errorCode, "errorCode");
            synchronized (this.f83915e) {
                this.f83915e.f83869C.remove(Integer.valueOf(this.f83916f));
                Unit unit = Unit.f99208a;
            }
            return -1L;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.pe0$g */
    /* loaded from: classes8.dex */
    public static final class C31119g extends iz1 {

        /* renamed from: e */
        final /* synthetic */ pe0 f83918e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C31119g(String str, pe0 pe0Var) {
            super(str, true);
            this.f83918e = pe0Var;
        }

        @Override // com.yandex.mobile.ads.impl.iz1
        /* renamed from: e */
        public final long mo29204e() {
            this.f83918e.m30745a(2, 0, false);
            return -1L;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.pe0$h */
    /* loaded from: classes8.dex */
    public static final class C31120h extends iz1 {

        /* renamed from: e */
        final /* synthetic */ pe0 f83919e;

        /* renamed from: f */
        final /* synthetic */ long f83920f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C31120h(String str, pe0 pe0Var, long j) {
            super(str);
            this.f83919e = pe0Var;
            this.f83920f = j;
        }

        @Override // com.yandex.mobile.ads.impl.iz1
        /* renamed from: e */
        public final long mo29204e() {
            boolean z;
            synchronized (this.f83919e) {
                if (this.f83919e.f83883o >= this.f83919e.f83882n) {
                    this.f83919e.f83882n++;
                    z = false;
                } else {
                    z = true;
                }
            }
            if (z) {
                pe0.m30733a(this.f83919e, (IOException) null);
                return -1L;
            }
            this.f83919e.m30745a(1, 0, false);
            return this.f83920f;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.pe0$i */
    /* loaded from: classes8.dex */
    public static final class C31121i extends iz1 {

        /* renamed from: e */
        final /* synthetic */ pe0 f83921e;

        /* renamed from: f */
        final /* synthetic */ int f83922f;

        /* renamed from: g */
        final /* synthetic */ k30 f83923g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C31121i(String str, pe0 pe0Var, int i, k30 k30Var) {
            super(str, true);
            this.f83921e = pe0Var;
            this.f83922f = i;
            this.f83923g = k30Var;
        }

        @Override // com.yandex.mobile.ads.impl.iz1
        /* renamed from: e */
        public final long mo29204e() {
            try {
                this.f83921e.m30729b(this.f83922f, this.f83923g);
                return -1L;
            } catch (IOException e) {
                pe0.m30733a(this.f83921e, e);
                return -1L;
            }
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.pe0$j */
    /* loaded from: classes8.dex */
    public static final class C31122j extends iz1 {

        /* renamed from: e */
        final /* synthetic */ pe0 f83924e;

        /* renamed from: f */
        final /* synthetic */ int f83925f;

        /* renamed from: g */
        final /* synthetic */ long f83926g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C31122j(String str, pe0 pe0Var, int i, long j) {
            super(str, true);
            this.f83924e = pe0Var;
            this.f83925f = i;
            this.f83926g = j;
        }

        @Override // com.yandex.mobile.ads.impl.iz1
        /* renamed from: e */
        public final long mo29204e() {
            try {
                this.f83924e.m30703k().m27554a(this.f83925f, this.f83926g);
                return -1L;
            } catch (IOException e) {
                pe0.m30733a(this.f83924e, e);
                return -1L;
            }
        }
    }

    static {
        jt1 jt1Var = new jt1();
        jt1Var.m32733a(7, 65535);
        jt1Var.m32733a(5, 16384);
        f83866D = jt1Var;
    }

    public pe0(@NotNull C31111a builder) {
        int i;
        Intrinsics.checkNotNullParameter(builder, "builder");
        boolean m30699a = builder.m30699a();
        this.f83870b = m30699a;
        this.f83871c = builder.m30695c();
        this.f83872d = new LinkedHashMap();
        String m30696b = builder.m30696b();
        this.f83873e = m30696b;
        if (builder.m30699a()) {
            i = 3;
        } else {
            i = 2;
        }
        this.f83875g = i;
        mz1 m30689i = builder.m30689i();
        this.f83877i = m30689i;
        lz1 m31726e = m30689i.m31726e();
        this.f83878j = m31726e;
        this.f83879k = m30689i.m31726e();
        this.f83880l = m30689i.m31726e();
        this.f83881m = builder.m30693e();
        jt1 jt1Var = new jt1();
        if (builder.m30699a()) {
            jt1Var.m32733a(7, 16777216);
        }
        this.f83888t = jt1Var;
        jt1 jt1Var2 = f83866D;
        this.f83889u = jt1Var2;
        this.f83893y = jt1Var2.m32731b();
        this.f83894z = builder.m30691g();
        this.f83867A = new xe0(builder.m30692f(), m30699a);
        this.f83868B = new C31114c(this, new ve0(builder.m30690h(), m30699a));
        this.f83869C = new LinkedHashSet();
        if (builder.m30694d() != 0) {
            long nanos = TimeUnit.MILLISECONDS.toNanos(builder.m30694d());
            m31726e.m32183a(new C31120h(m30696b + " ping", this, nanos), nanos);
        }
    }

    /* renamed from: a */
    public static final void m30733a(pe0 pe0Var, IOException iOException) {
        pe0Var.getClass();
        k30 k30Var = k30.f81254e;
        pe0Var.m30736a(k30Var, k30Var, iOException);
    }

    /* renamed from: b */
    public static boolean m30730b(int i) {
        return i != 0 && (i & 1) == 0;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        m30736a(k30.f81253d, k30.f81258i, (IOException) null);
    }

    public final void flush() throws IOException {
        this.f83867A.flush();
    }

    /* renamed from: l */
    public final void m30701l() {
        synchronized (this) {
            long j = this.f83885q;
            long j2 = this.f83884p;
            if (j < j2) {
                return;
            }
            this.f83884p = j2 + 1;
            this.f83887s = System.nanoTime() + 1000000000;
            Unit unit = Unit.f99208a;
            lz1 lz1Var = this.f83878j;
            String str = this.f83873e;
            lz1Var.m32183a(new C31119g(str + " ping", this), 0L);
        }
    }

    /* renamed from: f */
    public final int m30713f() {
        return this.f83875g;
    }

    @NotNull
    /* renamed from: g */
    public final jt1 m30711g() {
        return this.f83888t;
    }

    @NotNull
    /* renamed from: h */
    public final jt1 m30709h() {
        return this.f83889u;
    }

    @NotNull
    /* renamed from: i */
    public final LinkedHashMap m30707i() {
        return this.f83872d;
    }

    /* renamed from: j */
    public final long m30705j() {
        return this.f83893y;
    }

    @NotNull
    /* renamed from: k */
    public final xe0 m30703k() {
        return this.f83867A;
    }

    @NotNull
    /* renamed from: c */
    public final String m30725c() {
        return this.f83873e;
    }

    /* renamed from: d */
    public final int m30720d() {
        return this.f83874f;
    }

    @NotNull
    /* renamed from: e */
    public final AbstractC31112b m30716e() {
        return this.f83871c;
    }

    /* renamed from: b */
    public final boolean m30731b() {
        return this.f83870b;
    }

    @Nullable
    /* renamed from: c */
    public final synchronized we0 m30724c(int i) {
        we0 we0Var;
        we0Var = (we0) this.f83872d.remove(Integer.valueOf(i));
        Intrinsics.m17073h(this, "null cannot be cast to non-null type java.lang.Object");
        notifyAll();
        return we0Var;
    }

    /* renamed from: d */
    public final void m30719d(int i) {
        this.f83874f = i;
    }

    /* renamed from: a */
    public final void m30736a(@NotNull k30 connectionCode, @NotNull k30 streamCode, @Nullable IOException iOException) {
        int i;
        Object[] objArr;
        Intrinsics.checkNotNullParameter(connectionCode, "connectionCode");
        Intrinsics.checkNotNullParameter(streamCode, "streamCode");
        if (z32.f88702f && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        try {
            m30737a(connectionCode);
        } catch (IOException unused) {
        }
        synchronized (this) {
            if (!this.f83872d.isEmpty()) {
                objArr = this.f83872d.values().toArray(new we0[0]);
                this.f83872d.clear();
            } else {
                objArr = null;
            }
            Unit unit = Unit.f99208a;
        }
        we0[] we0VarArr = (we0[]) objArr;
        if (we0VarArr != null) {
            for (we0 we0Var : we0VarArr) {
                try {
                    we0Var.m27962a(streamCode, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.f83867A.close();
        } catch (IOException unused3) {
        }
        try {
            this.f83894z.close();
        } catch (IOException unused4) {
        }
        this.f83878j.m32172j();
        this.f83879k.m32172j();
        this.f83880l.m32172j();
    }

    /* renamed from: b */
    public final synchronized void m30728b(long j) {
        long j2 = this.f83890v + j;
        this.f83890v = j2;
        long j3 = j2 - this.f83891w;
        if (j3 >= this.f83888t.m32731b() / 2) {
            m30744a(0, j3);
            this.f83891w += j3;
        }
    }

    /* renamed from: c */
    public final void m30723c(int i, @NotNull k30 errorCode) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        lz1 lz1Var = this.f83878j;
        String str = this.f83873e;
        lz1Var.m32183a(new C31121i(str + C21114v8.C21123i.f54137d + i + "] writeSynReset", this, i, errorCode), 0L);
    }

    /* renamed from: l */
    public static void m30700l(pe0 pe0Var) throws IOException {
        mz1 taskRunner = mz1.f82495h;
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        pe0Var.f83867A.m27557a();
        pe0Var.f83867A.m27547b(pe0Var.f83888t);
        int m32731b = pe0Var.f83888t.m32731b();
        if (m32731b != 65535) {
            pe0Var.f83867A.m27554a(0, m32731b - 65535);
        }
        taskRunner.m31726e().m32183a(new kz1(pe0Var.f83873e, pe0Var.f83868B), 0L);
    }

    /* renamed from: b */
    public final void m30729b(int i, @NotNull k30 statusCode) throws IOException {
        Intrinsics.checkNotNullParameter(statusCode, "statusCode");
        this.f83867A.m27553a(i, statusCode);
    }

    @Nullable
    /* renamed from: a */
    public final synchronized we0 m30747a(int i) {
        return (we0) this.f83872d.get(Integer.valueOf(i));
    }

    /* renamed from: a */
    public final synchronized boolean m30739a(long j) {
        if (this.f83876h) {
            return false;
        }
        if (this.f83885q < this.f83884p) {
            if (j >= this.f83887s) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x004c A[Catch: all -> 0x006c, TryCatch #1 {, blocks: (B:42:0x000b, B:61:0x0057, B:62:0x0058, B:43:0x000c, B:45:0x0013, B:46:0x0018, B:48:0x001c, B:50:0x002e, B:52:0x0036, B:57:0x0046, B:59:0x004c, B:60:0x0055, B:67:0x0066, B:68:0x006b), top: B:75:0x000b }] */
    @org.jetbrains.annotations.NotNull
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.yandex.mobile.ads.impl.we0 m30732a(@org.jetbrains.annotations.NotNull java.util.ArrayList r11, boolean r12) throws java.io.IOException {
        /*
            r10 = this;
            java.lang.String r0 = "requestHeaders"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            r0 = r12 ^ 1
            r5 = 0
            com.yandex.mobile.ads.impl.xe0 r7 = r10.f83867A
            monitor-enter(r7)
            monitor-enter(r10)     // Catch: java.lang.Throwable -> L6f
            int r1 = r10.f83875g     // Catch: java.lang.Throwable -> L6c
            r2 = 1073741823(0x3fffffff, float:1.9999999)
            if (r1 <= r2) goto L18
            com.yandex.mobile.ads.impl.k30 r1 = com.yandex.mobile.ads.impl.k30.f81257h     // Catch: java.lang.Throwable -> L6c
            r10.m30737a(r1)     // Catch: java.lang.Throwable -> L6c
        L18:
            boolean r1 = r10.f83876h     // Catch: java.lang.Throwable -> L6c
            if (r1 != 0) goto L66
            int r8 = r10.f83875g     // Catch: java.lang.Throwable -> L6c
            int r1 = r8 + 2
            r10.f83875g = r1     // Catch: java.lang.Throwable -> L6c
            com.yandex.mobile.ads.impl.we0 r9 = new com.yandex.mobile.ads.impl.we0     // Catch: java.lang.Throwable -> L6c
            r6 = 0
            r1 = r9
            r2 = r8
            r3 = r10
            r4 = r0
            r1.<init>(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L6c
            if (r12 == 0) goto L45
            long r1 = r10.f83892x     // Catch: java.lang.Throwable -> L6c
            long r3 = r10.f83893y     // Catch: java.lang.Throwable -> L6c
            int r12 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r12 >= 0) goto L45
            long r1 = r9.m27942n()     // Catch: java.lang.Throwable -> L6c
            long r3 = r9.m27943m()     // Catch: java.lang.Throwable -> L6c
            int r12 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r12 < 0) goto L43
            goto L45
        L43:
            r12 = 0
            goto L46
        L45:
            r12 = 1
        L46:
            boolean r1 = r9.m27939q()     // Catch: java.lang.Throwable -> L6c
            if (r1 == 0) goto L55
            java.util.LinkedHashMap r1 = r10.f83872d     // Catch: java.lang.Throwable -> L6c
            java.lang.Integer r2 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> L6c
            r1.put(r2, r9)     // Catch: java.lang.Throwable -> L6c
        L55:
            kotlin.Unit r1 = kotlin.Unit.f99208a     // Catch: java.lang.Throwable -> L6c
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L6f
            com.yandex.mobile.ads.impl.xe0 r1 = r10.f83867A     // Catch: java.lang.Throwable -> L6f
            r1.m27551a(r8, r11, r0)     // Catch: java.lang.Throwable -> L6f
            monitor-exit(r7)
            if (r12 == 0) goto L65
            com.yandex.mobile.ads.impl.xe0 r11 = r10.f83867A
            r11.flush()
        L65:
            return r9
        L66:
            com.yandex.mobile.ads.impl.iq r11 = new com.yandex.mobile.ads.impl.iq     // Catch: java.lang.Throwable -> L6c
            r11.<init>()     // Catch: java.lang.Throwable -> L6c
            throw r11     // Catch: java.lang.Throwable -> L6c
        L6c:
            r11 = move-exception
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L6f
            throw r11     // Catch: java.lang.Throwable -> L6f
        L6f:
            r11 = move-exception
            monitor-exit(r7)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.pe0.m30732a(java.util.ArrayList, boolean):com.yandex.mobile.ads.impl.we0");
    }

    /* renamed from: com.yandex.mobile.ads.impl.pe0$c */
    /* loaded from: classes8.dex */
    public final class C31114c implements ve0.InterfaceC31650c, Functions<Unit> {
        @NotNull

        /* renamed from: b */
        private final ve0 f83905b;

        /* renamed from: c */
        final /* synthetic */ pe0 f83906c;

        /* renamed from: com.yandex.mobile.ads.impl.pe0$c$a */
        /* loaded from: classes8.dex */
        public static final class C31115a extends iz1 {

            /* renamed from: e */
            final /* synthetic */ pe0 f83907e;

            /* renamed from: f */
            final /* synthetic */ C37609n0 f83908f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C31115a(String str, pe0 pe0Var, C37609n0 c37609n0) {
                super(str, true);
                this.f83907e = pe0Var;
                this.f83908f = c37609n0;
            }

            @Override // com.yandex.mobile.ads.impl.iz1
            /* renamed from: e */
            public final long mo29204e() {
                this.f83907e.m30716e().mo30022a(this.f83907e, (jt1) this.f83908f.f99327b);
                return -1L;
            }
        }

        public C31114c(pe0 pe0Var, @NotNull ve0 reader) {
            Intrinsics.checkNotNullParameter(reader, "reader");
            this.f83906c = pe0Var;
            this.f83905b = reader;
        }

        /* JADX WARN: Type inference failed for: r12v1 */
        /* JADX WARN: Type inference failed for: r12v2, types: [com.yandex.mobile.ads.impl.jt1, T] */
        /* JADX WARN: Type inference failed for: r12v3 */
        /* renamed from: a */
        public final void m30687a(boolean z, @NotNull jt1 settings) {
            ?? r12;
            long m32731b;
            int i;
            we0[] we0VarArr;
            Intrinsics.checkNotNullParameter(settings, "settings");
            C37609n0 c37609n0 = new C37609n0();
            xe0 m30703k = this.f83906c.m30703k();
            pe0 pe0Var = this.f83906c;
            synchronized (m30703k) {
                synchronized (pe0Var) {
                    jt1 m30709h = pe0Var.m30709h();
                    if (z) {
                        r12 = settings;
                    } else {
                        jt1 jt1Var = new jt1();
                        jt1Var.m32732a(m30709h);
                        jt1Var.m32732a(settings);
                        r12 = jt1Var;
                    }
                    c37609n0.f99327b = r12;
                    m32731b = r12.m32731b() - m30709h.m32731b();
                    if (m32731b != 0 && !pe0Var.m30707i().isEmpty()) {
                        we0VarArr = (we0[]) pe0Var.m30707i().values().toArray(new we0[0]);
                        pe0Var.m30738a((jt1) c37609n0.f99327b);
                        pe0Var.f83880l.m32183a(new C31115a(pe0Var.m30725c() + " onSettings", pe0Var, c37609n0), 0L);
                        Unit unit = Unit.f99208a;
                    }
                    we0VarArr = null;
                    pe0Var.m30738a((jt1) c37609n0.f99327b);
                    pe0Var.f83880l.m32183a(new C31115a(pe0Var.m30725c() + " onSettings", pe0Var, c37609n0), 0L);
                    Unit unit2 = Unit.f99208a;
                }
                try {
                    pe0Var.m30703k().m27550a((jt1) c37609n0.f99327b);
                } catch (IOException e) {
                    pe0.m30733a(pe0Var, e);
                }
                Unit unit3 = Unit.f99208a;
            }
            if (we0VarArr != null) {
                for (we0 we0Var : we0VarArr) {
                    synchronized (we0Var) {
                        we0Var.m27964a(m32731b);
                        Unit unit4 = Unit.f99208a;
                    }
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [com.yandex.mobile.ads.impl.k30] */
        /* JADX WARN: Type inference failed for: r0v3 */
        /* JADX WARN: Type inference failed for: r0v6, types: [kotlin.Unit] */
        @Override // kotlin.jvm.functions.Functions
        public final Unit invoke() {
            Throwable th;
            k30 k30Var;
            k30 k30Var2;
            k30 k30Var3 = k30.f81255f;
            IOException e = null;
            try {
                try {
                    this.f83905b.m28350a(this);
                    do {
                    } while (this.f83905b.m28347a(false, this));
                    k30Var2 = k30.f81253d;
                } catch (IOException e2) {
                    e = e2;
                } catch (Throwable th2) {
                    th = th2;
                    k30Var = k30Var3;
                    this.f83906c.m30736a(k30Var, k30Var3, e);
                    z32.m26419a(this.f83905b);
                    throw th;
                }
                try {
                    this.f83906c.m30736a(k30Var2, k30.f81258i, (IOException) null);
                    z32.m26419a(this.f83905b);
                    k30Var = k30Var2;
                } catch (IOException e3) {
                    e = e3;
                    k30 k30Var4 = k30.f81254e;
                    pe0 pe0Var = this.f83906c;
                    pe0Var.m30736a(k30Var4, k30Var4, e);
                    z32.m26419a(this.f83905b);
                    k30Var = pe0Var;
                    k30Var3 = Unit.f99208a;
                    return k30Var3;
                }
                k30Var3 = Unit.f99208a;
                return k30Var3;
            } catch (Throwable th3) {
                th = th3;
                this.f83906c.m30736a(k30Var, k30Var3, e);
                z32.m26419a(this.f83905b);
                throw th;
            }
        }

        @Override // com.yandex.mobile.ads.impl.ve0.InterfaceC31650c
        /* renamed from: a */
        public final void mo28333a(int i, int i2, @NotNull BufferedSource source, boolean z) throws IOException {
            Intrinsics.checkNotNullParameter(source, "source");
            this.f83906c.getClass();
            if (pe0.m30730b(i)) {
                this.f83906c.m30746a(i, i2, source, z);
                return;
            }
            we0 m30747a = this.f83906c.m30747a(i);
            if (m30747a == null) {
                this.f83906c.m30723c(i, k30.f81254e);
                long j = i2;
                this.f83906c.m30728b(j);
                source.skip(j);
                return;
            }
            m30747a.m27960a(source, i2);
            if (z) {
                m30747a.m27961a(z32.f88698b, true);
            }
        }

        @Override // com.yandex.mobile.ads.impl.ve0.InterfaceC31650c
        /* renamed from: a */
        public final void mo28329a(int i, @NotNull k30 errorCode, @NotNull C39208h debugData) {
            int i2;
            Object[] array;
            we0[] we0VarArr;
            Intrinsics.checkNotNullParameter(errorCode, "errorCode");
            Intrinsics.checkNotNullParameter(debugData, "debugData");
            debugData.m13569C();
            pe0 pe0Var = this.f83906c;
            synchronized (pe0Var) {
                array = pe0Var.m30707i().values().toArray(new we0[0]);
                pe0Var.f83876h = true;
                Unit unit = Unit.f99208a;
            }
            for (we0 we0Var : (we0[]) array) {
                if (we0Var.m27950f() > i && we0Var.m27940p()) {
                    we0Var.m27957b(k30.f81257h);
                    this.f83906c.m30724c(we0Var.m27950f());
                }
            }
        }

        @Override // com.yandex.mobile.ads.impl.ve0.InterfaceC31650c
        /* renamed from: a */
        public final void mo28326a(boolean z, int i, @NotNull List headerBlock) {
            Intrinsics.checkNotNullParameter(headerBlock, "headerBlock");
            this.f83906c.getClass();
            if (pe0.m30730b(i)) {
                this.f83906c.m30741a(i, headerBlock, z);
                return;
            }
            pe0 pe0Var = this.f83906c;
            synchronized (pe0Var) {
                we0 m30747a = pe0Var.m30747a(i);
                if (m30747a == null) {
                    if (pe0Var.f83876h) {
                        return;
                    }
                    if (i <= pe0Var.m30720d()) {
                        return;
                    }
                    if (i % 2 == pe0Var.m30713f() % 2) {
                        return;
                    }
                    we0 we0Var = new we0(i, pe0Var, false, z, z32.m26408a(headerBlock));
                    pe0Var.m30719d(i);
                    pe0Var.m30707i().put(Integer.valueOf(i), we0Var);
                    lz1 m31726e = pe0Var.f83877i.m31726e();
                    String m30725c = pe0Var.m30725c();
                    m31726e.m32183a(new qe0(m30725c + C21114v8.C21123i.f54137d + i + "] onStream", pe0Var, we0Var), 0L);
                    return;
                }
                Unit unit = Unit.f99208a;
                m30747a.m27961a(z32.m26408a(headerBlock), z);
            }
        }

        @Override // com.yandex.mobile.ads.impl.ve0.InterfaceC31650c
        /* renamed from: a */
        public final void mo28332a(int i, int i2, boolean z) {
            if (!z) {
                this.f83906c.f83878j.m32183a(new re0(this.f83906c.m30725c() + " ping", this.f83906c, i, i2), 0L);
                return;
            }
            pe0 pe0Var = this.f83906c;
            synchronized (pe0Var) {
                if (i == 1) {
                    pe0Var.f83883o++;
                } else if (i == 2) {
                    pe0Var.f83885q++;
                } else {
                    if (i == 3) {
                        pe0Var.f83886r++;
                        Intrinsics.m17073h(pe0Var, "null cannot be cast to non-null type java.lang.Object");
                        pe0Var.notifyAll();
                    }
                    Unit unit = Unit.f99208a;
                }
            }
        }

        @Override // com.yandex.mobile.ads.impl.ve0.InterfaceC31650c
        /* renamed from: a */
        public final void mo28328a(int i, @NotNull List requestHeaders) {
            Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
            this.f83906c.m30742a(i, requestHeaders);
        }

        @Override // com.yandex.mobile.ads.impl.ve0.InterfaceC31650c
        /* renamed from: a */
        public final void mo28330a(int i, @NotNull k30 errorCode) {
            Intrinsics.checkNotNullParameter(errorCode, "errorCode");
            this.f83906c.getClass();
            if (pe0.m30730b(i)) {
                this.f83906c.m30743a(i, errorCode);
                return;
            }
            we0 m30724c = this.f83906c.m30724c(i);
            if (m30724c != null) {
                m30724c.m27957b(errorCode);
            }
        }

        @Override // com.yandex.mobile.ads.impl.ve0.InterfaceC31650c
        /* renamed from: a */
        public final void mo28327a(@NotNull jt1 settings) {
            Intrinsics.checkNotNullParameter(settings, "settings");
            lz1 lz1Var = this.f83906c.f83878j;
            String m30725c = this.f83906c.m30725c();
            lz1Var.m32183a(new se0(m30725c + " applyAndAckSettings", this, settings), 0L);
        }

        @Override // com.yandex.mobile.ads.impl.ve0.InterfaceC31650c
        /* renamed from: a */
        public final void mo28331a(int i, long j) {
            if (i == 0) {
                pe0 pe0Var = this.f83906c;
                synchronized (pe0Var) {
                    pe0Var.f83893y = pe0Var.m30705j() + j;
                    Intrinsics.m17073h(pe0Var, "null cannot be cast to non-null type java.lang.Object");
                    pe0Var.notifyAll();
                    Unit unit = Unit.f99208a;
                }
                return;
            }
            we0 m30747a = this.f83906c.m30747a(i);
            if (m30747a != null) {
                synchronized (m30747a) {
                    m30747a.m27964a(j);
                    Unit unit2 = Unit.f99208a;
                }
            }
        }
    }

    /* renamed from: a */
    public final void m30746a(int i, int i2, @NotNull BufferedSource source, boolean z) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        C39200e c39200e = new C39200e();
        long j = i2;
        source.require(j);
        source.read(c39200e, j);
        this.f83879k.m32183a(new te0(this.f83873e + C21114v8.C21123i.f54137d + i + "] onData", this, i, c39200e, i2, z), 0L);
    }

    /* renamed from: a */
    public final void m30741a(int i, @NotNull List<uc0> requestHeaders, boolean z) {
        Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
        lz1 lz1Var = this.f83879k;
        String str = this.f83873e;
        lz1Var.m32183a(new C31116d(str + C21114v8.C21123i.f54137d + i + "] onHeaders", this, i, requestHeaders, z), 0L);
    }

    /* renamed from: a */
    public final void m30742a(int i, @NotNull List<uc0> requestHeaders) {
        Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
        synchronized (this) {
            if (this.f83869C.contains(Integer.valueOf(i))) {
                m30723c(i, k30.f81254e);
                return;
            }
            this.f83869C.add(Integer.valueOf(i));
            lz1 lz1Var = this.f83879k;
            String str = this.f83873e;
            lz1Var.m32183a(new C31117e(str + C21114v8.C21123i.f54137d + i + "] onRequest", this, i, requestHeaders), 0L);
        }
    }

    /* renamed from: a */
    public final void m30743a(int i, @NotNull k30 errorCode) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        lz1 lz1Var = this.f83879k;
        String str = this.f83873e;
        lz1Var.m32183a(new C31118f(str + C21114v8.C21123i.f54137d + i + "] onReset", this, i, errorCode), 0L);
    }

    /* renamed from: a */
    public final void m30738a(@NotNull jt1 jt1Var) {
        Intrinsics.checkNotNullParameter(jt1Var, "<set-?>");
        this.f83889u = jt1Var;
    }

    /* renamed from: a */
    public final void m30737a(@NotNull k30 statusCode) throws IOException {
        Intrinsics.checkNotNullParameter(statusCode, "statusCode");
        synchronized (this.f83867A) {
            C37607l0 c37607l0 = new C37607l0();
            synchronized (this) {
                if (this.f83876h) {
                    return;
                }
                this.f83876h = true;
                int i = this.f83874f;
                c37607l0.f99325b = i;
                Unit unit = Unit.f99208a;
                this.f83867A.m27552a(i, statusCode, z32.f88697a);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0036, code lost:
        throw new java.io.IOException("stream closed");
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0038, code lost:
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r6 - r4), r8.f83867A.m27548b());
        r6 = r2;
        r8.f83892x += r6;
        r4 = kotlin.Unit.f99208a;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m30740a(int r9, boolean r10, @org.jetbrains.annotations.Nullable okio.C39200e r11, long r12) throws java.io.IOException {
        /*
            r8 = this;
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            r3 = 0
            if (r2 != 0) goto Ld
            com.yandex.mobile.ads.impl.xe0 r12 = r8.f83867A
            r12.m27549a(r10, r9, r11, r3)
            return
        Ld:
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 <= 0) goto L71
            monitor-enter(r8)
        L12:
            long r4 = r8.f83892x     // Catch: java.lang.Throwable -> L60 java.lang.InterruptedException -> L62
            long r6 = r8.f83893y     // Catch: java.lang.Throwable -> L60 java.lang.InterruptedException -> L62
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 < 0) goto L37
            java.util.LinkedHashMap r2 = r8.f83872d     // Catch: java.lang.Throwable -> L60 java.lang.InterruptedException -> L62
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L60 java.lang.InterruptedException -> L62
            boolean r2 = r2.containsKey(r4)     // Catch: java.lang.Throwable -> L60 java.lang.InterruptedException -> L62
            if (r2 == 0) goto L2f
            java.lang.String r2 = "null cannot be cast to non-null type java.lang.Object"
            kotlin.jvm.internal.Intrinsics.m17073h(r8, r2)     // Catch: java.lang.Throwable -> L60 java.lang.InterruptedException -> L62
            r8.wait()     // Catch: java.lang.Throwable -> L60 java.lang.InterruptedException -> L62
            goto L12
        L2f:
            java.io.IOException r9 = new java.io.IOException     // Catch: java.lang.Throwable -> L60 java.lang.InterruptedException -> L62
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L60 java.lang.InterruptedException -> L62
            throw r9     // Catch: java.lang.Throwable -> L60 java.lang.InterruptedException -> L62
        L37:
            long r6 = r6 - r4
            long r4 = java.lang.Math.min(r12, r6)     // Catch: java.lang.Throwable -> L60
            int r2 = (int) r4     // Catch: java.lang.Throwable -> L60
            com.yandex.mobile.ads.impl.xe0 r4 = r8.f83867A     // Catch: java.lang.Throwable -> L60
            int r4 = r4.m27548b()     // Catch: java.lang.Throwable -> L60
            int r2 = java.lang.Math.min(r2, r4)     // Catch: java.lang.Throwable -> L60
            long r4 = r8.f83892x     // Catch: java.lang.Throwable -> L60
            long r6 = (long) r2     // Catch: java.lang.Throwable -> L60
            long r4 = r4 + r6
            r8.f83892x = r4     // Catch: java.lang.Throwable -> L60
            kotlin.Unit r4 = kotlin.Unit.f99208a     // Catch: java.lang.Throwable -> L60
            monitor-exit(r8)
            long r12 = r12 - r6
            com.yandex.mobile.ads.impl.xe0 r4 = r8.f83867A
            if (r10 == 0) goto L5b
            int r5 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r5 != 0) goto L5b
            r5 = 1
            goto L5c
        L5b:
            r5 = r3
        L5c:
            r4.m27549a(r5, r9, r11, r2)
            goto Ld
        L60:
            r9 = move-exception
            goto L6f
        L62:
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L60
            r9.interrupt()     // Catch: java.lang.Throwable -> L60
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L60
            r9.<init>()     // Catch: java.lang.Throwable -> L60
            throw r9     // Catch: java.lang.Throwable -> L60
        L6f:
            monitor-exit(r8)
            throw r9
        L71:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.pe0.m30740a(int, boolean, okio.e, long):void");
    }

    /* renamed from: a */
    public final void m30745a(int i, int i2, boolean z) {
        try {
            this.f83867A.m27555a(i, i2, z);
        } catch (IOException e) {
            k30 k30Var = k30.f81254e;
            m30736a(k30Var, k30Var, e);
        }
    }

    /* renamed from: a */
    public final void m30744a(int i, long j) {
        lz1 lz1Var = this.f83878j;
        String str = this.f83873e;
        lz1Var.m32183a(new C31122j(str + C21114v8.C21123i.f54137d + i + "] windowUpdate", this, i, j), 0L);
    }

    /* renamed from: a */
    public static final /* synthetic */ jt1 m30748a() {
        return f83866D;
    }
}
