package com.vungle.ads.internal.task;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.annotation.VisibleForTesting;
import com.vungle.ads.internal.util.C29518o;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.vungle.ads.internal.task.m */
/* loaded from: classes7.dex */
public final class VungleJobRunner implements JobRunner {
    @NotNull
    private final JobCreator creator;
    @NotNull
    private final Executor executor;
    private long nextCheck;
    @NotNull
    private final List<C29475b> pendingJobs;
    @NotNull
    private final Runnable pendingRunnable;
    @Nullable
    private final ThreadPriorityHelper threadPriorityHelper;
    @NotNull
    public static final C29474a Companion = new C29474a(null);
    @NotNull
    private static final Handler handler = new Handler(Looper.getMainLooper());
    private static final String TAG = VungleJobRunner.class.getSimpleName();

    /* compiled from: VungleJobRunner.kt */
    @Metadata
    /* renamed from: com.vungle.ads.internal.task.m$a */
    /* loaded from: classes7.dex */
    public static final class C29474a {
        private C29474a() {
        }

        public /* synthetic */ C29474a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: VungleJobRunner.kt */
    @Metadata
    /* renamed from: com.vungle.ads.internal.task.m$b */
    /* loaded from: classes7.dex */
    public static final class C29475b {
        @Nullable
        private JobInfo info;
        private final long uptimeMillis;

        public C29475b(long j, @Nullable JobInfo jobInfo) {
            this.uptimeMillis = j;
            this.info = jobInfo;
        }

        @Nullable
        public final JobInfo getInfo() {
            return this.info;
        }

        public final long getUptimeMillis() {
            return this.uptimeMillis;
        }

        public final void setInfo(@Nullable JobInfo jobInfo) {
            this.info = jobInfo;
        }
    }

    /* compiled from: VungleJobRunner.kt */
    @Metadata
    /* renamed from: com.vungle.ads.internal.task.m$c */
    /* loaded from: classes7.dex */
    private static final class RunnableC29476c implements Runnable {
        @NotNull
        private WeakReference<VungleJobRunner> runner;

        public RunnableC29476c(@NotNull WeakReference<VungleJobRunner> runner) {
            Intrinsics.checkNotNullParameter(runner, "runner");
            this.runner = runner;
        }

        @NotNull
        public final WeakReference<VungleJobRunner> getRunner() {
            return this.runner;
        }

        @Override // java.lang.Runnable
        public void run() {
            VungleJobRunner vungleJobRunner = this.runner.get();
            if (vungleJobRunner != null) {
                vungleJobRunner.executePendingJobs();
            }
        }

        public final void setRunner(@NotNull WeakReference<VungleJobRunner> weakReference) {
            Intrinsics.checkNotNullParameter(weakReference, "<set-?>");
            this.runner = weakReference;
        }
    }

    public VungleJobRunner(@NotNull JobCreator creator, @NotNull Executor executor, @Nullable ThreadPriorityHelper threadPriorityHelper) {
        Intrinsics.checkNotNullParameter(creator, "creator");
        Intrinsics.checkNotNullParameter(executor, "executor");
        this.creator = creator;
        this.executor = executor;
        this.threadPriorityHelper = threadPriorityHelper;
        this.nextCheck = Long.MAX_VALUE;
        this.pendingJobs = new CopyOnWriteArrayList();
        this.pendingRunnable = new RunnableC29476c(new WeakReference(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void executePendingJobs() {
        long uptimeMillis = SystemClock.uptimeMillis();
        long j = Long.MAX_VALUE;
        for (C29475b c29475b : this.pendingJobs) {
            if (uptimeMillis >= c29475b.getUptimeMillis()) {
                this.pendingJobs.remove(c29475b);
                JobInfo info = c29475b.getInfo();
                if (info != null) {
                    this.executor.execute(new JobRunnable(info, this.creator, this, this.threadPriorityHelper));
                }
            } else {
                j = Math.min(j, c29475b.getUptimeMillis());
            }
        }
        if (j != Long.MAX_VALUE && j != this.nextCheck) {
            Handler handler2 = handler;
            handler2.removeCallbacks(this.pendingRunnable);
            handler2.postAtTime(this.pendingRunnable, TAG, j);
        }
        this.nextCheck = j;
    }

    @Override // com.vungle.ads.internal.task.JobRunner
    public synchronized void cancelPendingJob(@NotNull String tag) {
        String str;
        Intrinsics.checkNotNullParameter(tag, "tag");
        ArrayList arrayList = new ArrayList();
        for (C29475b c29475b : this.pendingJobs) {
            JobInfo info = c29475b.getInfo();
            if (info != null) {
                str = info.getJobTag();
            } else {
                str = null;
            }
            if (Intrinsics.m17075f(str, tag)) {
                arrayList.add(c29475b);
            }
        }
        this.pendingJobs.removeAll(arrayList);
    }

    @Override // com.vungle.ads.internal.task.JobRunner
    public synchronized void execute(@NotNull JobInfo jobInfo) {
        String str;
        Intrinsics.checkNotNullParameter(jobInfo, "jobInfo");
        JobInfo copy = jobInfo.copy();
        if (copy != null) {
            String jobTag = copy.getJobTag();
            long delay = copy.getDelay();
            copy.setDelay(0L);
            if (copy.getUpdateCurrent()) {
                for (C29475b c29475b : this.pendingJobs) {
                    JobInfo info = c29475b.getInfo();
                    if (info != null) {
                        str = info.getJobTag();
                    } else {
                        str = null;
                    }
                    if (Intrinsics.m17075f(str, jobTag)) {
                        C29518o.C29519a c29519a = C29518o.Companion;
                        String TAG2 = TAG;
                        Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                        c29519a.m37468d(TAG2, "replacing pending job with new " + jobTag);
                        this.pendingJobs.remove(c29475b);
                    }
                }
            }
            this.pendingJobs.add(new C29475b(SystemClock.uptimeMillis() + delay, copy));
            executePendingJobs();
        }
    }

    @VisibleForTesting
    public final int getPendingJobSize$vungle_ads_release() {
        return this.pendingJobs.size();
    }
}
