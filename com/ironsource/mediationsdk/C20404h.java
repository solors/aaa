package com.ironsource.mediationsdk;

import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ironsource.mediationsdk.h */
/* loaded from: classes6.dex */
public class C20404h {

    /* renamed from: c */
    public static final int f51575c = -1;

    /* renamed from: d */
    public static final int f51576d = 0;

    /* renamed from: a */
    private ConcurrentHashMap<String, ArrayList<EnumC20405a>> f51577a = new ConcurrentHashMap<>();

    /* renamed from: b */
    private int f51578b;

    /* renamed from: com.ironsource.mediationsdk.h$a */
    /* loaded from: classes6.dex */
    public enum EnumC20405a {
        ISAuctionPerformanceDidntAttemptToLoad,
        ISAuctionPerformanceFailedToLoad,
        ISAuctionPerformanceLoadedSuccessfully,
        ISAuctionPerformanceFailedToShow,
        ISAuctionPerformanceShowedSuccessfully,
        ISAuctionPerformanceNotPartOfWaterfall
    }

    public C20404h(List<NetworkSettings> list, int i) {
        this.f51578b = i;
        for (NetworkSettings networkSettings : list) {
            this.f51577a.put(networkSettings.getProviderName(), new ArrayList<>());
        }
    }

    /* renamed from: a */
    public String mo56860a(String str) {
        ArrayList<EnumC20405a> arrayList = this.f51577a.get(str);
        String str2 = "";
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator<EnumC20405a> it = arrayList.iterator();
            StringBuilder sb2 = new StringBuilder();
            while (true) {
                sb2.append(str2);
                sb2.append(it.next().ordinal());
                str2 = sb2.toString();
                if (!it.hasNext()) {
                    break;
                }
                str2 = str2 + ",";
                sb2 = new StringBuilder();
            }
        }
        return str2;
    }

    /* renamed from: a */
    public void m56859a(ConcurrentHashMap<String, EnumC20405a> concurrentHashMap) {
        if (this.f51578b == 0) {
            return;
        }
        for (String str : this.f51577a.keySet()) {
            EnumC20405a enumC20405a = EnumC20405a.ISAuctionPerformanceNotPartOfWaterfall;
            if (concurrentHashMap.containsKey(str)) {
                enumC20405a = concurrentHashMap.get(str);
            }
            ArrayList<EnumC20405a> arrayList = this.f51577a.get(str);
            if (this.f51578b != -1 && arrayList.size() == this.f51578b) {
                arrayList.remove(0);
            }
            arrayList.add(enumC20405a);
        }
    }
}
