package com.amazon.device.simplesignin.p107a.p108a.p110b;

import com.amazon.device.simplesignin.model.RequestId;
import com.amazon.device.simplesignin.model.request.LinkUserAccountRequest;
import com.amazon.device.simplesignin.p107a.p108a.SSIKiwiRequest;

/* renamed from: com.amazon.device.simplesignin.a.a.b.a */
/* loaded from: classes2.dex */
public class LinkUserAccount extends SSIKiwiRequest {
    public LinkUserAccount(RequestId requestId, LinkUserAccountRequest linkUserAccountRequest) {
        super(requestId);
        super.mo102461a(new LinkUserAccountCommand(this, linkUserAccountRequest));
    }
}
