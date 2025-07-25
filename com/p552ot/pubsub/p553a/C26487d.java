package com.p552ot.pubsub.p553a;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.text.TextUtils;
import android.util.Log;
import com.p552ot.pubsub.Configuration;
import com.p552ot.pubsub.PubSubMainThreadException;
import com.p552ot.pubsub.PubSubTrack;
import com.p552ot.pubsub.p559g.C26537b;
import com.p552ot.pubsub.p559g.C26546i;
import com.p552ot.pubsub.p564j.C26566d;
import com.p552ot.pubsub.util.C26577b;
import com.p552ot.pubsub.util.C26580e;
import com.p552ot.pubsub.util.C26582g;
import com.p552ot.pubsub.util.C26586j;
import com.p552ot.pubsub.util.C26590l;
import com.p552ot.pubsub.util.C26591m;
import com.p552ot.pubsub.util.C26596q;
import com.p552ot.pubsub.util.C26597r;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: com.ot.pubsub.a.d */
/* loaded from: classes7.dex */
public class C26487d {

    /* renamed from: a */
    public static final int f69247a = 1;

    /* renamed from: b */
    public static final int f69248b = 2;

    /* renamed from: c */
    private static final String f69249c = "PubSubTrackImp";

    /* renamed from: e */
    private static ExecutorService f69250e;

    /* renamed from: d */
    private InterfaceC26486c f69251d;

    /* renamed from: f */
    private PubSubTrack.ICommonPropertyProvider f69252f;

    /* renamed from: g */
    private Context f69253g;

    /* renamed from: h */
    private Configuration f69254h;

    /* renamed from: i */
    private C26596q f69255i;

    /* renamed from: j */
    private PubSubTrack.IEventHook f69256j;

    /* renamed from: k */
    private BroadcastReceiver f69257k = new C26494k(this);

    public C26487d(Context context, Configuration configuration) {
        Context applicationContext = context.getApplicationContext();
        this.f69253g = applicationContext;
        this.f69254h = configuration;
        m41476a(applicationContext);
    }

    /* renamed from: c */
    private void m41462c() {
        try {
            Context m41116b = C26577b.m41116b();
            if (m41116b == null) {
                return;
            }
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            m41116b.registerReceiver(this.f69257k, intentFilter);
        } catch (Exception e) {
            C26586j.m41072b(f69249c, "registerScreenReceiver: %s", e.toString());
        }
    }

    /* renamed from: d */
    private void m41459d() {
        try {
            Context m41116b = C26577b.m41116b();
            if (m41116b == null) {
                return;
            }
            ((Application) m41116b).registerActivityLifecycleCallbacks(new C26493j(this));
        } catch (Exception e) {
            C26586j.m41080a(f69249c, "registerLifecycleCallback: " + e);
        }
    }

    /* renamed from: e */
    public void m41456e() {
        if (C26546i.m41241c()) {
            C26580e.m41105a(new RunnableC26496m(this));
        }
    }

    /* renamed from: a */
    private void m41476a(Context context) {
        C26590l.m41048a(this.f69254h.isInternational(), this.f69254h.getRegion());
        if (f69250e == null) {
            f69250e = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue());
        }
        C26596q c26596q = new C26596q(this.f69254h);
        this.f69255i = c26596q;
        this.f69251d = new C26500q(this.f69253g, this.f69254h, c26596q);
        m41462c();
        C26590l.m41049a(this.f69254h.isOverrideMiuiRegionSetting());
        m41459d();
        f69250e.execute(new RunnableC26488e(this));
    }

    /* renamed from: b */
    public void m41463b(String str) {
        f69250e.execute(new RunnableC26490g(this, str));
    }

    /* renamed from: b */
    public String m41466b() throws PubSubMainThreadException {
        if (C26597r.m41006a()) {
            if (!C26586j.f69734a) {
                Log.e(f69249c, "getInstanceId() throw exception : Don't use it on the main thread");
                return "";
            }
            throw new PubSubMainThreadException("Don't use it on the main thread");
        }
        return C26537b.m41287a().m41284b();
    }

    /* renamed from: d */
    public JSONObject m41457d(String str) {
        try {
            PubSubTrack.ICommonPropertyProvider iCommonPropertyProvider = this.f69252f;
            JSONObject m41028a = C26591m.m41028a(iCommonPropertyProvider != null ? iCommonPropertyProvider.getDynamicProperty(str) : null, false);
            String m41099a = C26582g.m41099a(C26591m.m41035a(this.f69254h));
            return C26591m.m41027a(m41028a, !TextUtils.isEmpty(m41099a) ? new JSONObject(m41099a) : null);
        } catch (Exception e) {
            C26586j.m41074b(f69249c, "getCommonProperty: " + e.toString());
            return null;
        }
    }

    /* renamed from: c */
    public boolean m41460c(String str) {
        boolean m41033a = C26591m.m41033a(str);
        if (!m41033a) {
            C26586j.m41074b(f69249c, String.format("Invalid eventname: %s. Eventname can only consist of numbers, letters, underscores ,and can not start with a number or \"onetrack_\" or \"ot_\"", str));
        }
        return !m41033a;
    }

    /* renamed from: a */
    public void m41469a(String str, String str2, String str3, Map<String, String> map, boolean z) {
        f69250e.execute(new RunnableC26491h(this, str, str2, str3, map, z));
    }

    /* renamed from: a */
    public void m41470a(String str, String str2, String str3, Map<String, Object> map, Map<String, String> map2) {
        f69250e.execute(new RunnableC26492i(this, str3, map, str, str2, map2));
    }

    /* renamed from: a */
    public void m41477a(int i) {
        C26566d.m41154a().m41147b(i);
    }

    /* renamed from: a */
    public void m41474a(PubSubTrack.IEventHook iEventHook) {
        this.f69256j = iEventHook;
        this.f69255i.m41013a(iEventHook);
    }

    /* renamed from: a */
    public void m41475a(PubSubTrack.ICommonPropertyProvider iCommonPropertyProvider) {
        this.f69252f = iCommonPropertyProvider;
    }

    /* renamed from: a */
    public void m41468a(Map<String, Object> map) {
        if (map == null) {
            return;
        }
        f69250e.execute(new RunnableC26497n(this, map));
    }

    /* renamed from: a */
    public void m41478a() {
        f69250e.execute(new RunnableC26498o(this));
    }

    /* renamed from: a */
    public void m41471a(String str) {
        f69250e.execute(new RunnableC26499p(this, str));
    }

    /* renamed from: a */
    public void m41467a(boolean z) {
        if (this.f69254h.isUseCustomPrivacyPolicy()) {
            f69250e.execute(new RunnableC26489f(this, z));
        }
    }
}
