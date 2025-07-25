package com.inmobi.media;

import android.media.MediaMetadataRetriever;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.J7 */
/* loaded from: classes6.dex */
public final class C18979J7 {

    /* renamed from: a */
    public final long f47381a;

    /* renamed from: b */
    public final long f47382b;

    /* renamed from: c */
    public final String f47383c;

    /* renamed from: d */
    public final C19328j7 f47384d;

    public C18979J7(long j, long j2, String referencedAssetId, C19328j7 nativeDataModel) {
        Intrinsics.checkNotNullParameter(referencedAssetId, "referencedAssetId");
        Intrinsics.checkNotNullParameter(nativeDataModel, "nativeDataModel");
        this.f47381a = j;
        this.f47382b = j2;
        this.f47383c = referencedAssetId;
        this.f47384d = nativeDataModel;
        Intrinsics.checkNotNullExpressionValue(C18993K7.class.getSimpleName(), "getSimpleName(...)");
    }

    /* renamed from: a */
    public final long m60989a() {
        String str;
        long j;
        long j2 = this.f47381a;
        C19149W6 m60168m = this.f47384d.m60168m(this.f47383c);
        try {
            if (m60168m instanceof C19150W7) {
                InterfaceC19319ic m60594b = ((C19150W7) m60168m).m60594b();
                if (m60594b != null) {
                    str = ((C19305hc) m60594b).m60270b();
                } else {
                    str = null;
                }
                if (str != null) {
                    MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                    mediaMetadataRetriever.setDataSource(str);
                    String extractMetadata = mediaMetadataRetriever.extractMetadata(9);
                    if (extractMetadata != null) {
                        j = Long.parseLong(extractMetadata);
                    } else {
                        j = 0;
                    }
                    j2 += (long) ((this.f47382b / 100.0d) * (j / 1000));
                    mediaMetadataRetriever.release();
                }
            }
        } catch (Exception unused) {
        }
        return Math.max(j2, 0L);
    }
}
