package com.bytedance.sdk.component.p233Kg;

import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.sdk.component.p233Kg.p234IL.C7226bg;
import com.bytedance.sdk.component.utils.C7741PX;
import com.ironsource.C21114v8;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.bytedance.sdk.component.Kg.eqN */
/* loaded from: classes3.dex */
public class C7252eqN {

    /* renamed from: bX */
    private static AtomicInteger f15654bX = new AtomicInteger(0);

    /* renamed from: bg */
    public static final String[] f15655bg = {"com.bytedance.sdk", "com.bykv.vk", "com.ss", "tt_pangle"};

    /* renamed from: IL */
    public static final String[] f15653IL = {"tt_pangle", "bd_tracker"};
    private static int eqN = 0;

    /* renamed from: zx */
    private static int f15656zx = 0;

    /* renamed from: com.bytedance.sdk.component.Kg.eqN$bg */
    /* loaded from: classes3.dex */
    public static class C7253bg {

        /* renamed from: IL */
        public String f15657IL;

        /* renamed from: bX */
        public String f15658bX;

        /* renamed from: bg */
        public int f15659bg;
        public String eqN;

        public C7253bg(String str, int i, String str2, String str3) {
            this.f15658bX = str;
            this.f15659bg = i;
            this.eqN = str2;
            this.f15657IL = str3;
        }

        /* renamed from: bg */
        public void m89467bg(int i) {
            this.f15659bg = i;
        }

        public String toString() {
            return "ThreadModel{times=" + this.f15659bg + ", name='" + this.f15657IL + "', lastStackStack='" + this.f15658bX + "'}";
        }

        /* renamed from: bg */
        public int m89468bg() {
            return this.f15659bg;
        }
    }

    /* renamed from: IL */
    private static void m89471IL() {
        int i;
        String str;
        InterfaceC7229bX m89459WR = C7255ldr.m89459WR();
        if (m89459WR == null) {
            return;
        }
        int i2 = 1;
        int addAndGet = f15654bX.addAndGet(1);
        int i3 = C7255ldr.f15666bX;
        if (i3 >= 0 && addAndGet % i3 == 0 && Looper.getMainLooper() != Looper.myLooper()) {
            Map<Thread, StackTraceElement[]> allStackTraces = Thread.getAllStackTraces();
            HashMap hashMap = new HashMap();
            if (allStackTraces == null) {
                return;
            }
            boolean m87876bg = C7741PX.m87876bg();
            int size = allStackTraces.size();
            if (size > f15656zx) {
                f15656zx = size;
            }
            Iterator<Map.Entry<Thread, StackTraceElement[]>> it = allStackTraces.entrySet().iterator();
            int i4 = 0;
            int i5 = 0;
            while (it.hasNext()) {
                Map.Entry<Thread, StackTraceElement[]> next = it.next();
                i5 += i2;
                Thread key = next.getKey();
                StackTraceElement[] value = next.getValue();
                StringBuilder sb2 = new StringBuilder("\n");
                if (m87876bg) {
                    sb2.append("Thread Name is : " + key.getName());
                    sb2.append("\n");
                }
                int length = value.length;
                String str2 = null;
                int i6 = 0;
                while (i6 < length) {
                    String stackTraceElement = value[i6].toString();
                    Iterator<Map.Entry<Thread, StackTraceElement[]>> it2 = it;
                    if (m87876bg) {
                        sb2.append(stackTraceElement + "\n");
                    }
                    if (TextUtils.isEmpty(str2)) {
                        if (!m89469bg(stackTraceElement, f15655bg)) {
                            str = stackTraceElement;
                            if (!m89469bg(key.getName(), f15653IL)) {
                            }
                        } else {
                            str = stackTraceElement;
                        }
                        i4++;
                        str2 = str;
                    }
                    i6++;
                    it = it2;
                }
                Iterator<Map.Entry<Thread, StackTraceElement[]>> it3 = it;
                if (m87876bg) {
                    if (!TextUtils.isEmpty(str2)) {
                        String str3 = str2 + C21114v8.C21123i.f54135c + key.getName();
                        C7253bg c7253bg = (C7253bg) hashMap.get(str3);
                        if (c7253bg != null) {
                            i = 1;
                            c7253bg.m89467bg(c7253bg.m89468bg() + 1);
                        } else {
                            i = 1;
                            c7253bg = new C7253bg(str3, 1, sb2.toString(), key.getName());
                        }
                        hashMap.put(str3, c7253bg);
                    } else {
                        i = 1;
                    }
                    if (!TextUtils.isEmpty(sb2.toString())) {
                        Log.e("PoolTaskStatistics", "Thread index = " + i5 + "   &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
                        Log.w("PoolTaskStatistics", sb2.toString());
                    }
                } else {
                    i = 1;
                }
                i2 = i;
                it = it3;
            }
            if (i4 > eqN) {
                eqN = i4;
            }
            if (m87876bg) {
                Log.e("PoolTaskStatistics", "SDK current threads=" + i4 + ", SDK Max threads=" + eqN + ", Application threads = " + size + ", Application max threads = " + f15656zx);
                for (Map.Entry entry : hashMap.entrySet()) {
                    Log.i("PoolTaskStatistics", ((C7253bg) entry.getValue()).toString());
                }
            }
            m89459WR.mo82303bg(new C7226bg(i4, eqN, size, f15656zx));
        }
    }

    /* renamed from: bg */
    public static void m89470bg() {
        try {
            m89471IL();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: bg */
    private static boolean m89469bg(String str, String[] strArr) {
        if (!TextUtils.isEmpty(str) && strArr != null) {
            for (String str2 : strArr) {
                if (str.contains(str2)) {
                    return true;
                }
            }
        }
        return false;
    }
}
