package com.mbridge.msdk.foundation.same.net;

import com.mbridge.msdk.foundation.same.net.p443a.CommonError;

/* renamed from: com.mbridge.msdk.foundation.same.net.b */
/* loaded from: classes6.dex */
public interface IListener<T> {
    void onError(CommonError commonError);

    void onSuccess(C21990d<T> c21990d);
}
