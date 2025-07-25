package com.mobilefuse.sdk.telemetry;

import com.mobilefuse.sdk.telemetry.Telemetry;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections._Collections;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: TelemetryAgent.kt */
@Metadata
/* loaded from: classes7.dex */
public final class TelemetryAgent implements TelemetryActionReceiver {
    private final List<TelemetryDataModel> mutableActions;
    private final int ownerHashCode;
    @NotNull
    private final String ownerSenderName;

    public TelemetryAgent(@NotNull Object owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.ownerHashCode = owner.hashCode();
        this.ownerSenderName = TelemetryHelpersKt.getTelemetryActionSender(owner);
        this.mutableActions = new ArrayList();
        registerToTelemetry();
    }

    public final void clearActions$mobilefuse_sdk_telemetry_release() {
        this.mutableActions.clear();
    }

    @Override // com.mobilefuse.sdk.telemetry.TelemetryActionReceiver
    @NotNull
    public List<TelemetryDataModel> getActions() {
        List<TelemetryDataModel> m17553Z0;
        m17553Z0 = _Collections.m17553Z0(this.mutableActions);
        return m17553Z0;
    }

    public final int getOwnerHashCode() {
        return this.ownerHashCode;
    }

    @NotNull
    public final String getOwnerSenderName() {
        return this.ownerSenderName;
    }

    public final synchronized void onAction(@NotNull TelemetryDataModel action) {
        Intrinsics.checkNotNullParameter(action, "action");
        Telemetry.Companion companion = Telemetry.Companion;
        if (companion.getStoreActionsEnabled()) {
            this.mutableActions.add(action);
        }
        companion.onAction(action);
    }

    public final void registerToTelemetry() {
        Telemetry.Companion.registerAgent$mobilefuse_sdk_telemetry_release(this);
    }
}
