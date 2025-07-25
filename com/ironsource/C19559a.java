package com.ironsource;

import android.os.Debug;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;

/* renamed from: com.ironsource.a */
/* loaded from: classes6.dex */
public class C19559a extends Thread {

    /* renamed from: l */
    private static final int f48986l = 1;

    /* renamed from: m */
    private static final InterfaceC19608b f48987m = new C19560a();

    /* renamed from: n */
    private static final InterfaceC20099ih f48988n = new C19561b();

    /* renamed from: d */
    private final int f48992d;

    /* renamed from: a */
    private InterfaceC19608b f48989a = f48987m;

    /* renamed from: b */
    private InterfaceC20099ih f48990b = f48988n;

    /* renamed from: c */
    private final Handler f48991c = new Handler(Looper.getMainLooper());

    /* renamed from: e */
    private String f48993e = "";

    /* renamed from: f */
    private boolean f48994f = false;

    /* renamed from: g */
    private boolean f48995g = false;

    /* renamed from: h */
    private volatile int f48996h = 0;

    /* renamed from: i */
    private int f48997i = 1;

    /* renamed from: j */
    private int f48998j = 0;

    /* renamed from: k */
    private final Runnable f48999k = new RunnableC19562c();

    /* renamed from: com.ironsource.a$b */
    /* loaded from: classes6.dex */
    class C19561b implements InterfaceC20099ih {
        C19561b() {
        }

        @Override // com.ironsource.InterfaceC20099ih
        /* renamed from: a */
        public void mo57978a(InterruptedException interruptedException) {
            Log.w("ANRHandler", "Interrupted: " + interruptedException.getMessage());
        }
    }

    /* renamed from: com.ironsource.a$c */
    /* loaded from: classes6.dex */
    class RunnableC19562c implements Runnable {
        RunnableC19562c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C19559a c19559a = C19559a.this;
            c19559a.f48996h = (c19559a.f48996h + 1) % Integer.MAX_VALUE;
        }
    }

    public C19559a(int i) {
        this.f48992d = i;
    }

    /* renamed from: a */
    public int m59504a() {
        return this.f48998j;
    }

    /* renamed from: b */
    public int m59495b() {
        return this.f48997i;
    }

    /* renamed from: c */
    public C19559a m59493c() {
        this.f48993e = null;
        return this;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        setName("|ANR-ANRHandler|");
        int i = -1;
        while (!isInterrupted() && this.f48998j < this.f48997i) {
            int i2 = this.f48996h;
            this.f48991c.post(this.f48999k);
            try {
                Thread.sleep(this.f48992d);
                if (this.f48996h == i2) {
                    if (!this.f48995g && Debug.isDebuggerConnected()) {
                        if (this.f48996h != i) {
                            Log.w("ANRHandler", "An ANR was detected but ignored because the debugger is connected (you can prevent this with setIgnoreDebugger(true))");
                        }
                        i = this.f48996h;
                    } else {
                        this.f48998j++;
                        this.f48989a.mo57995a();
                        String str = C20086i9.f50546l;
                        if (str != null && !str.trim().isEmpty()) {
                            new C21173wb(C20086i9.f50546l, String.valueOf(System.currentTimeMillis()), "ANR").m54359a();
                        }
                    }
                } else {
                    this.f48998j = 0;
                }
            } catch (InterruptedException e) {
                this.f48990b.mo57978a(e);
                return;
            }
        }
        if (this.f48998j >= this.f48997i) {
            this.f48989a.mo57994b();
        }
    }

    /* renamed from: b */
    public C19559a m59494b(boolean z) {
        this.f48994f = z;
        return this;
    }

    /* renamed from: a */
    public C19559a m59500a(InterfaceC19608b interfaceC19608b) {
        if (interfaceC19608b == null) {
            interfaceC19608b = f48987m;
        }
        this.f48989a = interfaceC19608b;
        return this;
    }

    /* renamed from: a */
    public C19559a m59499a(InterfaceC20099ih interfaceC20099ih) {
        if (interfaceC20099ih == null) {
            interfaceC20099ih = f48988n;
        }
        this.f48990b = interfaceC20099ih;
        return this;
    }

    /* renamed from: a */
    public C19559a m59498a(String str) {
        if (str == null) {
            str = "";
        }
        this.f48993e = str;
        return this;
    }

    /* renamed from: a */
    public C19559a m59497a(boolean z) {
        this.f48995g = z;
        return this;
    }

    /* renamed from: a */
    private String m59496a(StackTraceElement[] stackTraceElementArr) {
        String str = "";
        if (stackTraceElementArr != null && stackTraceElementArr.length > 0) {
            for (StackTraceElement stackTraceElement : stackTraceElementArr) {
                if (stackTraceElement != null) {
                    str = str + stackTraceElement.toString() + ";\n";
                }
            }
        }
        return str;
    }

    /* renamed from: a */
    public void m59503a(int i) {
        this.f48997i = i;
    }

    /* renamed from: com.ironsource.a$a */
    /* loaded from: classes6.dex */
    class C19560a implements InterfaceC19608b {
        C19560a() {
        }

        @Override // com.ironsource.InterfaceC19608b
        /* renamed from: b */
        public void mo57994b() {
            throw new RuntimeException("ANRHandler has given up");
        }

        @Override // com.ironsource.InterfaceC19608b
        /* renamed from: a */
        public void mo57995a() {
        }
    }
}
