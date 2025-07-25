package com.smaato.sdk.video.vast.tracking;

import androidx.annotation.NonNull;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.simplehttp.SimpleHttpClient;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.Threads;
import com.smaato.sdk.video.vast.model.VastBeaconEvent;
import com.smaato.sdk.video.vast.tracking.macro.MacroInjector;
import com.smaato.sdk.video.vast.tracking.macro.PlayerState;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;

/* loaded from: classes7.dex */
public class VastBeaconTracker {
    @NonNull
    private final MacroInjector macroInjector;
    @NonNull
    private final SimpleHttpClient simpleHttpClient;
    @NonNull
    private final VastTrackingBeaconsManager vastTrackingBeaconsManager;

    public VastBeaconTracker(@NonNull Logger logger, @NonNull SimpleHttpClient simpleHttpClient, @NonNull MacroInjector macroInjector, @NonNull VastTrackingBeaconsManager vastTrackingBeaconsManager) {
        this.macroInjector = (MacroInjector) Objects.requireNonNull(macroInjector);
        this.vastTrackingBeaconsManager = (VastTrackingBeaconsManager) Objects.requireNonNull(vastTrackingBeaconsManager);
        this.simpleHttpClient = (SimpleHttpClient) Objects.requireNonNull(simpleHttpClient);
    }

    @NonNull
    private Set<String> getUrlsToTrack(@NonNull VastBeaconEvent vastBeaconEvent, @NonNull PlayerState playerState) {
        Set<String> m38751a = this.vastTrackingBeaconsManager.m38751a(vastBeaconEvent);
        if (!m38751a.isEmpty()) {
            return Collections.unmodifiableSet(this.macroInjector.injectMacros(m38751a, playerState));
        }
        return Collections.emptySet();
    }

    public /* synthetic */ void lambda$trackBeaconUrls$0(Set set) {
        this.simpleHttpClient.fireAndForget(new ArrayList(set));
    }

    private void trackBeaconUrls(@NonNull VastBeaconEvent vastBeaconEvent, @NonNull final Set<String> set) {
        this.vastTrackingBeaconsManager.m38749c(vastBeaconEvent);
        Threads.runOnBackgroundThread(new Runnable() { // from class: com.smaato.sdk.video.vast.tracking.d
            {
                VastBeaconTracker.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                VastBeaconTracker.this.lambda$trackBeaconUrls$0(set);
            }
        });
    }

    public void trigger(@NonNull VastBeaconEvent vastBeaconEvent, @NonNull PlayerState playerState) {
        if (this.vastTrackingBeaconsManager.m38750b(vastBeaconEvent)) {
            return;
        }
        Set<String> urlsToTrack = getUrlsToTrack(vastBeaconEvent, playerState);
        if (urlsToTrack.isEmpty()) {
            return;
        }
        trackBeaconUrls(vastBeaconEvent, urlsToTrack);
    }
}
