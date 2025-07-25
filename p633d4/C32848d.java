package p633d4;

import android.os.Bundle;
import android.util.Log;
import com.facebook.AccessToken;
import com.google.firebase.remoteconfig.RemoteConfigComponent;
import com.learnings.purchase.ProductData;
import com.learnings.purchase.PurchaseCallbackManager;
import com.learnings.purchase.PurchaseData;
import com.learnings.purchase.amazon.AmazonPurchaseCallbackManager;
import com.meevii.adsdk.common.util.PangleAdRevenueUtil;
import java.util.ArrayList;
import java.util.List;
import p005a4.AnalyzePlatform;
import p1020w3.C44574a;
import p635d6.AdImpressionData;
import p635d6.AdRevenueManager;
import p753k4.LogUtil;

/* compiled from: BridgeManager.java */
/* renamed from: d4.d */
/* loaded from: classes6.dex */
public class C32848d {

    /* compiled from: BridgeManager.java */
    /* renamed from: d4.d$a */
    /* loaded from: classes6.dex */
    public interface InterfaceC32849a {
        /* renamed from: b */
        void mo23728b(GrtPurchaseData grtPurchaseData);

        /* renamed from: c */
        void mo23727c(GrtAdImpressionData grtAdImpressionData);
    }

    /* renamed from: c */
    private static AnalyzePlatform[] m25763c(List<String> list) {
        ArrayList arrayList = new ArrayList();
        if (list.isEmpty()) {
            arrayList.add(AnalyzePlatform.f53e);
            arrayList.add(AnalyzePlatform.f50b);
            arrayList.add(AnalyzePlatform.f52d);
            arrayList.add(AnalyzePlatform.f51c);
            return (AnalyzePlatform[]) arrayList.toArray(new AnalyzePlatform[0]);
        }
        if (list.contains("learnings")) {
            arrayList.add(AnalyzePlatform.f53e);
        }
        if (list.contains(RemoteConfigComponent.DEFAULT_NAMESPACE)) {
            arrayList.add(AnalyzePlatform.f50b);
        }
        if (list.contains(AccessToken.DEFAULT_GRAPH_DOMAIN)) {
            arrayList.add(AnalyzePlatform.f52d);
        }
        if (list.contains("appsflyer")) {
            arrayList.add(AnalyzePlatform.f51c);
        }
        return (AnalyzePlatform[]) arrayList.toArray(new AnalyzePlatform[0]);
    }

    /* renamed from: d */
    public static /* synthetic */ void m25762d(InterfaceC32849a interfaceC32849a, AdImpressionData adImpressionData) {
        try {
            GrtAdImpressionData grtAdImpressionData = new GrtAdImpressionData();
            grtAdImpressionData.m25733m(adImpressionData.m15453d() / 1000.0d);
            grtAdImpressionData.m25734l("USD");
            grtAdImpressionData.m25737i(adImpressionData.m15450g().getName());
            grtAdImpressionData.m25736j(adImpressionData.m15447j());
            grtAdImpressionData.m25738h(adImpressionData.m15456a().getName());
            grtAdImpressionData.m25735k(adImpressionData.m15451f());
            interfaceC32849a.mo23727c(grtAdImpressionData);
        } catch (Throwable th) {
            th.printStackTrace();
            LogUtil.m18216b("GRT_BridgeManager", "observeAdImpression onAdImpression fail：" + th.getMessage());
        }
    }

    /* renamed from: e */
    public static /* synthetic */ void m25761e(InterfaceC32849a interfaceC32849a, PurchaseData purchaseData) {
        try {
            GrtPurchaseData grtPurchaseData = new GrtPurchaseData();
            ProductData productData = purchaseData.getProductData();
            grtPurchaseData.m25728e(productData.getPriceAmountMicros());
            grtPurchaseData.m25729d(productData.getPriceCurrencyCode());
            interfaceC32849a.mo23728b(grtPurchaseData);
        } catch (Throwable th) {
            th.printStackTrace();
            LogUtil.m18216b("GRT_BridgeManager", "observeGooglePurchased onPurchased fail：" + th.getMessage());
        }
    }

    /* renamed from: f */
    private static void m25760f(EventParameter eventParameter) {
        if (!LogUtil.m18217a()) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(eventParameter.m25752b());
        sb2.append(":\n");
        sb2.append("===== receivers: ");
        sb2.append(eventParameter.m25751c());
        sb2.append(" =====");
        sb2.append("\n");
        if (eventParameter.m25750d() != null) {
            sb2.append("----- ValueToSum: ");
            sb2.append(eventParameter.m25750d());
            sb2.append(" -----");
            sb2.append("\n");
        }
        Bundle m25753a = eventParameter.m25753a();
        for (String str : m25753a.keySet()) {
            sb2.append("[ ");
            sb2.append(str);
            sb2.append(" = ");
            sb2.append(m25753a.get(str));
            sb2.append(" ]");
            sb2.append(" --> ");
            sb2.append(m25753a.get(str).getClass().getSimpleName());
            sb2.append("\n");
        }
        LogUtil.m18216b("GRT_EVENT", sb2.toString());
    }

    /* renamed from: g */
    private static void m25759g(final InterfaceC32849a interfaceC32849a) {
        try {
            AdRevenueManager.m25721e().m25722d(new AdRevenueManager.InterfaceC32855c() { // from class: d4.a
                @Override // p635d6.AdRevenueManager.InterfaceC32855c
                /* renamed from: a */
                public final void mo25715a(AdImpressionData adImpressionData) {
                    C32848d.m25762d(interfaceC32849a, adImpressionData);
                }
            });
        } catch (Throwable th) {
            Log.i("GRT_BridgeManager", "observeAdImpression fail：" + th);
        }
    }

    /* renamed from: h */
    private static void m25758h(final InterfaceC32849a interfaceC32849a) {
        try {
            AmazonPurchaseCallbackManager.get().addPurchaseCallback(new AmazonPurchaseCallbackManager.PurchaseCallback() { // from class: d4.b
            });
        } catch (Throwable th) {
            Log.i("GRT_BridgeManager", "observeAmazonPurchased fail：" + th);
        }
    }

    /* renamed from: i */
    private static void m25757i(final InterfaceC32849a interfaceC32849a) {
        try {
            PurchaseCallbackManager.get().addPurchaseCallback(new PurchaseCallbackManager.PurchaseCallback() { // from class: d4.c
                @Override // com.learnings.purchase.PurchaseCallbackManager.PurchaseCallback
                public final void onSuccess(PurchaseData purchaseData) {
                    C32848d.m25761e(interfaceC32849a, purchaseData);
                }
            });
        } catch (Throwable th) {
            Log.i("GRT_BridgeManager", "observeGooglePurchased fail：" + th);
        }
    }

    /* renamed from: j */
    public static void m25756j(EventParameter eventParameter) {
        try {
            Bundle m25753a = eventParameter.m25753a();
            m25753a.putString("grt_sdk_version", "1.2.5.0");
            m25760f(eventParameter);
            C44574a.C44575a m2365b = new C44574a.C44575a(eventParameter.m25752b()).m2365b(m25753a);
            Double m25750d = eventParameter.m25750d();
            if (m25750d != null) {
                m2365b.m2363d(m25750d);
            }
            m2365b.m2364c(m25763c(eventParameter.m25751c()));
            m2365b.m2366a().mo2359k();
        } catch (Throwable th) {
            Log.i("GRT_BridgeManager", "sendEvent fail：" + th);
        }
    }

    /* renamed from: k */
    public static void m25755k() {
        try {
            PangleAdRevenueUtil.sendAdRevenue();
        } catch (Throwable th) {
            Log.i("GRT_BridgeManager", "sendPangleVbo fail：" + th);
        }
    }

    /* renamed from: l */
    public static void m25754l(InterfaceC32849a interfaceC32849a) {
        m25759g(interfaceC32849a);
        m25757i(interfaceC32849a);
        m25758h(interfaceC32849a);
    }
}
