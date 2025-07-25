package com.mobilefuse.sdk.mfx;

import com.mobilefuse.sdk.component.ParsedAdMarkup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: BasicAdMarkup.kt */
@Metadata
/* loaded from: classes7.dex */
public final class BasicAdMarkup implements ParsedAdMarkup {
    @NotNull
    private final String adm;

    public BasicAdMarkup(@NotNull String adm) {
        Intrinsics.checkNotNullParameter(adm, "adm");
        this.adm = adm;
    }

    public static /* synthetic */ BasicAdMarkup copy$default(BasicAdMarkup basicAdMarkup, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = basicAdMarkup.getAdm();
        }
        return basicAdMarkup.copy(str);
    }

    @NotNull
    public final String component1() {
        return getAdm();
    }

    @NotNull
    public final BasicAdMarkup copy(@NotNull String adm) {
        Intrinsics.checkNotNullParameter(adm, "adm");
        return new BasicAdMarkup(adm);
    }

    public boolean equals(@Nullable Object obj) {
        if (this != obj) {
            if (!(obj instanceof BasicAdMarkup) || !Intrinsics.m17075f(getAdm(), ((BasicAdMarkup) obj).getAdm())) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override // com.mobilefuse.sdk.component.ParsedAdMarkup
    @NotNull
    public String getAdm() {
        return this.adm;
    }

    public int hashCode() {
        String adm = getAdm();
        if (adm != null) {
            return adm.hashCode();
        }
        return 0;
    }

    @NotNull
    public String toString() {
        return "BasicAdMarkup(adm=" + getAdm() + ")";
    }
}
