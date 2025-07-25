package com.amazon.p047a.p048a.p051b.p053b;

import android.os.RemoteException;
import com.amazon.p047a.p048a.p051b.CrashManager;
import com.amazon.p047a.p048a.p051b.CrashReport;
import com.amazon.p047a.p048a.p055d.KiwiException;
import com.amazon.p047a.p048a.p063k.Resource;
import com.amazon.p047a.p048a.p066n.p067a.AbstractCommandTask;
import com.amazon.p047a.p048a.p071o.KiwiLogger;
import com.amazon.p084d.p085a.FailureResult;
import com.amazon.p084d.p085a.SuccessResult;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.amazon.a.a.b.b.a */
/* loaded from: classes2.dex */
public class SubmitCrashReportsTask extends AbstractCommandTask {

    /* renamed from: b */
    private static final KiwiLogger f2334b = new KiwiLogger("SubmitCrashReportsTask");
    @Resource

    /* renamed from: c */
    private CrashManager f2335c;

    /* renamed from: d */
    private List<CrashReport> f2336d;

    @Override // com.amazon.p047a.p048a.p066n.p067a.AbstractCommandTask
    /* renamed from: a */
    protected void mo102770a(FailureResult failureResult) throws RemoteException, KiwiException {
    }

    @Override // com.amazon.p047a.p048a.p066n.p067a.AbstractCommandTask
    /* renamed from: a_ */
    protected String mo102768a_() {
        return "submit_crash_reports";
    }

    @Override // com.amazon.p047a.p048a.p066n.p067a.AbstractCommandTask
    /* renamed from: b */
    protected Map<String, Object> mo102767b() {
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        for (CrashReport crashReport : this.f2336d) {
            arrayList.add(crashReport.m103158a());
        }
        hashMap.put("reports", arrayList);
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
        return !this.f2336d.isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.amazon.p047a.p048a.p066n.p067a.AbstractCommandTask
    /* renamed from: e */
    public void mo102451e() throws KiwiException {
        this.f2336d = this.f2335c.mo103171a();
        if (KiwiLogger.f2770a) {
            KiwiLogger kiwiLogger = f2334b;
            kiwiLogger.m102829a("--------------- Crash Reports -------------------");
            kiwiLogger.m102829a("Size: " + this.f2336d.size());
            kiwiLogger.m102829a("--------------------------------------------------");
        }
    }

    @Override // com.amazon.p047a.p048a.p066n.p067a.AbstractCommandTask
    /* renamed from: a */
    protected void mo102769a(SuccessResult successResult) throws RemoteException, KiwiException {
        this.f2335c.mo103166a(this.f2336d);
    }
}
