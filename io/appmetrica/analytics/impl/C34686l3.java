package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;

/* renamed from: io.appmetrica.analytics.impl.l3 */
/* loaded from: classes9.dex */
public final class C34686l3 implements IBinaryDataHelper {

    /* renamed from: a */
    public final IBinaryDataHelper f94813a;

    public C34686l3(IBinaryDataHelper iBinaryDataHelper) {
        this.f94813a = iBinaryDataHelper;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper
    public final byte[] get(String str) {
        return this.f94813a.get(str);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper
    public final void insert(String str, byte[] bArr) {
        this.f94813a.insert(str, bArr);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper
    public final void remove(String str) {
        this.f94813a.remove(str);
    }
}
