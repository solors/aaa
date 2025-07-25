package com.ironsource;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

@Metadata
/* renamed from: com.ironsource.r0 */
/* loaded from: classes6.dex */
public interface InterfaceC20732r0 {

    @Metadata
    /* renamed from: com.ironsource.r0$a */
    /* loaded from: classes6.dex */
    public static final class C20733a implements InterfaceC20732r0 {
        @NotNull

        /* renamed from: a */
        private final JSONObject f52685a;

        public C20733a(@NotNull JSONObject applicationConfig) {
            Intrinsics.checkNotNullParameter(applicationConfig, "applicationConfig");
            this.f52685a = applicationConfig;
        }

        @Override // com.ironsource.InterfaceC20732r0
        @NotNull
        /* renamed from: a */
        public JSONObject mo55578a() {
            JSONObject optJSONObject = this.f52685a.optJSONObject("controllerConfig");
            if (optJSONObject == null) {
                return new JSONObject();
            }
            return optJSONObject;
        }

        @Override // com.ironsource.InterfaceC20732r0
        /* renamed from: b */
        public int mo55577b() {
            int optInt = this.f52685a.optInt("debugMode", 0);
            if (this.f52685a.optBoolean(C20734b.f52690e, false)) {
                return 3;
            }
            return optInt;
        }

        @Override // com.ironsource.InterfaceC20732r0
        @NotNull
        /* renamed from: c */
        public String mo55576c() {
            String optString = this.f52685a.optString("controllerUrl");
            if (optString == null) {
                return "";
            }
            return optString;
        }
    }

    @Metadata
    /* renamed from: com.ironsource.r0$b */
    /* loaded from: classes6.dex */
    public static final class C20734b {
        @NotNull

        /* renamed from: a */
        public static final C20734b f52686a = new C20734b();
        @NotNull

        /* renamed from: b */
        public static final String f52687b = "controllerUrl";
        @NotNull

        /* renamed from: c */
        public static final String f52688c = "controllerConfig";
        @NotNull

        /* renamed from: d */
        public static final String f52689d = "debugMode";
        @NotNull

        /* renamed from: e */
        public static final String f52690e = "adptDebugMode";

        private C20734b() {
        }
    }

    @NotNull
    /* renamed from: a */
    JSONObject mo55578a();

    /* renamed from: b */
    int mo55577b();

    @NotNull
    /* renamed from: c */
    String mo55576c();
}
