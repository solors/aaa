package com.monetization.ads.exo.offline;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import androidx.annotation.Nullable;
import com.monetization.ads.exo.offline.C25572a;
import com.monetization.ads.exo.offline.InterfaceC25580d;
import com.monetization.ads.exo.scheduler.Requirements;
import com.yandex.mobile.ads.impl.C30278ey;
import com.yandex.mobile.ads.impl.a20;
import com.yandex.mobile.ads.impl.b20;
import com.yandex.mobile.ads.impl.c20;
import com.yandex.mobile.ads.impl.cf2;
import com.yandex.mobile.ads.impl.gq0;
import com.yandex.mobile.ads.impl.jm1;
import com.yandex.mobile.ads.impl.ud2;
import com.yandex.mobile.ads.impl.y32;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: com.monetization.ads.exo.offline.c */
/* loaded from: classes7.dex */
public final class C25575c {

    /* renamed from: h */
    public static final Requirements f66383h = new Requirements(1);

    /* renamed from: a */
    private final HandlerC25577b f66384a;

    /* renamed from: b */
    private final CopyOnWriteArraySet<InterfaceC25578c> f66385b;

    /* renamed from: c */
    private int f66386c;

    /* renamed from: d */
    private boolean f66387d;

    /* renamed from: e */
    private int f66388e;

    /* renamed from: f */
    private boolean f66389f;

    /* renamed from: g */
    private List<C25574b> f66390g;

    /* renamed from: com.monetization.ads.exo.offline.c$a */
    /* loaded from: classes7.dex */
    public static final class C25576a {

        /* renamed from: a */
        public final C25574b f66391a;

        /* renamed from: b */
        public final boolean f66392b;

        /* renamed from: c */
        public final List<C25574b> f66393c;

        public C25576a(C25574b c25574b, boolean z, ArrayList arrayList, @Nullable Exception exc) {
            this.f66391a = c25574b;
            this.f66392b = z;
            this.f66393c = arrayList;
        }
    }

    /* renamed from: com.monetization.ads.exo.offline.c$b */
    /* loaded from: classes7.dex */
    public static final class HandlerC25577b extends Handler {

        /* renamed from: a */
        private final HandlerThread f66394a;

        /* renamed from: b */
        private final cf2 f66395b;

        /* renamed from: c */
        private final c20 f66396c;

        /* renamed from: d */
        private final Handler f66397d;

        /* renamed from: e */
        private final ArrayList<C25574b> f66398e;

        /* renamed from: f */
        private final HashMap<String, C25579d> f66399f;

        /* renamed from: g */
        private int f66400g;

        /* renamed from: h */
        private boolean f66401h;

        /* renamed from: i */
        private int f66402i;

        /* renamed from: j */
        private int f66403j;

        /* renamed from: k */
        private int f66404k;

        public HandlerC25577b(HandlerThread handlerThread, C25572a c25572a, C30278ey c30278ey, Handler handler, boolean z) {
            super(handlerThread.getLooper());
            this.f66394a = handlerThread;
            this.f66395b = c25572a;
            this.f66396c = c30278ey;
            this.f66397d = handler;
            this.f66402i = 3;
            this.f66403j = 5;
            this.f66401h = z;
            this.f66398e = new ArrayList<>();
            this.f66399f = new HashMap<>();
        }

        /* renamed from: a */
        private void m44322a(C25574b c25574b, int i) {
            if (i == 0) {
                if (c25574b.f66376b == 1) {
                    m44321a(c25574b, 0, 0);
                }
            } else if (i != c25574b.f66380f) {
                int i2 = c25574b.f66376b;
                if (i2 == 0 || i2 == 2) {
                    i2 = 1;
                }
                m44323a(new C25574b(c25574b.f66375a, i2, c25574b.f66377c, System.currentTimeMillis(), c25574b.f66379e, i, 0, c25574b.f66382h));
            }
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int i;
            long j;
            int i2;
            int i3;
            int i4;
            int i5;
            a20 a20Var = null;
            r10 = 0;
            int i6 = 0;
            boolean z = false;
            switch (message.what) {
                case 0:
                    this.f66400g = message.arg1;
                    try {
                        ((C25572a) this.f66395b).m44343b();
                        a20Var = ((C25572a) this.f66395b).m44344a(0, 1, 2, 5, 7);
                    } catch (IOException e) {
                        gq0.m33797a("DownloadManager", "Failed to load index.", e);
                        this.f66398e.clear();
                    } finally {
                        y32.m27078a((Closeable) a20Var);
                    }
                    while (true) {
                        C25572a.C25573a c25573a = (C25572a.C25573a) a20Var;
                        if (c25573a.m44336a(c25573a.m44335b() + 1)) {
                            this.f66398e.add(((C25572a.C25573a) a20Var).m44337a());
                        } else {
                            this.f66397d.obtainMessage(0, new ArrayList(this.f66398e)).sendToTarget();
                            m44317b();
                            i6 = 1;
                            this.f66397d.obtainMessage(1, i6, this.f66399f.size()).sendToTarget();
                            return;
                        }
                    }
                case 1:
                    if (message.arg1 != 0) {
                        z = true;
                    }
                    this.f66401h = z;
                    m44317b();
                    i6 = 1;
                    this.f66397d.obtainMessage(1, i6, this.f66399f.size()).sendToTarget();
                    return;
                case 2:
                    this.f66400g = message.arg1;
                    m44317b();
                    i6 = 1;
                    this.f66397d.obtainMessage(1, i6, this.f66399f.size()).sendToTarget();
                    return;
                case 3:
                    String str = (String) message.obj;
                    int i7 = message.arg1;
                    if (str == null) {
                        for (int i8 = 0; i8 < this.f66398e.size(); i8++) {
                            m44322a(this.f66398e.get(i8), i7);
                        }
                        try {
                            ((C25572a) this.f66395b).m44352a(i7);
                        } catch (IOException e2) {
                            gq0.m33797a("DownloadManager", "Failed to set manual stop reason", e2);
                        }
                    } else {
                        C25574b m44318a = m44318a(str, false);
                        if (m44318a != null) {
                            m44322a(m44318a, i7);
                        } else {
                            try {
                                ((C25572a) this.f66395b).m44351a(i7, str);
                            } catch (IOException e3) {
                                gq0.m33797a("DownloadManager", "Failed to set manual stop reason: ".concat(str), e3);
                            }
                        }
                    }
                    m44317b();
                    i6 = 1;
                    this.f66397d.obtainMessage(1, i6, this.f66399f.size()).sendToTarget();
                    return;
                case 4:
                    this.f66402i = message.arg1;
                    m44317b();
                    i6 = 1;
                    this.f66397d.obtainMessage(1, i6, this.f66399f.size()).sendToTarget();
                    return;
                case 5:
                    this.f66403j = message.arg1;
                    i6 = 1;
                    this.f66397d.obtainMessage(1, i6, this.f66399f.size()).sendToTarget();
                    return;
                case 6:
                    DownloadRequest downloadRequest = (DownloadRequest) message.obj;
                    int i9 = message.arg1;
                    C25574b m44318a2 = m44318a(downloadRequest.f66351b, true);
                    long currentTimeMillis = System.currentTimeMillis();
                    if (m44318a2 != null) {
                        int i10 = m44318a2.f66376b;
                        if (i10 != 5 && i10 != 3 && i10 != 4) {
                            j = m44318a2.f66377c;
                        } else {
                            j = currentTimeMillis;
                        }
                        if (i10 != 5 && i10 != 7) {
                            if (i9 != 0) {
                                i2 = 1;
                            } else {
                                i2 = 0;
                            }
                        } else {
                            i2 = 7;
                        }
                        m44323a(new C25574b(m44318a2.f66375a.m44360a(downloadRequest), i2, j, currentTimeMillis, -1L, i9, 0, new b20()));
                    } else {
                        if (i9 != 0) {
                            i = 1;
                        } else {
                            i = 0;
                        }
                        m44323a(new C25574b(downloadRequest, i, currentTimeMillis, currentTimeMillis, -1L, i9, 0, new b20()));
                    }
                    m44317b();
                    i6 = 1;
                    this.f66397d.obtainMessage(1, i6, this.f66399f.size()).sendToTarget();
                    return;
                case 7:
                    String str2 = (String) message.obj;
                    C25574b m44318a3 = m44318a(str2, true);
                    if (m44318a3 == null) {
                        gq0.m33795b("DownloadManager", "Failed to remove nonexistent download: " + str2);
                    } else {
                        m44321a(m44318a3, 5, 0);
                        m44317b();
                    }
                    i6 = 1;
                    this.f66397d.obtainMessage(1, i6, this.f66399f.size()).sendToTarget();
                    return;
                case 8:
                    m44324a();
                    i6 = 1;
                    this.f66397d.obtainMessage(1, i6, this.f66399f.size()).sendToTarget();
                    return;
                case 9:
                    C25579d c25579d = (C25579d) message.obj;
                    String str3 = c25579d.f66405b.f66351b;
                    this.f66399f.remove(str3);
                    boolean z2 = c25579d.f66408e;
                    if (!z2) {
                        int i11 = this.f66404k - 1;
                        this.f66404k = i11;
                        if (i11 == 0) {
                            removeMessages(11);
                        }
                    }
                    if (!c25579d.f66411h) {
                        Exception exc = c25579d.f66412i;
                        if (exc != null) {
                            gq0.m33797a("DownloadManager", "Task failed: " + c25579d.f66405b + ", " + z2, exc);
                        }
                        C25574b m44318a4 = m44318a(str3, false);
                        m44318a4.getClass();
                        int i12 = m44318a4.f66376b;
                        if (i12 != 2) {
                            if (i12 != 5 && i12 != 7) {
                                throw new IllegalStateException();
                            }
                            if (z2) {
                                if (i12 == 7) {
                                    int i13 = m44318a4.f66380f;
                                    if (i13 == 0) {
                                        i5 = 0;
                                    } else {
                                        i5 = 1;
                                    }
                                    m44321a(m44318a4, i5, i13);
                                    m44317b();
                                } else {
                                    this.f66398e.remove(m44319a(m44318a4.f66375a.f66351b));
                                    try {
                                        ((C25572a) this.f66395b).m44338c(m44318a4.f66375a.f66351b);
                                    } catch (IOException unused) {
                                        gq0.m33795b("DownloadManager", "Failed to remove from database");
                                    }
                                    this.f66397d.obtainMessage(2, new C25576a(m44318a4, true, new ArrayList(this.f66398e), null)).sendToTarget();
                                }
                            } else {
                                throw new IllegalStateException();
                            }
                        } else if (!z2) {
                            DownloadRequest downloadRequest2 = m44318a4.f66375a;
                            if (exc == null) {
                                i3 = 3;
                            } else {
                                i3 = 4;
                            }
                            long j2 = m44318a4.f66377c;
                            long currentTimeMillis2 = System.currentTimeMillis();
                            long j3 = m44318a4.f66379e;
                            int i14 = m44318a4.f66380f;
                            if (exc == null) {
                                i4 = 0;
                            } else {
                                i4 = 1;
                            }
                            C25574b c25574b = new C25574b(downloadRequest2, i3, j2, currentTimeMillis2, j3, i14, i4, m44318a4.f66382h);
                            this.f66398e.remove(m44319a(c25574b.f66375a.f66351b));
                            try {
                                ((C25572a) this.f66395b).m44348a(c25574b);
                            } catch (IOException e4) {
                                gq0.m33797a("DownloadManager", "Failed to update index.", e4);
                            }
                            this.f66397d.obtainMessage(2, new C25576a(c25574b, false, new ArrayList(this.f66398e), exc)).sendToTarget();
                        } else {
                            throw new IllegalStateException();
                        }
                        m44317b();
                    } else {
                        m44317b();
                    }
                    this.f66397d.obtainMessage(1, i6, this.f66399f.size()).sendToTarget();
                    return;
                case 10:
                    int i15 = message.arg1;
                    int i16 = message.arg2;
                    int i17 = y32.f88010a;
                    long j4 = ((i15 & 4294967295L) << 32) | (4294967295L & i16);
                    C25574b m44318a5 = m44318a(((C25579d) message.obj).f66405b.f66351b, false);
                    m44318a5.getClass();
                    if (j4 != m44318a5.f66379e && j4 != -1) {
                        m44323a(new C25574b(m44318a5.f66375a, m44318a5.f66376b, m44318a5.f66377c, System.currentTimeMillis(), j4, m44318a5.f66380f, m44318a5.f66381g, m44318a5.f66382h));
                        return;
                    }
                    return;
                case 11:
                    for (int i18 = 0; i18 < this.f66398e.size(); i18++) {
                        C25574b c25574b2 = this.f66398e.get(i18);
                        if (c25574b2.f66376b == 2) {
                            try {
                                ((C25572a) this.f66395b).m44348a(c25574b2);
                            } catch (IOException e5) {
                                gq0.m33797a("DownloadManager", "Failed to update index.", e5);
                            }
                        }
                    }
                    sendEmptyMessageDelayed(11, 5000L);
                    return;
                case 12:
                    for (C25579d c25579d2 : this.f66399f.values()) {
                        c25579d2.m44313a(true);
                    }
                    try {
                        ((C25572a) this.f66395b).m44343b();
                    } catch (IOException e6) {
                        gq0.m33797a("DownloadManager", "Failed to update index.", e6);
                    }
                    this.f66398e.clear();
                    this.f66394a.quit();
                    synchronized (this) {
                        notifyAll();
                    }
                    return;
                default:
                    throw new IllegalStateException();
            }
        }

        /* renamed from: b */
        private void m44317b() {
            int i = 0;
            for (int i2 = 0; i2 < this.f66398e.size(); i2++) {
                C25574b c25574b = this.f66398e.get(i2);
                C25579d c25579d = this.f66399f.get(c25574b.f66375a.f66351b);
                int i3 = c25574b.f66376b;
                if (i3 != 0) {
                    if (i3 != 1) {
                        if (i3 == 2) {
                            c25579d.getClass();
                            if (!c25579d.f66408e) {
                                if (this.f66401h || this.f66400g != 0 || i >= this.f66402i) {
                                    m44321a(c25574b, 0, 0);
                                    c25579d.m44313a(false);
                                }
                            } else {
                                throw new IllegalStateException();
                            }
                        } else if (i3 != 5 && i3 != 7) {
                            throw new IllegalStateException();
                        } else {
                            if (c25579d != null) {
                                if (!c25579d.f66408e) {
                                    c25579d.m44313a(false);
                                }
                            } else {
                                C25579d c25579d2 = new C25579d(c25574b.f66375a, ((C30278ey) this.f66396c).m34412a(c25574b.f66375a), c25574b.f66382h, true, this.f66403j, this);
                                this.f66399f.put(c25574b.f66375a.f66351b, c25579d2);
                                c25579d2.start();
                            }
                        }
                    } else if (c25579d != null) {
                        if (!c25579d.f66408e) {
                            c25579d.m44313a(false);
                        } else {
                            throw new IllegalStateException();
                        }
                    }
                } else if (c25579d != null) {
                    if (!c25579d.f66408e) {
                        c25579d.m44313a(false);
                    } else {
                        throw new IllegalStateException();
                    }
                } else if (this.f66401h || this.f66400g != 0 || this.f66404k >= this.f66402i) {
                    c25579d = null;
                } else {
                    C25574b m44321a = m44321a(c25574b, 2, 0);
                    c25579d = new C25579d(m44321a.f66375a, ((C30278ey) this.f66396c).m34412a(m44321a.f66375a), m44321a.f66382h, false, this.f66403j, this);
                    this.f66399f.put(m44321a.f66375a.f66351b, c25579d);
                    int i4 = this.f66404k;
                    this.f66404k = i4 + 1;
                    if (i4 == 0) {
                        sendEmptyMessageDelayed(11, 5000L);
                    }
                    c25579d.start();
                }
                if (c25579d != null && !c25579d.f66408e) {
                    i++;
                }
            }
        }

        /* renamed from: a */
        private void m44324a() {
            ArrayList arrayList = new ArrayList();
            try {
                a20 m44344a = ((C25572a) this.f66395b).m44344a(3, 4);
                while (true) {
                    C25572a.C25573a c25573a = (C25572a.C25573a) m44344a;
                    if (!c25573a.m44336a(c25573a.m44335b() + 1)) {
                        break;
                    }
                    arrayList.add(((C25572a.C25573a) m44344a).m44337a());
                }
                ((C25572a.C25573a) m44344a).close();
            } catch (IOException unused) {
                gq0.m33795b("DownloadManager", "Failed to load downloads.");
            }
            for (int i = 0; i < this.f66398e.size(); i++) {
                ArrayList<C25574b> arrayList2 = this.f66398e;
                C25574b c25574b = arrayList2.get(i);
                arrayList2.set(i, new C25574b(c25574b.f66375a, 5, c25574b.f66377c, System.currentTimeMillis(), c25574b.f66379e, 0, 0, c25574b.f66382h));
            }
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                ArrayList<C25574b> arrayList3 = this.f66398e;
                C25574b c25574b2 = (C25574b) arrayList.get(i2);
                arrayList3.add(new C25574b(c25574b2.f66375a, 5, c25574b2.f66377c, System.currentTimeMillis(), c25574b2.f66379e, 0, 0, c25574b2.f66382h));
            }
            Collections.sort(this.f66398e, new C25588j());
            try {
                ((C25572a) this.f66395b).m44340c();
            } catch (IOException e) {
                gq0.m33797a("DownloadManager", "Failed to update index.", e);
            }
            ArrayList arrayList4 = new ArrayList(this.f66398e);
            for (int i3 = 0; i3 < this.f66398e.size(); i3++) {
                this.f66397d.obtainMessage(2, new C25576a(this.f66398e.get(i3), false, arrayList4, null)).sendToTarget();
            }
            m44317b();
        }

        /* renamed from: a */
        private C25574b m44323a(C25574b c25574b) {
            int i = c25574b.f66376b;
            if (i != 3 && i != 4) {
                int m44319a = m44319a(c25574b.f66375a.f66351b);
                if (m44319a == -1) {
                    this.f66398e.add(c25574b);
                    Collections.sort(this.f66398e, new C25588j());
                } else {
                    boolean z = c25574b.f66377c != this.f66398e.get(m44319a).f66377c;
                    this.f66398e.set(m44319a, c25574b);
                    if (z) {
                        Collections.sort(this.f66398e, new C25588j());
                    }
                }
                try {
                    ((C25572a) this.f66395b).m44348a(c25574b);
                } catch (IOException e) {
                    gq0.m33797a("DownloadManager", "Failed to update index.", e);
                }
                this.f66397d.obtainMessage(2, new C25576a(c25574b, false, new ArrayList(this.f66398e), null)).sendToTarget();
                return c25574b;
            }
            throw new IllegalStateException();
        }

        @Nullable
        /* renamed from: a */
        private C25574b m44318a(String str, boolean z) {
            int m44319a = m44319a(str);
            if (m44319a != -1) {
                return this.f66398e.get(m44319a);
            }
            if (z) {
                try {
                    return ((C25572a) this.f66395b).m44341b(str);
                } catch (IOException e) {
                    gq0.m33797a("DownloadManager", "Failed to load download: " + str, e);
                    return null;
                }
            }
            return null;
        }

        /* renamed from: a */
        private int m44319a(String str) {
            for (int i = 0; i < this.f66398e.size(); i++) {
                if (this.f66398e.get(i).f66375a.f66351b.equals(str)) {
                    return i;
                }
            }
            return -1;
        }

        /* renamed from: a */
        private C25574b m44321a(C25574b c25574b, int i, int i2) {
            if (i != 3 && i != 4) {
                return m44323a(new C25574b(c25574b.f66375a, i, c25574b.f66377c, System.currentTimeMillis(), c25574b.f66379e, i2, 0, c25574b.f66382h));
            }
            throw new IllegalStateException();
        }

        /* renamed from: a */
        public static int m44320a(C25574b c25574b, C25574b c25574b2) {
            long j = c25574b.f66377c;
            long j2 = c25574b2.f66377c;
            int i = y32.f88010a;
            int i2 = (j > j2 ? 1 : (j == j2 ? 0 : -1));
            if (i2 < 0) {
                return -1;
            }
            return i2 == 0 ? 0 : 1;
        }
    }

    /* renamed from: com.monetization.ads.exo.offline.c$d */
    /* loaded from: classes7.dex */
    public static class C25579d extends Thread implements InterfaceC25580d.InterfaceC25581a {

        /* renamed from: b */
        private final DownloadRequest f66405b;

        /* renamed from: c */
        private final InterfaceC25580d f66406c;

        /* renamed from: d */
        private final b20 f66407d;

        /* renamed from: e */
        private final boolean f66408e;

        /* renamed from: f */
        private final int f66409f;
        @Nullable

        /* renamed from: g */
        private volatile HandlerC25577b f66410g;

        /* renamed from: h */
        private volatile boolean f66411h;
        @Nullable

        /* renamed from: i */
        private Exception f66412i;

        /* renamed from: j */
        private long f66413j;

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            try {
                if (this.f66408e) {
                    this.f66406c.remove();
                } else {
                    long j = -1;
                    int i = 0;
                    while (!this.f66411h) {
                        try {
                            this.f66406c.mo44308a(this);
                            break;
                        } catch (IOException e) {
                            if (!this.f66411h) {
                                long j2 = this.f66407d.f77052a;
                                if (j2 != j) {
                                    i = 0;
                                    j = j2;
                                }
                                int i2 = i + 1;
                                if (i2 <= this.f66409f) {
                                    Thread.sleep(Math.min(i * 1000, 5000));
                                    i = i2;
                                } else {
                                    throw e;
                                }
                            }
                        }
                    }
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (Exception e2) {
                this.f66412i = e2;
            }
            HandlerC25577b handlerC25577b = this.f66410g;
            if (handlerC25577b != null) {
                handlerC25577b.obtainMessage(9, this).sendToTarget();
            }
        }

        private C25579d(DownloadRequest downloadRequest, InterfaceC25580d interfaceC25580d, b20 b20Var, boolean z, int i, HandlerC25577b handlerC25577b) {
            this.f66405b = downloadRequest;
            this.f66406c = interfaceC25580d;
            this.f66407d = b20Var;
            this.f66408e = z;
            this.f66409f = i;
            this.f66410g = handlerC25577b;
            this.f66413j = -1L;
        }

        /* renamed from: a */
        public final void m44313a(boolean z) {
            if (z) {
                this.f66410g = null;
            }
            if (this.f66411h) {
                return;
            }
            this.f66411h = true;
            this.f66406c.cancel();
            interrupt();
        }

        /* renamed from: a */
        public final void m44315a(long j, long j2, float f) {
            this.f66407d.f77052a = j2;
            this.f66407d.f77053b = f;
            if (j != this.f66413j) {
                this.f66413j = j;
                HandlerC25577b handlerC25577b = this.f66410g;
                if (handlerC25577b != null) {
                    handlerC25577b.obtainMessage(10, (int) (j >> 32), (int) j, this).sendToTarget();
                }
            }
        }
    }

    public C25575c(Context context, C25572a c25572a, C30278ey c30278ey) {
        context.getApplicationContext();
        this.f66387d = true;
        this.f66390g = Collections.emptyList();
        this.f66385b = new CopyOnWriteArraySet<>();
        Handler m27059b = y32.m27059b(new Handler.Callback() { // from class: com.monetization.ads.exo.offline.h
            {
                C25575c.this = this;
            }

            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                boolean m44333a;
                m44333a = C25575c.this.m44333a(message);
                return m44333a;
            }
        });
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:DownloadManager");
        handlerThread.start();
        HandlerC25577b handlerC25577b = new HandlerC25577b(handlerThread, c25572a, c30278ey, m27059b, this.f66387d);
        this.f66384a = handlerC25577b;
        int m32851a = new jm1(context, new jm1.InterfaceC30639b() { // from class: com.monetization.ads.exo.offline.i
            {
                C25575c.this = this;
            }

            @Override // com.yandex.mobile.ads.impl.jm1.InterfaceC30639b
            /* renamed from: a */
            public final void mo32843a(jm1 jm1Var, int i) {
                C25575c.this.m44329a(jm1Var, i);
            }
        }).m32851a();
        this.f66388e = m32851a;
        this.f66386c = 1;
        handlerC25577b.obtainMessage(0, m32851a, 0).sendToTarget();
    }

    /* renamed from: b */
    private boolean m44326b() {
        boolean z;
        if (!this.f66387d && this.f66388e != 0) {
            for (int i = 0; i < this.f66390g.size(); i++) {
                if (this.f66390g.get(i).f66376b == 0) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        boolean z2 = this.f66389f != z;
        this.f66389f = z;
        return z2;
    }

    /* renamed from: a */
    public final void m44328a(ud2 ud2Var) {
        this.f66385b.add(ud2Var);
    }

    /* renamed from: a */
    public void m44329a(jm1 jm1Var, int i) {
        jm1Var.getClass();
        if (this.f66388e != i) {
            this.f66388e = i;
            this.f66386c++;
            this.f66384a.obtainMessage(2, i, 0).sendToTarget();
        }
        boolean m44326b = m44326b();
        Iterator<InterfaceC25578c> it = this.f66385b.iterator();
        while (it.hasNext()) {
            it.next().getClass();
        }
        if (m44326b) {
            Iterator<InterfaceC25578c> it2 = this.f66385b.iterator();
            while (it2.hasNext()) {
                it2.next().getClass();
            }
        }
    }

    /* renamed from: a */
    public final void m44331a(InterfaceC25578c interfaceC25578c) {
        this.f66385b.remove(interfaceC25578c);
    }

    /* renamed from: a */
    public final void m44332a(DownloadRequest downloadRequest) {
        this.f66386c++;
        this.f66384a.obtainMessage(6, 0, 0, downloadRequest).sendToTarget();
    }

    /* renamed from: a */
    public final void m44327a(String str) {
        this.f66386c++;
        this.f66384a.obtainMessage(7, str).sendToTarget();
    }

    /* renamed from: a */
    public final void m44334a() {
        if (this.f66387d) {
            this.f66387d = false;
            this.f66386c++;
            this.f66384a.obtainMessage(1, 0, 0).sendToTarget();
            boolean m44326b = m44326b();
            Iterator<InterfaceC25578c> it = this.f66385b.iterator();
            while (it.hasNext()) {
                it.next().getClass();
            }
            if (m44326b) {
                Iterator<InterfaceC25578c> it2 = this.f66385b.iterator();
                while (it2.hasNext()) {
                    it2.next().getClass();
                }
            }
        }
    }

    /* renamed from: a */
    public boolean m44333a(Message message) {
        int i = message.what;
        if (i == 0) {
            this.f66390g = Collections.unmodifiableList((List) message.obj);
            boolean m44326b = m44326b();
            Iterator<InterfaceC25578c> it = this.f66385b.iterator();
            while (it.hasNext()) {
                it.next().getClass();
            }
            if (m44326b) {
                Iterator<InterfaceC25578c> it2 = this.f66385b.iterator();
                while (it2.hasNext()) {
                    it2.next().getClass();
                }
            }
        } else if (i == 1) {
            int i2 = message.arg1;
            int i3 = message.arg2;
            int i4 = this.f66386c - i2;
            this.f66386c = i4;
            if (i3 == 0 && i4 == 0) {
                Iterator<InterfaceC25578c> it3 = this.f66385b.iterator();
                while (it3.hasNext()) {
                    it3.next().getClass();
                }
            }
        } else if (i == 2) {
            C25576a c25576a = (C25576a) message.obj;
            this.f66390g = Collections.unmodifiableList(c25576a.f66393c);
            C25574b c25574b = c25576a.f66391a;
            boolean m44326b2 = m44326b();
            if (c25576a.f66392b) {
                Iterator<InterfaceC25578c> it4 = this.f66385b.iterator();
                while (it4.hasNext()) {
                    it4.next().getClass();
                }
            } else {
                Iterator<InterfaceC25578c> it5 = this.f66385b.iterator();
                while (it5.hasNext()) {
                    it5.next().mo28815a(this, c25574b);
                }
            }
            if (m44326b2) {
                Iterator<InterfaceC25578c> it6 = this.f66385b.iterator();
                while (it6.hasNext()) {
                    it6.next().getClass();
                }
            }
        } else {
            throw new IllegalStateException();
        }
        return true;
    }

    /* renamed from: com.monetization.ads.exo.offline.c$c */
    /* loaded from: classes7.dex */
    public interface InterfaceC25578c {
        /* renamed from: a */
        default void mo28815a(C25575c c25575c, C25574b c25574b) {
        }
    }
}
