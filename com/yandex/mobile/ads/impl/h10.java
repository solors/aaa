package com.yandex.mobile.ads.impl;

import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p1072z8.DivDataTag;
import sb.DivData;

/* loaded from: classes8.dex */
public final class h10 {
    @NotNull

    /* renamed from: a */
    private final String f79833a;
    @NotNull

    /* renamed from: b */
    private final JSONObject f79834b;
    @Nullable

    /* renamed from: c */
    private final JSONObject f79835c;
    @Nullable

    /* renamed from: d */
    private final List<bh0> f79836d;
    @NotNull

    /* renamed from: e */
    private final DivData f79837e;
    @NotNull

    /* renamed from: f */
    private final DivDataTag f79838f;
    @NotNull

    /* renamed from: g */
    private final Set<c10> f79839g;

    public h10(@NotNull String target, @NotNull JSONObject card, @Nullable JSONObject jSONObject, @Nullable List<bh0> list, @NotNull DivData divData, @NotNull DivDataTag divDataTag, @NotNull Set<c10> divAssets) {
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(card, "card");
        Intrinsics.checkNotNullParameter(divData, "divData");
        Intrinsics.checkNotNullParameter(divDataTag, "divDataTag");
        Intrinsics.checkNotNullParameter(divAssets, "divAssets");
        this.f79833a = target;
        this.f79834b = card;
        this.f79835c = jSONObject;
        this.f79836d = list;
        this.f79837e = divData;
        this.f79838f = divDataTag;
        this.f79839g = divAssets;
    }

    @NotNull
    /* renamed from: a */
    public final Set<c10> m33741a() {
        return this.f79839g;
    }

    @NotNull
    /* renamed from: b */
    public final DivData m33740b() {
        return this.f79837e;
    }

    @NotNull
    /* renamed from: c */
    public final DivDataTag m33739c() {
        return this.f79838f;
    }

    @Nullable
    /* renamed from: d */
    public final List<bh0> m33738d() {
        return this.f79836d;
    }

    @NotNull
    /* renamed from: e */
    public final String m33737e() {
        return this.f79833a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h10)) {
            return false;
        }
        h10 h10Var = (h10) obj;
        if (Intrinsics.m17075f(this.f79833a, h10Var.f79833a) && Intrinsics.m17075f(this.f79834b, h10Var.f79834b) && Intrinsics.m17075f(this.f79835c, h10Var.f79835c) && Intrinsics.m17075f(this.f79836d, h10Var.f79836d) && Intrinsics.m17075f(this.f79837e, h10Var.f79837e) && Intrinsics.m17075f(this.f79838f, h10Var.f79838f) && Intrinsics.m17075f(this.f79839g, h10Var.f79839g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.f79834b.hashCode() + (this.f79833a.hashCode() * 31)) * 31;
        JSONObject jSONObject = this.f79835c;
        int i = 0;
        if (jSONObject == null) {
            hashCode = 0;
        } else {
            hashCode = jSONObject.hashCode();
        }
        int i2 = (hashCode2 + hashCode) * 31;
        List<bh0> list = this.f79836d;
        if (list != null) {
            i = list.hashCode();
        }
        int hashCode3 = this.f79837e.hashCode();
        return this.f79839g.hashCode() + ((this.f79838f.hashCode() + ((hashCode3 + ((i2 + i) * 31)) * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        String str = this.f79833a;
        JSONObject jSONObject = this.f79834b;
        JSONObject jSONObject2 = this.f79835c;
        List<bh0> list = this.f79836d;
        DivData divData = this.f79837e;
        DivDataTag divDataTag = this.f79838f;
        Set<c10> set = this.f79839g;
        return "DivKitDesign(target=" + str + ", card=" + jSONObject + ", templates=" + jSONObject2 + ", images=" + list + ", divData=" + divData + ", divDataTag=" + divDataTag + ", divAssets=" + set + ")";
    }
}
