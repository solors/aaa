package com.amazon.p047a.p048a.p057f;

import android.os.RemoteException;
import com.amazon.p047a.p048a.p055d.KiwiException;
import com.amazon.p047a.p048a.p066n.p067a.AbstractCommandTask;
import com.amazon.p084d.p085a.FailureResult;
import com.amazon.p084d.p085a.SuccessResult;
import java.util.Map;

/* renamed from: com.amazon.a.a.f.b */
/* loaded from: classes2.dex */
public class LifeCycleEventTask extends AbstractCommandTask {

    /* renamed from: b */
    private static final String f2396b = "lifeCycle_Events";

    /* renamed from: c */
    private static final String f2397c = "1.0";

    /* renamed from: d */
    private Map<String, Object> f2398d;

    public LifeCycleEventTask(Map<String, Object> map) {
        this.f2398d = map;
    }

    @Override // com.amazon.p047a.p048a.p066n.p067a.AbstractCommandTask
    /* renamed from: a */
    protected void mo102770a(FailureResult failureResult) throws RemoteException, KiwiException {
    }

    @Override // com.amazon.p047a.p048a.p066n.p067a.AbstractCommandTask
    /* renamed from: a_ */
    protected String mo102768a_() {
        return f2396b;
    }

    @Override // com.amazon.p047a.p048a.p066n.p067a.AbstractCommandTask
    /* renamed from: b */
    protected Map<String, Object> mo102767b() {
        return this.f2398d;
    }

    @Override // com.amazon.p047a.p048a.p066n.p067a.AbstractCommandTask
    /* renamed from: c */
    protected String mo102766c() {
        return "1.0";
    }

    @Override // com.amazon.p047a.p048a.p066n.p067a.AbstractCommandTask
    /* renamed from: d */
    protected boolean mo102765d() {
        return true;
    }

    @Override // com.amazon.p047a.p048a.p066n.p067a.AbstractCommandTask
    /* renamed from: a */
    protected void mo102769a(SuccessResult successResult) throws RemoteException, KiwiException {
    }
}
