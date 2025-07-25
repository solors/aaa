package com.amazon.p047a.p048a.p059h.p060a;

import android.os.RemoteException;
import com.amazon.p047a.p048a.p055d.KiwiException;
import com.amazon.p047a.p048a.p059h.Metric;
import com.amazon.p047a.p048a.p059h.MetricBatch;
import com.amazon.p047a.p048a.p059h.MetricsManager;
import com.amazon.p047a.p048a.p063k.Resource;
import com.amazon.p047a.p048a.p066n.p067a.AbstractCommandTask;
import com.amazon.p047a.p048a.p071o.KiwiLogger;
import com.amazon.p084d.p085a.FailureResult;
import com.amazon.p084d.p085a.SuccessResult;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.amazon.a.a.h.a.a */
/* loaded from: classes2.dex */
public class SubmitMetricsTask extends AbstractCommandTask {

    /* renamed from: b */
    private static final KiwiLogger f2408b = new KiwiLogger("SubmitMetricsTask");
    @Resource

    /* renamed from: c */
    private MetricsManager f2409c;

    /* renamed from: d */
    private MetricBatch f2410d;

    @Override // com.amazon.p047a.p048a.p066n.p067a.AbstractCommandTask
    /* renamed from: a */
    protected void mo102770a(FailureResult failureResult) throws RemoteException, KiwiException {
    }

    @Override // com.amazon.p047a.p048a.p066n.p067a.AbstractCommandTask
    /* renamed from: a_ */
    protected String mo102768a_() {
        return "submit_metrics";
    }

    @Override // com.amazon.p047a.p048a.p066n.p067a.AbstractCommandTask
    /* renamed from: b */
    protected Map<String, Object> mo102767b() {
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList(this.f2410d.m103112c());
        Iterator<Metric> it = this.f2410d.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().m103117a());
        }
        hashMap.put("metrics", arrayList);
        return hashMap;
    }

    @Override // com.amazon.p047a.p048a.p066n.p067a.AbstractCommandTask
    /* renamed from: c */
    protected String mo102766c() {
        return "1.0";
    }

    @Override // com.amazon.p047a.p048a.p066n.p067a.AbstractCommandTask
    /* renamed from: d */
    protected boolean mo102765d() {
        return !this.f2410d.m103115a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.amazon.p047a.p048a.p066n.p067a.AbstractCommandTask
    /* renamed from: e */
    public void mo102451e() throws KiwiException {
        this.f2410d = this.f2409c.mo103111a();
        if (KiwiLogger.f2770a) {
            KiwiLogger kiwiLogger = f2408b;
            kiwiLogger.m102829a("--------------- SUBMIT METRICS -------------------");
            kiwiLogger.m102829a("Size: " + this.f2410d.m103112c());
            kiwiLogger.m102829a("--------------------------------------------------");
        }
    }

    @Override // com.amazon.p047a.p048a.p066n.p067a.AbstractCommandTask
    /* renamed from: a */
    protected void mo102769a(SuccessResult successResult) throws RemoteException, KiwiException {
    }
}
