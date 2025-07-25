package io.appmetrica.analytics.coreapi.internal.control;

import kotlin.Metadata;

@Metadata
/* loaded from: classes9.dex */
public interface DataSendingRestrictionController {
    boolean isRestrictedForBackgroundDataCollection();

    boolean isRestrictedForReporter();

    boolean isRestrictedForSdk();
}
