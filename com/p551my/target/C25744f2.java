package com.p551my.target;

import android.content.Context;
import android.text.TextUtils;
import com.p551my.target.common.MyTargetConfig;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.my.target.f2 */
/* loaded from: classes7.dex */
public class C25744f2 extends AbstractC26021q1 {

    /* renamed from: a */
    public Map f66835a;

    /* renamed from: a */
    public synchronized Map m43942a(MyTargetConfig myTargetConfig, final Context context) {
        if (AbstractC25671c0.m44128a()) {
            AbstractC25846ja.m43680a("HuaweiOAIdDataProvider: You must not call collectData method from main thread");
            return new HashMap();
        } else if (this.f66835a != null) {
            return new HashMap(this.f66835a);
        } else {
            this.f66835a = new HashMap();
            C25634a8 m44224a = C25634a8.m44224a(context);
            Class.forName("com.huawei.hms.ads.identifier.AdvertisingIdClient");
            String m44213e = m44224a.m44213e();
            String m44215d = m44224a.m44215d();
            if (TextUtils.isEmpty(m44213e)) {
                m43943a(context);
            } else {
                this.f66835a.put(CommonUrlParts.HUAWEI_OAID, m44213e);
                this.f66835a.put("oaid_tracking_enabled", m44215d);
                AbstractC25671c0.m44122d(new Runnable() { // from class: com.my.target.xb
                    @Override // java.lang.Runnable
                    public final void run() {
                        C25744f2.this.m43943a(context);
                    }
                });
            }
            return new HashMap(this.f66835a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x009c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m43943a(android.content.Context r9) {
        /*
            r8 = this;
            r0 = 0
            java.lang.String r1 = "com.huawei.hms.ads.identifier.AdvertisingIdClient"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L9a
            java.lang.String r2 = "HuaweiOAIdDataProvider: Send huawei AId"
            com.p551my.target.AbstractC25846ja.m43680a(r2)     // Catch: java.lang.Throwable -> L9a
            java.lang.String r2 = "getAdvertisingIdInfo"
            r3 = 1
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L9a
            java.lang.Class<android.content.Context> r5 = android.content.Context.class
            r6 = 0
            r4[r6] = r5     // Catch: java.lang.Throwable -> L9a
            java.lang.reflect.Method r1 = r1.getMethod(r2, r4)     // Catch: java.lang.Throwable -> L9a
            if (r1 == 0) goto L9a
            java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L9a
            r2[r6] = r9     // Catch: java.lang.Throwable -> L9a
            java.lang.Object r1 = r1.invoke(r0, r2)     // Catch: java.lang.Throwable -> L9a
            if (r1 == 0) goto L9a
            java.lang.Class r2 = r1.getClass()     // Catch: java.lang.Throwable -> L9a
            java.lang.String r4 = "getId"
            java.lang.Class[] r5 = new java.lang.Class[r6]     // Catch: java.lang.Throwable -> L9a
            java.lang.reflect.Method r2 = r2.getMethod(r4, r5)     // Catch: java.lang.Throwable -> L9a
            if (r2 == 0) goto L51
            java.lang.Object[] r4 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> L9a
            java.lang.Object r2 = r2.invoke(r1, r4)     // Catch: java.lang.Throwable -> L9a
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L9a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L97
            r4.<init>()     // Catch: java.lang.Throwable -> L97
            java.lang.String r5 = "HuaweiOAIdDataProvider: Huawei AId - "
            r4.append(r5)     // Catch: java.lang.Throwable -> L97
            r4.append(r2)     // Catch: java.lang.Throwable -> L97
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L97
            com.p551my.target.AbstractC25846ja.m43680a(r4)     // Catch: java.lang.Throwable -> L97
            goto L52
        L51:
            r2 = r0
        L52:
            java.lang.Class r4 = r1.getClass()     // Catch: java.lang.Throwable -> L97
            java.lang.String r5 = "isLimitAdTrackingEnabled"
            java.lang.Class[] r7 = new java.lang.Class[r6]     // Catch: java.lang.Throwable -> L97
            java.lang.reflect.Method r4 = r4.getMethod(r5, r7)     // Catch: java.lang.Throwable -> L97
            if (r4 == 0) goto L97
            java.lang.Object[] r5 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> L97
            java.lang.Object r1 = r4.invoke(r1, r5)     // Catch: java.lang.Throwable -> L97
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L97
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L97
            r4.<init>()     // Catch: java.lang.Throwable -> L97
            boolean r5 = r1.booleanValue()     // Catch: java.lang.Throwable -> L97
            r5 = r5 ^ r3
            r4.append(r5)     // Catch: java.lang.Throwable -> L97
            java.lang.String r5 = ""
            r4.append(r5)     // Catch: java.lang.Throwable -> L97
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Throwable -> L97
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L97
            r4.<init>()     // Catch: java.lang.Throwable -> L97
            java.lang.String r5 = "HuaweiOAIdDataProvider: Huawei ad tracking enabled - "
            r4.append(r5)     // Catch: java.lang.Throwable -> L97
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L97
            r1 = r1 ^ r3
            r4.append(r1)     // Catch: java.lang.Throwable -> L97
            java.lang.String r1 = r4.toString()     // Catch: java.lang.Throwable -> L97
            com.p551my.target.AbstractC25846ja.m43680a(r1)     // Catch: java.lang.Throwable -> L97
        L97:
            r1 = r0
            r0 = r2
            goto L9b
        L9a:
            r1 = r0
        L9b:
            monitor-enter(r8)
            if (r0 != 0) goto La6
            java.util.Map r2 = r8.f66835a     // Catch: java.lang.Throwable -> Lce
            java.lang.String r3 = "oaid"
            r2.remove(r3)     // Catch: java.lang.Throwable -> Lce
            goto Lad
        La6:
            java.util.Map r2 = r8.f66835a     // Catch: java.lang.Throwable -> Lce
            java.lang.String r3 = "oaid"
            r2.put(r3, r0)     // Catch: java.lang.Throwable -> Lce
        Lad:
            if (r1 != 0) goto Lb7
            java.util.Map r2 = r8.f66835a     // Catch: java.lang.Throwable -> Lce
            java.lang.String r3 = "oaid_tracking_enabled"
            r2.remove(r3)     // Catch: java.lang.Throwable -> Lce
            goto Lbe
        Lb7:
            java.util.Map r2 = r8.f66835a     // Catch: java.lang.Throwable -> Lce
            java.lang.String r3 = "oaid_tracking_enabled"
            r2.put(r3, r1)     // Catch: java.lang.Throwable -> Lce
        Lbe:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> Lce
            com.my.target.a8 r2 = com.p551my.target.C25634a8.m44224a(r9)
            r2.m44214d(r0)
            com.my.target.a8 r9 = com.p551my.target.C25634a8.m44224a(r9)
            r9.m44212e(r1)
            return
        Lce:
            r9 = move-exception
            monitor-exit(r8)     // Catch: java.lang.Throwable -> Lce
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p551my.target.C25744f2.m43943a(android.content.Context):void");
    }
}
