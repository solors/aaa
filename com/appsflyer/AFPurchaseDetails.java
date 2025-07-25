package com.appsflyer;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class AFPurchaseDetails {
    @NotNull
    private final String AFInAppEventParameterName;
    @NotNull
    private final String AFInAppEventType;
    @NotNull
    private final AFPurchaseType AFKeystoreWrapper;
    @NotNull
    private final String valueOf;
    @NotNull
    private final String values;

    public AFPurchaseDetails(@NotNull AFPurchaseType aFPurchaseType, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(aFPurchaseType, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.AFKeystoreWrapper = aFPurchaseType;
        this.valueOf = str;
        this.AFInAppEventType = str2;
        this.values = str3;
        this.AFInAppEventParameterName = str4;
    }

    public static /* synthetic */ AFPurchaseDetails copy$default(AFPurchaseDetails aFPurchaseDetails, AFPurchaseType aFPurchaseType, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            aFPurchaseType = aFPurchaseDetails.AFKeystoreWrapper;
        }
        if ((i & 2) != 0) {
            str = aFPurchaseDetails.valueOf;
        }
        String str5 = str;
        if ((i & 4) != 0) {
            str2 = aFPurchaseDetails.AFInAppEventType;
        }
        String str6 = str2;
        if ((i & 8) != 0) {
            str3 = aFPurchaseDetails.values;
        }
        String str7 = str3;
        if ((i & 16) != 0) {
            str4 = aFPurchaseDetails.AFInAppEventParameterName;
        }
        return aFPurchaseDetails.copy(aFPurchaseType, str5, str6, str7, str4);
    }

    @NotNull
    public final AFPurchaseType component1() {
        return this.AFKeystoreWrapper;
    }

    @NotNull
    public final String component2() {
        return this.valueOf;
    }

    @NotNull
    public final String component3() {
        return this.AFInAppEventType;
    }

    @NotNull
    public final String component4() {
        return this.values;
    }

    @NotNull
    public final String component5() {
        return this.AFInAppEventParameterName;
    }

    @NotNull
    public final AFPurchaseDetails copy(@NotNull AFPurchaseType aFPurchaseType, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(aFPurchaseType, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new AFPurchaseDetails(aFPurchaseType, str, str2, str3, str4);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFPurchaseDetails)) {
            return false;
        }
        AFPurchaseDetails aFPurchaseDetails = (AFPurchaseDetails) obj;
        if (this.AFKeystoreWrapper == aFPurchaseDetails.AFKeystoreWrapper && Intrinsics.m17075f(this.valueOf, aFPurchaseDetails.valueOf) && Intrinsics.m17075f(this.AFInAppEventType, aFPurchaseDetails.AFInAppEventType) && Intrinsics.m17075f(this.values, aFPurchaseDetails.values) && Intrinsics.m17075f(this.AFInAppEventParameterName, aFPurchaseDetails.AFInAppEventParameterName)) {
            return true;
        }
        return false;
    }

    @NotNull
    public final String getCurrency() {
        return this.AFInAppEventParameterName;
    }

    @NotNull
    public final String getPrice() {
        return this.values;
    }

    @NotNull
    public final String getProductId() {
        return this.AFInAppEventType;
    }

    @NotNull
    public final String getPurchaseToken() {
        return this.valueOf;
    }

    @NotNull
    public final AFPurchaseType getPurchaseType() {
        return this.AFKeystoreWrapper;
    }

    public final int hashCode() {
        return (((((((this.AFKeystoreWrapper.hashCode() * 31) + this.valueOf.hashCode()) * 31) + this.AFInAppEventType.hashCode()) * 31) + this.values.hashCode()) * 31) + this.AFInAppEventParameterName.hashCode();
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AFPurchaseDetails(purchaseType=");
        sb2.append(this.AFKeystoreWrapper);
        sb2.append(", purchaseToken=");
        sb2.append(this.valueOf);
        sb2.append(", productId=");
        sb2.append(this.AFInAppEventType);
        sb2.append(", price=");
        sb2.append(this.values);
        sb2.append(", currency=");
        sb2.append(this.AFInAppEventParameterName);
        sb2.append(')');
        return sb2.toString();
    }
}
