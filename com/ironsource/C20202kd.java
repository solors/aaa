package com.ironsource;

import com.ironsource.mediationsdk.metadata.C20419a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata
/* renamed from: com.ironsource.kd */
/* loaded from: classes6.dex */
public final class C20202kd implements InterfaceC19969gd {
    @NotNull

    /* renamed from: a */
    private final JSONObject f50844a;

    @Metadata
    /* renamed from: com.ironsource.kd$a */
    /* loaded from: classes6.dex */
    public static final class C20203a {

        /* renamed from: b */
        public static final boolean f50846b = false;

        /* renamed from: d */
        public static final int f50848d = 24;
        @NotNull

        /* renamed from: a */
        public static final C20203a f50845a = new C20203a();

        /* renamed from: c */
        private static final int f50847c = EnumC20260ld.SendEvent.m57492b();

        private C20203a() {
        }

        /* renamed from: a */
        public final int m57646a() {
            return f50847c;
        }
    }

    public C20202kd(@Nullable JSONObject jSONObject) {
        this.f50844a = jSONObject == null ? new JSONObject() : jSONObject;
    }

    @Override // com.ironsource.InterfaceC19969gd
    /* renamed from: a */
    public long mo57649a() {
        return this.f50844a.optInt("timeout", 24) * 1000;
    }

    @Override // com.ironsource.InterfaceC19969gd
    @NotNull
    /* renamed from: b */
    public EnumC20260ld mo57648b() {
        return EnumC20260ld.f50992b.m57491a(this.f50844a.optInt("strategy", C20203a.f50845a.m57646a()));
    }

    @Override // com.ironsource.InterfaceC19811ec
    /* renamed from: c */
    public boolean mo57647c() {
        return this.f50844a.optBoolean(C20419a.f51686j, false);
    }
}
