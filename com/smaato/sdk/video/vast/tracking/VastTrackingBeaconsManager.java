package com.smaato.sdk.video.vast.tracking;

import androidx.annotation.NonNull;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.video.vast.model.VastBeaconEvent;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: com.smaato.sdk.video.vast.tracking.m */
/* loaded from: classes7.dex */
class VastTrackingBeaconsManager {
    @NonNull

    /* renamed from: a */
    private final Map<VastBeaconEvent, Collection<String>> f72822a;
    @NonNull

    /* renamed from: b */
    private final Set<VastBeaconEvent> f72823b = Collections.synchronizedSet(new HashSet());

    /* JADX INFO: Access modifiers changed from: package-private */
    public VastTrackingBeaconsManager(@NonNull Map<VastBeaconEvent, Collection<String>> map) {
        this.f72822a = new HashMap((Map) Objects.requireNonNull(map));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    /* renamed from: a */
    public Set<String> m38751a(@NonNull VastBeaconEvent vastBeaconEvent) {
        Collection<String> collection;
        if (this.f72823b.contains(vastBeaconEvent)) {
            return Collections.emptySet();
        }
        if (this.f72822a.containsKey(vastBeaconEvent) && (collection = this.f72822a.get(vastBeaconEvent)) != null) {
            return Collections.unmodifiableSet(new HashSet(collection));
        }
        return Collections.emptySet();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean m38750b(@NonNull VastBeaconEvent vastBeaconEvent) {
        return this.f72823b.contains(vastBeaconEvent);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m38749c(@NonNull VastBeaconEvent vastBeaconEvent) {
        this.f72823b.add(vastBeaconEvent);
    }
}
