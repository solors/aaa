package com.moloco.sdk.acm.http;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p761kc.C37469l;

/* renamed from: com.moloco.sdk.acm.http.a */
/* loaded from: classes7.dex */
public final class C23830a {

    /* renamed from: com.moloco.sdk.acm.http.a$a */
    /* loaded from: classes7.dex */
    public static final class C23831a extends Lambda implements Function1<C37469l, Unit> {

        /* renamed from: g */
        public final /* synthetic */ String f61851g;

        /* renamed from: h */
        public final /* synthetic */ String f61852h;

        /* renamed from: i */
        public final /* synthetic */ String f61853i;

        /* renamed from: j */
        public final /* synthetic */ String f61854j;

        /* renamed from: k */
        public final /* synthetic */ String f61855k;

        /* renamed from: l */
        public final /* synthetic */ String f61856l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23831a(String str, String str2, String str3, String str4, String str5, String str6) {
            super(1);
            this.f61851g = str;
            this.f61852h = str2;
            this.f61853i = str3;
            this.f61854j = str4;
            this.f61855k = str5;
            this.f61856l = str6;
        }

        /* renamed from: a */
        public final void m47654a(@NotNull C37469l c37469l) {
            Intrinsics.checkNotNullParameter(c37469l, "$this$null");
            StringBuilder sb2 = new StringBuilder();
            String str = this.f61851g;
            String str2 = this.f61852h;
            String str3 = this.f61853i;
            if (str != null) {
                sb2.append("AppBundle/" + str + ';');
            }
            if (str2 != null) {
                sb2.append("AppVersion/" + str2 + ';');
            }
            if (str3 != null) {
                sb2.append("AppKey/" + str3 + ';');
            }
            String sb3 = sb2.toString();
            Intrinsics.checkNotNullExpressionValue(sb3, "StringBuilder().apply {\n…\") }\n        }.toString()");
            StringBuilder sb4 = new StringBuilder();
            String str4 = this.f61854j;
            String str5 = this.f61855k;
            if (str4 != null) {
                sb4.append("SdkVersion/" + str4 + ';');
            }
            if (str5 != null) {
                sb4.append("Mediator/" + str5 + ';');
            }
            String sb5 = sb4.toString();
            Intrinsics.checkNotNullExpressionValue(sb5, "StringBuilder().apply {\n…\") }\n        }.toString()");
            StringBuilder sb6 = new StringBuilder();
            String str6 = this.f61856l;
            sb6.append("OS/Android;");
            if (str6 != null) {
                sb6.append("osv/" + str6 + ';');
            }
            String sb7 = sb6.toString();
            Intrinsics.checkNotNullExpressionValue(sb7, "StringBuilder().apply {\n…\") }\n        }.toString()");
            c37469l.mo15205e("X-Moloco-App-Info", sb3);
            c37469l.mo15205e("X-Moloco-Device-Info", sb7);
            c37469l.mo15205e("X-Moloco-SDK-Info", sb5);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C37469l c37469l) {
            m47654a(c37469l);
            return Unit.f99208a;
        }
    }

    @NotNull
    /* renamed from: a */
    public final Function1<C37469l, Unit> m47655a(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
        return new C23831a(str4, str5, str3, str, str6, str2);
    }
}
