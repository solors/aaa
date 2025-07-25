package com.smaato.sdk.video.vast.tracking;

import android.util.SparseArray;
import androidx.annotation.NonNull;
import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.collections.Sets;
import com.smaato.sdk.core.util.p574fi.Consumer;
import com.smaato.sdk.core.util.p574fi.Predicate;
import com.smaato.sdk.video.vast.model.Tracking;
import com.smaato.sdk.video.vast.model.VastEvent;
import com.smaato.sdk.video.vast.utils.VastVideoPlayerTimeConverterUtils;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.smaato.sdk.video.vast.tracking.c */
/* loaded from: classes7.dex */
public final class OffsetEventsManager {
    @NonNull

    /* renamed from: a */
    private final SparseArray<Set<Tracking>> f72807a;
    @NonNull

    /* renamed from: b */
    private final Set<Tracking> f72808b = Collections.synchronizedSet(new HashSet());

    private OffsetEventsManager(@NonNull SparseArray<Set<Tracking>> sparseArray) {
        this.f72807a = sparseArray;
    }

    /* renamed from: c */
    private static void m38757c(@NonNull SparseArray<Set<Tracking>> sparseArray, @NonNull Tracking tracking, int i) {
        Set<Tracking> set = sparseArray.get(i);
        if (set != null) {
            set.add(tracking);
            return;
        }
        HashSet hashSet = new HashSet();
        hashSet.add(tracking);
        sparseArray.append(i, hashSet);
    }

    @NonNull
    /* renamed from: d */
    public static OffsetEventsManager m38756d(@NonNull Map<VastEvent, List<Tracking>> map, final long j, @NonNull final Logger logger) {
        final SparseArray sparseArray = new SparseArray();
        for (VastEvent vastEvent : VastEvent.EVENTS_WITH_OFFSET) {
            Objects.onNotNull(map.get(vastEvent), new Consumer() { // from class: com.smaato.sdk.video.vast.tracking.b
                @Override // com.smaato.sdk.core.util.p574fi.Consumer
                public final void accept(Object obj) {
                    OffsetEventsManager.m38754f(j, logger, sparseArray, (List) obj);
                }
            });
        }
        return new OffsetEventsManager(sparseArray);
    }

    /* renamed from: f */
    public static /* synthetic */ void m38754f(long j, Logger logger, SparseArray sparseArray, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Tracking tracking = (Tracking) it.next();
            int convertOffsetStringToPercentage = VastVideoPlayerTimeConverterUtils.convertOffsetStringToPercentage(tracking.offset, j, logger);
            if (convertOffsetStringToPercentage >= 0) {
                m38757c(sparseArray, tracking, convertOffsetStringToPercentage);
            }
        }
    }

    /* renamed from: g */
    public /* synthetic */ boolean m38753g(Tracking tracking) {
        return !this.f72808b.contains(tracking);
    }

    @NonNull
    /* renamed from: e */
    public Set<Tracking> m38755e(Logger logger, long j, long j2) {
        HashSet hashSet = new HashSet();
        if (j2 == 0) {
            logger.warning(LogDomain.VAST, "Video duration is 0", new Object[0]);
            return hashSet;
        }
        for (int i = 0; i < this.f72807a.size(); i++) {
            if (this.f72807a.keyAt(i) <= (100 * j) / j2) {
                hashSet.addAll(Sets.retainToSet(this.f72807a.valueAt(i), new Predicate() { // from class: com.smaato.sdk.video.vast.tracking.a
                    {
                        OffsetEventsManager.this = this;
                    }

                    @Override // com.smaato.sdk.core.util.p574fi.Predicate
                    public final boolean test(Object obj) {
                        boolean m38753g;
                        m38753g = OffsetEventsManager.this.m38753g((Tracking) obj);
                        return m38753g;
                    }
                }));
            }
        }
        return hashSet;
    }

    /* renamed from: h */
    public void m38752h(@NonNull Tracking tracking) {
        this.f72808b.add(tracking);
    }
}
