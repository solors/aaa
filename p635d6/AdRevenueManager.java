package p635d6;

import android.os.Bundle;
import com.meevii.adsdk.common.util.LogUtil;
import com.meevii.adsdk.common.util.ThreadUtils;
import java.util.ArrayList;
import java.util.List;
import p696h6.C33483e;
import p785m5.AdFilledData;

/* renamed from: d6.d */
/* loaded from: classes6.dex */
public class AdRevenueManager {

    /* renamed from: a */
    private final List<InterfaceC32855c> f89531a;

    /* renamed from: b */
    private final List<InterfaceC32854b> f89532b;

    /* compiled from: AdRevenueManager.java */
    /* renamed from: d6.d$b */
    /* loaded from: classes6.dex */
    public interface InterfaceC32854b {
        /* renamed from: a */
        void mo25716a(AdFilledData adFilledData);
    }

    /* compiled from: AdRevenueManager.java */
    /* renamed from: d6.d$c */
    /* loaded from: classes6.dex */
    public interface InterfaceC32855c {
        /* renamed from: a */
        void mo25715a(AdImpressionData adImpressionData);
    }

    /* compiled from: AdRevenueManager.java */
    /* renamed from: d6.d$d */
    /* loaded from: classes6.dex */
    public static class C32856d {

        /* renamed from: a */
        public static AdRevenueManager f89533a = new AdRevenueManager();
    }

    /* renamed from: a */
    public static /* synthetic */ void m25725a(AdRevenueManager adRevenueManager, String str, Bundle bundle) {
        adRevenueManager.m25719g(str, bundle);
    }

    /* renamed from: b */
    public static /* synthetic */ void m25724b(AdRevenueManager adRevenueManager, String str) {
        adRevenueManager.m25720f(str);
    }

    /* renamed from: e */
    public static AdRevenueManager m25721e() {
        return C32856d.f89533a;
    }

    /* renamed from: f */
    public /* synthetic */ void m25720f(String str) {
        if (this.f89532b.isEmpty()) {
            return;
        }
        AdImpressionData m25726k = AdImpressionData.m25726k(str);
        if (LogUtil.isShowLog()) {
            LogUtil.m48060i("ADSDK.AdRevenueManager", "onAdFill result: " + m25726k);
        }
        for (InterfaceC32854b interfaceC32854b : this.f89532b) {
            interfaceC32854b.mo25716a(m25726k);
        }
    }

    /* renamed from: g */
    public /* synthetic */ void m25719g(String str, Bundle bundle) {
        C33483e.m23671a(str, bundle);
        if (this.f89531a.isEmpty()) {
            return;
        }
        AdImpressionData m25726k = AdImpressionData.m25726k(str);
        if (LogUtil.isShowLog()) {
            LogUtil.m48060i("ADSDK.AdRevenueManager", "onAdImpression result: " + m25726k);
        }
        for (InterfaceC32855c interfaceC32855c : this.f89531a) {
            interfaceC32855c.mo25715a(m25726k);
        }
    }

    /* renamed from: c */
    public void m25723c(InterfaceC32854b interfaceC32854b) {
        if (interfaceC32854b != null && !this.f89532b.contains(interfaceC32854b)) {
            this.f89532b.add(interfaceC32854b);
        }
    }

    /* renamed from: d */
    public void m25722d(InterfaceC32855c interfaceC32855c) {
        if (interfaceC32855c != null && !this.f89531a.contains(interfaceC32855c)) {
            this.f89531a.add(interfaceC32855c);
        }
    }

    /* renamed from: h */
    public void m25718h(final String str) {
        ThreadUtils.runOnUiThread(new Runnable() { // from class: d6.b
            @Override // java.lang.Runnable
            public final void run() {
                AdRevenueManager.m25724b(AdRevenueManager.this, str);
            }
        });
    }

    /* renamed from: i */
    public void m25717i(final String str, final Bundle bundle) {
        ThreadUtils.runOnUiThread(new Runnable() { // from class: d6.c
            @Override // java.lang.Runnable
            public final void run() {
                AdRevenueManager.m25725a(AdRevenueManager.this, str, bundle);
            }
        });
    }

    private AdRevenueManager() {
        this.f89531a = new ArrayList();
        this.f89532b = new ArrayList();
    }
}
