package com.google.android.gms.internal.ads;

import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
final class zzafh {
    private static final String[] zza = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};
    private static final String[] zzb = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};
    private static final String[] zzc = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0088, code lost:
        r7 = -9223372036854775807L;
     */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.zzafd zza(java.lang.String r22) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 232
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzafh.zza(java.lang.String):com.google.android.gms.internal.ads.zzafd");
    }

    private static zzfxn zzb(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        long j;
        long j2;
        zzfxk zzfxkVar = new zzfxk();
        do {
            String concat = str.concat(":Item");
            xmlPullParser.next();
            if (zzej.zzc(xmlPullParser, concat)) {
                String concat2 = str2.concat(":Mime");
                String concat3 = str2.concat(":Semantic");
                String concat4 = str2.concat(":Length");
                String concat5 = str2.concat(":Padding");
                String zza2 = zzej.zza(xmlPullParser, concat2);
                String zza3 = zzej.zza(xmlPullParser, concat3);
                String zza4 = zzej.zza(xmlPullParser, concat4);
                String zza5 = zzej.zza(xmlPullParser, concat5);
                if (zza2 != null && zza3 != null) {
                    if (zza4 != null) {
                        j = Long.parseLong(zza4);
                    } else {
                        j = 0;
                    }
                    if (zza5 != null) {
                        j2 = Long.parseLong(zza5);
                    } else {
                        j2 = 0;
                    }
                    zzfxkVar.zzf(new zzafc(zza2, zza3, j, j2));
                } else {
                    return zzfxn.zzn();
                }
            }
        } while (!zzej.zzb(xmlPullParser, str.concat(":Directory")));
        return zzfxkVar.zzi();
    }
}
