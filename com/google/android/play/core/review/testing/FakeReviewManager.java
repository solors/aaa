package com.google.android.play.core.review.testing;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.review.ReviewException;
import com.google.android.play.core.review.ReviewInfo;
import com.google.android.play.core.review.ReviewManager;

/* compiled from: com.google.android.play:review@@2.0.0 */
/* loaded from: classes5.dex */
public class FakeReviewManager implements ReviewManager {

    /* renamed from: a */
    private final Context f39259a;

    /* renamed from: b */
    private ReviewInfo f39260b;

    public FakeReviewManager(Context context) {
        this.f39259a = context;
    }

    @Override // com.google.android.play.core.review.ReviewManager
    @NonNull
    public Task<Void> launchReviewFlow(@NonNull Activity activity, @NonNull ReviewInfo reviewInfo) {
        if (reviewInfo != this.f39260b) {
            return Tasks.forException(new ReviewException(-2));
        }
        return Tasks.forResult(null);
    }

    @Override // com.google.android.play.core.review.ReviewManager
    @NonNull
    public Task<ReviewInfo> requestReviewFlow() {
        ReviewInfo zzc = ReviewInfo.zzc(PendingIntent.getBroadcast(this.f39259a, 0, new Intent(), 67108864), false);
        this.f39260b = zzc;
        return Tasks.forResult(zzc);
    }
}
