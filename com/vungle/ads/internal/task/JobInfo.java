package com.vungle.ads.internal.task;

import android.os.Bundle;
import com.vungle.ads.internal.util.C29518o;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.vungle.ads.internal.task.d */
/* loaded from: classes7.dex */
public final class JobInfo implements Cloneable {
    @NotNull
    public static final C29469a Companion = new C29469a(null);
    @NotNull
    private static final String TAG = "JobInfo";
    private long delay;
    @NotNull
    private Bundle extras;
    @NotNull
    private final String jobTag;
    private long nextRescheduleTimeout;
    private int priority;
    private int requiredNetworkType;
    private int reschedulePolicy;
    private long rescheduleTimeout;
    private boolean updateCurrent;

    /* compiled from: JobInfo.kt */
    @Metadata
    /* renamed from: com.vungle.ads.internal.task.d$a */
    /* loaded from: classes7.dex */
    public static final class C29469a {
        private C29469a() {
        }

        public /* synthetic */ C29469a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public JobInfo(@NotNull String jobTag) {
        Intrinsics.checkNotNullParameter(jobTag, "jobTag");
        this.jobTag = jobTag;
        this.extras = new Bundle();
        this.reschedulePolicy = 1;
        this.priority = 2;
    }

    @NotNull
    public Object clone() {
        return super.clone();
    }

    @Nullable
    public final JobInfo copy() {
        try {
            Object clone = super.clone();
            Intrinsics.m17073h(clone, "null cannot be cast to non-null type com.vungle.ads.internal.task.JobInfo");
            return (JobInfo) clone;
        } catch (CloneNotSupportedException e) {
            C29518o.C29519a c29519a = C29518o.Companion;
            c29519a.m37466e(TAG, "Cannot copy JobInfo " + this, e);
            return null;
        }
    }

    public final long getDelay() {
        return this.delay;
    }

    @NotNull
    public final Bundle getExtras() {
        return this.extras;
    }

    @NotNull
    public final String getJobTag() {
        return this.jobTag;
    }

    public final int getPriority() {
        return this.priority;
    }

    public final int getRequiredNetworkType() {
        return this.requiredNetworkType;
    }

    public final boolean getUpdateCurrent() {
        return this.updateCurrent;
    }

    public final long makeNextRescedule() {
        long j = this.rescheduleTimeout;
        if (j == 0) {
            return 0L;
        }
        long j2 = this.nextRescheduleTimeout;
        if (j2 == 0) {
            this.nextRescheduleTimeout = j;
        } else if (this.reschedulePolicy == 1) {
            this.nextRescheduleTimeout = j2 * 2;
        }
        return this.nextRescheduleTimeout;
    }

    @NotNull
    public final JobInfo setDelay(long j) {
        this.delay = j;
        return this;
    }

    @NotNull
    public final JobInfo setExtras(@NotNull Bundle extras) {
        Intrinsics.checkNotNullParameter(extras, "extras");
        this.extras = extras;
        return this;
    }

    @NotNull
    public final JobInfo setPriority(int i) {
        this.priority = i;
        return this;
    }

    @NotNull
    public final JobInfo setRequiredNetworkType(int i) {
        this.requiredNetworkType = i;
        return this;
    }

    @NotNull
    public final JobInfo setReschedulePolicy(long j, int i) {
        this.rescheduleTimeout = j;
        this.reschedulePolicy = i;
        return this;
    }

    @NotNull
    public final JobInfo setUpdateCurrent(boolean z) {
        this.updateCurrent = z;
        return this;
    }

    public static /* synthetic */ void getPriority$annotations() {
    }

    public static /* synthetic */ void getRequiredNetworkType$annotations() {
    }

    private static /* synthetic */ void getReschedulePolicy$annotations() {
    }
}
