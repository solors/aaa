package io.appmetrica.analytics;

import androidx.annotation.NonNull;
import java.util.Map;

/* loaded from: classes9.dex */
public interface DeferredDeeplinkParametersListener {

    /* loaded from: classes9.dex */
    public enum Error {
        NOT_A_FIRST_LAUNCH("Deferred deeplink parameters can be requested during first launch only."),
        PARSE_ERROR("Google Play referrer did not contain valid deferred deeplink parameters."),
        NO_REFERRER("No referrer was found"),
        UNKNOWN("Unknown error");
        

        /* renamed from: a */
        private final String f92206a;

        Error(String str) {
            this.f92206a = str;
        }

        public String getDescription() {
            return this.f92206a;
        }
    }

    void onError(@NonNull Error error, @NonNull String str);

    void onParametersLoaded(@NonNull Map<String, String> map);
}
