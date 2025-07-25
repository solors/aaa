package com.google.android.play.core.review;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.review.internal.zzt;
import com.google.android.play.core.review.internal.zzw;

/* compiled from: com.google.android.play:review@@2.0.0 */
@SuppressLint({"RestrictedApi"})
/* loaded from: classes5.dex */
public final class zzi {

    /* renamed from: c */
    private static final com.google.android.play.core.review.internal.zzi f39272c = new com.google.android.play.core.review.internal.zzi("ReviewService");
    @Nullable
    @VisibleForTesting

    /* renamed from: a */
    zzt f39273a;

    /* renamed from: b */
    private final String f39274b;

    public zzi(Context context) {
        this.f39274b = context.getPackageName();
        if (zzw.zza(context)) {
            this.f39273a = new zzt(context, f39272c, "com.google.android.finsky.inappreviewservice.InAppReviewService", new Intent("com.google.android.finsky.BIND_IN_APP_REVIEW_SERVICE").setPackage("com.android.vending"), zze.zza, null, null);
        }
    }

    public final Task zza() {
        com.google.android.play.core.review.internal.zzi zziVar = f39272c;
        zziVar.zzd("requestInAppReview (%s)", this.f39274b);
        if (this.f39273a == null) {
            zziVar.zzb("Play Store app is either not installed or not the official version", new Object[0]);
            return Tasks.forException(new ReviewException(-1));
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f39273a.zzp(new zzf(this, taskCompletionSource, taskCompletionSource), taskCompletionSource);
        return taskCompletionSource.getTask();
    }
}
