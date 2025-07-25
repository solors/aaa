package com.amazon.device.iap.internal;

import android.content.Context;
import android.content.Intent;
import com.amazon.device.iap.model.FulfillmentResult;
import com.amazon.device.iap.model.RequestId;
import java.util.Set;

/* renamed from: com.amazon.device.iap.internal.e */
/* loaded from: classes2.dex */
public interface RequestHandler {
    /* renamed from: a */
    void mo102385a(Context context, Intent intent);

    /* renamed from: a */
    void mo102384a(RequestId requestId);

    /* renamed from: a */
    void mo102383a(RequestId requestId, String str);

    /* renamed from: a */
    void mo102382a(RequestId requestId, String str, FulfillmentResult fulfillmentResult);

    /* renamed from: a */
    void mo102381a(RequestId requestId, Set<String> set);

    /* renamed from: a */
    void mo102380a(RequestId requestId, boolean z);
}
