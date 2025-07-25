package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.AdvIdentifiersResult;
import io.appmetrica.analytics.StartupParamsCallback;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.internal.IdentifiersResult;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: io.appmetrica.analytics.impl.Sk */
/* loaded from: classes9.dex */
public final class C34214Sk implements InterfaceC34238Tk {

    /* renamed from: k */
    public static final Map f93502k = Collections.unmodifiableMap(new C34143Pk());

    /* renamed from: a */
    public final List f93503a;

    /* renamed from: b */
    public final C34140Ph f93504b;

    /* renamed from: c */
    public final C34407al f93505c;

    /* renamed from: d */
    public final Handler f93506d;

    /* renamed from: e */
    public PublicLogger f93507e;

    /* renamed from: f */
    public final C34167Qk f93508f;

    /* renamed from: g */
    public final Object f93509g;

    /* renamed from: h */
    public final WeakHashMap f93510h;

    /* renamed from: i */
    public HashMap f93511i;

    /* renamed from: j */
    public boolean f93512j;

    public C34214Sk(@NonNull Context context, C34140Ph c34140Ph, C34751ne c34751ne, @NonNull Handler handler) {
        this(c34140Ph, new C34407al(context, c34751ne), handler);
    }

    /* renamed from: a */
    public final void m22261a(@NonNull StartupParamsCallback startupParamsCallback, @NonNull List<String> list, @Nullable Map<String, String> map) {
        synchronized (this.f93509g) {
            C34407al c34407al = this.f93505c;
            c34407al.getClass();
            if (!AbstractC34679kn.m21469a((Map) map) && !AbstractC34679kn.m21471a(map, c34407al.f93989e)) {
                c34407al.f93989e = new HashMap(map);
                c34407al.f93991g = true;
                c34407al.m21965c();
            }
            m22262a(startupParamsCallback, list);
            if (this.f93505c.m21968a((List) list)) {
                m22257a(list, new C34190Rk(this, startupParamsCallback), map);
            } else {
                m22263a(new Bundle(), startupParamsCallback);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00b1 A[Catch: all -> 0x0115, TryCatch #0 {, blocks: (B:4:0x0063, B:6:0x0071, B:10:0x0082, B:12:0x00b1, B:13:0x00b8, B:15:0x00be, B:16:0x00c5, B:18:0x00da, B:21:0x00e5, B:22:0x00f1, B:19:0x00df, B:9:0x007f), top: B:29:0x0063 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00be A[Catch: all -> 0x0115, TryCatch #0 {, blocks: (B:4:0x0063, B:6:0x0071, B:10:0x0082, B:12:0x00b1, B:13:0x00b8, B:15:0x00be, B:16:0x00c5, B:18:0x00da, B:21:0x00e5, B:22:0x00f1, B:19:0x00df, B:9:0x007f), top: B:29:0x0063 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00da A[Catch: all -> 0x0115, TryCatch #0 {, blocks: (B:4:0x0063, B:6:0x0071, B:10:0x0082, B:12:0x00b1, B:13:0x00b8, B:15:0x00be, B:16:0x00c5, B:18:0x00da, B:21:0x00e5, B:22:0x00f1, B:19:0x00df, B:9:0x007f), top: B:29:0x0063 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00df A[Catch: all -> 0x0115, TryCatch #0 {, blocks: (B:4:0x0063, B:6:0x0071, B:10:0x0082, B:12:0x00b1, B:13:0x00b8, B:15:0x00be, B:16:0x00c5, B:18:0x00da, B:21:0x00e5, B:22:0x00f1, B:19:0x00df, B:9:0x007f), top: B:29:0x0063 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00e5 A[Catch: all -> 0x0115, TryCatch #0 {, blocks: (B:4:0x0063, B:6:0x0071, B:10:0x0082, B:12:0x00b1, B:13:0x00b8, B:15:0x00be, B:16:0x00c5, B:18:0x00da, B:21:0x00e5, B:22:0x00f1, B:19:0x00df, B:9:0x007f), top: B:29:0x0063 }] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m22254b(android.os.Bundle r20) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.C34214Sk.m22254b(android.os.Bundle):void");
    }

    @NonNull
    @VisibleForTesting(otherwise = 5)
    /* renamed from: c */
    public final InterfaceC33787B6 m22250c() {
        return this.f93508f;
    }

    /* renamed from: d */
    public final String m22249d() {
        IdentifiersResult identifiersResult = (IdentifiersResult) this.f93505c.f93986b.get(StartupParamsCallback.APPMETRICA_DEVICE_ID);
        if (identifiersResult == null) {
            return null;
        }
        return identifiersResult.f95711id;
    }

    @NonNull
    /* renamed from: e */
    public final C34275V9 m22248e() {
        C34227T9 c34227t9;
        C34407al c34407al = this.f93505c;
        C34156Q9 c34156q9 = c34407al.f93998n;
        C34179R9 c34179r9 = c34407al.f93997m;
        synchronized (c34179r9) {
            c34227t9 = c34179r9.f93445b;
        }
        c34156q9.getClass();
        Boolean bool = c34227t9.f93529a;
        return new C34275V9();
    }

    /* renamed from: f */
    public final long m22247f() {
        return this.f93505c.f93990f;
    }

    /* renamed from: g */
    public final String m22246g() {
        IdentifiersResult identifiersResult = (IdentifiersResult) this.f93505c.f93986b.get(StartupParamsCallback.APPMETRICA_UUID);
        if (identifiersResult == null) {
            return null;
        }
        return identifiersResult.f95711id;
    }

    /* renamed from: h */
    public final void m22245h() {
        WeakHashMap weakHashMap = new WeakHashMap();
        for (Map.Entry entry : this.f93510h.entrySet()) {
            List list = (List) entry.getValue();
            if (this.f93505c.m21969a((Collection) list)) {
                weakHashMap.put((StartupParamsCallback) entry.getKey(), list);
            }
        }
        for (Map.Entry entry2 : weakHashMap.entrySet()) {
            StartupParamsCallback startupParamsCallback = (StartupParamsCallback) entry2.getKey();
            if (startupParamsCallback != null) {
                m22263a(new Bundle(), startupParamsCallback);
            }
        }
        weakHashMap.clear();
    }

    /* renamed from: i */
    public final void m22244i() {
        synchronized (this.f93509g) {
            if (!this.f93512j || this.f93505c.m21967b()) {
                this.f93512j = true;
                m22257a(this.f93503a, this.f93508f, this.f93511i);
            }
        }
    }

    public C34214Sk(C34140Ph c34140Ph, C34407al c34407al, Handler handler) {
        this.f93503a = Arrays.asList(StartupParamsCallback.APPMETRICA_UUID, StartupParamsCallback.APPMETRICA_DEVICE_ID, StartupParamsCallback.APPMETRICA_DEVICE_ID_HASH, "appmetrica_get_ad_url", "appmetrica_report_ad_url", "appmetrica_clids");
        this.f93509g = new Object();
        this.f93510h = new WeakHashMap();
        this.f93512j = false;
        this.f93504b = c34140Ph;
        this.f93505c = c34407al;
        this.f93506d = handler;
        this.f93508f = new C34167Qk(this);
    }

    /* renamed from: a */
    public final void m22264a(@NonNull Bundle bundle) {
        m22253b(bundle, null);
    }

    /* renamed from: a */
    public final void m22260a(@NonNull PublicLogger publicLogger) {
        this.f93507e = publicLogger;
    }

    /* renamed from: a */
    public final void m22257a(List list, InterfaceC33787B6 interfaceC33787B6, Map map) {
        ResultReceiverC33812C6 resultReceiverC33812C6 = new ResultReceiverC33812C6(this.f93506d, interfaceC33787B6);
        C34140Ph c34140Ph = this.f93504b;
        c34140Ph.getClass();
        Bundle bundle = new Bundle();
        bundle.putParcelable("io.appmetrica.analytics.impl.IdentifiersData", new C34276Va(resultReceiverC33812C6, list, map));
        EnumC34324Xa enumC34324Xa = EnumC34324Xa.EVENT_TYPE_UNDEFINED;
        PublicLogger anonymousInstance = PublicLogger.getAnonymousInstance();
        Set set = AbstractC34905t9.f95391a;
        C34444c4 c34444c4 = new C34444c4("", "", 1536, 0, anonymousInstance);
        c34444c4.f93565m = bundle;
        C34246U4 c34246u4 = c34140Ph.f93359a;
        c34140Ph.m22350a(C34140Ph.m22351a(c34444c4, c34246u4), c34246u4, 1, null);
    }

    /* renamed from: a */
    public final void m22256a(Map<String, String> map) {
        if (AbstractC34679kn.m21469a((Map) map)) {
            return;
        }
        synchronized (this.f93509g) {
            HashMap m22487b = AbstractC34024Kl.m22487b(map);
            this.f93511i = m22487b;
            this.f93504b.m22348a(m22487b);
            C34407al c34407al = this.f93505c;
            c34407al.getClass();
            if (!AbstractC34679kn.m21469a((Map) m22487b) && !AbstractC34679kn.m21471a(m22487b, c34407al.f93989e)) {
                c34407al.f93989e = new HashMap(m22487b);
                c34407al.f93991g = true;
                c34407al.m21965c();
            }
        }
    }

    /* renamed from: a */
    public final void m22259a(String str) {
        synchronized (this.f93509g) {
            this.f93504b.m22349a(str);
        }
    }

    /* renamed from: a */
    public final void m22263a(Bundle bundle, StartupParamsCallback startupParamsCallback) {
        EnumC34095Nk enumC34095Nk;
        if (this.f93510h.containsKey(startupParamsCallback)) {
            List list = (List) this.f93510h.get(startupParamsCallback);
            if (this.f93505c.m21969a((Collection) list)) {
                startupParamsCallback.onReceive(m22258a(list));
            } else {
                StartupParamsCallback.Reason reason = null;
                if (bundle.containsKey("startup_error_key_code")) {
                    int i = bundle.getInt("startup_error_key_code");
                    enumC34095Nk = EnumC34095Nk.UNKNOWN;
                    if (i == 1) {
                        enumC34095Nk = EnumC34095Nk.NETWORK;
                    } else if (i == 2) {
                        enumC34095Nk = EnumC34095Nk.PARSE;
                    }
                } else {
                    enumC34095Nk = null;
                }
                if (enumC34095Nk == null) {
                    if (!this.f93505c.m21972a()) {
                        PublicLogger publicLogger = this.f93507e;
                        if (publicLogger != null) {
                            publicLogger.warning("Clids error. Passed clids: %s, and clids from server are empty.", this.f93511i);
                        }
                        reason = new StartupParamsCallback.Reason("INCONSISTENT_CLIDS");
                    } else {
                        enumC34095Nk = EnumC34095Nk.UNKNOWN;
                    }
                }
                if (reason == null) {
                    reason = (StartupParamsCallback.Reason) CollectionUtils.getOrDefault(f93502k, enumC34095Nk, StartupParamsCallback.Reason.UNKNOWN);
                }
                startupParamsCallback.onRequestError(reason, m22258a(list));
            }
            this.f93510h.remove(startupParamsCallback);
            if (this.f93510h.isEmpty()) {
                C34629j0 c34629j0 = this.f93504b.f93362d;
                synchronized (c34629j0.f94652f) {
                    c34629j0.f94649c = false;
                    c34629j0.m21529c();
                }
            }
        }
    }

    /* renamed from: b */
    public final void m22253b(@NonNull Bundle bundle, @Nullable StartupParamsCallback startupParamsCallback) {
        synchronized (this.f93509g) {
            m22254b(bundle);
            m22245h();
            if (startupParamsCallback != null) {
                m22263a(bundle, startupParamsCallback);
            }
        }
    }

    /* renamed from: b */
    public final void m22251b(List<String> list) {
        synchronized (this.f93509g) {
            List list2 = this.f93505c.f93988d;
            if (AbstractC34679kn.m21470a((Collection) list)) {
                if (!AbstractC34679kn.m21470a((Collection) list2)) {
                    C34407al c34407al = this.f93505c;
                    c34407al.f93988d = null;
                    c34407al.f93993i.m21293a((List<String>) null);
                    this.f93504b.m22347a((List) null);
                }
            } else if (!AbstractC34679kn.m21471a(list, list2)) {
                C34407al c34407al2 = this.f93505c;
                c34407al2.f93988d = list;
                c34407al2.f93993i.m21293a(list);
                this.f93504b.m22347a(list);
            } else {
                this.f93504b.m22347a(list2);
            }
        }
    }

    /* renamed from: a */
    public final StartupParamsCallback.Result m22258a(List list) {
        HashMap hashMap = new HashMap();
        C34407al c34407al = this.f93505c;
        synchronized (c34407al) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                IdentifiersResult identifiersResult = (IdentifiersResult) c34407al.f93986b.get(str);
                if (identifiersResult != null) {
                    hashMap.put(str, c34407al.f93987c.m22091a(identifiersResult));
                }
            }
            c34407al.f93996l.m20750a(list, hashMap);
            c34407al.f93997m.m22317a(list, hashMap);
        }
        return new StartupParamsCallback.Result(hashMap);
    }

    /* renamed from: b */
    public final void m22252b(@Nullable String str) {
        synchronized (this.f93509g) {
            this.f93504b.m22346b(str);
        }
    }

    /* renamed from: b */
    public final Map<String, String> m22255b() {
        IdentifiersResult identifiersResult = (IdentifiersResult) this.f93505c.f93986b.get("appmetrica_clids");
        String str = identifiersResult == null ? null : identifiersResult.f95711id;
        if (!TextUtils.isEmpty(str)) {
            return AbstractC34451cb.m21883a(str);
        }
        return this.f93511i;
    }

    /* renamed from: a */
    public final void m22262a(StartupParamsCallback startupParamsCallback, List list) {
        if (this.f93510h.isEmpty()) {
            C34629j0 c34629j0 = this.f93504b.f93362d;
            synchronized (c34629j0.f94652f) {
                c34629j0.f94649c = true;
                c34629j0.m21530b();
            }
        }
        this.f93510h.put(startupParamsCallback, list);
    }

    @NonNull
    /* renamed from: a */
    public final AdvIdentifiersResult m22265a() {
        C34407al c34407al = this.f93505c;
        c34407al.f93994j.getClass();
        return new AdvIdentifiersResult(C33954I.m22556a((IdentifiersResult) c34407al.f93986b.get("appmetrica_google_adv_id")), C33954I.m22556a((IdentifiersResult) c34407al.f93986b.get("appmetrica_huawei_oaid")), C33954I.m22556a((IdentifiersResult) c34407al.f93986b.get("appmetrica_yandex_adv_id")));
    }
}
