package sg.bigo.ads.common.p926n;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import sg.bigo.ads.common.p932t.C43782a;
import sg.bigo.ads.common.utils.C43840t;

/* renamed from: sg.bigo.ads.common.n.d */
/* loaded from: classes10.dex */
public final class C43727d {

    /* renamed from: a */
    public static List<InterfaceC43723a> f114436a;

    /* renamed from: b */
    private static HandlerThread f114437b;

    /* renamed from: c */
    private static HandlerC43724b f114438c;

    /* renamed from: d */
    private static HandlerThread f114439d;

    /* renamed from: e */
    private static HandlerC43724b f114440e;

    /* renamed from: f */
    private static HandlerThread f114441f;

    /* renamed from: g */
    private static HandlerC43724b f114442g;

    /* renamed from: h */
    private static HandlerC43724b f114443h;

    /* renamed from: i */
    private static HandlerC43724b f114444i;

    /* renamed from: j */
    private static final WeakHashMap<Object, C43734a> f114445j = new WeakHashMap<>();

    /* renamed from: k */
    private static boolean f114446k = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: sg.bigo.ads.common.n.d$a */
    /* loaded from: classes10.dex */
    public static class C43734a {

        /* renamed from: a */
        final Runnable f114460a;

        /* renamed from: b */
        final Integer f114461b;

        public C43734a(Runnable runnable, Integer num) {
            this.f114460a = runnable;
            this.f114461b = num;
        }
    }

    static {
        C43840t.m4813a();
    }

    /* renamed from: a */
    public static void m5108a(int i, Runnable runnable) {
        m5103b(i, runnable, 0L);
    }

    /* renamed from: b */
    private static synchronized void m5103b(int i, final Runnable runnable, long j) {
        final HandlerC43724b handlerC43724b;
        synchronized (C43727d.class) {
            if (runnable == null) {
                return;
            }
            if (f114443h == null) {
                m5094j();
            }
            if (i == 0) {
                if (f114437b == null) {
                    m5097g();
                }
                handlerC43724b = f114438c;
            } else if (i == 1) {
                if (f114439d == null) {
                    m5096h();
                }
                handlerC43724b = f114440e;
            } else if (i != 3) {
                handlerC43724b = f114443h;
            } else {
                if (f114441f == null) {
                    m5095i();
                }
                handlerC43724b = f114442g;
            }
            if (handlerC43724b == null) {
                return;
            }
            final Looper myLooper = Looper.myLooper();
            if (myLooper == null) {
                myLooper = f114443h.getLooper();
            }
            final Runnable runnable2 = new Runnable() { // from class: sg.bigo.ads.common.n.d.1

                /* renamed from: b */
                final /* synthetic */ Runnable f114448b = null;

                /* renamed from: c */
                final /* synthetic */ boolean f114449c = false;

                @Override // java.lang.Runnable
                public final void run() {
                    Runnable runnable3;
                    if (C43727d.f114444i != null) {
                        runnable3 = new Runnable() { // from class: sg.bigo.ads.common.n.d.1.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                C43727d.f114443h.post(new Runnable() { // from class: sg.bigo.ads.common.n.d.1.1.1
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        C43782a.m5009a(0, "ThreadManager", "这里使用了ThreadManager.post函数运行了一个超过30s的任务");
                                    }
                                });
                            }
                        };
                    } else {
                        runnable3 = null;
                    }
                    if (C43727d.f114444i != null) {
                        C43727d.f114444i.postDelayed(runnable3, 30000L);
                    }
                    synchronized (C43727d.f114445j) {
                        C43727d.f114445j.remove(runnable);
                    }
                    if (C43727d.f114446k) {
                        runnable.run();
                    } else {
                        try {
                            runnable.run();
                        } catch (Throwable th) {
                            C43782a.m5009a(2, "ThreadManager", "An error occurred while running a task: \n" + Log.getStackTraceString(th));
                            List<InterfaceC43723a> list = C43727d.f114436a;
                            if (list != null) {
                                for (InterfaceC43723a interfaceC43723a : list) {
                                    interfaceC43723a.mo4189a(th);
                                }
                            }
                        }
                    }
                    if (C43727d.f114444i != null) {
                        C43727d.f114444i.removeCallbacks(runnable3);
                    }
                    if (this.f114448b != null) {
                        if (!this.f114449c && myLooper != C43727d.f114443h.getLooper()) {
                            new Handler(myLooper).post(this.f114448b);
                        } else {
                            C43727d.f114443h.post(this.f114448b);
                        }
                    }
                }
            };
            Runnable runnable3 = new Runnable() { // from class: sg.bigo.ads.common.n.d.2

                /* renamed from: a */
                final /* synthetic */ Runnable f114453a = null;

                /* renamed from: b */
                final /* synthetic */ boolean f114454b = false;

                @Override // java.lang.Runnable
                public final void run() {
                    if (this.f114453a != null) {
                        if (!this.f114454b && myLooper != C43727d.f114443h.getLooper()) {
                            new Handler(myLooper).post(new Runnable() { // from class: sg.bigo.ads.common.n.d.2.2
                                @Override // java.lang.Runnable
                                public final void run() {
                                    RunnableC437312.this.f114453a.run();
                                    RunnableC437312 runnableC437312 = RunnableC437312.this;
                                    handlerC43724b.post(runnable2);
                                }
                            });
                            return;
                        } else {
                            C43727d.f114443h.post(new Runnable() { // from class: sg.bigo.ads.common.n.d.2.1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    RunnableC437312.this.f114453a.run();
                                    RunnableC437312 runnableC437312 = RunnableC437312.this;
                                    handlerC43724b.post(runnable2);
                                }
                            });
                            return;
                        }
                    }
                    runnable2.run();
                }
            };
            WeakHashMap<Object, C43734a> weakHashMap = f114445j;
            synchronized (weakHashMap) {
                weakHashMap.put(runnable, new C43734a(runnable3, Integer.valueOf(i)));
            }
            handlerC43724b.postDelayed(runnable3, j);
        }
    }

    /* renamed from: g */
    private static synchronized void m5097g() {
        synchronized (C43727d.class) {
            if (f114437b == null) {
                HandlerThread handlerThread = new HandlerThread("BGAd-Background", 10);
                f114437b = handlerThread;
                handlerThread.start();
                f114438c = new HandlerC43724b("BGAd-Background", f114437b.getLooper());
            }
        }
    }

    /* renamed from: h */
    private static synchronized void m5096h() {
        synchronized (C43727d.class) {
            if (f114439d == null) {
                HandlerThread handlerThread = new HandlerThread("BGAd-Work", 5);
                f114439d = handlerThread;
                handlerThread.start();
                f114440e = new HandlerC43724b("BGAd-Work", f114439d.getLooper());
            }
        }
    }

    /* renamed from: i */
    private static synchronized void m5095i() {
        synchronized (C43727d.class) {
            if (f114441f == null) {
                HandlerThread handlerThread = new HandlerThread("BGAd-Normal", 0);
                f114441f = handlerThread;
                handlerThread.start();
                f114442g = new HandlerC43724b("BGAd-Normal", f114441f.getLooper());
            }
        }
    }

    /* renamed from: j */
    private static synchronized void m5094j() {
        synchronized (C43727d.class) {
            if (f114443h == null) {
                f114443h = new HandlerC43724b("BGAd-Background.Main + 38", Looper.getMainLooper());
            }
        }
    }

    /* renamed from: a */
    public static void m5107a(int i, Runnable runnable, long j) {
        m5103b(i, runnable, j);
    }

    /* renamed from: b */
    public static void m5102b(Runnable runnable) {
        if (m5104b()) {
            runnable.run();
        } else {
            m5103b(2, runnable, 0L);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0033, code lost:
        if (r2 != null) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0049 A[Catch: all -> 0x004f, TRY_ENTER, TryCatch #2 {, blocks: (B:7:0x0007, B:11:0x0013, B:13:0x0017, B:37:0x0048, B:24:0x002d, B:25:0x0031, B:27:0x0035, B:28:0x0039, B:31:0x003e, B:34:0x0043, B:38:0x0049, B:39:0x004c), top: B:50:0x0007 }] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static synchronized void m5106a(java.lang.Runnable r5) {
        /*
            java.lang.Class<sg.bigo.ads.common.n.d> r0 = sg.bigo.ads.common.p926n.C43727d.class
            monitor-enter(r0)
            if (r5 != 0) goto L7
            monitor-exit(r0)
            return
        L7:
            java.util.WeakHashMap<java.lang.Object, sg.bigo.ads.common.n.d$a> r1 = sg.bigo.ads.common.p926n.C43727d.f114445j     // Catch: java.lang.Throwable -> L54
            java.lang.Object r2 = r1.get(r5)     // Catch: java.lang.Throwable -> L54
            sg.bigo.ads.common.n.d$a r2 = (sg.bigo.ads.common.p926n.C43727d.C43734a) r2     // Catch: java.lang.Throwable -> L54
            if (r2 != 0) goto L13
            monitor-exit(r0)
            return
        L13:
            java.lang.Runnable r3 = r2.f114460a     // Catch: java.lang.Throwable -> L54
            if (r3 == 0) goto L52
            java.lang.Integer r2 = r2.f114461b     // Catch: java.lang.Throwable -> L54
            int r2 = r2.intValue()     // Catch: java.lang.Throwable -> L54
            if (r2 == 0) goto L43
            r4 = 1
            if (r2 == r4) goto L3e
            r4 = 2
            if (r2 == r4) goto L39
            r4 = 3
            if (r2 == r4) goto L31
            r4 = 1024(0x400, float:1.435E-42)
            if (r2 == r4) goto L2d
            goto L48
        L2d:
            r3.run()     // Catch: java.lang.Throwable -> L54
            goto L48
        L31:
            sg.bigo.ads.common.n.b r2 = sg.bigo.ads.common.p926n.C43727d.f114442g     // Catch: java.lang.Throwable -> L54
            if (r2 == 0) goto L48
        L35:
            r2.removeCallbacks(r3)     // Catch: java.lang.Throwable -> L54
            goto L48
        L39:
            sg.bigo.ads.common.n.b r2 = sg.bigo.ads.common.p926n.C43727d.f114443h     // Catch: java.lang.Throwable -> L54
            if (r2 == 0) goto L48
            goto L35
        L3e:
            sg.bigo.ads.common.n.b r2 = sg.bigo.ads.common.p926n.C43727d.f114440e     // Catch: java.lang.Throwable -> L54
            if (r2 == 0) goto L48
            goto L35
        L43:
            sg.bigo.ads.common.n.b r2 = sg.bigo.ads.common.p926n.C43727d.f114438c     // Catch: java.lang.Throwable -> L54
            if (r2 == 0) goto L48
            goto L35
        L48:
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L54
            r1.remove(r5)     // Catch: java.lang.Throwable -> L4f
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L4f
            monitor-exit(r0)
            return
        L4f:
            r5 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L4f
            throw r5     // Catch: java.lang.Throwable -> L54
        L52:
            monitor-exit(r0)
            return
        L54:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.common.p926n.C43727d.m5106a(java.lang.Runnable):void");
    }

    /* renamed from: b */
    public static boolean m5104b() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    /* renamed from: a */
    public static synchronized void m5105a(@NonNull InterfaceC43723a interfaceC43723a) {
        synchronized (C43727d.class) {
            if (f114436a == null) {
                f114436a = new ArrayList();
            }
            f114436a.add(interfaceC43723a);
        }
    }

    /* renamed from: a */
    public static boolean m5109a() {
        return f114439d == Thread.currentThread();
    }
}
