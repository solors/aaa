package com.smaato.sdk.video.vast.tracking;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.simplehttp.SimpleHttpClient;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.Threads;
import com.smaato.sdk.video.vast.tracking.macro.MacroInjector;
import com.smaato.sdk.video.vast.tracking.macro.PlayerState;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes7.dex */
public class VastErrorTracker {
    @NonNull
    private final Set<String> errorUrls;
    @NonNull
    private final Logger logger;
    @NonNull
    private final MacroInjector macroInjector;
    @NonNull
    private final SimpleHttpClient simpleHttpClient;

    public VastErrorTracker(@NonNull Logger logger, @NonNull SimpleHttpClient simpleHttpClient, @NonNull MacroInjector macroInjector, @NonNull Collection<String> collection) {
        this.logger = (Logger) Objects.requireNonNull(logger);
        this.macroInjector = (MacroInjector) Objects.requireNonNull(macroInjector);
        this.errorUrls = new HashSet((Collection) Objects.requireNonNull(collection));
        this.simpleHttpClient = simpleHttpClient;
    }

    public /* synthetic */ void lambda$track$0(String str) {
        this.simpleHttpClient.fireAndForget(Collections.singletonList(str));
    }

    public void track(@NonNull PlayerState playerState) {
        if (this.errorUrls.isEmpty()) {
            this.logger.info(LogDomain.VAST, "Wanted to track VastError [%d], but no beacon URLs available", playerState.errorCode);
            return;
        }
        this.logger.info(LogDomain.VAST, "Tracking VastError [%d]", playerState.errorCode);
        for (String str : this.errorUrls) {
            if (!TextUtils.isEmpty(str)) {
                final String injectMacros = this.macroInjector.injectMacros(str, playerState);
                Threads.runOnBackgroundThread(new Runnable() { // from class: com.smaato.sdk.video.vast.tracking.f
                    {
                        VastErrorTracker.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        VastErrorTracker.this.lambda$track$0(injectMacros);
                    }
                });
            }
        }
    }
}
