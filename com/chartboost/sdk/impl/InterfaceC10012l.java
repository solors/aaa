package com.chartboost.sdk.impl;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: com.chartboost.sdk.impl.l */
/* loaded from: classes3.dex */
public interface InterfaceC10012l {

    /* renamed from: com.chartboost.sdk.impl.l$a */
    /* loaded from: classes3.dex */
    public static final class C10013a {
        /* renamed from: a */
        public static String m81199a(InterfaceC10012l interfaceC10012l, JSONObject receiver, String error, String response) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            Intrinsics.checkNotNullParameter(error, "error");
            Intrinsics.checkNotNullParameter(response, "response");
            try {
                receiver.put("error", error);
                receiver.put("response", response);
            } catch (Exception e) {
                C9763c7.m81920b("Cannot create error json for the event", e);
            }
            String jSONObject = receiver.toString();
            Intrinsics.checkNotNullExpressionValue(jSONObject, "toString(...)");
            return jSONObject;
        }
    }

    /* renamed from: a */
    void mo81141a(C9673a7 c9673a7, Function1 function1);
}
