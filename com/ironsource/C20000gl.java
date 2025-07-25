package com.ironsource;

import com.ironsource.sdk.controller.InterfaceC20844f;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata
/* renamed from: com.ironsource.gl */
/* loaded from: classes6.dex */
public final class C20000gl {
    @NotNull

    /* renamed from: d */
    public static final C20001a f50280d = new C20001a(null);
    @NotNull

    /* renamed from: a */
    private final String f50281a;
    @NotNull

    /* renamed from: b */
    private final String f50282b;
    @Nullable

    /* renamed from: c */
    private final JSONObject f50283c;

    @Metadata
    /* renamed from: com.ironsource.gl$a */
    /* loaded from: classes6.dex */
    public static final class C20001a {
        private C20001a() {
        }

        public /* synthetic */ C20001a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* renamed from: a */
        public final C20000gl m58336a(@NotNull String jsonStr) throws JSONException {
            Intrinsics.checkNotNullParameter(jsonStr, "jsonStr");
            JSONObject jSONObject = new JSONObject(jsonStr);
            String adId = jSONObject.getString("adId");
            String command = jSONObject.getString(InterfaceC20844f.C20847b.f53074g);
            JSONObject optJSONObject = jSONObject.optJSONObject("params");
            Intrinsics.checkNotNullExpressionValue(adId, "adId");
            Intrinsics.checkNotNullExpressionValue(command, "command");
            return new C20000gl(adId, command, optJSONObject);
        }
    }

    public C20000gl(@NotNull String adId, @NotNull String command, @Nullable JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(adId, "adId");
        Intrinsics.checkNotNullParameter(command, "command");
        this.f50281a = adId;
        this.f50282b = command;
        this.f50283c = jSONObject;
    }

    /* renamed from: a */
    public static /* synthetic */ C20000gl m58344a(C20000gl c20000gl, String str, String str2, JSONObject jSONObject, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c20000gl.f50281a;
        }
        if ((i & 2) != 0) {
            str2 = c20000gl.f50282b;
        }
        if ((i & 4) != 0) {
            jSONObject = c20000gl.f50283c;
        }
        return c20000gl.m58342a(str, str2, jSONObject);
    }

    @NotNull
    /* renamed from: b */
    public final String m58341b() {
        return this.f50282b;
    }

    @Nullable
    /* renamed from: c */
    public final JSONObject m58340c() {
        return this.f50283c;
    }

    @NotNull
    /* renamed from: d */
    public final String m58339d() {
        return this.f50281a;
    }

    @NotNull
    /* renamed from: e */
    public final String m58338e() {
        return this.f50282b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20000gl)) {
            return false;
        }
        C20000gl c20000gl = (C20000gl) obj;
        if (Intrinsics.m17075f(this.f50281a, c20000gl.f50281a) && Intrinsics.m17075f(this.f50282b, c20000gl.f50282b) && Intrinsics.m17075f(this.f50283c, c20000gl.f50283c)) {
            return true;
        }
        return false;
    }

    @Nullable
    /* renamed from: f */
    public final JSONObject m58337f() {
        return this.f50283c;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((this.f50281a.hashCode() * 31) + this.f50282b.hashCode()) * 31;
        JSONObject jSONObject = this.f50283c;
        if (jSONObject == null) {
            hashCode = 0;
        } else {
            hashCode = jSONObject.hashCode();
        }
        return hashCode2 + hashCode;
    }

    @NotNull
    public String toString() {
        return "MessageToNative(adId=" + this.f50281a + ", command=" + this.f50282b + ", params=" + this.f50283c + ')';
    }

    @NotNull
    /* renamed from: a */
    public static final C20000gl m58343a(@NotNull String str) throws JSONException {
        return f50280d.m58336a(str);
    }

    @NotNull
    /* renamed from: a */
    public final C20000gl m58342a(@NotNull String adId, @NotNull String command, @Nullable JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(adId, "adId");
        Intrinsics.checkNotNullParameter(command, "command");
        return new C20000gl(adId, command, jSONObject);
    }

    @NotNull
    /* renamed from: a */
    public final String m58345a() {
        return this.f50281a;
    }
}
