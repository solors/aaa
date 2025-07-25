package com.learnings.purchase;

import android.content.Context;
import java.util.Locale;

/* loaded from: classes6.dex */
public class Utils {
    public static boolean isAmazon(Context context) {
        try {
            return context.getPackageName().toLowerCase(Locale.US).endsWith(".amz");
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }
}
