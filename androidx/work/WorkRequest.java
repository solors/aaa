package androidx.work;

import android.annotation.SuppressLint;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.work.WorkInfo;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.utils.DurationApi26;
import java.time.Duration;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.C37572z0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: WorkRequest.kt */
@Metadata
/* loaded from: classes2.dex */
public abstract class WorkRequest {
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final long DEFAULT_BACKOFF_DELAY_MILLIS = 30000;
    @SuppressLint({"MinMaxConstant"})
    public static final long MAX_BACKOFF_MILLIS = 18000000;
    @SuppressLint({"MinMaxConstant"})
    public static final long MIN_BACKOFF_MILLIS = 10000;
    @NotNull

    /* renamed from: id */
    private final UUID f1488id;
    @NotNull
    private final Set<String> tags;
    @NotNull
    private final WorkSpec workSpec;

    /* compiled from: WorkRequest.kt */
    @Metadata
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public WorkRequest(@NotNull UUID id2, @NotNull WorkSpec workSpec, @NotNull Set<String> tags) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(workSpec, "workSpec");
        Intrinsics.checkNotNullParameter(tags, "tags");
        this.f1488id = id2;
        this.workSpec = workSpec;
        this.tags = tags;
    }

    @NotNull
    public UUID getId() {
        return this.f1488id;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    public final String getStringId() {
        String uuid = getId().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "id.toString()");
        return uuid;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    public final Set<String> getTags() {
        return this.tags;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    public final WorkSpec getWorkSpec() {
        return this.workSpec;
    }

    /* compiled from: WorkRequest.kt */
    @Metadata
    /* loaded from: classes2.dex */
    public static abstract class Builder<B extends Builder<B, ?>, W extends WorkRequest> {
        private boolean backoffCriteriaSet;
        @NotNull

        /* renamed from: id */
        private UUID f1489id;
        @NotNull
        private final Set<String> tags;
        @NotNull
        private WorkSpec workSpec;
        @NotNull
        private final Class<? extends ListenableWorker> workerClass;

        public Builder(@NotNull Class<? extends ListenableWorker> workerClass) {
            Set<String> m17121h;
            Intrinsics.checkNotNullParameter(workerClass, "workerClass");
            this.workerClass = workerClass;
            UUID randomUUID = UUID.randomUUID();
            Intrinsics.checkNotNullExpressionValue(randomUUID, "randomUUID()");
            this.f1489id = randomUUID;
            String uuid = this.f1489id.toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "id.toString()");
            String name = workerClass.getName();
            Intrinsics.checkNotNullExpressionValue(name, "workerClass.name");
            this.workSpec = new WorkSpec(uuid, name);
            String name2 = workerClass.getName();
            Intrinsics.checkNotNullExpressionValue(name2, "workerClass.name");
            m17121h = C37572z0.m17121h(name2);
            this.tags = m17121h;
        }

        @NotNull
        public final B addTag(@NotNull String tag) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            this.tags.add(tag);
            return getThisObject$work_runtime_release();
        }

        @NotNull
        public final W build() {
            boolean z;
            W buildInternal$work_runtime_release = buildInternal$work_runtime_release();
            Constraints constraints = this.workSpec.constraints;
            boolean z2 = false;
            if (!constraints.hasContentUriTriggers() && !constraints.requiresBatteryNotLow() && !constraints.requiresCharging() && !constraints.requiresDeviceIdle()) {
                z = false;
            } else {
                z = true;
            }
            WorkSpec workSpec = this.workSpec;
            if (workSpec.expedited) {
                if (!z) {
                    if (workSpec.initialDelay <= 0) {
                        z2 = true;
                    }
                    if (!z2) {
                        throw new IllegalArgumentException("Expedited jobs cannot be delayed".toString());
                    }
                } else {
                    throw new IllegalArgumentException("Expedited jobs only support network and storage constraints".toString());
                }
            }
            UUID randomUUID = UUID.randomUUID();
            Intrinsics.checkNotNullExpressionValue(randomUUID, "randomUUID()");
            setId(randomUUID);
            return buildInternal$work_runtime_release;
        }

        @NotNull
        public abstract W buildInternal$work_runtime_release();

        public final boolean getBackoffCriteriaSet$work_runtime_release() {
            return this.backoffCriteriaSet;
        }

        @NotNull
        public final UUID getId$work_runtime_release() {
            return this.f1489id;
        }

        @NotNull
        public final Set<String> getTags$work_runtime_release() {
            return this.tags;
        }

        @NotNull
        public abstract B getThisObject$work_runtime_release();

        @NotNull
        public final WorkSpec getWorkSpec$work_runtime_release() {
            return this.workSpec;
        }

        @NotNull
        public final Class<? extends ListenableWorker> getWorkerClass$work_runtime_release() {
            return this.workerClass;
        }

        @NotNull
        public final B keepResultsForAtLeast(long j, @NotNull TimeUnit timeUnit) {
            Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
            this.workSpec.minimumRetentionDuration = timeUnit.toMillis(j);
            return getThisObject$work_runtime_release();
        }

        @NotNull
        public final B setBackoffCriteria(@NotNull BackoffPolicy backoffPolicy, long j, @NotNull TimeUnit timeUnit) {
            Intrinsics.checkNotNullParameter(backoffPolicy, "backoffPolicy");
            Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
            this.backoffCriteriaSet = true;
            WorkSpec workSpec = this.workSpec;
            workSpec.backoffPolicy = backoffPolicy;
            workSpec.setBackoffDelayDuration(timeUnit.toMillis(j));
            return getThisObject$work_runtime_release();
        }

        public final void setBackoffCriteriaSet$work_runtime_release(boolean z) {
            this.backoffCriteriaSet = z;
        }

        @NotNull
        public final B setConstraints(@NotNull Constraints constraints) {
            Intrinsics.checkNotNullParameter(constraints, "constraints");
            this.workSpec.constraints = constraints;
            return getThisObject$work_runtime_release();
        }

        @SuppressLint({"MissingGetterMatchingBuilder"})
        @NotNull
        public B setExpedited(@NotNull OutOfQuotaPolicy policy) {
            Intrinsics.checkNotNullParameter(policy, "policy");
            WorkSpec workSpec = this.workSpec;
            workSpec.expedited = true;
            workSpec.outOfQuotaPolicy = policy;
            return getThisObject$work_runtime_release();
        }

        @NotNull
        public final B setId(@NotNull UUID id2) {
            Intrinsics.checkNotNullParameter(id2, "id");
            this.f1489id = id2;
            String uuid = id2.toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "id.toString()");
            this.workSpec = new WorkSpec(uuid, this.workSpec);
            return getThisObject$work_runtime_release();
        }

        public final void setId$work_runtime_release(@NotNull UUID uuid) {
            Intrinsics.checkNotNullParameter(uuid, "<set-?>");
            this.f1489id = uuid;
        }

        @NotNull
        public B setInitialDelay(long j, @NotNull TimeUnit timeUnit) {
            Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
            this.workSpec.initialDelay = timeUnit.toMillis(j);
            if (Long.MAX_VALUE - System.currentTimeMillis() > this.workSpec.initialDelay) {
                return getThisObject$work_runtime_release();
            }
            throw new IllegalArgumentException("The given initial delay is too large and will cause an overflow!".toString());
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        @VisibleForTesting
        @NotNull
        public final B setInitialRunAttemptCount(int i) {
            this.workSpec.runAttemptCount = i;
            return getThisObject$work_runtime_release();
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        @VisibleForTesting
        @NotNull
        public final B setInitialState(@NotNull WorkInfo.State state) {
            Intrinsics.checkNotNullParameter(state, "state");
            this.workSpec.state = state;
            return getThisObject$work_runtime_release();
        }

        @NotNull
        public final B setInputData(@NotNull Data inputData) {
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            this.workSpec.input = inputData;
            return getThisObject$work_runtime_release();
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        @VisibleForTesting
        @NotNull
        public final B setLastEnqueueTime(long j, @NotNull TimeUnit timeUnit) {
            Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
            this.workSpec.lastEnqueueTime = timeUnit.toMillis(j);
            return getThisObject$work_runtime_release();
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        @VisibleForTesting
        @NotNull
        public final B setScheduleRequestedAt(long j, @NotNull TimeUnit timeUnit) {
            Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
            this.workSpec.scheduleRequestedAt = timeUnit.toMillis(j);
            return getThisObject$work_runtime_release();
        }

        public final void setWorkSpec$work_runtime_release(@NotNull WorkSpec workSpec) {
            Intrinsics.checkNotNullParameter(workSpec, "<set-?>");
            this.workSpec = workSpec;
        }

        @RequiresApi(26)
        @NotNull
        public final B keepResultsForAtLeast(@NotNull Duration duration) {
            Intrinsics.checkNotNullParameter(duration, "duration");
            this.workSpec.minimumRetentionDuration = DurationApi26.toMillisCompat(duration);
            return getThisObject$work_runtime_release();
        }

        @RequiresApi(26)
        @NotNull
        public final B setBackoffCriteria(@NotNull BackoffPolicy backoffPolicy, @NotNull Duration duration) {
            Intrinsics.checkNotNullParameter(backoffPolicy, "backoffPolicy");
            Intrinsics.checkNotNullParameter(duration, "duration");
            this.backoffCriteriaSet = true;
            WorkSpec workSpec = this.workSpec;
            workSpec.backoffPolicy = backoffPolicy;
            workSpec.setBackoffDelayDuration(DurationApi26.toMillisCompat(duration));
            return getThisObject$work_runtime_release();
        }

        @RequiresApi(26)
        @NotNull
        public B setInitialDelay(@NotNull Duration duration) {
            Intrinsics.checkNotNullParameter(duration, "duration");
            this.workSpec.initialDelay = DurationApi26.toMillisCompat(duration);
            if (Long.MAX_VALUE - System.currentTimeMillis() > this.workSpec.initialDelay) {
                return getThisObject$work_runtime_release();
            }
            throw new IllegalArgumentException("The given initial delay is too large and will cause an overflow!".toString());
        }
    }
}
