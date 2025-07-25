package com.pubmatic.sdk.video.player;

import androidx.annotation.NonNull;
import com.pubmatic.sdk.video.vastmodels.POBVastCreative;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/* loaded from: classes7.dex */
public class POBProgressiveEventHandler {
    @NonNull

    /* renamed from: a */
    private SortedMap<Integer, Map<POBVastCreative.POBEventTypes, List<String>>> f70903a = new TreeMap();
    @NonNull

    /* renamed from: b */
    private POBProgressiveEventListener f70904b;

    public POBProgressiveEventHandler(@NonNull POBProgressiveEventListener pOBProgressiveEventListener) {
        this.f70904b = pOBProgressiveEventListener;
    }

    public void addProgressUrls(@NonNull Integer num, POBVastCreative.POBEventTypes pOBEventTypes, @NonNull List<String> list) {
        Map<POBVastCreative.POBEventTypes, List<String>> map = this.f70903a.get(num);
        if (map == null) {
            HashMap hashMap = new HashMap();
            hashMap.put(pOBEventTypes, list);
            this.f70903a.put(num, hashMap);
            return;
        }
        List<String> list2 = map.get(pOBEventTypes);
        if (list2 == null) {
            map.put(pOBEventTypes, list);
        } else {
            list2.addAll(list);
        }
    }

    public void onProgress(int i) {
        int intValue;
        Map<POBVastCreative.POBEventTypes, List<String>> map;
        if (!this.f70903a.isEmpty() && i >= (intValue = this.f70903a.firstKey().intValue()) && (map = this.f70903a.get(Integer.valueOf(intValue))) != null) {
            this.f70904b.onProgressReached(map);
            this.f70903a.remove(Integer.valueOf(intValue));
        }
    }
}
