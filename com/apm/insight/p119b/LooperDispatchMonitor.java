package com.apm.insight.p119b;

import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import com.apm.insight.runtime.CpuInfo;
import com.apm.insight.runtime.ThreadWithHandler;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.apm.insight.b.g */
/* loaded from: classes2.dex */
public final class LooperDispatchMonitor {

    /* renamed from: r */
    private static int f3629r = 2;

    /* renamed from: a */
    private InterfaceC3779c f3630a;

    /* renamed from: b */
    private int f3631b;

    /* renamed from: c */
    private volatile int f3632c;

    /* renamed from: d */
    private int f3633d;

    /* renamed from: e */
    private int f3634e;

    /* renamed from: f */
    private C3782f f3635f;

    /* renamed from: g */
    private long f3636g;

    /* renamed from: h */
    private long f3637h;

    /* renamed from: i */
    private int f3638i;

    /* renamed from: j */
    private long f3639j;

    /* renamed from: k */
    private String f3640k;

    /* renamed from: l */
    private String f3641l;

    /* renamed from: m */
    private AbsLooperDispatchListener f3642m;

    /* renamed from: n */
    private volatile boolean f3643n;

    /* renamed from: o */
    private boolean f3644o;

    /* renamed from: p */
    private final ThreadWithHandler f3645p;

    /* renamed from: q */
    private volatile boolean f3646q;

    /* renamed from: s */
    private Runnable f3647s;

    /* compiled from: LooperDispatchMonitor.java */
    /* renamed from: com.apm.insight.b.g$a */
    /* loaded from: classes2.dex */
    static class C3777a {

        /* renamed from: a */
        long f3656a;

        /* renamed from: b */
        long f3657b;

        /* renamed from: c */
        long f3658c;

        /* renamed from: d */
        boolean f3659d;

        /* renamed from: e */
        int f3660e;

        /* renamed from: f */
        StackTraceElement[] f3661f;

        private C3777a() {
        }

        /* synthetic */ C3777a(byte b) {
            this();
        }
    }

    /* compiled from: LooperDispatchMonitor.java */
    /* renamed from: com.apm.insight.b.g$b */
    /* loaded from: classes2.dex */
    static class C3778b {

        /* renamed from: a */
        C3777a f3662a;

        /* renamed from: b */
        private int f3663b;

        /* renamed from: a */
        final void m102073a(C3777a c3777a) {
            throw null;
        }
    }

    /* compiled from: LooperDispatchMonitor.java */
    /* renamed from: com.apm.insight.b.g$c */
    /* loaded from: classes2.dex */
    public interface InterfaceC3779c {
    }

    /* compiled from: LooperDispatchMonitor.java */
    /* renamed from: com.apm.insight.b.g$d */
    /* loaded from: classes2.dex */
    public static class C3780d {
    }

    /* compiled from: LooperDispatchMonitor.java */
    /* renamed from: com.apm.insight.b.g$e */
    /* loaded from: classes2.dex */
    public static class C3781e {

        /* renamed from: a */
        public long f3664a;

        /* renamed from: b */
        long f3665b;

        /* renamed from: c */
        long f3666c;

        /* renamed from: d */
        int f3667d;

        /* renamed from: e */
        int f3668e;

        /* renamed from: f */
        long f3669f;

        /* renamed from: g */
        long f3670g;

        /* renamed from: h */
        String f3671h;

        /* renamed from: i */
        public String f3672i;

        /* renamed from: j */
        private String f3673j;

        /* renamed from: k */
        private C3780d f3674k;

        /* renamed from: a */
        public final JSONObject m102072a() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("msg", LooperDispatchMonitor.m102086a(this.f3671h));
                jSONObject.put("cpuDuration", this.f3670g);
                jSONObject.put("duration", this.f3669f);
                jSONObject.put("type", this.f3667d);
                jSONObject.put("count", this.f3668e);
                jSONObject.put("messageCount", this.f3668e);
                jSONObject.put("lastDuration", this.f3665b - this.f3666c);
                jSONObject.put("start", this.f3664a);
                jSONObject.put("end", this.f3665b);
                jSONObject.put("block_uuid", (Object) null);
                jSONObject.put("sblock_uuid", (Object) null);
                jSONObject.put("belong_frame", false);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            return jSONObject;
        }

        /* renamed from: b */
        final void m102071b() {
            this.f3667d = -1;
            this.f3668e = -1;
            this.f3669f = -1L;
            this.f3671h = null;
            this.f3673j = null;
            this.f3674k = null;
            this.f3672i = null;
        }
    }

    public LooperDispatchMonitor() {
        this((byte) 0);
    }

    /* renamed from: c */
    static /* synthetic */ C3778b m102082c() {
        return null;
    }

    /* renamed from: e */
    static /* synthetic */ ThreadWithHandler m102078e() {
        return null;
    }

    private LooperDispatchMonitor(byte b) {
        this.f3631b = 0;
        this.f3632c = 0;
        this.f3633d = 100;
        this.f3634e = 200;
        this.f3636g = -1L;
        this.f3637h = -1L;
        this.f3638i = -1;
        this.f3639j = -1L;
        this.f3643n = false;
        this.f3644o = false;
        this.f3646q = false;
        this.f3647s = new Runnable() { // from class: com.apm.insight.b.g.2

            /* renamed from: b */
            private long f3650b;

            /* renamed from: a */
            private long f3649a = 0;

            /* renamed from: c */
            private int f3651c = -1;

            /* renamed from: d */
            private int f3652d = 0;

            /* renamed from: e */
            private int f3653e = 0;

            @Override // java.lang.Runnable
            public final void run() {
                long uptimeMillis = SystemClock.uptimeMillis();
                if (LooperDispatchMonitor.m102082c().f3662a == null) {
                    C3777a c3777a = new C3777a((byte) 0);
                    if (this.f3651c == LooperDispatchMonitor.this.f3632c) {
                        this.f3652d++;
                    } else {
                        this.f3652d = 0;
                        this.f3653e = 0;
                        this.f3650b = uptimeMillis;
                    }
                    this.f3651c = LooperDispatchMonitor.this.f3632c;
                    int i = this.f3652d;
                    if (i > 0 && i - this.f3653e >= LooperDispatchMonitor.f3629r && this.f3649a != 0 && uptimeMillis - this.f3650b > 700 && LooperDispatchMonitor.this.f3646q) {
                        c3777a.f3661f = Looper.getMainLooper().getThread().getStackTrace();
                        this.f3653e = this.f3652d;
                    }
                    c3777a.f3659d = LooperDispatchMonitor.this.f3646q;
                    c3777a.f3658c = (uptimeMillis - this.f3649a) - 300;
                    c3777a.f3656a = uptimeMillis;
                    long uptimeMillis2 = SystemClock.uptimeMillis();
                    this.f3649a = uptimeMillis2;
                    c3777a.f3657b = uptimeMillis2 - uptimeMillis;
                    c3777a.f3660e = LooperDispatchMonitor.this.f3632c;
                    LooperDispatchMonitor.m102078e().m101308a(LooperDispatchMonitor.this.f3647s, 300L);
                    LooperDispatchMonitor.m102082c().m102073a(c3777a);
                    return;
                }
                throw null;
            }
        };
        this.f3630a = new InterfaceC3779c() { // from class: com.apm.insight.b.g.1
        };
        this.f3645p = null;
    }

    /* renamed from: d */
    static /* synthetic */ int m102079d(LooperDispatchMonitor looperDispatchMonitor) {
        int i = looperDispatchMonitor.f3631b;
        looperDispatchMonitor.f3631b = i + 1;
        return i;
    }

    /* renamed from: b */
    public final JSONArray m102085b() {
        JSONArray jSONArray = new JSONArray();
        try {
            int i = 0;
            for (C3781e c3781e : this.f3635f.m102070a()) {
                if (c3781e != null) {
                    i++;
                    jSONArray.put(c3781e.m102072a().put("id", i));
                }
            }
        } catch (Throwable unused) {
        }
        return jSONArray;
    }

    /* renamed from: a */
    public final void m102095a() {
        if (this.f3643n) {
            return;
        }
        this.f3643n = true;
        this.f3633d = 100;
        this.f3634e = 300;
        this.f3635f = new C3782f(100);
        this.f3642m = new AbsLooperDispatchListener() { // from class: com.apm.insight.b.g.3
            @Override // com.apm.insight.p119b.AbsLooperDispatchListener
            /* renamed from: a */
            public final boolean mo102076a() {
                return true;
            }

            @Override // com.apm.insight.p119b.AbsLooperDispatchListener
            /* renamed from: b */
            public final void mo102074b(String str) {
                super.mo102074b(str);
                LooperDispatchMonitor.m102079d(LooperDispatchMonitor.this);
                LooperDispatchMonitor.m102087a(LooperDispatchMonitor.this, false, AbsLooperDispatchListener.f3623a);
                LooperDispatchMonitor looperDispatchMonitor = LooperDispatchMonitor.this;
                looperDispatchMonitor.f3640k = looperDispatchMonitor.f3641l;
                LooperDispatchMonitor.this.f3641l = "no message running";
                LooperDispatchMonitor.this.f3646q = false;
            }

            @Override // com.apm.insight.p119b.AbsLooperDispatchListener
            /* renamed from: a */
            public final void mo102075a(String str) {
                LooperDispatchMonitor.this.f3646q = true;
                LooperDispatchMonitor.this.f3641l = str;
                super.mo102075a(str);
                LooperDispatchMonitor.m102087a(LooperDispatchMonitor.this, true, AbsLooperDispatchListener.f3623a);
            }
        };
        LooperMonitor.m102067a();
        LooperMonitor.m102066a(this.f3642m);
        LooperUtil.m102052a(LooperUtil.m102056a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LooperDispatchMonitor.java */
    /* renamed from: com.apm.insight.b.g$f */
    /* loaded from: classes2.dex */
    public static class C3782f {

        /* renamed from: a */
        private int f3675a;

        /* renamed from: b */
        private int f3676b;

        /* renamed from: c */
        private C3781e f3677c;

        /* renamed from: d */
        private List<C3781e> f3678d = new ArrayList();

        C3782f(int i) {
            this.f3675a = i;
        }

        /* renamed from: a */
        final C3781e m102069a(int i) {
            C3781e c3781e = this.f3677c;
            if (c3781e != null) {
                c3781e.f3667d = i;
                this.f3677c = null;
                return c3781e;
            }
            C3781e c3781e2 = new C3781e();
            c3781e2.f3667d = i;
            return c3781e2;
        }

        /* renamed from: a */
        final void m102068a(C3781e c3781e) {
            int size = this.f3678d.size();
            int i = this.f3675a;
            if (size < i) {
                this.f3678d.add(c3781e);
                this.f3676b = this.f3678d.size();
                return;
            }
            int i2 = this.f3676b % i;
            this.f3676b = i2;
            C3781e c3781e2 = this.f3678d.set(i2, c3781e);
            c3781e2.m102071b();
            this.f3677c = c3781e2;
            this.f3676b++;
        }

        /* renamed from: a */
        final List<C3781e> m102070a() {
            ArrayList arrayList = new ArrayList();
            int i = 0;
            if (this.f3678d.size() == this.f3675a) {
                for (int i2 = this.f3676b; i2 < this.f3678d.size(); i2++) {
                    arrayList.add(this.f3678d.get(i2));
                }
                while (i < this.f3676b - 1) {
                    arrayList.add(this.f3678d.get(i));
                    i++;
                }
            } else {
                while (i < this.f3678d.size()) {
                    arrayList.add(this.f3678d.get(i));
                    i++;
                }
            }
            return arrayList;
        }
    }

    /* renamed from: a */
    private void m102093a(int i, long j, String str) {
        m102092a(i, j, str, true);
    }

    /* renamed from: a */
    private void m102092a(int i, long j, String str, boolean z) {
        this.f3644o = true;
        C3781e m102069a = this.f3635f.m102069a(i);
        m102069a.f3669f = j - this.f3636g;
        if (z) {
            long currentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
            m102069a.f3670g = currentThreadTimeMillis - this.f3639j;
            this.f3639j = currentThreadTimeMillis;
        } else {
            m102069a.f3670g = -1L;
        }
        m102069a.f3668e = this.f3631b;
        m102069a.f3671h = str;
        m102069a.f3672i = this.f3640k;
        m102069a.f3664a = this.f3636g;
        m102069a.f3665b = j;
        m102069a.f3666c = this.f3637h;
        this.f3635f.m102068a(m102069a);
        this.f3631b = 0;
        this.f3636g = j;
    }

    /* renamed from: a */
    public final C3781e m102091a(long j) {
        C3781e c3781e = new C3781e();
        c3781e.f3671h = this.f3641l;
        c3781e.f3672i = this.f3640k;
        c3781e.f3669f = j - this.f3637h;
        c3781e.f3670g = m102094a(this.f3638i) - this.f3639j;
        c3781e.f3668e = this.f3631b;
        return c3781e;
    }

    /* renamed from: a */
    public static String m102086a(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            return "unknown message";
        }
        try {
            String[] split = str.split(":");
            String str3 = split.length == 2 ? split[1] : "";
            if (str.contains("{") && str.contains("}")) {
                str2 = str.split("\\{")[0];
                try {
                    str = str2 + str.split("\\}")[1];
                } catch (Throwable unused) {
                    return str2;
                }
            } else {
                str2 = str;
            }
            if (str.contains("@")) {
                String[] split2 = str.split("@");
                if (split2.length > 1) {
                    str = split2[0];
                }
            }
            if (str.contains("(") && str.contains(")") && !str.endsWith(" null")) {
                String[] split3 = str.split("\\(");
                if (split3.length > 1) {
                    str = split3[1];
                }
                str = str.replace(")", "");
            }
            if (str.startsWith(" ")) {
                str = str.replace(" ", "");
            }
            return str + str3;
        } catch (Throwable unused2) {
            return str;
        }
    }

    /* renamed from: a */
    private static long m102094a(int i) {
        if (i < 0) {
            return 0L;
        }
        try {
            return CpuInfo.m101409a(i);
        } catch (Throwable unused) {
            return 0L;
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m102087a(LooperDispatchMonitor looperDispatchMonitor, boolean z, long j) {
        int i = looperDispatchMonitor.f3632c + 1;
        looperDispatchMonitor.f3632c = i;
        looperDispatchMonitor.f3632c = i & 65535;
        looperDispatchMonitor.f3644o = false;
        if (looperDispatchMonitor.f3636g < 0) {
            looperDispatchMonitor.f3636g = j;
        }
        if (looperDispatchMonitor.f3637h < 0) {
            looperDispatchMonitor.f3637h = j;
        }
        if (looperDispatchMonitor.f3638i < 0) {
            looperDispatchMonitor.f3638i = Process.myTid();
            looperDispatchMonitor.f3639j = SystemClock.currentThreadTimeMillis();
        }
        int i2 = looperDispatchMonitor.f3634e;
        if (j - looperDispatchMonitor.f3636g > i2) {
            long j2 = looperDispatchMonitor.f3637h;
            if (j - j2 <= i2) {
                looperDispatchMonitor.m102093a(9, j, looperDispatchMonitor.f3641l);
            } else if (z) {
                if (looperDispatchMonitor.f3631b == 0) {
                    looperDispatchMonitor.m102093a(1, j, "no message running");
                } else {
                    looperDispatchMonitor.m102093a(9, j2, looperDispatchMonitor.f3640k);
                    looperDispatchMonitor.m102092a(1, j, "no message running", false);
                }
            } else if (looperDispatchMonitor.f3631b == 0) {
                looperDispatchMonitor.m102092a(8, j, looperDispatchMonitor.f3641l, true);
            } else {
                looperDispatchMonitor.m102092a(9, j2, looperDispatchMonitor.f3640k, false);
                looperDispatchMonitor.m102092a(8, j, looperDispatchMonitor.f3641l, true);
            }
        }
        looperDispatchMonitor.f3637h = j;
    }
}
