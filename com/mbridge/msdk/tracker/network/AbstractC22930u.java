package com.mbridge.msdk.tracker.network;

import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import com.ironsource.C20517nb;
import com.mbridge.msdk.tracker.network.C22899ae;
import com.mbridge.msdk.tracker.network.C22937w;
import com.mbridge.msdk.tracker.network.InterfaceC22902b;
import com.mbridge.msdk.tracker.network.toolbox.DefaultCacheKeyGenerator;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Request.java */
/* renamed from: com.mbridge.msdk.tracker.network.u */
/* loaded from: classes6.dex */
public abstract class AbstractC22930u<T> implements Comparable<AbstractC22930u<T>> {

    /* renamed from: a */
    private CacheKeyGenerator f59841a;

    /* renamed from: b */
    private String f59842b;

    /* renamed from: c */
    private volatile NetworkMonitor f59843c;

    /* renamed from: d */
    private long f59844d;

    /* renamed from: e */
    private Map<String, String> f59845e;

    /* renamed from: f */
    private final C22899ae.C22900a f59846f;

    /* renamed from: g */
    private int f59847g;

    /* renamed from: h */
    private final String f59848h;

    /* renamed from: i */
    private final int f59849i;

    /* renamed from: j */
    private final String f59850j;

    /* renamed from: k */
    private final int f59851k;

    /* renamed from: l */
    private final Object f59852l;

    /* renamed from: m */
    private C22937w.InterfaceC22938a f59853m;

    /* renamed from: n */
    private Integer f59854n;

    /* renamed from: o */
    private C22933v f59855o;

    /* renamed from: p */
    private boolean f59856p;

    /* renamed from: q */
    private boolean f59857q;

    /* renamed from: r */
    private boolean f59858r;

    /* renamed from: s */
    private boolean f59859s;

    /* renamed from: t */
    private boolean f59860t;

    /* renamed from: u */
    private InterfaceC22941z f59861u;

    /* renamed from: v */
    private InterfaceC22902b.C22903a f59862v;

    /* renamed from: w */
    private InterfaceC22931a f59863w;

    /* renamed from: x */
    private long f59864x;

    /* compiled from: Request.java */
    /* renamed from: com.mbridge.msdk.tracker.network.u$a */
    /* loaded from: classes6.dex */
    interface InterfaceC22931a {
        /* renamed from: a */
        void m49387a(AbstractC22930u<?> abstractC22930u);

        /* renamed from: a */
        void m49386a(AbstractC22930u<?> abstractC22930u, C22937w<?> c22937w);
    }

    /* compiled from: Request.java */
    /* renamed from: com.mbridge.msdk.tracker.network.u$b */
    /* loaded from: classes6.dex */
    public enum EnumC22932b {
        LOW,
        NORMAL,
        HIGH,
        IMMEDIATE
    }

    public AbstractC22930u(int i, String str) {
        this(i, str, 0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C22937w<T> mo49324a(C22913r c22913r);

    /* renamed from: a */
    protected Map<String, String> mo49325a() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo49320a(T t);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final void m49417b(int i) {
        C22933v c22933v = this.f59855o;
        if (c22933v != null) {
            c22933v.m49382a(this, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final void m49413c(String str) {
        C22933v c22933v = this.f59855o;
        if (c22933v != null) {
            c22933v.m49379b(this);
        }
    }

    @Override // java.lang.Comparable
    public /* synthetic */ int compareTo(Object obj) {
        AbstractC22930u abstractC22930u = (AbstractC22930u) obj;
        EnumC22932b mo49315e = mo49315e();
        EnumC22932b mo49315e2 = abstractC22930u.mo49315e();
        if (mo49315e == mo49315e2) {
            return this.f59854n.intValue() - abstractC22930u.f59854n.intValue();
        }
        return mo49315e2.ordinal() - mo49315e.ordinal();
    }

    /* renamed from: d */
    public boolean mo49316d() {
        return false;
    }

    /* renamed from: e */
    public EnumC22932b mo49315e() {
        return EnumC22932b.NORMAL;
    }

    /* renamed from: f */
    public final String m49408f() {
        return this.f59850j;
    }

    /* renamed from: g */
    public final long m49407g() {
        return SystemClock.elapsedRealtime() - this.f59844d;
    }

    /* renamed from: h */
    public final int m49406h() {
        return this.f59849i;
    }

    /* renamed from: i */
    public final int m49405i() {
        return this.f59847g;
    }

    /* renamed from: j */
    public final int m49404j() {
        return this.f59851k;
    }

    /* renamed from: k */
    public final String m49403k() {
        return this.f59848h;
    }

    /* renamed from: l */
    public final String m49402l() {
        if (!TextUtils.isEmpty(this.f59842b)) {
            return this.f59842b;
        }
        if (this.f59841a == null) {
            this.f59841a = new DefaultCacheKeyGenerator();
        }
        String mo49446a = this.f59841a.mo49446a(this);
        this.f59842b = mo49446a;
        return mo49446a;
    }

    /* renamed from: m */
    public final InterfaceC22902b.C22903a m49401m() {
        return this.f59862v;
    }

    /* renamed from: n */
    public final boolean m49400n() {
        boolean z;
        synchronized (this.f59852l) {
            z = this.f59857q;
        }
        return z;
    }

    /* renamed from: o */
    public final String m49399o() {
        return "application/x-www-form-urlencoded; charset=UTF-8";
    }

    /* renamed from: p */
    public final byte[] m49398p() {
        Map<String, String> mo49325a = mo49325a();
        if (mo49325a != null && mo49325a.size() > 0) {
            byte[] m49418a = m49418a(mo49325a, "UTF-8");
            this.f59864x = m49418a.length;
            return m49418a;
        }
        this.f59864x = 0L;
        return null;
    }

    /* renamed from: q */
    public final long m49397q() {
        return this.f59864x;
    }

    /* renamed from: r */
    public final boolean m49396r() {
        return this.f59856p;
    }

    /* renamed from: s */
    public final boolean m49395s() {
        return this.f59859s;
    }

    /* renamed from: t */
    public final boolean m49394t() {
        return this.f59860t;
    }

    public String toString() {
        String str;
        String str2 = "0x" + Integer.toHexString(this.f59851k);
        StringBuilder sb2 = new StringBuilder();
        if (m49400n()) {
            str = "[X] ";
        } else {
            str = "[ ] ";
        }
        sb2.append(str);
        sb2.append(this.f59848h);
        sb2.append(" ");
        sb2.append(str2);
        sb2.append(" ");
        sb2.append(mo49315e());
        sb2.append(" ");
        sb2.append(this.f59854n);
        return sb2.toString();
    }

    /* renamed from: u */
    public final int m49393u() {
        InterfaceC22941z mo49318b = mo49318b();
        if (mo49318b == null) {
            return 30000;
        }
        return mo49318b.mo49367a();
    }

    /* renamed from: v */
    public final long m49392v() {
        InterfaceC22941z mo49318b = mo49318b();
        if (mo49318b == null) {
            return 30000L;
        }
        long mo49365b = mo49318b.mo49365b();
        if (mo49365b < 0) {
            return 30000L;
        }
        return mo49365b;
    }

    /* renamed from: w */
    public final void m49391w() {
        synchronized (this.f59852l) {
            this.f59858r = true;
        }
    }

    /* renamed from: x */
    public final boolean m49390x() {
        boolean z;
        synchronized (this.f59852l) {
            z = this.f59858r;
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y */
    public final void m49389y() {
        InterfaceC22931a interfaceC22931a;
        synchronized (this.f59852l) {
            interfaceC22931a = this.f59863w;
        }
        if (interfaceC22931a != null) {
            interfaceC22931a.m49387a(this);
        }
    }

    /* renamed from: z */
    public final NetworkMonitor m49388z() {
        return this.f59843c;
    }

    public AbstractC22930u(int i, String str, int i2) {
        this(i, str, i2, "un_known");
    }

    /* renamed from: a */
    public final void m49420a(C22937w.InterfaceC22938a interfaceC22938a) {
        this.f59853m = interfaceC22938a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: d */
    public final AbstractC22930u<?> m49409d(boolean z) {
        this.f59860t = z;
        return this;
    }

    public AbstractC22930u(int i, String str, int i2, String str2) {
        Uri parse;
        String host;
        this.f59846f = null;
        this.f59852l = new Object();
        int i3 = 0;
        this.f59856p = false;
        this.f59857q = false;
        this.f59858r = false;
        this.f59859s = false;
        this.f59860t = false;
        this.f59862v = null;
        this.f59864x = 0L;
        this.f59847g = i;
        this.f59848h = str;
        this.f59849i = i2;
        this.f59850j = str2;
        this.f59861u = new C22905e();
        if (!TextUtils.isEmpty(str) && (parse = Uri.parse(str)) != null && (host = parse.getHost()) != null) {
            i3 = host.hashCode();
        }
        this.f59851k = i3;
        this.f59844d = SystemClock.elapsedRealtime();
    }

    /* renamed from: a */
    public final void m49423a(int i) {
        this.f59847g = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public final AbstractC22930u<?> m49415b(boolean z) {
        this.f59856p = z;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: c */
    public final AbstractC22930u<?> m49414c(int i) {
        this.f59854n = Integer.valueOf(i);
        return this;
    }

    /* renamed from: d */
    public final String m49410d(String str) {
        if (this.f59845e != null && !TextUtils.isEmpty(str)) {
            try {
                return this.f59845e.get(str);
            } catch (Exception unused) {
            }
        }
        return "";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public final AbstractC22930u<?> m49421a(C22933v c22933v) {
        this.f59855o = c22933v;
        return this;
    }

    /* renamed from: b */
    public InterfaceC22941z mo49318b() {
        return this.f59861u;
    }

    /* renamed from: c */
    public Map<String, String> mo49317c() {
        return Collections.emptyMap();
    }

    /* renamed from: a */
    private byte[] m49418a(Map<String, String> map, String str) {
        StringBuilder sb2 = new StringBuilder();
        try {
            int i = 0;
            for (Map.Entry<String, String> entry : map.entrySet()) {
                i++;
                if (entry.getKey() != null) {
                    sb2.append(URLEncoder.encode(entry.getKey(), str));
                    sb2.append(C20517nb.f52173T);
                    sb2.append(URLEncoder.encode(entry.getValue() == null ? "" : entry.getValue(), str));
                    if (i <= map.size() - 1) {
                        sb2.append('&');
                    }
                }
            }
            return sb2.toString().getBytes(str);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("Encoding not supported: " + str, e);
        }
    }

    /* renamed from: b */
    public final void m49416b(AbstractC22898ad abstractC22898ad) {
        C22937w.InterfaceC22938a interfaceC22938a;
        synchronized (this.f59852l) {
            interfaceC22938a = this.f59853m;
        }
        if (interfaceC22938a != null) {
            interfaceC22938a.mo49372a(abstractC22898ad);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: c */
    public final AbstractC22930u<?> m49411c(boolean z) {
        this.f59859s = z;
        return this;
    }

    /* renamed from: c */
    public final void m49412c(String str, String str2) {
        if (this.f59845e == null) {
            this.f59845e = new HashMap();
        }
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            try {
                this.f59845e.put(str, str2);
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m49419a(C22937w<?> c22937w) {
        InterfaceC22931a interfaceC22931a;
        synchronized (this.f59852l) {
            interfaceC22931a = this.f59863w;
        }
        if (interfaceC22931a != null) {
            interfaceC22931a.m49386a(this, c22937w);
        }
    }

    /* renamed from: a */
    public final void m49422a(NetworkMonitor networkMonitor) {
        this.f59843c = networkMonitor;
    }
}
