package com.amazon.device.iap.internal.p096a.p103g;

import com.amazon.device.iap.PurchasingService;
import com.amazon.device.iap.internal.p096a.C3712c;
import com.amazon.p047a.p048a.p066n.p067a.KiwiCommand;
import com.amazon.p084d.p085a.SuccessResult;

/* renamed from: com.amazon.device.iap.internal.a.g.a */
/* loaded from: classes2.dex */
abstract class ResponseReceivedCommandBase extends KiwiCommand {

    /* renamed from: b */
    protected static final String f3206b = "response_received";

    /* JADX INFO: Access modifiers changed from: package-private */
    public ResponseReceivedCommandBase(C3712c c3712c, String str) {
        super(c3712c, f3206b, str, c3712c.m102458d().toString(), PurchasingService.SDK_VERSION);
        m102920b(false);
    }

    @Override // com.amazon.p047a.p048a.p066n.p067a.KiwiCommand
    /* renamed from: b */
    protected boolean mo102338b(SuccessResult successResult) throws Exception {
        return true;
    }
}
