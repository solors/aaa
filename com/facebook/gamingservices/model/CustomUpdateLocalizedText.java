package com.facebook.gamingservices.model;

import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: CustomUpdateContent.kt */
@Metadata
/* loaded from: classes3.dex */
public final class CustomUpdateLocalizedText {
    @NotNull

    /* renamed from: default  reason: not valid java name */
    private final String f119449default;
    @Nullable
    private final HashMap<String, String> localizations;

    public CustomUpdateLocalizedText(@NotNull String str, @Nullable HashMap<String, String> hashMap) {
        Intrinsics.checkNotNullParameter(str, "default");
        this.f119449default = str;
        this.localizations = hashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CustomUpdateLocalizedText copy$default(CustomUpdateLocalizedText customUpdateLocalizedText, String str, HashMap hashMap, int i, Object obj) {
        if ((i & 1) != 0) {
            str = customUpdateLocalizedText.f119449default;
        }
        if ((i & 2) != 0) {
            hashMap = customUpdateLocalizedText.localizations;
        }
        return customUpdateLocalizedText.copy(str, hashMap);
    }

    @NotNull
    public final String component1() {
        return this.f119449default;
    }

    @Nullable
    public final HashMap<String, String> component2() {
        return this.localizations;
    }

    @NotNull
    public final CustomUpdateLocalizedText copy(@NotNull String str, @Nullable HashMap<String, String> hashMap) {
        Intrinsics.checkNotNullParameter(str, "default");
        return new CustomUpdateLocalizedText(str, hashMap);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomUpdateLocalizedText)) {
            return false;
        }
        CustomUpdateLocalizedText customUpdateLocalizedText = (CustomUpdateLocalizedText) obj;
        if (Intrinsics.m17075f(this.f119449default, customUpdateLocalizedText.f119449default) && Intrinsics.m17075f(this.localizations, customUpdateLocalizedText.localizations)) {
            return true;
        }
        return false;
    }

    @NotNull
    public final String getDefault() {
        return this.f119449default;
    }

    @Nullable
    public final HashMap<String, String> getLocalizations() {
        return this.localizations;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.f119449default.hashCode() * 31;
        HashMap<String, String> hashMap = this.localizations;
        if (hashMap == null) {
            hashCode = 0;
        } else {
            hashCode = hashMap.hashCode();
        }
        return hashCode2 + hashCode;
    }

    @NotNull
    public final JSONObject toJSONObject() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("default", this.f119449default);
        HashMap<String, String> hashMap = this.localizations;
        if (hashMap != null) {
            JSONObject jSONObject2 = new JSONObject();
            for (Map.Entry<String, String> entry : hashMap.entrySet()) {
                jSONObject2.put(entry.getKey(), entry.getValue());
            }
            jSONObject.put("localizations", jSONObject2);
        }
        return jSONObject;
    }

    @NotNull
    public String toString() {
        return "CustomUpdateLocalizedText(default=" + this.f119449default + ", localizations=" + this.localizations + ')';
    }

    public /* synthetic */ CustomUpdateLocalizedText(String str, HashMap hashMap, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : hashMap);
    }
}
