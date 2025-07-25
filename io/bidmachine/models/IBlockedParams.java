package io.bidmachine.models;

import androidx.annotation.NonNull;

/* loaded from: classes9.dex */
public interface IBlockedParams<SelfType> {
    SelfType addBlockedAdvertiserDomain(@NonNull String str);

    SelfType addBlockedAdvertiserIABCategory(@NonNull String str);

    SelfType addBlockedApplication(@NonNull String str);
}
