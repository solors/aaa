package com.google.common.util.concurrent;

import java.util.concurrent.locks.LockSupport;

@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
final class OverflowAvoidingLockSupport {
    private OverflowAvoidingLockSupport() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m67527a(Object obj, long j) {
        LockSupport.parkNanos(obj, Math.min(j, 2147483647999999999L));
    }
}
