package com.amazon.device.simplesignin.p107a.p108a.p113d;

import com.amazon.device.simplesignin.model.RequestId;
import com.amazon.device.simplesignin.p107a.p108a.SSIKiwiRequest;
import java.util.Map;

/* renamed from: com.amazon.device.simplesignin.a.a.d.a */
/* loaded from: classes2.dex */
public class ShowLoginSelection extends SSIKiwiRequest {
    public ShowLoginSelection(RequestId requestId, Map<String, String> map) {
        super(requestId);
        super.mo102461a(new ShowLoginSelectionCommand(this, map));
    }
}
