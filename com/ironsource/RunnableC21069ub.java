package com.ironsource;

import android.util.Pair;
import com.ironsource.InterfaceC20045he;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.ArrayList;

/* renamed from: com.ironsource.ub */
/* loaded from: classes6.dex */
public class RunnableC21069ub implements Runnable {

    /* renamed from: e */
    private static final String f53776e = "Content-Type";

    /* renamed from: f */
    private static final String f53777f = "application/json";

    /* renamed from: a */
    private InterfaceC20045he f53778a;

    /* renamed from: b */
    String f53779b;

    /* renamed from: c */
    String f53780c;

    /* renamed from: d */
    ArrayList<C20200kb> f53781d;

    public RunnableC21069ub(InterfaceC20045he interfaceC20045he, String str, String str2, ArrayList<C20200kb> arrayList) {
        this.f53778a = interfaceC20045he;
        this.f53779b = str;
        this.f53780c = str2;
        this.f53781d = arrayList;
    }

    @Override // java.lang.Runnable
    public void run() {
        InterfaceC20045he.C20046a m58160a;
        InterfaceC20045he.C20046a c20046a = new InterfaceC20045he.C20046a(this.f53781d);
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new Pair("Content-Type", "application/json"));
            C21144vo m58581b = C19916ff.m58581b(this.f53780c, this.f53779b, arrayList);
            m58160a = c20046a.m58159a(m58581b.m54396a()).m58161a(m58581b.f54231a);
        } catch (Exception e) {
            C20086i9.m57997d().m58003a(e);
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.error("EventsSender failed to send events - " + e.getLocalizedMessage());
            m58160a = c20046a.m58159a(e instanceof C21273ym).m58160a(e);
        }
        InterfaceC20045he interfaceC20045he = this.f53778a;
        if (interfaceC20045he != null) {
            interfaceC20045he.mo57219a(m58160a);
        }
    }
}
