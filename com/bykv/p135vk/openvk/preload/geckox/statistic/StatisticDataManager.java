package com.bykv.p135vk.openvk.preload.geckox.statistic;

import com.bykv.p135vk.openvk.preload.geckox.statistic.model.ChannelUpdateData;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.bykv.vk.openvk.preload.geckox.statistic.a */
/* loaded from: classes3.dex */
final class StatisticDataManager {

    /* renamed from: a */
    private static final Map<Long, StatisticDataManager> f14080a = new HashMap();

    /* renamed from: b */
    private final Map<String, ChannelUpdateData> f14081b = new HashMap();

    StatisticDataManager() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static StatisticDataManager m91254a(long j) {
        StatisticDataManager statisticDataManager;
        Map<Long, StatisticDataManager> map = f14080a;
        synchronized (map) {
            statisticDataManager = map.get(Long.valueOf(j));
            if (statisticDataManager == null) {
                statisticDataManager = new StatisticDataManager();
                map.put(Long.valueOf(j), statisticDataManager);
            }
        }
        return statisticDataManager;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final ChannelUpdateData m91253a(String str) {
        ChannelUpdateData channelUpdateData;
        synchronized (this.f14081b) {
            channelUpdateData = this.f14081b.get(str);
            if (channelUpdateData == null) {
                channelUpdateData = new ChannelUpdateData();
                this.f14081b.put(str, channelUpdateData);
            }
        }
        return channelUpdateData;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final List<ChannelUpdateData> m91255a() {
        ArrayList arrayList;
        synchronized (this.f14081b) {
            arrayList = new ArrayList(this.f14081b.values());
        }
        return arrayList;
    }
}
