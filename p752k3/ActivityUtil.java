package p752k3;

import android.app.Activity;
import android.content.Intent;
import androidx.annotation.NonNull;

/* renamed from: k3.a */
/* loaded from: classes5.dex */
public class ActivityUtil {
    /* renamed from: a */
    public static void m18275a(@NonNull Activity activity) {
        if (activity != null) {
            Intent m18272c = ApplicationUtil.m18272c(activity, activity.getPackageName());
            if (m18272c != null) {
                activity.startActivity(m18272c);
            }
            activity.finish();
        }
    }
}
