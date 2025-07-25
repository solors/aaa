package com.amazon.device.simplesignin.p107a.p108a.p113d.p114a;

import com.amazon.device.simplesignin.model.RequestId;
import com.amazon.device.simplesignin.p107a.p108a.SSIKiwiRequest;

/* renamed from: com.amazon.device.simplesignin.a.a.d.a.a */
/* loaded from: classes2.dex */
public class LoginSelectionResponse extends SSIKiwiRequest {
    public LoginSelectionResponse(RequestId requestId) {
        super(requestId);
        super.mo102461a(new LoginSelectionResponseCommand(this));
    }
}
