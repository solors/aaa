package com.ironsource;

import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata
/* renamed from: com.ironsource.pm */
/* loaded from: classes6.dex */
public final class C20648pm {
    @Nullable

    /* renamed from: a */
    private final C19615b5 f52436a;

    /* renamed from: b */
    private final boolean f52437b;

    @Metadata
    /* renamed from: com.ironsource.pm$a */
    /* loaded from: classes6.dex */
    public static final class C20649a {
        @NotNull

        /* renamed from: a */
        public static final C20649a f52438a = new C20649a();
        @NotNull

        /* renamed from: b */
        public static final String f52439b = "adm";
        @NotNull

        /* renamed from: c */
        public static final String f52440c = "isOneFlow";
        @NotNull

        /* renamed from: d */
        public static final String f52441d = "isMultipleAdObjects";
        @NotNull

        /* renamed from: e */
        public static final String f52442e = "adsInternalInfo";
        @NotNull

        /* renamed from: f */
        public static final String f52443f = "success";
        @NotNull

        /* renamed from: g */
        public static final String f52444g = "error";
        @NotNull

        /* renamed from: h */
        public static final String f52445h = "data";

        private C20649a() {
        }
    }

    public C20648pm() {
        this(null, false, 3, null);
    }

    @NotNull
    /* renamed from: a */
    public final HashMap<String, String> m55776a() {
        JSONObject put;
        C19954g5 m59367g;
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("isOneFlow", String.valueOf(this.f52437b));
        hashMap.put("isMultipleAdObjects", "true");
        List<C20177k0> mo56236a = C19821el.f49880p.m58785d().mo57099B().mo56236a();
        if (mo56236a != null) {
            put = new JSONObject().put("success", true).put("data", mo56236a);
        } else {
            put = new JSONObject().put("success", false).put("error", "Failed to get ad internal info");
        }
        String jSONObject = put.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject, "if (jsonAdInternalInfo !…    .toString()\n        }");
        hashMap.put(C20649a.f52442e, jSONObject);
        C19615b5 c19615b5 = this.f52436a;
        if (c19615b5 != null && (m59367g = c19615b5.m59367g()) != null) {
            hashMap.put("adm", m59367g.m58473a());
            hashMap.putAll(m59367g.m58470b());
        }
        return hashMap;
    }

    public C20648pm(@Nullable C19615b5 c19615b5, boolean z) {
        this.f52436a = c19615b5;
        this.f52437b = z;
    }

    public /* synthetic */ C20648pm(C19615b5 c19615b5, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : c19615b5, (i & 2) != 0 ? false : z);
    }
}
