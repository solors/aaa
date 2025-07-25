package com.chartboost.sdk.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* renamed from: com.chartboost.sdk.impl.a1 */
/* loaded from: classes3.dex */
public abstract class AbstractC9666a1 {

    /* renamed from: a */
    public static final Function1 f21542a = C9667a.f21543b;

    /* renamed from: com.chartboost.sdk.impl.a1$a */
    /* loaded from: classes3.dex */
    public static final class C9667a extends Lambda implements Function1 {

        /* renamed from: b */
        public static final C9667a f21543b = new C9667a();

        public C9667a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final C10127p9 invoke(InterfaceC10302w0 it) {
            JSONObject jSONObject;
            String str = JsonUtils.EMPTY_JSON;
            Intrinsics.checkNotNullParameter(it, "it");
            try {
                String string = it.mo80136f().getString("config", JsonUtils.EMPTY_JSON);
                if (string != null) {
                    str = string;
                }
                jSONObject = new JSONObject(str);
            } catch (Exception e) {
                C9763c7.m81920b("Error reading config from shared preferences", e);
                jSONObject = new JSONObject();
            }
            return new C10127p9(jSONObject);
        }
    }
}
