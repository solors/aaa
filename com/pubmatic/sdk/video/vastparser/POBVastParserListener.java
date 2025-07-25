package com.pubmatic.sdk.video.vastparser;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.video.POBVastError;
import com.pubmatic.sdk.video.vastmodels.POBVast;

/* loaded from: classes7.dex */
public interface POBVastParserListener {
    void onFailure(@Nullable POBVast pOBVast, @NonNull POBVastError pOBVastError);

    void onSuccess(@NonNull POBVast pOBVast);
}
