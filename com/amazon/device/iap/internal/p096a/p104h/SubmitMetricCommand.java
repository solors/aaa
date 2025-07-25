package com.amazon.device.iap.internal.p096a.p104h;

import android.os.RemoteException;
import com.amazon.device.iap.PurchasingService;
import com.amazon.device.iap.internal.p096a.C3712c;
import com.amazon.p047a.p048a.p055d.KiwiException;
import com.amazon.p047a.p048a.p066n.p067a.KiwiCommand;
import com.amazon.p084d.p085a.SuccessResult;

/* renamed from: com.amazon.device.iap.internal.a.h.a */
/* loaded from: classes2.dex */
public class SubmitMetricCommand extends KiwiCommand {

    /* renamed from: b */
    private static final String f3207b = "submit_metric";

    /* renamed from: c */
    private static final String f3208c = "metricName";

    /* renamed from: d */
    private static final String f3209d = "metricAttributes";

    public SubmitMetricCommand(C3712c c3712c, String str, String str2) {
        super(c3712c, f3207b, "1.0", c3712c.m102458d().toString(), PurchasingService.SDK_VERSION);
        m102923a(f3208c, str);
        m102923a(f3209d, str2);
        m102920b(false);
    }

    @Override // com.amazon.p047a.p048a.p066n.p067a.KiwiCommand
    /* renamed from: b */
    protected boolean mo102338b(SuccessResult successResult) throws RemoteException, KiwiException {
        return true;
    }
}
