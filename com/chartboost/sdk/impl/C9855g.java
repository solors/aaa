package com.chartboost.sdk.impl;

import com.chartboost.sdk.impl.AbstractC9839f;
import com.chartboost.sdk.internal.Model.CBError;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import p804nd.C38508r;
import p804nd.Result;

/* renamed from: com.chartboost.sdk.impl.g */
/* loaded from: classes3.dex */
public final class C9855g {

    /* renamed from: a */
    public static final C9855g f22032a = new C9855g();

    /* renamed from: a */
    public Object m81679a(String str, C10059n1 base64Wrapper, Function2 onLoadFailure) {
        Intrinsics.checkNotNullParameter(base64Wrapper, "base64Wrapper");
        Intrinsics.checkNotNullParameter(onLoadFailure, "onLoadFailure");
        String str2 = null;
        if (str != null) {
            String m81045b = base64Wrapper.m81045b(str);
            if (m81045b.length() == 0) {
                C9763c7.m81919b("Cannot decode provided bidResponse.", null, 2, null);
                onLoadFailure.mo105910invoke("", CBError.EnumC10416b.f23718q);
                Result.C38506a c38506a = Result.f101870c;
                return Result.m14549b(C38508r.m14540a(AbstractC9839f.C9840a.f21973b));
            }
            str2 = m81045b;
        }
        return Result.m14549b(str2);
    }
}
