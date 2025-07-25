package com.yandex.mobile.ads.impl;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.annotation.CallSuper;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.InterfaceC31376sl;
import com.yandex.mobile.ads.impl.om1;
import com.yandex.mobile.ads.impl.zc2;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes8.dex */
public abstract class ml1<T> implements Comparable<ml1<T>> {

    /* renamed from: b */
    private final zc2.C31973a f82250b;

    /* renamed from: c */
    private final int f82251c;

    /* renamed from: d */
    private final String f82252d;

    /* renamed from: e */
    private final int f82253e;

    /* renamed from: f */
    private final Object f82254f;
    @Nullable
    @GuardedBy("mLock")

    /* renamed from: g */
    private om1.InterfaceC31053a f82255g;

    /* renamed from: h */
    private Integer f82256h;

    /* renamed from: i */
    private am1 f82257i;

    /* renamed from: j */
    private boolean f82258j;
    @GuardedBy("mLock")

    /* renamed from: k */
    private boolean f82259k;
    @GuardedBy("mLock")

    /* renamed from: l */
    private boolean f82260l;

    /* renamed from: m */
    private boolean f82261m;

    /* renamed from: n */
    private boolean f82262n;

    /* renamed from: o */
    private en1 f82263o;
    @Nullable

    /* renamed from: p */
    private InterfaceC31376sl.C31377a f82264p;

    /* renamed from: q */
    private Object f82265q;
    @GuardedBy("mLock")

    /* renamed from: r */
    private InterfaceC30864b f82266r;

    /* renamed from: com.yandex.mobile.ads.impl.ml1$a */
    /* loaded from: classes8.dex */
    final class RunnableC30863a implements Runnable {

        /* renamed from: b */
        final /* synthetic */ String f82267b;

        /* renamed from: c */
        final /* synthetic */ long f82268c;

        RunnableC30863a(String str, long j) {
            this.f82267b = str;
            this.f82268c = j;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ml1.this.f82250b.m26259a(this.f82267b, this.f82268c);
            ml1 ml1Var = ml1.this;
            ml1Var.f82250b.m26260a(ml1Var.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.yandex.mobile.ads.impl.ml1$b */
    /* loaded from: classes8.dex */
    public interface InterfaceC30864b {
    }

    public ml1(int i, String str, @Nullable om1.InterfaceC31053a interfaceC31053a) {
        zc2.C31973a c31973a;
        if (zc2.C31973a.f88825c) {
            c31973a = new zc2.C31973a();
        } else {
            c31973a = null;
        }
        this.f82250b = c31973a;
        this.f82254f = new Object();
        this.f82258j = true;
        this.f82259k = false;
        this.f82260l = false;
        this.f82261m = false;
        this.f82262n = false;
        this.f82264p = null;
        this.f82251c = i;
        this.f82252d = str;
        this.f82255g = interfaceC31053a;
        m31960a(new C31859xy());
        this.f82253e = m31953b(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public abstract om1<T> mo27506a(c91 c91Var);

    @CallSuper
    /* renamed from: a */
    public void mo27508a() {
        synchronized (this.f82254f) {
            this.f82259k = true;
            this.f82255g = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo27505a(T t);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final void m31951c(String str) {
        am1 am1Var = this.f82257i;
        if (am1Var != null) {
            am1Var.m35823b(this);
        }
        if (zc2.C31973a.f88825c) {
            long id2 = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new RunnableC30863a(str, id2));
                return;
            }
            this.f82250b.m26259a(str, id2);
            this.f82250b.m26260a(toString());
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        ml1 ml1Var = (ml1) obj;
        int mo27503g = mo27503g();
        int mo27503g2 = ml1Var.mo27503g();
        if (mo27503g == mo27503g2) {
            return this.f82256h.intValue() - ml1Var.f82256h.intValue();
        }
        return C31558u8.m28855a(mo27503g2) - C31558u8.m28855a(mo27503g);
    }

    /* renamed from: d */
    public final String m31950d() {
        String mo31943l = mo31943l();
        int i = this.f82251c;
        if (i != 0 && i != -1) {
            return Integer.toString(i) + '-' + mo31943l;
        }
        return mo31943l;
    }

    /* renamed from: e */
    public Map<String, String> mo31949e() throws C30313fh {
        return Collections.emptyMap();
    }

    /* renamed from: f */
    public final int m31948f() {
        return this.f82251c;
    }

    /* renamed from: g */
    public int mo27503g() {
        return 2;
    }

    /* renamed from: h */
    public final en1 m31947h() {
        return this.f82263o;
    }

    /* renamed from: i */
    public final Object m31946i() {
        return this.f82265q;
    }

    /* renamed from: j */
    public final int m31945j() {
        return this.f82263o.mo27163a();
    }

    /* renamed from: k */
    public final int m31944k() {
        return this.f82253e;
    }

    /* renamed from: l */
    public String mo31943l() {
        return this.f82252d;
    }

    /* renamed from: m */
    public final boolean m31942m() {
        boolean z;
        synchronized (this.f82254f) {
            z = this.f82260l;
        }
        return z;
    }

    /* renamed from: n */
    public final boolean m31941n() {
        boolean z;
        synchronized (this.f82254f) {
            z = this.f82259k;
        }
        return z;
    }

    /* renamed from: o */
    public final void m31940o() {
        synchronized (this.f82254f) {
            this.f82260l = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public final void m31939p() {
        InterfaceC30864b interfaceC30864b;
        synchronized (this.f82254f) {
            interfaceC30864b = this.f82266r;
        }
        if (interfaceC30864b != null) {
            ((ld2) interfaceC30864b).m32286b(this);
        }
    }

    /* renamed from: q */
    public final void m31938q() {
        this.f82258j = false;
    }

    /* renamed from: r */
    public final void m31937r() {
        this.f82262n = true;
    }

    /* renamed from: s */
    public final void m31936s() {
        this.f82261m = true;
    }

    /* renamed from: t */
    public final boolean m31935t() {
        return this.f82258j;
    }

    public final String toString() {
        String str;
        String str2 = "0x" + Integer.toHexString(this.f82253e);
        StringBuilder sb2 = new StringBuilder();
        if (m31941n()) {
            str = "[X] ";
        } else {
            str = "[ ] ";
        }
        sb2.append(str);
        sb2.append(mo31943l());
        sb2.append(" ");
        sb2.append(str2);
        sb2.append(" ");
        sb2.append(ol1.m30961a(mo27503g()));
        sb2.append(" ");
        sb2.append(this.f82256h);
        return sb2.toString();
    }

    /* renamed from: u */
    public final boolean m31934u() {
        return this.f82262n;
    }

    /* renamed from: v */
    public final boolean m31933v() {
        return this.f82261m;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public yc2 mo30037b(yc2 yc2Var) {
        return yc2Var;
    }

    /* renamed from: b */
    public byte[] mo31957b() throws C30313fh {
        return null;
    }

    /* renamed from: b */
    private static int m31953b(String str) {
        Uri parse;
        String host;
        if (TextUtils.isEmpty(str) || (parse = Uri.parse(str)) == null || (host = parse.getHost()) == null) {
            return 0;
        }
        return host.hashCode();
    }

    /* renamed from: a */
    public final void m31959a(yc2 yc2Var) {
        om1.InterfaceC31053a interfaceC31053a;
        synchronized (this.f82254f) {
            interfaceC31053a = this.f82255g;
        }
        if (interfaceC31053a != null) {
            interfaceC31053a.mo29243a(yc2Var);
        }
    }

    /* renamed from: b */
    public final void m31956b(int i) {
        this.f82256h = Integer.valueOf(i);
    }

    /* renamed from: b */
    public final void m31954b(Object obj) {
        this.f82265q = obj;
    }

    @Nullable
    /* renamed from: c */
    public final InterfaceC31376sl.C31377a m31952c() {
        return this.f82264p;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m31962a(om1<?> om1Var) {
        InterfaceC30864b interfaceC30864b;
        synchronized (this.f82254f) {
            interfaceC30864b = this.f82266r;
        }
        if (interfaceC30864b != null) {
            ((ld2) interfaceC30864b).m32287a(this, om1Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m31965a(int i) {
        am1 am1Var = this.f82257i;
        if (am1Var != null) {
            am1Var.m35825a(this, i);
        }
    }

    /* renamed from: a */
    public final void m31961a(InterfaceC31376sl.C31377a c31377a) {
        this.f82264p = c31377a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m31963a(InterfaceC30864b interfaceC30864b) {
        synchronized (this.f82254f) {
            this.f82266r = interfaceC30864b;
        }
    }

    /* renamed from: a */
    public final void m31964a(am1 am1Var) {
        this.f82257i = am1Var;
    }

    /* renamed from: a */
    public final void m31960a(C31859xy c31859xy) {
        this.f82263o = c31859xy;
    }

    /* renamed from: a */
    public final void m31958a(String str) {
        if (zc2.C31973a.f88825c) {
            this.f82250b.m26259a(str, Thread.currentThread().getId());
        }
    }
}
