package com.moloco.sdk.xenoss.sdkdevkit.android.core;

import com.moloco.sdk.internal.MolocoLogger;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsJVM;
import org.jetbrains.annotations.NotNull;
import p804nd.InterfaceC38501j;
import p804nd.LazyJVM;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.core.d */
/* loaded from: classes7.dex */
public final class C25401d implements InterfaceC25396a {
    @NotNull

    /* renamed from: a */
    public final String f65965a = "WebBrowserUserAgentService";
    @NotNull

    /* renamed from: b */
    public final InterfaceC38501j f65966b;

    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.core.d$a */
    /* loaded from: classes7.dex */
    public static final class C25402a extends Lambda implements Functions<String> {
        public C25402a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Functions
        @NotNull
        /* renamed from: a */
        public final String invoke() {
            boolean m16635B;
            try {
                String property = System.getProperty("http.agent");
                if (property != null) {
                    m16635B = StringsJVM.m16635B(property);
                    if (m16635B) {
                        return "";
                    }
                    Intrinsics.checkNotNullExpressionValue(property, "{\n                userAgent\n            }");
                    return property;
                }
                return "";
            } catch (Exception e) {
                MolocoLogger.error$default(MolocoLogger.INSTANCE, C25401d.this.f65965a, e.toString(), null, false, 12, null);
                return "";
            }
        }
    }

    public C25401d() {
        InterfaceC38501j m14554a;
        m14554a = LazyJVM.m14554a(new C25402a());
        this.f65966b = m14554a;
    }

    /* renamed from: a */
    public final String m44616a() {
        return (String) this.f65966b.getValue();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.core.InterfaceC25396a
    @NotNull
    public String invoke() {
        return m44616a();
    }
}
