package com.google.android.play.core.review;

import android.content.Context;
import androidx.annotation.NonNull;

/* compiled from: com.google.android.play:review@@2.0.0 */
/* loaded from: classes5.dex */
public class ReviewManagerFactory {
    private ReviewManagerFactory() {
    }

    @NonNull
    public static ReviewManager create(@NonNull Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return new zzd(new zzi(context));
    }
}
