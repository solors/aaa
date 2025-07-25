package com.smaato.sdk.video.vast.browser;

import androidx.annotation.NonNull;
import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.network.UrlCreator;
import com.smaato.sdk.core.util.Objects;

/* loaded from: classes7.dex */
public class VastWebComponentSecurityPolicy {
    @NonNull
    private final Boolean isHttpsOnly;
    @NonNull
    private final Logger logger;
    @NonNull
    private final UrlCreator urlCreator;

    public VastWebComponentSecurityPolicy(@NonNull Logger logger, @NonNull String str, @NonNull UrlCreator urlCreator, @NonNull Boolean bool) {
        this.logger = (Logger) Objects.requireNonNull(logger);
        this.urlCreator = (UrlCreator) Objects.requireNonNull(urlCreator);
        this.isHttpsOnly = bool;
    }

    public boolean validateUrl(@NonNull String str) {
        boolean z;
        if (!this.urlCreator.isSupportedForNetworking(str)) {
            return true;
        }
        String extractScheme = this.urlCreator.extractScheme(str);
        if (!this.urlCreator.isSecureScheme(extractScheme) && (!this.urlCreator.isInsecureScheme(extractScheme) || this.isHttpsOnly.booleanValue())) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            this.logger.error(LogDomain.VAST, "Invalid url or violation of httpsOnly rule: Url: %s , isHttpsOnly: %s", str, this.isHttpsOnly);
        }
        return z;
    }
}
