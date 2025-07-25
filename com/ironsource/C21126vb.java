package com.ironsource;

import android.util.Log;
import android.util.Pair;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: com.ironsource.vb */
/* loaded from: classes6.dex */
public class C21126vb {

    /* renamed from: e */
    private static final String f54177e = "EventsTracker";

    /* renamed from: a */
    private InterfaceC21011td f54178a;

    /* renamed from: b */
    private C20630pb f54179b;

    /* renamed from: c */
    private InterfaceC20204ke f54180c;

    /* renamed from: d */
    private ExecutorService f54181d;

    /* renamed from: com.ironsource.vb$a */
    /* loaded from: classes6.dex */
    public class RunnableC21127a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f54182a;

        RunnableC21127a(String str) {
            C21126vb.this = r1;
            this.f54182a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                C21144vo c21144vo = new C21144vo();
                ArrayList<Pair<String, String>> m55849d = C21126vb.this.f54179b.m55849d();
                if ("POST".equals(C21126vb.this.f54179b.m55848e())) {
                    c21144vo = C19916ff.m58581b(C21126vb.this.f54179b.m55851b(), this.f54182a, m55849d);
                } else if ("GET".equals(C21126vb.this.f54179b.m55848e())) {
                    c21144vo = C19916ff.m58586a(C21126vb.this.f54179b.m55851b(), this.f54182a, m55849d);
                }
                C21126vb c21126vb = C21126vb.this;
                c21126vb.m54498a("response status code: " + c21144vo.f54231a);
            } catch (Exception e) {
                C20086i9.m57997d().m58003a(e);
            }
        }
    }

    public C21126vb(C20630pb c20630pb, InterfaceC21011td interfaceC21011td) {
        if (c20630pb != null) {
            if (c20630pb.m55850c() != null) {
                this.f54179b = c20630pb;
                this.f54178a = interfaceC21011td;
                this.f54180c = c20630pb.m55850c();
                this.f54181d = Executors.newSingleThreadExecutor();
                return;
            }
            throw new InvalidParameterException("Null formatter not supported ");
        }
        throw new InvalidParameterException("Null configuration not supported ");
    }

    /* renamed from: b */
    private void m54495b(String str) {
        this.f54181d.submit(new RunnableC21127a(str));
    }

    /* renamed from: a */
    public void m54498a(String str) {
        if (this.f54179b.m55847f()) {
            Log.d(f54177e, str);
        }
    }

    /* renamed from: a */
    public void m54497a(String str, Map<String, Object> map) {
        m54498a(String.format(Locale.ENGLISH, "%s %s", str, map.toString()));
        if (this.f54179b.m55852a() && !str.isEmpty()) {
            HashMap hashMap = new HashMap();
            hashMap.put("eventname", str);
            m54496a(hashMap, this.f54178a.mo54462a());
            m54496a(hashMap, map);
            m54495b(this.f54180c.mo54342a(hashMap));
        }
    }

    /* renamed from: a */
    private void m54496a(Map<String, Object> map, Map<String, Object> map2) {
        try {
            map.putAll(map2);
        } catch (Exception e) {
            C20086i9.m57997d().m58003a(e);
        }
    }
}
