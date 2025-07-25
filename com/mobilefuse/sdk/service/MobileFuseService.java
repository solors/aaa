package com.mobilefuse.sdk.service;

import androidx.annotation.VisibleForTesting;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: MobileFuseService.kt */
@Metadata
/* loaded from: classes7.dex */
public abstract class MobileFuseService {
    private int currentInitAttempt;
    @NotNull
    private ServiceInitState state = ServiceInitState.IDLE;
    private final int maxInitAttempts = 1;
    private final List<Function2<MobileFuseService, Boolean, Unit>> awaitingCallbacks = new ArrayList();

    @Metadata
    /* loaded from: classes7.dex */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ServiceInitState.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[ServiceInitState.IDLE.ordinal()] = 1;
            iArr[ServiceInitState.INITIALIZING.ordinal()] = 2;
            iArr[ServiceInitState.INITIALIZED.ordinal()] = 3;
            iArr[ServiceInitState.ERROR.ordinal()] = 4;
        }
    }

    private final void doInitialization(Function2<? super MobileFuseService, ? super Boolean, Unit> function2) {
        this.currentInitAttempt++;
        setState(ServiceInitState.INITIALIZING);
        this.awaitingCallbacks.add(function2);
        initServiceImpl$mobilefuse_sdk_core_release(new MobileFuseService$doInitialization$1(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setState(ServiceInitState serviceInitState) {
        MobileFuseServices_Logs.logServiceDebug(this, "Change state from " + this.state + " to " + serviceInitState);
        this.state = serviceInitState;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int getMaxInitAttempts() {
        return this.maxInitAttempts;
    }

    @NotNull
    public final ServiceInitState getState() {
        return this.state;
    }

    public final void initService(@NotNull Function2<? super MobileFuseService, ? super Boolean, Unit> onComplete) {
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        int i = WhenMappings.$EnumSwitchMapping$0[this.state.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        if (this.currentInitAttempt < getMaxInitAttempts()) {
                            doInitialization(onComplete);
                            return;
                        } else {
                            onComplete.mo105910invoke(this, Boolean.TRUE);
                            return;
                        }
                    }
                    return;
                }
                onComplete.mo105910invoke(this, Boolean.TRUE);
                return;
            }
            this.awaitingCallbacks.add(onComplete);
            return;
        }
        doInitialization(onComplete);
    }

    @VisibleForTesting(otherwise = 4)
    public abstract void initServiceImpl$mobilefuse_sdk_core_release(@NotNull Function2<? super MobileFuseService, ? super Boolean, Unit> function2);

    public final void reset() {
        setState(ServiceInitState.IDLE);
        this.currentInitAttempt = 0;
        this.awaitingCallbacks.clear();
        resetImpl();
    }

    protected abstract void resetImpl();
}
