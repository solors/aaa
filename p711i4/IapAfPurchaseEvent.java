package p711i4;

import p681g4.IapAfPurchaseModel;

/* renamed from: i4.h */
/* loaded from: classes6.dex */
public class IapAfPurchaseEvent extends BaseGrtEvent<IapAfPurchaseModel> {

    /* renamed from: d */
    private final String f91904d;

    public IapAfPurchaseEvent(IapAfPurchaseModel iapAfPurchaseModel) {
        super(iapAfPurchaseModel);
        this.f91904d = "GRT_IapAfPurchaseEvent";
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0025  */
    @Override // p711i4.BaseGrtEvent
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo23152g(p633d4.GrtPurchaseData r8) {
        /*
            r7 = this;
            super.mo23152g(r8)
            double r0 = r8.m25730c()
            r2 = 4604480259023595110(0x3fe6666666666666, double:0.7)
            double r0 = r0 * r2
            g4.c r2 = r7.m23173a()
            g4.h r2 = (p681g4.IapAfPurchaseModel) r2
            i4.o r3 = r7.m23171c()
            java.util.List r4 = r2.m24375b()
            java.util.Iterator r4 = r4.iterator()
        L1f:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L75
            java.lang.Object r5 = r4.next()
            java.lang.String r5 = (java.lang.String) r5
            boolean r6 = r3.m23134h(r5)
            if (r6 != 0) goto L37
            boolean r6 = r3.m23135g(r5)
            if (r6 == 0) goto L1f
        L37:
            boolean r3 = p753k4.LogUtil.m18217a()
            if (r3 == 0) goto L53
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "countryThreshold："
            r3.append(r4)
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "GRT_IapAfPurchaseEvent"
            p753k4.LogUtil.m18216b(r4, r3)
        L53:
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            java.lang.String r4 = "af_revenue"
            r3.putDouble(r4, r0)
            java.lang.String r4 = "af_currency"
            java.lang.String r8 = r8.m25732a()
            r3.putString(r4, r8)
            java.lang.String r8 = r2.m24373d()
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            g4.c$a r1 = r2.m24374c()
            r7.m23168j(r8, r3, r0, r1)
        L75:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p711i4.IapAfPurchaseEvent.mo23152g(d4.g):void");
    }
}
