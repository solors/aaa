package androidx.work;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import androidx.work.WorkInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

/* loaded from: classes2.dex */
public final class WorkQuery {
    private final List<UUID> mIds;
    private final List<WorkInfo.State> mStates;
    private final List<String> mTags;
    private final List<String> mUniqueWorkNames;

    /* loaded from: classes2.dex */
    public static final class Builder {
        List<UUID> mIds = new ArrayList();
        List<String> mUniqueWorkNames = new ArrayList();
        List<String> mTags = new ArrayList();
        List<WorkInfo.State> mStates = new ArrayList();

        private Builder() {
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public static Builder fromIds(@NonNull List<UUID> list) {
            Builder builder = new Builder();
            builder.addIds(list);
            return builder;
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public static Builder fromStates(@NonNull List<WorkInfo.State> list) {
            Builder builder = new Builder();
            builder.addStates(list);
            return builder;
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public static Builder fromTags(@NonNull List<String> list) {
            Builder builder = new Builder();
            builder.addTags(list);
            return builder;
        }

        @NonNull
        @SuppressLint({"BuilderSetStyle"})
        public static Builder fromUniqueWorkNames(@NonNull List<String> list) {
            Builder builder = new Builder();
            builder.addUniqueWorkNames(list);
            return builder;
        }

        @NonNull
        public Builder addIds(@NonNull List<UUID> list) {
            this.mIds.addAll(list);
            return this;
        }

        @NonNull
        public Builder addStates(@NonNull List<WorkInfo.State> list) {
            this.mStates.addAll(list);
            return this;
        }

        @NonNull
        public Builder addTags(@NonNull List<String> list) {
            this.mTags.addAll(list);
            return this;
        }

        @NonNull
        public Builder addUniqueWorkNames(@NonNull List<String> list) {
            this.mUniqueWorkNames.addAll(list);
            return this;
        }

        @NonNull
        public WorkQuery build() {
            if (this.mIds.isEmpty() && this.mUniqueWorkNames.isEmpty() && this.mTags.isEmpty() && this.mStates.isEmpty()) {
                throw new IllegalArgumentException("Must specify ids, uniqueNames, tags or states when building a WorkQuery");
            }
            return new WorkQuery(this);
        }
    }

    WorkQuery(@NonNull Builder builder) {
        this.mIds = builder.mIds;
        this.mUniqueWorkNames = builder.mUniqueWorkNames;
        this.mTags = builder.mTags;
        this.mStates = builder.mStates;
    }

    @NonNull
    public static WorkQuery fromIds(@NonNull List<UUID> list) {
        return Builder.fromIds(list).build();
    }

    @NonNull
    public static WorkQuery fromStates(@NonNull List<WorkInfo.State> list) {
        return Builder.fromStates(list).build();
    }

    @NonNull
    public static WorkQuery fromTags(@NonNull List<String> list) {
        return Builder.fromTags(list).build();
    }

    @NonNull
    public static WorkQuery fromUniqueWorkNames(@NonNull String... strArr) {
        return Builder.fromUniqueWorkNames(Arrays.asList(strArr)).build();
    }

    @NonNull
    public List<UUID> getIds() {
        return this.mIds;
    }

    @NonNull
    public List<WorkInfo.State> getStates() {
        return this.mStates;
    }

    @NonNull
    public List<String> getTags() {
        return this.mTags;
    }

    @NonNull
    public List<String> getUniqueWorkNames() {
        return this.mUniqueWorkNames;
    }

    @NonNull
    public static WorkQuery fromIds(@NonNull UUID... uuidArr) {
        return fromIds(Arrays.asList(uuidArr));
    }

    @NonNull
    public static WorkQuery fromStates(@NonNull WorkInfo.State... stateArr) {
        return Builder.fromStates(Arrays.asList(stateArr)).build();
    }

    @NonNull
    public static WorkQuery fromTags(@NonNull String... strArr) {
        return fromTags(Arrays.asList(strArr));
    }

    @NonNull
    public static WorkQuery fromUniqueWorkNames(@NonNull List<String> list) {
        return Builder.fromUniqueWorkNames(list).build();
    }
}
