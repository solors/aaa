package com.google.android.play.core.review;

import android.app.Activity;
import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;

/* compiled from: com.google.android.play:review@@2.0.0 */
/* loaded from: classes5.dex */
public interface ReviewManager {
    @NonNull
    Task<Void> launchReviewFlow(@NonNull Activity activity, @NonNull ReviewInfo reviewInfo);

    @NonNull
    Task<ReviewInfo> requestReviewFlow();
}
