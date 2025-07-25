package com.p551my.tracker.ads;

import com.p551my.tracker.obfuscated.AbstractC26352j0;

/* renamed from: com.my.tracker.ads.AdEvent */
/* loaded from: classes7.dex */
public final class AdEvent extends AbstractC26352j0 {
    public final String adFormat;
    public final String adId;
    public final String currency;
    public final int network;
    public final String placementId;
    public final double revenue;
    public final String source;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AdEvent(int i, int i2, double d, String str, String str2, String str3, String str4, String str5) {
        super(i);
        this.network = i2;
        this.revenue = d;
        this.currency = str;
        this.source = str2;
        this.placementId = str3;
        this.adId = str4;
        this.adFormat = str5;
    }
}
