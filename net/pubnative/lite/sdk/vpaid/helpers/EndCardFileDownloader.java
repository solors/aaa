package net.pubnative.lite.sdk.vpaid.helpers;

import java.net.MalformedURLException;
import java.net.URL;
import net.pubnative.lite.sdk.utils.Logger;

/* loaded from: classes10.dex */
public class EndCardFileDownloader {
    private static final String TAG = "EndCardFileDownloader";

    /* JADX WARN: Removed duplicated region for block: B:21:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Bitmap mLoad(java.lang.String r4) {
        /*
            java.net.URL r4 = mStringToURL(r4)
            r0 = 0
            if (r4 != 0) goto L8
            return r0
        L8:
            java.net.URLConnection r4 = r4.openConnection()     // Catch: java.lang.Throwable -> L24 java.io.IOException -> L29
            java.net.HttpURLConnection r4 = (java.net.HttpURLConnection) r4     // Catch: java.lang.Throwable -> L24 java.io.IOException -> L29
            r4.connect()     // Catch: java.io.IOException -> L22 java.lang.Throwable -> L3a
            java.io.InputStream r1 = r4.getInputStream()     // Catch: java.io.IOException -> L22 java.lang.Throwable -> L3a
            java.io.BufferedInputStream r2 = new java.io.BufferedInputStream     // Catch: java.io.IOException -> L22 java.lang.Throwable -> L3a
            r2.<init>(r1)     // Catch: java.io.IOException -> L22 java.lang.Throwable -> L3a
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeStream(r2)     // Catch: java.io.IOException -> L22 java.lang.Throwable -> L3a
            r4.disconnect()
            return r0
        L22:
            r1 = move-exception
            goto L2b
        L24:
            r4 = move-exception
            r3 = r0
            r0 = r4
            r4 = r3
            goto L3b
        L29:
            r1 = move-exception
            r4 = r0
        L2b:
            java.lang.String r2 = net.pubnative.lite.sdk.vpaid.helpers.EndCardFileDownloader.TAG     // Catch: java.lang.Throwable -> L3a
            java.lang.String r1 = r1.getMessage()     // Catch: java.lang.Throwable -> L3a
            net.pubnative.lite.sdk.utils.Logger.m14227e(r2, r1)     // Catch: java.lang.Throwable -> L3a
            if (r4 == 0) goto L39
            r4.disconnect()
        L39:
            return r0
        L3a:
            r0 = move-exception
        L3b:
            if (r4 == 0) goto L40
            r4.disconnect()
        L40:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: net.pubnative.lite.sdk.vpaid.helpers.EndCardFileDownloader.mLoad(java.lang.String):android.graphics.Bitmap");
    }

    private static URL mStringToURL(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            Logger.m14227e(TAG, e.getMessage());
            return null;
        }
    }
}
