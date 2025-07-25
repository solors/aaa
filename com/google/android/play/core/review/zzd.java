package com.google.android.play.core.review;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;

/* compiled from: com.google.android.play:review@@2.0.0 */
@SuppressLint({"RestrictedApi"})
/* loaded from: classes5.dex */
public final class zzd implements ReviewManager {

    /* renamed from: a */
    private final zzi f39264a;

    /* renamed from: b */
    private final Handler f39265b = new Handler(Looper.getMainLooper());

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzd(zzi zziVar) {
        this.f39264a = zziVar;
    }

    @Override // com.google.android.play.core.review.ReviewManager
    @NonNull
    public final Task<Void> launchReviewFlow(@NonNull Activity activity, @NonNull ReviewInfo reviewInfo) {
        if (reviewInfo.mo70120d()) {
            return Tasks.forResult(null);
        }
        Intent intent = new Intent(activity, PlayCoreDialogWrapperActivity.class);
        intent.putExtra("confirmation_intent", reviewInfo.mo70121c());
        intent.putExtra("window_flags", activity.getWindow().getDecorView().getWindowSystemUiVisibility());
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        intent.putExtra("result_receiver", new zzc(this, this.f39265b, taskCompletionSource));
        activity.startActivity(intent);
        return taskCompletionSource.getTask();
    }

    @Override // com.google.android.play.core.review.ReviewManager
    @NonNull
    public final Task<ReviewInfo> requestReviewFlow() {
        return this.f39264a.zza();
    }
}
