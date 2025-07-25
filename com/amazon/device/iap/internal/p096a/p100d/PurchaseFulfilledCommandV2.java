package com.amazon.device.iap.internal.p096a.p100d;

import android.os.RemoteException;
import com.amazon.device.iap.PurchasingService;
import com.amazon.device.iap.internal.model.InternalFulfillmentResult;
import com.amazon.device.iap.internal.p096a.C3712c;
import com.amazon.p047a.p048a.p055d.KiwiException;
import com.amazon.p047a.p048a.p066n.p067a.KiwiCommand;
import com.amazon.p047a.p048a.p071o.KiwiConstants;
import com.amazon.p084d.p085a.SuccessResult;
import java.util.Set;

/* renamed from: com.amazon.device.iap.internal.a.d.b */
/* loaded from: classes2.dex */
public final class PurchaseFulfilledCommandV2 extends KiwiCommand {

    /* renamed from: d */
    private static final String f3186d = "purchase_fulfilled";

    /* renamed from: b */
    protected final Set<String> f3187b;

    /* renamed from: c */
    protected final String f3188c;

    public PurchaseFulfilledCommandV2(C3712c c3712c, Set<String> set, String str) {
        super(c3712c, f3186d, "2.0", c3712c.m102458d().toString(), PurchasingService.SDK_VERSION);
        this.f3187b = set;
        this.f3188c = str;
        m102920b(false);
        m102923a(KiwiConstants.f2674F, set);
        m102923a(KiwiConstants.f2720g, str);
    }

    @Override // com.amazon.p047a.p048a.p066n.p067a.KiwiCommand
    /* renamed from: b */
    protected boolean mo102338b(SuccessResult successResult) throws RemoteException, KiwiException {
        return true;
    }

    @Override // com.amazon.p047a.p048a.p066n.p067a.KiwiCommand
    /* renamed from: l */
    public void mo102445l() {
        Object m103043a = m102918j().mo102462a().m103043a(KiwiConstants.f2708am);
        if (m103043a != null && Boolean.FALSE.equals(m103043a)) {
            m102923a(KiwiConstants.f2720g, InternalFulfillmentResult.DELIVERY_ATTEMPTED.toString());
        }
        super.mo102445l();
    }
}
