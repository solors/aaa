package com.p552ot.pubsub.p564j;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.p552ot.pubsub.p556d.C26531c;
import com.p552ot.pubsub.p559g.C26536a;
import com.p552ot.pubsub.p559g.C26538c;
import com.p552ot.pubsub.p559g.C26542f;
import com.p552ot.pubsub.util.C26577b;
import com.p552ot.pubsub.util.C26580e;
import com.p552ot.pubsub.util.C26586j;
import com.p552ot.pubsub.util.C26587k;
import com.p552ot.pubsub.util.C26590l;
import java.util.ArrayList;

/* renamed from: com.ot.pubsub.j.d */
/* loaded from: classes7.dex */
public class C26566d {

    /* renamed from: a */
    public static final String f69676a = "config";

    /* renamed from: b */
    public static final String f69677b = "appId";

    /* renamed from: c */
    public static final String f69678c = "version";

    /* renamed from: d */
    private static final String f69679d = "UploaderEngine";

    /* renamed from: e */
    private static volatile C26566d f69680e = null;

    /* renamed from: h */
    private static final int f69681h = 123;

    /* renamed from: i */
    private static int f69682i = 900000;

    /* renamed from: f */
    private HandlerC26564b f69683f;

    /* renamed from: g */
    private HandlerC26567a f69684g;

    /* renamed from: j */
    private volatile boolean f69685j = true;

    /* renamed from: k */
    private BroadcastReceiver f69686k = new C26569e(this);

    /* renamed from: l */
    private BroadcastReceiver f69687l = new C26571g(this);

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.ot.pubsub.j.d$a */
    /* loaded from: classes7.dex */
    public class HandlerC26567a extends Handler {
        /* synthetic */ HandlerC26567a(C26566d c26566d, Looper looper, C26569e c26569e) {
            this(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what == 123) {
                C26580e.m41105a(new RunnableC26574j(this));
            }
        }

        private HandlerC26567a(Looper looper) {
            super(looper);
        }
    }

    /* renamed from: com.ot.pubsub.j.d$b */
    /* loaded from: classes7.dex */
    static class C26568b {

        /* renamed from: a */
        public boolean f69689a;

        /* renamed from: b */
        public boolean f69690b;

        /* JADX INFO: Access modifiers changed from: package-private */
        public C26568b(boolean z, boolean z2) {
            this.f69689a = z;
            this.f69690b = z2;
        }
    }

    private C26566d() {
        m41136j();
        m41133m();
        m41139g();
        this.f69684g = new HandlerC26567a(this, Looper.getMainLooper(), null);
    }

    /* renamed from: g */
    private void m41139g() {
        HandlerThread handlerThread = new HandlerThread("mi_ad_pubsub_uploader_worker");
        handlerThread.start();
        this.f69683f = new HandlerC26564b(handlerThread.getLooper());
    }

    /* renamed from: h */
    private boolean m41138h() {
        if (C26587k.m41063a() && !C26590l.m41044c(f69679d) && !C26538c.m41280a().m41267e()) {
            return true;
        }
        C26586j.m41080a(f69679d, "not match the upload status，即将返回");
        return false;
    }

    /* renamed from: i */
    private boolean m41137i() {
        if (C26587k.m41063a() && !C26590l.m41044c(f69679d) && !C26542f.m41264a().m41251d()) {
            return true;
        }
        C26586j.m41080a(f69679d, "hb data not match the upload status，即将返回");
        return false;
    }

    /* renamed from: j */
    private void m41136j() {
        try {
            Context m41116b = C26577b.m41116b();
            if (m41116b == null) {
                return;
            }
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            m41116b.registerReceiver(this.f69686k, intentFilter);
        } catch (Exception e) {
            C26586j.m41072b(f69679d, "registerScreenReceiver: %s", e.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public void m41135k() {
        HandlerC26567a handlerC26567a = this.f69684g;
        if (handlerC26567a != null) {
            handlerC26567a.sendEmptyMessageDelayed(123, f69682i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public void m41134l() {
        HandlerC26567a handlerC26567a = this.f69684g;
        if (handlerC26567a != null) {
            handlerC26567a.removeCallbacksAndMessages(123);
        }
    }

    /* renamed from: m */
    private void m41133m() {
        try {
            Context m41116b = C26577b.m41116b();
            if (m41116b == null) {
                return;
            }
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            m41116b.registerReceiver(this.f69687l, intentFilter);
        } catch (Exception e) {
            C26586j.m41080a(f69679d, "registerNetReceiver: " + e);
        }
    }

    /* renamed from: e */
    public void m41141e() {
        C26536a.m41288a(new RunnableC26573i(this));
    }

    /* renamed from: b */
    public static void m41148b() {
        if (f69680e == null) {
            synchronized (C26566d.class) {
                if (f69680e == null) {
                    f69680e = new C26566d();
                }
            }
        }
    }

    /* renamed from: c */
    public synchronized void m41145c() {
        HandlerC26564b handlerC26564b = this.f69683f;
        if (handlerC26564b != null) {
            handlerC26564b.m41172a();
        } else {
            C26586j.m41074b(f69679d, "*** impossible, isInitCheckUpload timer should not be null");
        }
    }

    /* renamed from: d */
    public boolean m41143d() {
        int i;
        ArrayList<C26531c> arrayList;
        try {
            i = 0;
        } catch (Exception unused) {
        }
        if (m41138h()) {
            int i2 = 100;
            while (true) {
                if (C26586j.f69734a) {
                    i2 = 1000;
                }
                if (i < i2) {
                    C26563a m41269c = C26538c.m41280a().m41269c();
                    if (m41269c == null || (arrayList = m41269c.f69661a) == null || arrayList.size() == 0) {
                        break;
                    }
                    C26565c.m41166a(m41269c);
                    if (m41269c.f69664d) {
                        C26586j.m41080a(f69679d, "No more records ");
                        break;
                    }
                    i++;
                } else {
                    return true;
                }
            }
            C26586j.m41080a(f69679d, "满足条件的记录为空，即将返回");
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static C26566d m41154a() {
        if (f69680e == null) {
            m41148b();
        }
        return f69680e;
    }

    /* renamed from: a */
    public synchronized void m41149a(boolean z) {
        HandlerC26564b handlerC26564b = this.f69683f;
        if (handlerC26564b != null) {
            handlerC26564b.m41168a(z);
        } else {
            C26586j.m41074b(f69679d, "*** impossible, upload timer should not be null");
        }
    }

    /* renamed from: b */
    public void m41147b(int i) {
        HandlerC26564b handlerC26564b = this.f69683f;
        if (handlerC26564b != null) {
            handlerC26564b.m41171a(i);
        }
    }

    /* renamed from: a */
    public synchronized void m41152a(int i, boolean z) {
        HandlerC26564b handlerC26564b = this.f69683f;
        if (handlerC26564b != null) {
            handlerC26564b.m41169a(i, z);
        } else {
            C26586j.m41074b(f69679d, "*** impossible, upload timer should not be null");
        }
    }

    /* renamed from: a */
    public boolean m41153a(int i) {
        int i2;
        ArrayList<C26531c> arrayList;
        try {
            i2 = 0;
        } catch (Exception unused) {
        }
        if (m41137i()) {
            int i3 = 100;
            while (true) {
                if (C26586j.f69734a) {
                    i3 = 1000;
                }
                if (i2 < i3) {
                    C26563a m41263a = C26542f.m41264a().m41263a(i);
                    if (m41263a == null || (arrayList = m41263a.f69661a) == null || arrayList.size() == 0) {
                        break;
                    }
                    C26565c.m41161b(m41263a);
                    if (m41263a.f69664d) {
                        C26586j.m41080a(f69679d, "No more records ");
                        break;
                    }
                    i2++;
                } else {
                    return true;
                }
            }
            C26586j.m41080a(f69679d, "满足条件的记录为空，即将返回");
            return true;
        }
        return false;
    }
}
