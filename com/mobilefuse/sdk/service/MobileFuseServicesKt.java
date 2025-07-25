package com.mobilefuse.sdk.service;

import java.util.Set;
import kotlin.Metadata;

/* compiled from: MobileFuseServices.kt */
@Metadata
/* loaded from: classes7.dex */
public final class MobileFuseServicesKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getAllInitialized(Set<? extends MobileFuseService> set) {
        for (MobileFuseService mobileFuseService : set) {
            if (mobileFuseService.getState() != ServiceInitState.INITIALIZED) {
                return false;
            }
        }
        return true;
    }
}
