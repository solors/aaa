package com.apm.insight.p130l;

import android.annotation.TargetApi;
import android.os.Debug;
import java.util.Map;

/* renamed from: com.apm.insight.l.c */
/* loaded from: classes2.dex */
public final class DebugMemInfoCompat {

    /* renamed from: a */
    private static C3818a f3913a = new C3819b((byte) 0);

    /* compiled from: DebugMemInfoCompat.java */
    /* renamed from: com.apm.insight.l.c$a */
    /* loaded from: classes2.dex */
    static class C3818a {
        private C3818a() {
        }

        /* synthetic */ C3818a(byte b) {
            this();
        }

        /* renamed from: a */
        public int mo101742a(Debug.MemoryInfo memoryInfo) {
            return -1;
        }

        /* renamed from: b */
        public int mo101741b(Debug.MemoryInfo memoryInfo) {
            return -1;
        }

        /* renamed from: c */
        public int mo101740c(Debug.MemoryInfo memoryInfo) {
            return -1;
        }
    }

    /* compiled from: DebugMemInfoCompat.java */
    @TargetApi(19)
    /* renamed from: com.apm.insight.l.c$b */
    /* loaded from: classes2.dex */
    static class C3819b extends C3818a {
        private C3819b() {
            super((byte) 0);
        }

        @Override // com.apm.insight.p130l.DebugMemInfoCompat.C3818a
        /* renamed from: a */
        public final int mo101742a(Debug.MemoryInfo memoryInfo) {
            return memoryInfo.getTotalPrivateClean();
        }

        @Override // com.apm.insight.p130l.DebugMemInfoCompat.C3818a
        /* renamed from: b */
        public final int mo101741b(Debug.MemoryInfo memoryInfo) {
            return memoryInfo.getTotalSharedClean();
        }

        @Override // com.apm.insight.p130l.DebugMemInfoCompat.C3818a
        /* renamed from: c */
        public final int mo101740c(Debug.MemoryInfo memoryInfo) {
            return memoryInfo.getTotalSwappablePss();
        }

        /* synthetic */ C3819b(byte b) {
            this();
        }
    }

    /* renamed from: a */
    public static int m101748a(Debug.MemoryInfo memoryInfo) {
        return f3913a.mo101742a(memoryInfo);
    }

    /* renamed from: b */
    public static int m101747b(Debug.MemoryInfo memoryInfo) {
        return f3913a.mo101741b(memoryInfo);
    }

    /* renamed from: c */
    public static int m101746c(Debug.MemoryInfo memoryInfo) {
        return f3913a.mo101740c(memoryInfo);
    }

    /* compiled from: DebugMemInfoCompat.java */
    /* renamed from: com.apm.insight.l.c$1 */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class C38171 {
        /* renamed from: a */
        public static Long m101743a(Map<? super String, Long> map, String str, Long l) {
            if (str != null && map != null) {
                Long l2 = map.get(str);
                if (l2 != null) {
                    l = Long.valueOf(l2.longValue() + l.longValue());
                }
                map.put(str, l);
                return l;
            }
            return -1L;
        }

        /* renamed from: a */
        public static Float m101744a(Map<? super String, Float> map) {
            float f = 0.0f;
            for (Float f2 : map.values()) {
                if (f2 != null) {
                    f += f2.floatValue();
                }
            }
            return Float.valueOf(f);
        }

        /* renamed from: a */
        public static int m101745a(Object obj, int i) {
            if (obj == null) {
                return i;
            }
            if (obj instanceof Integer) {
                return ((Integer) obj).intValue();
            }
            if (obj instanceof String) {
                try {
                    return Integer.parseInt(String.valueOf(obj));
                } catch (Throwable unused) {
                }
            }
            return i;
        }
    }
}
