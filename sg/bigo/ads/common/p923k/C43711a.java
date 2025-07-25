package sg.bigo.ads.common.p923k;

import android.content.ContentResolver;
import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import sg.bigo.ads.common.C43584a;

/* renamed from: sg.bigo.ads.common.k.a */
/* loaded from: classes10.dex */
public final class C43711a {
    @NonNull
    @WorkerThread
    /* renamed from: a */
    public static C43584a m5148a(@NonNull Context context) {
        String str = "";
        boolean z = true;
        if ("Amazon".equalsIgnoreCase(Build.MANUFACTURER)) {
            try {
                ContentResolver contentResolver = context.getContentResolver();
                if (Settings.Secure.getInt(contentResolver, CommonUrlParts.LIMIT_AD_TRACKING) == 0) {
                    z = false;
                }
                str = Settings.Secure.getString(contentResolver, "advertising_id");
            } catch (Settings.SettingNotFoundException unused) {
            }
        }
        return new C43584a(str, z);
    }
}
