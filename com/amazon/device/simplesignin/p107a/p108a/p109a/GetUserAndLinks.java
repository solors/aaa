package com.amazon.device.simplesignin.p107a.p108a.p109a;

import com.amazon.device.simplesignin.model.RequestId;
import com.amazon.device.simplesignin.p107a.p108a.SSIKiwiRequest;

/* renamed from: com.amazon.device.simplesignin.a.a.a.a */
/* loaded from: classes2.dex */
public class GetUserAndLinks extends SSIKiwiRequest {
    public GetUserAndLinks(RequestId requestId, String str) {
        super(requestId);
        super.mo102461a(new GetUserAndLinksCommand(this, str));
    }
}
