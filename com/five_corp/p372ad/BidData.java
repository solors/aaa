package com.five_corp.p372ad;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: com.five_corp.ad.BidData */
/* loaded from: classes4.dex */
public class BidData {
    @NonNull
    public final String bidResponse;
    @Nullable
    public final String watermark;

    public BidData(@NonNull String str, @Nullable String str2) {
        this.bidResponse = str;
        this.watermark = str2;
    }
}
