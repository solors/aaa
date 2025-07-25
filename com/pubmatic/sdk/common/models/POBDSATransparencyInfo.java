package com.pubmatic.sdk.common.models;

import com.ironsource.C21114v8;
import com.pubmatic.sdk.common.log.POBLog;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.MutableCollections;
import kotlin.collections._Collections;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: POBDSATransparencyInfo.kt */
@Metadata
/* loaded from: classes7.dex */
public final class POBDSATransparencyInfo {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull

    /* renamed from: a */
    private final String f70130a;
    @NotNull

    /* renamed from: b */
    private final List<Integer> f70131b;

    /* compiled from: POBDSATransparencyInfo.kt */
    @Metadata
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        private final List<Integer> m40604a(JSONArray jSONArray) {
            ArrayList arrayList = new ArrayList();
            if (jSONArray != null) {
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    arrayList.add(Integer.valueOf(jSONArray.getInt(i)));
                }
            }
            return arrayList;
        }

        @Nullable
        public final POBDSATransparencyInfo build(@NotNull JSONObject transparencyObject) {
            Intrinsics.checkNotNullParameter(transparencyObject, "transparencyObject");
            try {
                JSONArray optJSONArray = transparencyObject.optJSONArray("dsaparams");
                if (optJSONArray != null) {
                    String domain = transparencyObject.optString(C21114v8.C21123i.f54109D);
                    Intrinsics.checkNotNullExpressionValue(domain, "domain");
                    return new POBDSATransparencyInfo(domain, POBDSATransparencyInfo.Companion.m40604a(optJSONArray));
                }
                return null;
            } catch (JSONException e) {
                POBLog.error("POBDSATransparencyInfo", "Error while parsing DSA transparency object: " + e.getMessage(), new Object[0]);
                return null;
            }
        }

        @NotNull
        public final String getCombinedListOfParams(@NotNull List<POBDSATransparencyInfo> transparencyInfoList) {
            Set m17547e1;
            String m17521z0;
            Intrinsics.checkNotNullParameter(transparencyInfoList, "transparencyInfoList");
            ArrayList arrayList = new ArrayList();
            for (POBDSATransparencyInfo pOBDSATransparencyInfo : transparencyInfoList) {
                MutableCollections.m17624D(arrayList, pOBDSATransparencyInfo.getUserParams());
            }
            m17547e1 = _Collections.m17547e1(arrayList);
            m17521z0 = _Collections.m17521z0(m17547e1, ",", null, null, 0, null, null, 62, null);
            return m17521z0;
        }

        private Companion() {
        }
    }

    public POBDSATransparencyInfo(@NotNull String domainName, @NotNull List<Integer> userParams) {
        Intrinsics.checkNotNullParameter(domainName, "domainName");
        Intrinsics.checkNotNullParameter(userParams, "userParams");
        this.f70130a = domainName;
        this.f70131b = userParams;
    }

    @Nullable
    public static final POBDSATransparencyInfo build(@NotNull JSONObject jSONObject) {
        return Companion.build(jSONObject);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ POBDSATransparencyInfo copy$default(POBDSATransparencyInfo pOBDSATransparencyInfo, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pOBDSATransparencyInfo.f70130a;
        }
        if ((i & 2) != 0) {
            list = pOBDSATransparencyInfo.f70131b;
        }
        return pOBDSATransparencyInfo.copy(str, list);
    }

    @NotNull
    public static final String getCombinedListOfParams(@NotNull List<POBDSATransparencyInfo> list) {
        return Companion.getCombinedListOfParams(list);
    }

    @NotNull
    public final String component1() {
        return this.f70130a;
    }

    @NotNull
    public final List<Integer> component2() {
        return this.f70131b;
    }

    @NotNull
    public final POBDSATransparencyInfo copy(@NotNull String domainName, @NotNull List<Integer> userParams) {
        Intrinsics.checkNotNullParameter(domainName, "domainName");
        Intrinsics.checkNotNullParameter(userParams, "userParams");
        return new POBDSATransparencyInfo(domainName, userParams);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof POBDSATransparencyInfo)) {
            return false;
        }
        POBDSATransparencyInfo pOBDSATransparencyInfo = (POBDSATransparencyInfo) obj;
        if (Intrinsics.m17075f(this.f70130a, pOBDSATransparencyInfo.f70130a) && Intrinsics.m17075f(this.f70131b, pOBDSATransparencyInfo.f70131b)) {
            return true;
        }
        return false;
    }

    @NotNull
    public final String getDomainName() {
        return this.f70130a;
    }

    @NotNull
    public final List<Integer> getUserParams() {
        return this.f70131b;
    }

    public int hashCode() {
        return (this.f70130a.hashCode() * 31) + this.f70131b.hashCode();
    }

    @NotNull
    public String toString() {
        return "POBDSATransparencyInfo(domainName=" + this.f70130a + ", userParams=" + this.f70131b + ')';
    }
}
