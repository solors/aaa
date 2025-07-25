package io.bidmachine.models;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;

/* loaded from: classes9.dex */
public interface IUserRestrictionsParams<SelfType> {
    @NonNull
    SelfType setConsentConfig(boolean z, @Nullable String str);

    @NonNull
    SelfType setCoppa(@Nullable Boolean bool);

    @NonNull
    SelfType setGPP(@Nullable String str, @Nullable List<Integer> list);

    @NonNull
    SelfType setSubjectToGDPR(@Nullable Boolean bool);

    @NonNull
    SelfType setUSPrivacyString(@Nullable String str);
}
