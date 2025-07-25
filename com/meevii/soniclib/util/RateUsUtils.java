package com.meevii.soniclib.util;

import android.app.Activity;
import android.util.Log;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.review.ReviewInfo;
import com.google.android.play.core.review.ReviewManager;
import com.google.android.play.core.review.ReviewManagerFactory;

/* loaded from: classes5.dex */
public class RateUsUtils {
    /* renamed from: a */
    public static /* synthetic */ void m47840a(Task task) {
        lambda$showRateActivity$0(task);
    }

    /* renamed from: b */
    public static /* synthetic */ void m47839b(ReviewManager reviewManager, Activity activity, Task task) {
        lambda$showRateActivity$1(reviewManager, activity, task);
    }

    public static /* synthetic */ void lambda$showRateActivity$0(Task task) {
        Log.i("Review", "launch result:" + task.isSuccessful());
    }

    public static /* synthetic */ void lambda$showRateActivity$1(ReviewManager reviewManager, Activity activity, Task task) {
        if (task.isSuccessful()) {
            Log.i("Review", "request success...");
            reviewManager.launchReviewFlow(activity, (ReviewInfo) task.getResult()).addOnCompleteListener(new OnCompleteListener() { // from class: com.meevii.soniclib.util.d
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task2) {
                    RateUsUtils.m47840a(task2);
                }
            });
            return;
        }
        Log.i("Review", "request failed...");
    }

    public static boolean showRateActivity(final Activity activity) {
        try {
            final ReviewManager create = ReviewManagerFactory.create(activity.getApplicationContext());
            create.requestReviewFlow().addOnCompleteListener(new OnCompleteListener() { // from class: com.meevii.soniclib.util.e
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    RateUsUtils.m47839b(ReviewManager.this, activity, task);
                }
            });
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
