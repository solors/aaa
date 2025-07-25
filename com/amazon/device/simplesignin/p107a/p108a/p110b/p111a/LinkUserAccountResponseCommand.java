package com.amazon.device.simplesignin.p107a.p108a.p110b.p111a;

import com.amazon.device.simplesignin.p107a.p108a.SSIKiwiRequest;
import com.amazon.device.simplesignin.p107a.p108a.p110b.LinkUserAccountCommandBase;
import com.amazon.p084d.p085a.SuccessResult;

/* renamed from: com.amazon.device.simplesignin.a.a.b.a.a */
/* loaded from: classes2.dex */
class LinkUserAccountResponseCommand extends LinkUserAccountCommandBase {

    /* renamed from: b */
    private static final String f3381b = "SSI_LinkUserAccountResponse";

    /* renamed from: c */
    private static final String f3382c = "1.0";

    /* JADX INFO: Access modifiers changed from: package-private */
    public LinkUserAccountResponseCommand(SSIKiwiRequest sSIKiwiRequest) {
        super(sSIKiwiRequest, f3381b, "1.0");
    }

    @Override // com.amazon.p047a.p048a.p066n.p067a.KiwiCommand
    /* renamed from: b */
    protected boolean mo102338b(SuccessResult successResult) throws Exception {
        return super.m102350a(successResult.mo102570b());
    }
}
