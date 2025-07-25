package com.smaato.sdk.core.csm;

import androidx.annotation.NonNull;
import com.google.auto.value.AutoValue;
import com.smaato.sdk.core.csm.AutoValue_CsmAdResponse;
import java.util.List;

@AutoValue
/* loaded from: classes7.dex */
public abstract class CsmAdResponse {

    @AutoValue.Builder
    /* loaded from: classes7.dex */
    public static abstract class Builder {
        public abstract CsmAdResponse build();

        public abstract Builder setNetworks(@NonNull List<Network> list);

        public abstract Builder setPassback(@NonNull String str);

        public abstract Builder setSessionId(@NonNull String str);
    }

    public static Builder builder() {
        return new AutoValue_CsmAdResponse.C27065b();
    }

    @NonNull
    public abstract List<Network> getNetworks();

    @NonNull
    public abstract String getPassback();

    @NonNull
    public abstract String getSessionId();
}
