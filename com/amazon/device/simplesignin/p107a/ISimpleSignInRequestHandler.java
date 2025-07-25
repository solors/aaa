package com.amazon.device.simplesignin.p107a;

import android.content.Context;
import android.content.Intent;
import com.amazon.device.simplesignin.model.RequestId;
import com.amazon.device.simplesignin.model.request.LinkUserAccountRequest;
import com.amazon.device.simplesignin.model.request.SSIEventRequest;
import java.util.Map;

/* renamed from: com.amazon.device.simplesignin.a.b */
/* loaded from: classes2.dex */
public interface ISimpleSignInRequestHandler {
    /* renamed from: a */
    void mo102320a(Context context, Intent intent);

    /* renamed from: a */
    void mo102318a(RequestId requestId, LinkUserAccountRequest linkUserAccountRequest);

    /* renamed from: a */
    void mo102317a(RequestId requestId, SSIEventRequest sSIEventRequest);

    /* renamed from: a */
    void mo102316a(RequestId requestId, String str);

    /* renamed from: a */
    void mo102315a(RequestId requestId, Map<String, String> map);
}
