package com.amazon.device.simplesignin.p107a.p108a.p110b.p111a;

import com.amazon.device.simplesignin.model.RequestId;
import com.amazon.device.simplesignin.p107a.p108a.SSIKiwiRequest;

/* renamed from: com.amazon.device.simplesignin.a.a.b.a.b */
/* loaded from: classes2.dex */
public class LinkUserAccountResponseRequest extends SSIKiwiRequest {
    public LinkUserAccountResponseRequest(RequestId requestId) {
        super(requestId);
        super.mo102461a(new LinkUserAccountResponseCommand(this));
    }
}
