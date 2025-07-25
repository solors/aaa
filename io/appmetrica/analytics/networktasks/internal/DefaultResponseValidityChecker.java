package io.appmetrica.analytics.networktasks.internal;

import kotlin.Metadata;

@Metadata
/* loaded from: classes9.dex */
public final class DefaultResponseValidityChecker implements ResponseValidityChecker {
    @Override // io.appmetrica.analytics.networktasks.internal.ResponseValidityChecker
    public boolean isResponseValid(int i) {
        if (i != 400 && i != 500) {
            return true;
        }
        return false;
    }
}
