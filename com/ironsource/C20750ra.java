package com.ironsource;

import android.os.Handler;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: com.ironsource.ra */
/* loaded from: classes6.dex */
public class C20750ra implements InterfaceC19766de {

    /* renamed from: e */
    private static final int f52740e = 5;

    /* renamed from: f */
    private static C20750ra f52741f;

    /* renamed from: a */
    private HandlerC20681qa f52742a;

    /* renamed from: b */
    private final JSONObject f52743b;

    /* renamed from: c */
    private Thread f52744c;

    /* renamed from: d */
    private final String f52745d;

    private C20750ra(String str, C21130ve c21130ve, JSONObject jSONObject) {
        this.f52745d = str;
        this.f52742a = new HandlerC20681qa(c21130ve.m54481a());
        this.f52743b = jSONObject;
        IronSourceStorageUtils.deleteFolder(m55523b());
        IronSourceStorageUtils.makeDir(m55523b());
    }

    /* renamed from: a */
    public static synchronized C20750ra m55524a(String str, C21130ve c21130ve, JSONObject jSONObject) {
        C20750ra c20750ra;
        synchronized (C20750ra.class) {
            if (f52741f == null) {
                f52741f = new C20750ra(str, c21130ve, jSONObject);
            }
            c20750ra = f52741f;
        }
        return c20750ra;
    }

    /* renamed from: b */
    private String m55523b() {
        return IronSourceStorageUtils.buildAbsolutePathToDirInCache(this.f52745d, C21216x8.f54442D);
    }

    /* renamed from: c */
    public boolean m55521c() {
        Thread thread = this.f52744c;
        if (thread != null && thread.isAlive()) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public synchronized void m55520d() {
        f52741f = null;
        HandlerC20681qa handlerC20681qa = this.f52742a;
        if (handlerC20681qa != null) {
            handlerC20681qa.m55658a();
            this.f52742a = null;
        }
    }

    /* renamed from: b */
    private Thread m55522b(C21314zf c21314zf, String str, int i, int i2, Handler handler) {
        if (i <= 0) {
            i = this.f52743b.optInt("connectionTimeout", 5);
        }
        if (i2 <= 0) {
            i2 = this.f52743b.optInt("readTimeout", 5);
        }
        boolean optBoolean = this.f52743b.optBoolean(C21216x8.f54446H, false);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        return m55528a(new C20574oa(c21314zf, str, (int) timeUnit.toMillis(i), (int) timeUnit.toMillis(i2), optBoolean, m55523b()), handler);
    }

    /* renamed from: a */
    public String m55530a() {
        return this.f52745d;
    }

    /* renamed from: a */
    private Thread m55528a(C20574oa c20574oa, Handler handler) {
        return new Thread(new RunnableC19937fs(c20574oa, handler));
    }

    @Override // com.ironsource.InterfaceC19766de
    /* renamed from: a */
    public void mo55529a(InterfaceC20057hn interfaceC20057hn) {
        this.f52742a.m55657a(interfaceC20057hn);
    }

    @Override // com.ironsource.InterfaceC19766de
    /* renamed from: a */
    public void mo55527a(C21314zf c21314zf, String str) {
        int optInt = this.f52743b.optInt("connectionTimeout", 5);
        int optInt2 = this.f52743b.optInt("readTimeout", 5);
        boolean optBoolean = this.f52743b.optBoolean(C21216x8.f54446H, false);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        Thread m55528a = m55528a(new C20574oa(c21314zf, str, (int) timeUnit.toMillis(optInt), (int) timeUnit.toMillis(optInt2), optBoolean, m55523b()), this.f52742a);
        this.f52744c = m55528a;
        m55528a.start();
    }

    @Override // com.ironsource.InterfaceC19766de
    /* renamed from: a */
    public void mo55526a(C21314zf c21314zf, String str, int i, int i2) {
        m55522b(c21314zf, str, i, i2, this.f52742a).start();
    }

    @Override // com.ironsource.InterfaceC19766de
    /* renamed from: a */
    public void mo55525a(C21314zf c21314zf, String str, int i, int i2, Handler handler) {
        m55522b(c21314zf, str, i, i2, handler).start();
    }
}
