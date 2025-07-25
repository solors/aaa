package p711i4;

import android.os.Bundle;
import com.appsflyer.AFInAppEventParameterName;
import java.util.List;
import p681g4.BaseGrtModel;
import p681g4.IapFbPurchaseModel;

/* renamed from: i4.i */
/* loaded from: classes6.dex */
public class IapFbPurchaseEvent extends BaseGrtEvent<IapFbPurchaseModel> {

    /* renamed from: d */
    private final String f91905d;

    public IapFbPurchaseEvent(IapFbPurchaseModel iapFbPurchaseModel) {
        super(iapFbPurchaseModel);
        this.f91905d = "GRT_IapFbPurchaseEvent";
    }

    /* renamed from: n */
    private void m23153n(IapFbPurchaseModel iapFbPurchaseModel, Bundle bundle, double d, String str) {
        BaseGrtModel.C33189a m24367c = iapFbPurchaseModel.m24367c();
        List<String> m24433f = m24367c.m24433f("appsflyer");
        if (m24433f.isEmpty()) {
            m23168j(iapFbPurchaseModel.m24366d(), bundle, Double.valueOf(d), iapFbPurchaseModel.m24367c());
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putAll(bundle);
        bundle2.putDouble(AFInAppEventParameterName.REVENUE, d);
        bundle2.putString(AFInAppEventParameterName.CURRENCY, str);
        m23167k(iapFbPurchaseModel.m24366d(), bundle2, Double.valueOf(d), m24433f, iapFbPurchaseModel.m24367c());
        List<String> m24434e = m24367c.m24434e("appsflyer");
        if (m24434e.isEmpty()) {
            return;
        }
        m23167k(iapFbPurchaseModel.m24366d(), bundle, Double.valueOf(d), m24434e, iapFbPurchaseModel.m24367c());
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0027  */
    @Override // p711i4.BaseGrtEvent
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo23152g(p633d4.GrtPurchaseData r11) {
        /*
            r10 = this;
            super.mo23152g(r11)
            double r0 = r11.m25730c()
            r2 = 4604480259023595110(0x3fe6666666666666, double:0.7)
            double r7 = r0 * r2
            g4.c r0 = r10.m23173a()
            r5 = r0
            g4.i r5 = (p681g4.IapFbPurchaseModel) r5
            i4.o r0 = r10.m23171c()
            java.util.List r1 = r5.m24368b()
            java.util.Iterator r1 = r1.iterator()
        L21:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L70
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            boolean r3 = r0.m23134h(r2)
            if (r3 != 0) goto L39
            boolean r3 = r0.m23135g(r2)
            if (r3 == 0) goto L21
        L39:
            boolean r0 = p753k4.LogUtil.m18217a()
            if (r0 == 0) goto L55
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "countryThreshold："
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "GRT_IapFbPurchaseEvent"
            p753k4.LogUtil.m18216b(r1, r0)
        L55:
            android.os.Bundle r6 = new android.os.Bundle
            r6.<init>()
            java.lang.String r0 = "value"
            r6.putDouble(r0, r7)
            java.lang.String r0 = "fb_currency"
            java.lang.String r1 = r11.m25732a()
            r6.putString(r0, r1)
            java.lang.String r9 = r11.m25732a()
            r4 = r10
            r4.m23153n(r5, r6, r7, r9)
        L70:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p711i4.IapFbPurchaseEvent.mo23152g(d4.g):void");
    }
}
