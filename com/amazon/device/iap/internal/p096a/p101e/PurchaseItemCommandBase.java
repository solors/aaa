package com.amazon.device.iap.internal.p096a.p101e;

import android.app.Activity;
import android.content.Intent;
import android.os.RemoteException;
import com.amazon.device.iap.PurchasingService;
import com.amazon.device.iap.internal.PurchasingManager;
import com.amazon.device.iap.internal.p096a.C3712c;
import com.amazon.device.iap.internal.util.C3722b;
import com.amazon.device.iap.internal.util.MetricsHelper;
import com.amazon.p047a.p048a.p049a.ContextManager;
import com.amazon.p047a.p048a.p055d.KiwiException;
import com.amazon.p047a.p048a.p063k.Resource;
import com.amazon.p047a.p048a.p066n.Task;
import com.amazon.p047a.p048a.p066n.TaskManager;
import com.amazon.p047a.p048a.p066n.p067a.KiwiCommand;
import com.amazon.p047a.p048a.p066n.p069b.TaskPipelineId;
import com.amazon.p047a.p048a.p071o.KiwiConstants;
import com.amazon.p084d.p085a.SuccessResult;
import java.util.Map;

/* renamed from: com.amazon.device.iap.internal.a.e.a */
/* loaded from: classes2.dex */
abstract class PurchaseItemCommandBase extends KiwiCommand {

    /* renamed from: b */
    protected static final String f3192b = "purchase_item";

    /* renamed from: f */
    private static final String f3193f = "a";
    @Resource

    /* renamed from: c */
    protected TaskManager f3194c;
    @Resource

    /* renamed from: d */
    protected ContextManager f3195d;

    /* renamed from: e */
    protected final String f3196e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public PurchaseItemCommandBase(C3712c c3712c, String str, String str2) {
        super(c3712c, f3192b, str, c3712c.m102458d().toString(), PurchasingService.SDK_VERSION);
        this.f3196e = str2;
        boolean m102390d = PurchasingManager.m102387g().m102390d();
        m102923a("sku", str2);
        m102923a(KiwiConstants.f2698ac, Boolean.valueOf(m102390d));
    }

    @Override // com.amazon.p047a.p048a.p066n.p067a.KiwiCommand
    /* renamed from: b */
    protected boolean mo102338b(SuccessResult successResult) throws RemoteException, KiwiException {
        Map mo102570b = successResult.mo102570b();
        String str = f3193f;
        C3722b.m102376a(str, "data: " + mo102570b);
        if (!mo102570b.containsKey(KiwiConstants.f2739z)) {
            C3722b.m102374b(str, "did not find intent");
            return false;
        }
        C3722b.m102376a(str, "found intent");
        final Intent intent = (Intent) mo102570b.remove(KiwiConstants.f2739z);
        this.f3194c.mo102883b(TaskPipelineId.FOREGROUND, new Task() { // from class: com.amazon.device.iap.internal.a.e.a.1
            @Override // com.amazon.p047a.p048a.p066n.Task
            /* renamed from: a */
            public void mo102336a() {
                try {
                    Activity mo103187b = PurchaseItemCommandBase.this.f3195d.mo103187b();
                    if (mo103187b == null) {
                        mo103187b = PurchaseItemCommandBase.this.f3195d.mo103192a();
                    }
                    String str2 = PurchaseItemCommandBase.f3193f;
                    C3722b.m102376a(str2, "About to fire intent with activity " + mo103187b);
                    mo103187b.startActivity(intent);
                } catch (Exception e) {
                    String m102917k = PurchaseItemCommandBase.this.m102917k();
                    MetricsHelper.submitExceptionMetrics(m102917k, PurchaseItemCommandBase.f3193f + ".onResult().execute()", e);
                    String str3 = PurchaseItemCommandBase.f3193f;
                    C3722b.m102374b(str3, "Exception when attempting to fire intent: " + e);
                }
            }
        });
        return true;
    }
}
