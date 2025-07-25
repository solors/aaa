package com.ironsource.sdk.controller;

import com.ironsource.C20688qf;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.ironsource.sdk.controller.m */
/* loaded from: classes6.dex */
public interface InterfaceC20865m {

    @Metadata
    /* renamed from: com.ironsource.sdk.controller.m$a */
    /* loaded from: classes6.dex */
    public static final class C20866a implements InterfaceC20865m {
        @NotNull

        /* renamed from: a */
        private final String f53109a;
        @Nullable

        /* renamed from: b */
        private final String f53110b;
        @Nullable

        /* renamed from: c */
        private final String f53111c;
        @Nullable

        /* renamed from: d */
        private final String f53112d;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public C20866a(@NotNull String funToCall) {
            this(funToCall, null, null, null, 14, null);
            Intrinsics.checkNotNullParameter(funToCall, "funToCall");
        }

        @Override // com.ironsource.sdk.controller.InterfaceC20865m
        @NotNull
        /* renamed from: a */
        public String mo55217a() {
            boolean z;
            boolean z2;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("SSA_CORE.SDKController.runFunction('" + this.f53109a);
            String str = this.f53110b;
            boolean z3 = false;
            if (str != null && str.length() != 0) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                sb2.append("?parameters=" + this.f53110b);
            }
            String str2 = this.f53111c;
            if (str2 != null && str2.length() != 0) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (!z2) {
                sb2.append("','" + this.f53111c);
            }
            String str3 = this.f53112d;
            if (str3 == null || str3.length() == 0) {
                z3 = true;
            }
            if (!z3) {
                sb2.append("','" + this.f53112d);
            }
            sb2.append("');");
            String sb3 = sb2.toString();
            Intrinsics.checkNotNullExpressionValue(sb3, "StringBuilder().apply(builderAction).toString()");
            return sb3;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public C20866a(@NotNull String funToCall, @Nullable String str) {
            this(funToCall, str, null, null, 12, null);
            Intrinsics.checkNotNullParameter(funToCall, "funToCall");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public C20866a(@NotNull String funToCall, @Nullable String str, @Nullable String str2) {
            this(funToCall, str, str2, null, 8, null);
            Intrinsics.checkNotNullParameter(funToCall, "funToCall");
        }

        public C20866a(@NotNull String funToCall, @Nullable String str, @Nullable String str2, @Nullable String str3) {
            Intrinsics.checkNotNullParameter(funToCall, "funToCall");
            this.f53109a = funToCall;
            this.f53110b = str;
            this.f53111c = str2;
            this.f53112d = str3;
        }

        public /* synthetic */ C20866a(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4);
        }
    }

    @Metadata
    /* renamed from: com.ironsource.sdk.controller.m$b */
    /* loaded from: classes6.dex */
    public static final class C20867b implements InterfaceC20865m {

        /* renamed from: a */
        private int f53113a;
        @NotNull

        /* renamed from: b */
        private String f53114b;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public C20867b(@NotNull InterfaceC20865m jsMethod, int i) {
            this(jsMethod.mo55217a(), i);
            Intrinsics.checkNotNullParameter(jsMethod, "jsMethod");
        }

        @Override // com.ironsource.sdk.controller.InterfaceC20865m
        @NotNull
        /* renamed from: a */
        public String mo55217a() {
            String str;
            if (this.f53113a == C20688qf.EnumC20692d.MODE_0.m55650a() || (this.f53113a >= C20688qf.EnumC20692d.MODE_1.m55650a() && this.f53113a <= C20688qf.EnumC20692d.MODE_3.m55650a())) {
                str = "console.log(\"JS exception: \" + JSON.stringify(e));";
            } else {
                str = "empty";
            }
            String str2 = "try{" + this.f53114b + "}catch(e){" + str + "}";
            Intrinsics.checkNotNullExpressionValue(str2, "StringBuilder()\n        …}\")\n          .toString()");
            return str2;
        }

        public C20867b(@NotNull String script, int i) {
            Intrinsics.checkNotNullParameter(script, "script");
            this.f53114b = script;
            this.f53113a = i;
        }
    }

    @NotNull
    /* renamed from: a */
    String mo55217a();
}
