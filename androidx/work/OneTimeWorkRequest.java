package androidx.work;

import androidx.work.WorkRequest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C37566w;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: OneTimeWorkRequest.kt */
@Metadata
/* loaded from: classes2.dex */
public final class OneTimeWorkRequest extends WorkRequest {
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* compiled from: OneTimeWorkRequest.kt */
    @Metadata
    /* loaded from: classes2.dex */
    public static final class Builder extends WorkRequest.Builder<Builder, OneTimeWorkRequest> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Builder(@NotNull Class<? extends ListenableWorker> workerClass) {
            super(workerClass);
            Intrinsics.checkNotNullParameter(workerClass, "workerClass");
            getWorkSpec$work_runtime_release().inputMergerClassName = OverwritingInputMerger.class.getName();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.work.WorkRequest.Builder
        @NotNull
        public Builder getThisObject$work_runtime_release() {
            return this;
        }

        @NotNull
        public final Builder setInputMerger(@NotNull Class<? extends InputMerger> inputMerger) {
            Intrinsics.checkNotNullParameter(inputMerger, "inputMerger");
            getWorkSpec$work_runtime_release().inputMergerClassName = inputMerger.getName();
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.work.WorkRequest.Builder
        @NotNull
        public OneTimeWorkRequest buildInternal$work_runtime_release() {
            if ((getBackoffCriteriaSet$work_runtime_release() && getWorkSpec$work_runtime_release().constraints.requiresDeviceIdle()) ? false : true) {
                return new OneTimeWorkRequest(this);
            }
            throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job".toString());
        }
    }

    /* compiled from: OneTimeWorkRequest.kt */
    @Metadata
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final OneTimeWorkRequest from(@NotNull Class<? extends ListenableWorker> workerClass) {
            Intrinsics.checkNotNullParameter(workerClass, "workerClass");
            return new Builder(workerClass).build();
        }

        @NotNull
        public final List<OneTimeWorkRequest> from(@NotNull List<? extends Class<? extends ListenableWorker>> workerClasses) {
            int m17154x;
            Intrinsics.checkNotNullParameter(workerClasses, "workerClasses");
            List<? extends Class<? extends ListenableWorker>> list = workerClasses;
            m17154x = C37566w.m17154x(list, 10);
            ArrayList arrayList = new ArrayList(m17154x);
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new Builder((Class) it.next()).build());
            }
            return arrayList;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneTimeWorkRequest(@NotNull Builder builder) {
        super(builder.getId$work_runtime_release(), builder.getWorkSpec$work_runtime_release(), builder.getTags$work_runtime_release());
        Intrinsics.checkNotNullParameter(builder, "builder");
    }

    @NotNull
    public static final OneTimeWorkRequest from(@NotNull Class<? extends ListenableWorker> cls) {
        return Companion.from(cls);
    }

    @NotNull
    public static final List<OneTimeWorkRequest> from(@NotNull List<? extends Class<? extends ListenableWorker>> list) {
        return Companion.from(list);
    }
}
