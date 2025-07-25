package com.yandex.mobile.ads.impl;

import java.util.List;
import java.util.Set;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p1072z8.DivDataTag;
import sb.DivData;

/* loaded from: classes8.dex */
public final class m10 {
    @NotNull

    /* renamed from: a */
    private final jl1 f81997a;
    @NotNull

    /* renamed from: b */
    private final p00 f81998b;
    @NotNull

    /* renamed from: c */
    private final r00 f81999c;
    @NotNull

    /* renamed from: d */
    private final j10 f82000d;
    @NotNull

    /* renamed from: e */
    private final C31753wi f82001e;

    public /* synthetic */ m10(jl1 jl1Var) {
        this(jl1Var, new p00(jl1Var), new r00(), new j10(), new C31753wi());
    }

    @Nullable
    /* renamed from: a */
    public final h10 m32159a(@NotNull C30815lz design) {
        JSONObject jSONObject;
        Intrinsics.checkNotNullParameter(design, "design");
        if (Intrinsics.m17075f(EnumC31322rz.f84949c.m29892a(), design.m32188d())) {
            try {
                String m32189c = design.m32189c();
                String m32190b = design.m32190b();
                this.f82001e.getClass();
                JSONObject jSONObject2 = new JSONObject(C31753wi.m27897a(m32190b));
                JSONObject jSONObject3 = jSONObject2.getJSONObject("card");
                if (jSONObject2.has("templates")) {
                    jSONObject = jSONObject2.getJSONObject("templates");
                } else {
                    jSONObject = null;
                }
                List<bh0> m32191a = design.m32191a();
                p00 p00Var = this.f81998b;
                Intrinsics.m17074g(jSONObject3);
                DivData m30859a = p00Var.m30859a(jSONObject3, jSONObject);
                this.f81999c.getClass();
                String uuid = UUID.randomUUID().toString();
                Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
                DivDataTag divDataTag = new DivDataTag(uuid);
                Set<c10> m33081a = this.f82000d.m33081a(jSONObject3);
                if (m30859a != null) {
                    return new h10(m32189c, jSONObject3, jSONObject, m32191a, m30859a, divDataTag, m33081a);
                }
            } catch (Throwable th) {
                this.f81997a.reportError("Failed to parse DivKit design", th);
            }
        }
        return null;
    }

    public m10(@NotNull jl1 reporter, @NotNull p00 divDataCreator, @NotNull r00 divDataTagCreator, @NotNull j10 assetsProvider, @NotNull C31753wi base64Decoder) {
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        Intrinsics.checkNotNullParameter(divDataCreator, "divDataCreator");
        Intrinsics.checkNotNullParameter(divDataTagCreator, "divDataTagCreator");
        Intrinsics.checkNotNullParameter(assetsProvider, "assetsProvider");
        Intrinsics.checkNotNullParameter(base64Decoder, "base64Decoder");
        this.f81997a = reporter;
        this.f81998b = divDataCreator;
        this.f81999c = divDataTagCreator;
        this.f82000d = assetsProvider;
        this.f82001e = base64Decoder;
    }
}
