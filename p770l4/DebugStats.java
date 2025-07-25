package p770l4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;
import p842q4.EventEntity;
import p993u4.C44433l;

/* renamed from: l4.a */
/* loaded from: classes6.dex */
public class DebugStats {

    /* renamed from: f */
    private static int f99948f;

    /* renamed from: g */
    private static int f99949g;

    /* renamed from: h */
    private static int f99950h;

    /* renamed from: i */
    private static long f99951i;

    /* renamed from: j */
    private static int f99952j;

    /* renamed from: k */
    private static int f99953k;

    /* renamed from: l */
    private static long f99954l;

    /* renamed from: a */
    private final Object f99955a = new Object();

    /* renamed from: b */
    private final Map<Integer, Integer> f99956b = new ConcurrentHashMap();

    /* renamed from: c */
    private final Map<String, Integer> f99957c = new ConcurrentHashMap();

    /* renamed from: d */
    private final HashSet<Long> f99958d = new HashSet<>();

    /* renamed from: e */
    private final HashSet<Long> f99959e = new HashSet<>();

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DebugStats.java */
    /* renamed from: l4.a$a */
    /* loaded from: classes6.dex */
    public static class C37918a {

        /* renamed from: a */
        private static final DebugStats f99960a = new DebugStats();
    }

    /* renamed from: b */
    public static DebugStats m15711b() {
        return C37918a.f99960a;
    }

    /* renamed from: d */
    public static void m15709d(long j) {
        f99951i = j;
    }

    /* renamed from: a */
    public void m15712a() {
        synchronized (this.f99955a) {
            for (int i = 0; i < 10; i++) {
                C44433l.m2997a("statistics-", "正在统计。。。");
            }
            C44433l.m2997a("statistics-", "|||||||||||||||| displayStatsInfo |||||||||||||||||||");
            C44433l.m2997a("statistics-", "upload duration = " + ((System.currentTimeMillis() - f99951i) / 1000) + "s");
            if (f99950h != 0) {
                C44433l.m2997a("statistics-", " current session repeat rate :" + (((f99950h * 1.0f) / f99949g) * 100.0f) + "%    mUploadRepeatCnt :" + f99950h + "  mUploadEventCnt :" + f99949g);
            }
            C44433l.m2997a("statistics-", " current session upload rate :" + (((f99953k * 1.0f) / f99952j) * 100.0f) + " %    mGenerateEventCount :" + f99952j + "  mUploadSuccesEventCount :" + f99953k);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(" 当前session每次上报的事件数: ");
            sb2.append(Arrays.toString(this.f99956b.values().toArray()));
            C44433l.m2997a("statistics-", sb2.toString());
            for (String str : this.f99957c.keySet()) {
                try {
                    int intValue = this.f99957c.get(str).intValue();
                    if (intValue > 1) {
                        C44433l.m2997a("statistics-", " upload repeat eventId :" + str + "  repeat upload count : " + intValue);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            if (!this.f99958d.isEmpty()) {
                C44433l.m2997a("statistics-", "upload repeat cid :" + this.f99958d.toString());
            }
            if (!this.f99959e.isEmpty()) {
                C44433l.m2997a("statistics-", "upload failed cid :" + this.f99959e.toString());
            }
            C44433l.m2997a("statistics-", "|||||||||||||||||||||||||||||||||||||||||||||||||||||");
            for (int i2 = 0; i2 < 10; i2++) {
                C44433l.m2997a("statistics-", "结束。。。");
            }
            f99951i = System.currentTimeMillis();
        }
    }

    /* renamed from: c */
    public void m15710c() {
        synchronized (this.f99955a) {
            f99952j++;
        }
    }

    /* renamed from: e */
    public void m15708e(EventEntity eventEntity, long j) {
        try {
            synchronized (this.f99955a) {
                if (eventEntity == null) {
                    return;
                }
                f99949g++;
                if (this.f99957c.containsKey(eventEntity.m12993c())) {
                    this.f99957c.put(eventEntity.m12993c(), Integer.valueOf(this.f99957c.get(eventEntity.m12993c()).intValue() + 1));
                    f99950h++;
                    this.f99958d.add(Long.valueOf(j));
                } else {
                    this.f99957c.put(eventEntity.m12993c(), 1);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: f */
    public void m15707f(long j) {
        this.f99959e.add(Long.valueOf(j));
    }

    /* renamed from: g */
    public void m15706g(List<EventEntity> list) {
        int i;
        if (list != null) {
            i = list.size();
        } else {
            i = 0;
        }
        synchronized (this.f99955a) {
            int i2 = f99948f + 1;
            f99948f = i2;
            this.f99956b.put(Integer.valueOf(i2), Integer.valueOf(i));
        }
        if (i != 0) {
            ArrayList arrayList = new ArrayList();
            for (EventEntity eventEntity : list) {
                try {
                    arrayList.add(Long.valueOf(Long.parseLong(new JSONObject(eventEntity.m12994b()).getString("analytics_event_num"))));
                } catch (Exception e) {
                    C44433l.m2992f(e);
                }
            }
            if (arrayList.isEmpty()) {
                C44433l.m2997a("statistics-", "当前上报事件为空");
                return;
            }
            Collections.sort(arrayList);
            if (((Long) arrayList.get(0)).longValue() > f99954l + 1) {
                C44433l.m2997a("statistics-", "事件并没有连续，当前analyticsNum = " + f99954l + "， 上报最小Num= " + arrayList.get(0));
            }
            boolean z = true;
            for (int i3 = 1; i3 < arrayList.size(); i3++) {
                if (((Long) arrayList.get(i3)).longValue() - ((Long) arrayList.get(i3 - 1)).longValue() > 1) {
                    z = false;
                }
            }
            if (!z) {
                C44433l.m2997a("statistics-", "事件并没有连续，analyticsNumList = " + Arrays.toString(arrayList.toArray()));
            }
            f99954l = ((Long) arrayList.get(arrayList.size() - 1)).longValue();
        }
    }

    /* renamed from: h */
    public void m15705h(int i) {
        synchronized (this.f99955a) {
            f99953k += i;
        }
    }
}
