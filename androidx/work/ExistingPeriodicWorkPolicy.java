package androidx.work;

import kotlin.Metadata;

/* compiled from: ExistingPeriodicWorkPolicy.kt */
@Metadata
/* loaded from: classes2.dex */
public enum ExistingPeriodicWorkPolicy {
    REPLACE,
    KEEP,
    UPDATE,
    CANCEL_AND_REENQUEUE
}
