package com.ironsource;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.ironsource.AbstractC20325m7;
import com.ironsource.C21114v8;
import com.ironsource.InterfaceC20045he;
import com.ironsource.InterfaceC20575ob;
import com.ironsource.mediationsdk.C20423p;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.IronSourceSegment;
import com.ironsource.mediationsdk.events.ISErrorListener;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.m7 */
/* loaded from: classes6.dex */
public abstract class AbstractC20325m7 implements InterfaceC19970ge {

    /* renamed from: A */
    private int[] f51138A;

    /* renamed from: B */
    private int[] f51139B;

    /* renamed from: C */
    private int[] f51140C;

    /* renamed from: G */
    int f51144G;

    /* renamed from: H */
    String f51145H;

    /* renamed from: I */
    String f51146I;

    /* renamed from: J */
    Set<Integer> f51147J;

    /* renamed from: K */
    private HandlerThreadC20336mb f51148K;

    /* renamed from: L */
    private IronSourceSegment f51149L;

    /* renamed from: M */
    private C19786dr f51150M;

    /* renamed from: N */
    private ISErrorListener f51151N;

    /* renamed from: l */
    private boolean f51164l;

    /* renamed from: p */
    private C20679q9 f51168p;

    /* renamed from: q */
    private AbstractC19795e f51169q;

    /* renamed from: r */
    private ArrayList<C20200kb> f51170r;

    /* renamed from: t */
    private int f51172t;

    /* renamed from: u */
    private InterfaceC20151jg f51173u;

    /* renamed from: v */
    private Context f51174v;

    /* renamed from: z */
    private int[] f51178z;

    /* renamed from: a */
    final int f51153a = 1;

    /* renamed from: b */
    final int f51154b = 100;

    /* renamed from: c */
    final int f51155c = 5000;

    /* renamed from: d */
    final int f51156d = 90000;

    /* renamed from: e */
    final int f51157e = 1024;

    /* renamed from: f */
    final int f51158f = 5;

    /* renamed from: g */
    final String f51159g = "supersonic_sdk.db";

    /* renamed from: h */
    final String f51160h = IronSourceConstants.EVENTS_PROVIDER;

    /* renamed from: i */
    final String f51161i = "placement";

    /* renamed from: j */
    private final String f51162j = C19577ad.f49149x0;

    /* renamed from: k */
    private final String f51163k = C19577ad.f49057I0;

    /* renamed from: m */
    private boolean f51165m = false;

    /* renamed from: n */
    private boolean f51166n = false;

    /* renamed from: o */
    private int f51167o = -1;

    /* renamed from: s */
    private boolean f51171s = true;

    /* renamed from: w */
    private int f51175w = 100;

    /* renamed from: x */
    private int f51176x = 5000;

    /* renamed from: y */
    private int f51177y = 1;

    /* renamed from: D */
    private Map<String, String> f51141D = new HashMap();

    /* renamed from: E */
    private Map<String, String> f51142E = new HashMap();

    /* renamed from: F */
    private String f51143F = "";

    /* renamed from: O */
    private final Object f51152O = new Object();

    /* renamed from: com.ironsource.m7$a */
    /* loaded from: classes6.dex */
    public class RunnableC20326a implements Runnable {
        RunnableC20326a() {
            AbstractC20325m7.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC20325m7.this.m57289a();
        }
    }

    /* renamed from: com.ironsource.m7$b */
    /* loaded from: classes6.dex */
    public class RunnableC20327b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C20200kb f51180a;

        /* renamed from: b */
        final /* synthetic */ IronSource.AD_UNIT f51181b;

        RunnableC20327b(C20200kb c20200kb, IronSource.AD_UNIT ad_unit) {
            AbstractC20325m7.this = r1;
            this.f51180a = c20200kb;
            this.f51181b = ad_unit;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean mo53773d;
            this.f51180a.m57655a("eventSessionId", AbstractC20325m7.this.f51173u.mo54726b());
            this.f51180a.m57655a("essn", Integer.valueOf(AbstractC20325m7.this.f51173u.mo54724c()));
            String connectionType = IronSourceUtils.getConnectionType(AbstractC20325m7.this.f51174v);
            if (AbstractC20325m7.this.mo53770g(this.f51180a)) {
                this.f51180a.m57655a(C21114v8.C21123i.f54168t, connectionType);
            }
            if (AbstractC20325m7.this.m57263a(connectionType, this.f51180a)) {
                C20200kb c20200kb = this.f51180a;
                c20200kb.m57657a(AbstractC20325m7.this.m57253b(c20200kb));
            }
            String m55376d = C20793s8.m55376d(AbstractC20325m7.this.f51174v);
            if (m55376d != null) {
                this.f51180a.m57655a(C21114v8.C21123i.f54169u, m55376d);
            }
            int m57287a = AbstractC20325m7.this.m57287a(this.f51180a.m57653c(), this.f51181b);
            if (m57287a != EnumC20330e.NOT_SUPPORTED.m57215a()) {
                this.f51180a.m57655a("adUnit", Integer.valueOf(m57287a));
            }
            AbstractC20325m7.this.m57281a(this.f51180a, "reason");
            AbstractC20325m7.this.m57281a(this.f51180a, IronSourceConstants.EVENTS_EXT1);
            if (!AbstractC20325m7.this.f51142E.isEmpty()) {
                for (Map.Entry entry : AbstractC20325m7.this.f51142E.entrySet()) {
                    if (!this.f51180a.m57654b().has((String) entry.getKey()) && entry.getKey() != "eventId" && entry.getKey() != "timestamp") {
                        this.f51180a.m57655a((String) entry.getKey(), entry.getValue());
                    }
                }
            }
            if (AbstractC20325m7.this.m57225i(this.f51180a)) {
                if (AbstractC20325m7.this.mo53769h(this.f51180a) && !AbstractC20325m7.this.m57234e(this.f51180a)) {
                    this.f51180a.m57655a("sessionDepth", Integer.valueOf(AbstractC20325m7.this.mo53775c(this.f51180a)));
                }
                if (AbstractC20325m7.this.mo53768j(this.f51180a)) {
                    AbstractC20325m7.this.mo53771f(this.f51180a);
                }
                long mo54729a = AbstractC20325m7.this.f51173u.mo54729a();
                if (mo54729a > 0) {
                    this.f51180a.m57655a("firstSessionTimestamp", Long.valueOf(mo54729a));
                }
                IronLog.EVENT.verbose(this.f51180a.toString());
                AbstractC20325m7.this.f51170r.add(this.f51180a);
                AbstractC20325m7.m57237d(AbstractC20325m7.this);
            }
            AbstractC20325m7 abstractC20325m7 = AbstractC20325m7.this;
            if (abstractC20325m7.m57257a(abstractC20325m7.f51139B)) {
                mo53773d = AbstractC20325m7.this.m57286a(this.f51180a.m57653c(), AbstractC20325m7.this.f51139B);
            } else {
                mo53773d = AbstractC20325m7.this.mo53773d(this.f51180a);
            }
            if (!AbstractC20325m7.this.f51165m && mo53773d) {
                AbstractC20325m7.this.f51165m = true;
            }
            if (AbstractC20325m7.this.f51168p != null) {
                if (AbstractC20325m7.this.m57229g()) {
                    AbstractC20325m7.this.m57232f();
                    return;
                }
                AbstractC20325m7 abstractC20325m72 = AbstractC20325m7.this;
                if (abstractC20325m72.m57248b(abstractC20325m72.f51170r) || mo53773d) {
                    AbstractC20325m7.this.m57289a();
                }
            }
        }
    }

    /* renamed from: com.ironsource.m7$c */
    /* loaded from: classes6.dex */
    public class C20328c implements InterfaceC20045he {
        C20328c() {
            AbstractC20325m7.this = r1;
        }

        /* renamed from: b */
        public /* synthetic */ void m57216b(InterfaceC20045he.C20046a c20046a) {
            try {
                if (c20046a.m58157c()) {
                    ArrayList<C20200kb> mo55662a = AbstractC20325m7.this.f51168p.mo55662a(AbstractC20325m7.this.f51146I);
                    AbstractC20325m7.this.f51172t = mo55662a.size() + AbstractC20325m7.this.f51170r.size();
                } else {
                    IronLog.INTERNAL.error("Failed to send events. Saving them back to storage.");
                    AbstractC20325m7.this.mo53776a(AbstractC20325m7.this.m57262a(c20046a.m58158b(), c20046a.m58162a()));
                }
            } catch (Exception e) {
                C20086i9.m57997d().m58003a(e);
                if (AbstractC20325m7.this.f51151N != null) {
                    AbstractC20325m7.this.f51151N.onError(new IllegalStateException("Error on sending data ", e));
                }
            }
            m57217a(c20046a.m58158b());
        }

        @Override // com.ironsource.InterfaceC20045he
        /* renamed from: a */
        public synchronized void mo57219a(final InterfaceC20045he.C20046a c20046a) {
            AbstractC20325m7.this.f51148K.m57105a(new Runnable() { // from class: com.ironsource.qx
                {
                    AbstractC20325m7.C20328c.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC20325m7.C20328c.this.m57216b(c20046a);
                }
            });
        }

        /* renamed from: a */
        public void m57217a(ArrayList<C20200kb> arrayList) {
            if (arrayList != null) {
                try {
                    arrayList.clear();
                } catch (Exception e) {
                    C20086i9.m57997d().m58003a(e);
                    IronLog ironLog = IronLog.INTERNAL;
                    ironLog.error("clearData exception: " + e.getMessage());
                }
            }
        }
    }

    /* renamed from: com.ironsource.m7$d */
    /* loaded from: classes6.dex */
    public class RunnableC20329d implements Runnable {
        RunnableC20329d() {
            AbstractC20325m7.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC20325m7.this.m57232f();
        }
    }

    /* renamed from: com.ironsource.m7$e */
    /* loaded from: classes6.dex */
    public enum EnumC20330e {
        NOT_SUPPORTED(-1),
        INTERSTITIAL(2),
        REWARDED_VIDEO(3),
        NATIVE_AD(4),
        BANNER(8);
        

        /* renamed from: a */
        private int f51191a;

        EnumC20330e(int i) {
            this.f51191a = i;
        }

        /* renamed from: a */
        public int m57215a() {
            return this.f51191a;
        }
    }

    /* renamed from: a */
    public int m57287a(int i, @Nullable IronSource.AD_UNIT ad_unit) {
        EnumC20330e enumC20330e;
        int m57215a = EnumC20330e.NOT_SUPPORTED.m57215a();
        if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO || ((i >= 1000 && i < 2000) || (i >= 91000 && i < 92000))) {
            enumC20330e = EnumC20330e.REWARDED_VIDEO;
        } else if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL || ((i >= 2000 && i < 3000) || (i >= 92000 && i < 93000))) {
            enumC20330e = EnumC20330e.INTERSTITIAL;
        } else if (ad_unit == IronSource.AD_UNIT.BANNER || ((i >= 3000 && i < 4000) || (i >= 93000 && i < 94000))) {
            enumC20330e = EnumC20330e.BANNER;
        } else if (ad_unit != IronSource.AD_UNIT.NATIVE_AD && ((i < 4000 || i >= 5000) && (i < 94000 || i >= 95000))) {
            return m57215a;
        } else {
            enumC20330e = EnumC20330e.NATIVE_AD;
        }
        return enumC20330e.m57215a();
    }

    /* renamed from: b */
    public synchronized int m57253b(C20200kb c20200kb) {
        return c20200kb.m57653c() + 90000;
    }

    /* renamed from: d */
    static /* synthetic */ int m57237d(AbstractC20325m7 abstractC20325m7) {
        int i = abstractC20325m7.f51172t;
        abstractC20325m7.f51172t = i + 1;
        return i;
    }

    /* renamed from: c */
    protected abstract int mo53775c(C20200kb c20200kb);

    /* renamed from: d */
    abstract void mo53774d();

    /* renamed from: d */
    protected abstract boolean mo53773d(C20200kb c20200kb);

    /* renamed from: e */
    protected abstract String mo53772e(int i);

    /* renamed from: e */
    public void m57235e() {
        this.f51170r = new ArrayList<>();
        this.f51172t = 0;
        this.f51169q = C20751rb.m55519a(this.f51145H, this.f51144G);
        HandlerThreadC20336mb handlerThreadC20336mb = new HandlerThreadC20336mb(this.f51146I + "EventThread");
        this.f51148K = handlerThreadC20336mb;
        handlerThreadC20336mb.start();
        this.f51148K.m57106a();
        this.f51173u = C19821el.m58797N().mo57095h();
        this.f51147J = new HashSet();
        mo53774d();
    }

    /* renamed from: f */
    public int m57231f(int i) {
        return m57287a(i, (IronSource.AD_UNIT) null);
    }

    /* renamed from: f */
    protected abstract void mo53771f(C20200kb c20200kb);

    /* renamed from: h */
    public void m57227h() {
        this.f51148K.m57105a(new RunnableC20329d());
    }

    /* renamed from: j */
    protected abstract boolean mo53768j(C20200kb c20200kb);

    /* renamed from: e */
    public boolean m57234e(C20200kb c20200kb) {
        JSONObject m57654b = c20200kb.m57654b();
        if (m57654b == null) {
            return false;
        }
        return m57654b.has("sessionDepth");
    }

    /* renamed from: f */
    public void m57232f() {
        ArrayList<C20200kb> mo55662a;
        try {
            this.f51165m = false;
            ArrayList<C20200kb> arrayList = new ArrayList<>();
            synchronized (this.f51152O) {
                mo55662a = this.f51168p.mo55662a(this.f51146I);
                this.f51168p.mo55659b(this.f51146I);
            }
            InterfaceC20575ob.C20578c c20578c = new InterfaceC20575ob.C20578c(new InterfaceC20575ob.C20576a(mo55662a, this.f51170r), this.f51176x);
            this.f51168p.mo55661a(c20578c.m56036a(), this.f51146I);
            arrayList.addAll(c20578c.m56035b());
            if (arrayList.size() > 0) {
                this.f51170r.clear();
                this.f51172t = 0;
                JSONObject m54143b = C21220xc.m54147a().m54143b();
                m57259a(m54143b);
                String m57255b = m57255b();
                if (!TextUtils.isEmpty(m57255b)) {
                    m54143b.put(C19577ad.f49149x0, m57255b);
                }
                String m56607q = C20423p.m56615m().m56607q();
                if (!TextUtils.isEmpty(m56607q)) {
                    m54143b.put(C19577ad.f49057I0, m56607q);
                }
                Map<String, String> m57244c = m57244c();
                if (!m57244c.isEmpty()) {
                    for (Map.Entry<String, String> entry : m57244c.entrySet()) {
                        if (!m54143b.has(entry.getKey())) {
                            m54143b.put(entry.getKey(), entry.getValue());
                        }
                    }
                }
                JSONObject m54804a = new C21009tb().m54804a();
                Iterator<String> keys = m54804a.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    m54143b.put(next, m54804a.get(next));
                }
                String mo56109a = this.f51169q.mo56109a(arrayList, m54143b);
                if (TextUtils.isEmpty(mo56109a)) {
                    IronLog.INTERNAL.error("Failed to parse events.");
                    ISErrorListener iSErrorListener = this.f51151N;
                    if (iSErrorListener != null) {
                        iSErrorListener.onError(new IllegalStateException("Event parse failed"));
                        return;
                    }
                    return;
                }
                if (this.f51166n) {
                    try {
                        mo56109a = Base64.encodeToString(C20972si.m54955a(mo56109a, this.f51167o), 0);
                    } catch (Exception e) {
                        C20086i9.m57997d().m58003a(e);
                        ISErrorListener iSErrorListener2 = this.f51151N;
                        if (iSErrorListener2 != null) {
                            iSErrorListener2.onError(new IllegalStateException("Error on compression: ", e));
                        }
                    }
                }
                C20289ls.f51040a.m57366a(new RunnableC21069ub(new C20328c(), mo56109a, this.f51169q.m58838b(), arrayList));
            }
        } catch (Throwable th) {
            C20086i9.m57997d().m58003a(th);
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.error("Send event exception: " + th.getMessage());
        }
    }

    /* renamed from: g */
    public boolean m57229g() {
        return (this.f51172t >= this.f51175w || this.f51165m) && this.f51164l;
    }

    /* renamed from: i */
    public boolean m57225i(C20200kb c20200kb) {
        if (c20200kb != null) {
            if (m57257a(this.f51178z)) {
                return true ^ m57286a(c20200kb.m57653c(), this.f51178z);
            }
            if (m57257a(this.f51138A)) {
                return m57286a(c20200kb.m57653c(), this.f51138A);
            }
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public Map<String, String> m57244c() {
        return this.f51141D;
    }

    @Override // com.ironsource.InterfaceC19970ge
    /* renamed from: d */
    public void mo57238d(int i) {
        this.f51167o = i;
    }

    /* renamed from: h */
    protected boolean mo53769h(C20200kb c20200kb) {
        return (c20200kb.m57653c() == 14 || c20200kb.m57653c() == 114 || c20200kb.m57653c() == 514 || c20200kb.m57653c() == 515 || c20200kb.m57653c() == 516 || c20200kb.m57653c() == 140 || c20200kb.m57653c() == 40 || c20200kb.m57653c() == 41 || c20200kb.m57653c() == 50 || c20200kb.m57653c() == 51 || c20200kb.m57653c() == 52) ? false : true;
    }

    /* renamed from: b */
    public String m57255b() {
        return this.f51143F;
    }

    @Override // com.ironsource.InterfaceC19970ge
    /* renamed from: c */
    public void mo57243c(int i) {
        if (i > 0) {
            this.f51177y = i;
        }
    }

    @Override // com.ironsource.InterfaceC19970ge
    /* renamed from: d */
    public void mo57236d(int[] iArr, Context context) {
        this.f51140C = iArr;
        IronSourceUtils.saveDefaultNonConnectivityEvents(context, this.f51146I, iArr);
    }

    /* renamed from: g */
    protected boolean mo53770g(C20200kb c20200kb) {
        return (c20200kb.m57653c() == 40 || c20200kb.m57653c() == 41 || c20200kb.m57653c() == 50 || c20200kb.m57653c() == 51 || c20200kb.m57653c() == 52) ? false : true;
    }

    @Override // com.ironsource.InterfaceC19970ge
    /* renamed from: b */
    public void mo57254b(int i) {
        if (i > 0) {
            this.f51175w = i;
        }
    }

    /* renamed from: c */
    public void m57240c(boolean z) {
        this.f51164l = z;
    }

    /* renamed from: b */
    private void m57250b(String str) {
        AbstractC19795e abstractC19795e = this.f51169q;
        if (abstractC19795e == null || !abstractC19795e.mo56108c().equals(str)) {
            this.f51169q = C20751rb.m55519a(str, this.f51144G);
        }
    }

    /* renamed from: a */
    String m57265a(String str, int i) {
        return (TextUtils.isEmpty(str) || str.length() <= i) ? str : str.substring(0, i);
    }

    @Override // com.ironsource.InterfaceC19970ge
    /* renamed from: c */
    public void mo57239c(int[] iArr, Context context) {
        this.f51178z = iArr;
        IronSourceUtils.saveDefaultOptOutEvents(context, this.f51146I, iArr);
    }

    @Override // com.ironsource.InterfaceC19970ge
    /* renamed from: b */
    public void mo57249b(String str, Context context) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        AbstractC19795e abstractC19795e = this.f51169q;
        if (abstractC19795e != null) {
            abstractC19795e.m58840a(str);
        }
        IronSourceUtils.saveDefaultEventsURL(context, this.f51146I, str);
    }

    /* renamed from: a */
    public ArrayList<C20200kb> m57262a(ArrayList<C20200kb> arrayList, String str) {
        String m57265a = m57265a(str, 1024);
        Iterator<C20200kb> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().m57656a(m57265a);
        }
        return arrayList;
    }

    /* renamed from: b */
    public void m57247b(Map<String, String> map) {
        this.f51142E.putAll(map);
    }

    /* renamed from: a */
    public void m57289a() {
        synchronized (this.f51152O) {
            this.f51168p.mo55661a(this.f51170r, this.f51146I);
            this.f51170r.clear();
        }
    }

    @Override // com.ironsource.InterfaceC19970ge
    /* renamed from: b */
    public void mo57246b(boolean z) {
        this.f51171s = z;
    }

    @Override // com.ironsource.InterfaceC19970ge
    /* renamed from: a */
    public void mo57288a(int i) {
        if (i > 0) {
            this.f51176x = i;
        }
    }

    @Override // com.ironsource.InterfaceC19970ge
    /* renamed from: b */
    public void mo57245b(int[] iArr, Context context) {
        this.f51139B = iArr;
        IronSourceUtils.saveDefaultTriggerEvents(context, this.f51146I, iArr);
    }

    /* renamed from: a */
    public synchronized void m57285a(Context context, IronSourceSegment ironSourceSegment) {
        String defaultEventsFormatterType = IronSourceUtils.getDefaultEventsFormatterType(context, this.f51146I, this.f51145H);
        this.f51145H = defaultEventsFormatterType;
        m57250b(defaultEventsFormatterType);
        this.f51169q.m58840a(IronSourceUtils.getDefaultEventsURL(context, this.f51146I, null));
        this.f51168p = C20679q9.m55664a(context, "supersonic_sdk.db", 5);
        this.f51148K.m57105a(new RunnableC20326a());
        this.f51178z = IronSourceUtils.getDefaultOptOutEvents(context, this.f51146I);
        this.f51138A = IronSourceUtils.getDefaultOptInEvents(context, this.f51146I);
        this.f51139B = IronSourceUtils.getDefaultTriggerEvents(context, this.f51146I);
        this.f51140C = IronSourceUtils.getDefaultNonConnectivityEvents(context, this.f51146I);
        this.f51149L = ironSourceSegment;
        this.f51174v = context;
    }

    /* renamed from: b */
    public boolean m57248b(ArrayList<C20200kb> arrayList) {
        return arrayList != null && arrayList.size() >= this.f51177y;
    }

    /* renamed from: a */
    public synchronized void m57284a(C19786dr c19786dr) {
        this.f51150M = c19786dr;
    }

    @Override // com.ironsource.InterfaceC19970ge
    /* renamed from: a */
    public synchronized void mo57283a(C20200kb c20200kb) {
        m57282a(c20200kb, (IronSource.AD_UNIT) null);
    }

    /* renamed from: a */
    public synchronized void m57282a(C20200kb c20200kb, @Nullable IronSource.AD_UNIT ad_unit) {
        if (c20200kb != null) {
            if (this.f51171s) {
                this.f51148K.m57105a(new RunnableC20327b(c20200kb, ad_unit));
            }
        }
    }

    /* renamed from: a */
    public void m57281a(C20200kb c20200kb, String str) {
        m57280a(c20200kb, str, 1024);
    }

    /* renamed from: a */
    private void m57280a(C20200kb c20200kb, String str, int i) {
        JSONObject m57654b = c20200kb.m57654b();
        if (m57654b == null || !m57654b.has(str)) {
            return;
        }
        try {
            c20200kb.m57655a(str, m57265a(m57654b.optString(str, null), i));
        } catch (Exception e) {
            C20086i9.m57997d().m58003a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    /* renamed from: a */
    public void m57268a(IronSourceSegment ironSourceSegment) {
        this.f51149L = ironSourceSegment;
    }

    /* renamed from: a */
    public void m57267a(ISErrorListener iSErrorListener) {
        this.f51151N = iSErrorListener;
    }

    /* renamed from: a */
    public void m57266a(String str) {
        this.f51143F = str;
    }

    @Override // com.ironsource.InterfaceC19970ge
    /* renamed from: a */
    public void mo57264a(String str, Context context) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f51145H = str;
        IronSourceUtils.saveDefaultEventsFormatterType(context, this.f51146I, str);
        m57250b(str);
    }

    /* renamed from: a */
    protected void mo53776a(ArrayList<C20200kb> arrayList) {
        if (arrayList != null) {
            synchronized (this.f51152O) {
                this.f51168p.mo55661a(arrayList, this.f51146I);
                this.f51172t = this.f51168p.mo55662a(this.f51146I).size() + this.f51170r.size();
            }
        }
    }

    /* renamed from: a */
    public void m57261a(Map<String, String> map) {
        this.f51141D.putAll(map);
    }

    /* renamed from: a */
    public void m57260a(Map<String, Object> map, int i, String str) {
        map.put(IronSourceConstants.AUCTION_TRIALS, Integer.valueOf(i));
        if (TextUtils.isEmpty(str)) {
            return;
        }
        map.put(IronSourceConstants.AUCTION_FALLBACK, str);
    }

    /* renamed from: a */
    private void m57259a(JSONObject jSONObject) {
        try {
            IronSourceSegment ironSourceSegment = this.f51149L;
            if (ironSourceSegment != null) {
                if (ironSourceSegment.getAge() > 0) {
                    jSONObject.put("age", this.f51149L.getAge());
                }
                if (!TextUtils.isEmpty(this.f51149L.getGender())) {
                    jSONObject.put(IronSourceSegment.GENDER, this.f51149L.getGender());
                }
                if (this.f51149L.getLevel() > 0) {
                    jSONObject.put(IronSourceSegment.LEVEL, this.f51149L.getLevel());
                }
                if (this.f51149L.getIsPaying() != null) {
                    jSONObject.put(IronSourceSegment.PAYING, this.f51149L.getIsPaying().get());
                }
                if (this.f51149L.getIapt() > 0.0d) {
                    jSONObject.put(IronSourceSegment.IAPT, this.f51149L.getIapt());
                }
                if (this.f51149L.getUcd() > 0) {
                    jSONObject.put(IronSourceSegment.USER_CREATION_DATE, this.f51149L.getUcd());
                }
            }
            C19786dr c19786dr = this.f51150M;
            if (c19786dr != null) {
                String m58852b = c19786dr.m58852b();
                if (!TextUtils.isEmpty(m58852b)) {
                    jSONObject.put("segmentId", m58852b);
                }
                JSONObject m58853a = this.f51150M.m58853a();
                Iterator<String> keys = m58853a.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    jSONObject.put(next, m58853a.get(next));
                }
            }
        } catch (JSONException e) {
            C20086i9.m57997d().m58003a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    @Override // com.ironsource.InterfaceC19970ge
    /* renamed from: a */
    public void mo57258a(boolean z) {
        this.f51166n = z;
    }

    @Override // com.ironsource.InterfaceC19970ge
    /* renamed from: a */
    public void mo57256a(int[] iArr, Context context) {
        this.f51138A = iArr;
        IronSourceUtils.saveDefaultOptInEvents(context, this.f51146I, iArr);
    }

    /* renamed from: a */
    public boolean m57286a(int i, int[] iArr) {
        if (m57257a(iArr)) {
            for (int i2 : iArr) {
                if (i == i2) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    /* renamed from: a */
    public synchronized boolean m57263a(String str, C20200kb c20200kb) {
        if (str.equalsIgnoreCase("none")) {
            return m57257a(this.f51140C) ? m57286a(c20200kb.m57653c(), this.f51140C) : this.f51147J.contains(Integer.valueOf(c20200kb.m57653c()));
        }
        return false;
    }

    /* renamed from: a */
    public boolean m57257a(int[] iArr) {
        return iArr != null && iArr.length > 0;
    }
}
