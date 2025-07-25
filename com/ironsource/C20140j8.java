package com.ironsource;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata
/* renamed from: com.ironsource.j8 */
/* loaded from: classes6.dex */
public final class C20140j8 implements InterfaceC19811ec {
    @NotNull

    /* renamed from: a */
    private final JSONObject f50688a;

    @Metadata
    /* renamed from: com.ironsource.j8$a */
    /* loaded from: classes6.dex */
    public static final class C20141a {
        @NotNull

        /* renamed from: a */
        public static final C20141a f50689a = new C20141a();

        /* renamed from: b */
        public static final boolean f50690b = false;

        private C20141a() {
        }
    }

    public C20140j8(@Nullable JSONObject jSONObject) {
        this.f50688a = jSONObject == null ? new JSONObject() : jSONObject;
    }

    @Override // com.ironsource.InterfaceC19811ec
    /* renamed from: c */
    public boolean mo57647c() {
        return this.f50688a.optBoolean("clickCheck", false);
    }
}
