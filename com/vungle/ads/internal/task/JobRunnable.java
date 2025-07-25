package com.vungle.ads.internal.task;

import android.os.Bundle;
import android.os.Process;
import com.vungle.ads.internal.util.C29518o;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.vungle.ads.internal.task.e */
/* loaded from: classes7.dex */
public final class JobRunnable extends PriorityRunnable {
    @NotNull
    public static final C29470a Companion = new C29470a(null);
    private static final String TAG = JobRunnable.class.getSimpleName();
    @NotNull
    private final JobCreator creator;
    @NotNull
    private final JobRunner jobRunner;
    @NotNull
    private final JobInfo jobinfo;
    @Nullable
    private final ThreadPriorityHelper threadPriorityHelper;

    /* compiled from: JobRunnable.kt */
    @Metadata
    /* renamed from: com.vungle.ads.internal.task.e$a */
    /* loaded from: classes7.dex */
    public static final class C29470a {
        private C29470a() {
        }

        public /* synthetic */ C29470a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public JobRunnable(@NotNull JobInfo jobinfo, @NotNull JobCreator creator, @NotNull JobRunner jobRunner, @Nullable ThreadPriorityHelper threadPriorityHelper) {
        Intrinsics.checkNotNullParameter(jobinfo, "jobinfo");
        Intrinsics.checkNotNullParameter(creator, "creator");
        Intrinsics.checkNotNullParameter(jobRunner, "jobRunner");
        this.jobinfo = jobinfo;
        this.creator = creator;
        this.jobRunner = jobRunner;
        this.threadPriorityHelper = threadPriorityHelper;
    }

    @Override // com.vungle.ads.internal.task.PriorityRunnable
    public int getPriority() {
        return this.jobinfo.getPriority();
    }

    @Override // java.lang.Runnable
    public void run() {
        ThreadPriorityHelper threadPriorityHelper = this.threadPriorityHelper;
        if (threadPriorityHelper != null) {
            try {
                int makeAndroidThreadPriority = threadPriorityHelper.makeAndroidThreadPriority(this.jobinfo);
                Process.setThreadPriority(makeAndroidThreadPriority);
                C29518o.C29519a c29519a = C29518o.Companion;
                String TAG2 = TAG;
                Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                c29519a.m37468d(TAG2, "Setting process thread prio = " + makeAndroidThreadPriority + " for " + this.jobinfo.getJobTag());
            } catch (Throwable unused) {
                C29518o.C29519a c29519a2 = C29518o.Companion;
                String TAG3 = TAG;
                Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
                c29519a2.m37467e(TAG3, "Error on setting process thread priority");
            }
        }
        try {
            String jobTag = this.jobinfo.getJobTag();
            Bundle extras = this.jobinfo.getExtras();
            C29518o.C29519a c29519a3 = C29518o.Companion;
            String TAG4 = TAG;
            Intrinsics.checkNotNullExpressionValue(TAG4, "TAG");
            c29519a3.m37468d(TAG4, "Start job " + jobTag + "Thread " + Thread.currentThread().getName());
            int onRunJob = this.creator.create(jobTag).onRunJob(extras, this.jobRunner);
            Intrinsics.checkNotNullExpressionValue(TAG4, "TAG");
            c29519a3.m37468d(TAG4, "On job finished " + jobTag + " with result " + onRunJob);
            if (onRunJob == 2) {
                long makeNextRescedule = this.jobinfo.makeNextRescedule();
                if (makeNextRescedule > 0) {
                    this.jobinfo.setDelay(makeNextRescedule);
                    this.jobRunner.execute(this.jobinfo);
                    Intrinsics.checkNotNullExpressionValue(TAG4, "TAG");
                    c29519a3.m37468d(TAG4, "Rescheduling " + jobTag + " in " + makeNextRescedule);
                }
            }
        } catch (Exception e) {
            C29518o.C29519a c29519a4 = C29518o.Companion;
            String TAG5 = TAG;
            Intrinsics.checkNotNullExpressionValue(TAG5, "TAG");
            c29519a4.m37467e(TAG5, "Cannot create job" + e.getLocalizedMessage());
        }
    }

    public static /* synthetic */ void getPriority$annotations() {
    }
}
