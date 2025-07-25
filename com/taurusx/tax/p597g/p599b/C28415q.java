package com.taurusx.tax.p597g.p599b;

import android.content.Context;
import android.os.Environment;
import com.taurusx.tax.p597g.p598a.C28392b;
import com.taurusx.tax.p597g.p598a.C28393c;
import java.io.File;
import net.pubnative.lite.sdk.analytics.Reporting;

/* renamed from: com.taurusx.tax.g.b.q */
/* loaded from: classes7.dex */
public final class C28415q {

    /* renamed from: a */
    public static final C28392b f73839a = C28393c.m38142a("StorageUtils");

    /* renamed from: a */
    public static File m38109a(Context context) {
        String str;
        try {
            str = Environment.getExternalStorageState();
        } catch (NullPointerException unused) {
            str = "";
        }
        File file = null;
        if ("mounted".equals(str)) {
            File file2 = new File(new File(new File(new File(Environment.getExternalStorageDirectory(), "Android"), "data"), context.getPackageName()), Reporting.EventType.CACHE);
            if (!file2.exists() && !file2.mkdirs()) {
                f73839a.m38148a(5, "Unable to create external cache directory", (Throwable) null);
            } else {
                file = file2;
            }
        }
        if (file == null) {
            file = context.getCacheDir();
        }
        if (file == null) {
            String str2 = "/data/data/" + context.getPackageName() + "/cache/";
            f73839a.m38143c("Can't define system cache directory! '" + str2 + "%s' will be used.");
            file = new File(str2);
        }
        return new File(file, "video-cache");
    }
}
