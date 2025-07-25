package com.mobilefuse.sdk.identity;

import androidx.annotation.VisibleForTesting;
import com.mobilefuse.sdk.StabilityHelper;
import com.mobilefuse.sdk.concurrency.SchedulersKt;
import com.mobilefuse.sdk.exception.ExceptionHandlingStrategy;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.MutableCollections;
import kotlin.collections._Collections;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.NoWhenBranchMatchedException;

/* compiled from: EidRequestDebouncer.kt */
@Metadata
/* loaded from: classes7.dex */
public final class EidRequestDebouncer {
    @Nullable
    private Runnable activeDebouceTask;
    private EidDataModel awaitingEidData;
    private final Set<IdentifierUpdateSignal> awaitingUpdateSignals;
    private final long debounceDelayMillis;
    @Nullable
    private Function2<? super EidDataModel, ? super Set<? extends IdentifierUpdateSignal>, Unit> onEidRequest;

    public EidRequestDebouncer() {
        this(0L, 1, null);
    }

    private final void clearCurrentTask() {
        Runnable runnable = this.activeDebouceTask;
        if (runnable != null) {
            SchedulersKt.getGlobalHandler().removeCallbacks(runnable);
        }
        this.activeDebouceTask = null;
    }

    @VisibleForTesting
    public final void callSdkStateChangedOnProviders$mobilefuse_sdk_core_release() {
        Set m17547e1;
        m17547e1 = _Collections.m17547e1(this.awaitingUpdateSignals);
        this.awaitingUpdateSignals.clear();
        EidDataModel eidDataModel = this.awaitingEidData;
        if (eidDataModel == null) {
            return;
        }
        this.awaitingEidData = null;
        this.activeDebouceTask = null;
        Function2<? super EidDataModel, ? super Set<? extends IdentifierUpdateSignal>, Unit> function2 = this.onEidRequest;
        if (function2 != null) {
            function2.mo105910invoke(eidDataModel, m17547e1);
        }
    }

    public final void debounceEidUpdate(@NotNull EidDataModel eidData, @NotNull Set<? extends IdentifierUpdateSignal> sdkSignals) {
        Intrinsics.checkNotNullParameter(eidData, "eidData");
        Intrinsics.checkNotNullParameter(sdkSignals, "sdkSignals");
        clearCurrentTask();
        MutableCollections.m17624D(this.awaitingUpdateSignals, sdkSignals);
        this.awaitingEidData = eidData;
        Runnable runnable = new Runnable() { // from class: com.mobilefuse.sdk.identity.EidRequestDebouncer$debounceEidUpdate$task$1
            {
                EidRequestDebouncer.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                EidRequestDebouncer eidRequestDebouncer = EidRequestDebouncer.this;
                ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
                try {
                    eidRequestDebouncer.callSdkStateChangedOnProviders$mobilefuse_sdk_core_release();
                } catch (Throwable th) {
                    int i = C23537xb85f474.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
                    if (i != 1) {
                        if (i != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        return;
                    }
                    StabilityHelper.logException("[Automatically caught]", th);
                }
            }
        };
        this.activeDebouceTask = runnable;
        SchedulersKt.getGlobalHandler().postDelayed(runnable, this.debounceDelayMillis);
    }

    @Nullable
    public final Runnable getActiveDebouceTask$mobilefuse_sdk_core_release() {
        return this.activeDebouceTask;
    }

    public final long getDebounceDelayMillis() {
        return this.debounceDelayMillis;
    }

    @Nullable
    public final Function2<EidDataModel, Set<? extends IdentifierUpdateSignal>, Unit> getOnEidRequest() {
        return this.onEidRequest;
    }

    public final void setActiveDebouceTask$mobilefuse_sdk_core_release(@Nullable Runnable runnable) {
        this.activeDebouceTask = runnable;
    }

    public final void setOnEidRequest(@Nullable Function2<? super EidDataModel, ? super Set<? extends IdentifierUpdateSignal>, Unit> function2) {
        this.onEidRequest = function2;
    }

    public EidRequestDebouncer(long j) {
        this.debounceDelayMillis = j;
        this.awaitingUpdateSignals = new LinkedHashSet();
    }

    public /* synthetic */ EidRequestDebouncer(long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 1000L : j);
    }

    @VisibleForTesting
    public static /* synthetic */ void getActiveDebouceTask$mobilefuse_sdk_core_release$annotations() {
    }
}
