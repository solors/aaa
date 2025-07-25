package io.bidmachine.models;

import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes9.dex */
public interface ISessionAdParams<SelfType> {
    @NonNull
    @Deprecated
    SelfType setClickRate(@Nullable @FloatRange(from = 0.0d, m105511to = 100.0d) Float f);

    @NonNull
    @Deprecated
    SelfType setCompletionRate(@Nullable @FloatRange(from = 0.0d, m105511to = 100.0d) Float f);

    @NonNull
    @Deprecated
    SelfType setImpressionCount(@IntRange(from = 0) @Nullable Integer num);

    @NonNull
    @Deprecated
    SelfType setIsUserClickedOnLastAd(@Nullable Boolean bool);

    @NonNull
    SelfType setSessionDuration(@IntRange(from = 0) @Nullable Integer num);
}
