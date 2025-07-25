package com.ironsource;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata
/* renamed from: com.ironsource.i8 */
/* loaded from: classes6.dex */
public final class C20084i8 implements InterfaceC19811ec {
    @NotNull

    /* renamed from: a */
    private final JSONObject f50541a;

    @Metadata
    /* renamed from: com.ironsource.i8$a */
    /* loaded from: classes6.dex */
    public static final class C20085a {
        @NotNull

        /* renamed from: a */
        public static final C20085a f50542a = new C20085a();

        /* renamed from: b */
        public static final boolean f50543b = false;
        @NotNull

        /* renamed from: c */
        public static final String f50544c = "curlError";

        private C20085a() {
        }
    }

    public C20084i8(@Nullable JSONObject jSONObject) {
        this.f50541a = jSONObject == null ? new JSONObject() : jSONObject;
    }

    @Override // com.ironsource.InterfaceC19811ec
    /* renamed from: c */
    public boolean mo57647c() {
        return this.f50541a.optBoolean("enabled", false);
    }

    /* renamed from: d */
    public final boolean m58010d() {
        return this.f50541a.optBoolean("closeActivity", true);
    }

    /* renamed from: e */
    public final boolean m58009e() {
        return this.f50541a.optBoolean("reportController", true);
    }
}
