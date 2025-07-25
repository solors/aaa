package com.p551my.target;

import android.content.Context;
import android.text.TextUtils;
import com.p551my.target.mediation.AdNetworkLoader;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.my.target.o5 */
/* loaded from: classes7.dex */
public final class RunnableC25980o5 implements Runnable, AdNetworkLoader.AdParamsListener {

    /* renamed from: a */
    public final C26252y8 f67475a = C26252y8.m42300a(10000);

    /* renamed from: b */
    public final String f67476b;

    /* renamed from: c */
    public final Context f67477c;

    /* renamed from: d */
    public final List f67478d;

    /* renamed from: e */
    public final Map f67479e;

    /* renamed from: f */
    public volatile InterfaceC25981a f67480f;

    /* renamed from: g */
    public volatile int f67481g;

    /* renamed from: com.my.target.o5$a */
    /* loaded from: classes7.dex */
    public interface InterfaceC25981a {
        /* renamed from: a */
        void mo42282a(Map map);
    }

    public RunnableC25980o5(String str, List list, Context context, InterfaceC25981a interfaceC25981a) {
        Map hashMap;
        this.f67476b = str;
        this.f67478d = list;
        this.f67477c = context;
        this.f67480f = interfaceC25981a;
        this.f67481g = list.size();
        if (this.f67481g == 0) {
            hashMap = Collections.emptyMap();
        } else {
            hashMap = new HashMap();
        }
        this.f67479e = hashMap;
    }

    /* renamed from: a */
    public void m43265a() {
        synchronized (this) {
            InterfaceC25981a interfaceC25981a = this.f67480f;
            if (interfaceC25981a == null) {
                AbstractC25846ja.m43680a("MediationParamsLoader: onResult has already been called");
                return;
            }
            this.f67480f = null;
            interfaceC25981a.mo42282a(this.f67479e);
            this.f67475a.close();
        }
    }

    /* renamed from: b */
    public void m43264b() {
        if (this.f67481g == 0) {
            AbstractC25846ja.m43680a("MediationParamsLoader: empty loaders list, direct onResult call");
            m43265a();
            return;
        }
        AbstractC25846ja.m43680a("MediationParamsLoader: params loading started, loaders count: " + this.f67481g);
        this.f67475a.m42299a(this);
        for (AdNetworkLoader adNetworkLoader : this.f67478d) {
            AbstractC25846ja.m43680a("MediationParamsLoader: loading params for " + adNetworkLoader);
            adNetworkLoader.setAdParamsListener(this);
            adNetworkLoader.loadParams(this.f67476b, this.f67477c);
        }
    }

    @Override // com.p551my.target.mediation.AdNetworkLoader.AdParamsListener
    public void onLoad(AdNetworkLoader adNetworkLoader, Map map, String str) {
        synchronized (this) {
            if (this.f67480f == null) {
                AbstractC25846ja.m43680a("MediationParamsLoader: onResult has already been called, skipping params processing");
                return;
            }
            if (TextUtils.isEmpty(str)) {
                AbstractC25846ja.m43680a("MediationParamsLoader: mediation params is received for " + adNetworkLoader);
                if (!map.isEmpty()) {
                    this.f67479e.putAll(map);
                }
            } else {
                AbstractC25846ja.m43680a("MediationParamsLoader: failed to get params in " + adNetworkLoader + " with error - " + str);
            }
            this.f67481g--;
            if (this.f67481g > 0) {
                return;
            }
            m43265a();
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        AbstractC25846ja.m43680a("MediationParamsLoader: loading timeout");
        for (AdNetworkLoader adNetworkLoader : this.f67478d) {
            adNetworkLoader.setAdParamsListener(null);
        }
        m43265a();
    }
}
