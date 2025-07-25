package com.p551my.target;

import android.content.Context;
import androidx.media3.exoplayer.hls.HlsMediaSource;
import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;

/* renamed from: com.my.target.h5 */
/* loaded from: classes7.dex */
public abstract class AbstractC25795h5 {

    /* renamed from: com.my.target.h5$a */
    /* loaded from: classes7.dex */
    public static final class C25796a {

        /* renamed from: a */
        public static final boolean f66926a;

        /* renamed from: b */
        public static final boolean f66927b;

        static {
            boolean z;
            boolean z2 = true;
            try {
                Class.forName(C25996p1.class.getName());
                z = true;
            } catch (Throwable unused) {
                AbstractC25846ja.m43680a("ExoPlayer doesn't exist, add ExoPlayer dependency to play video");
                z = false;
            }
            try {
                int i = HlsMediaSource.Factory.f1140a;
            } catch (Throwable unused2) {
                z2 = false;
            }
            f66926a = z;
            f66927b = z2;
        }
    }

    /* renamed from: a */
    public static float[] m43798a(C25837j3 c25837j3, float f) {
        float m42944y;
        TreeSet<Float> treeSet = new TreeSet();
        for (AbstractC25742f0 abstractC25742f0 : c25837j3.m43723d()) {
            float point = abstractC25742f0.getPoint();
            float pointP = abstractC25742f0.getPointP();
            if (pointP >= 0.0f && pointP <= 100.0f) {
                point = f * (pointP / 100.0f);
            } else if (point < 0.0f || point > f) {
                AbstractC25846ja.m43680a("MediaUtils: Midroll banner " + abstractC25742f0.getId() + " excluded, had point=" + point + ", pointP=" + pointP + ", content duration=" + f);
            }
            float round = Math.round(point * 10.0f) / 10.0f;
            abstractC25742f0.setPoint(round);
            treeSet.add(Float.valueOf(round));
        }
        for (C26073s c26073s : c25837j3.m43720g()) {
            float m42944y2 = c26073s.m42944y();
            float m42943z = c26073s.m42943z();
            if (m42943z >= 0.0f && m42943z <= 100.0f) {
                m42944y = (m42943z / 100.0f) * f;
            } else if (m42944y2 < 0.0f || m42944y2 > f) {
                AbstractC25846ja.m43680a("MediaUtils: Midroll service " + c26073s.m42950s() + " excluded, had point=" + m42944y2 + ", pointP=" + m42943z + ", content duration=" + f);
            } else {
                m42944y = c26073s.m42944y();
            }
            float round2 = Math.round(m42944y * 10.0f) / 10.0f;
            c26073s.m42993b(round2);
            treeSet.add(Float.valueOf(round2));
        }
        float[] fArr = new float[treeSet.size()];
        int i = 0;
        for (Float f2 : treeSet) {
            fArr[i] = f2.floatValue();
            i++;
        }
        return fArr;
    }

    /* renamed from: b */
    public static float[] m43793b(C25837j3 c25837j3, float[] fArr, float f) {
        String str;
        String str2;
        Arrays.sort(fArr);
        TreeSet<Float> treeSet = new TreeSet();
        int i = 0;
        int i2 = 0;
        for (AbstractC25742f0 abstractC25742f0 : c25837j3.m43723d()) {
            if (i2 >= fArr.length) {
                str2 = "MediaUtils: Midroll mediabanner missing - not enough user midPoints";
            } else {
                float f2 = fArr[i2];
                if (f2 > f) {
                    str2 = "MediaUtils: Cannot set midPoint " + f2 + " - out of duration";
                } else {
                    abstractC25742f0.setPoint(f2);
                    treeSet.add(Float.valueOf(f2));
                    if (!"statistics".equals(abstractC25742f0.getType())) {
                        i2++;
                    }
                }
            }
            AbstractC25846ja.m43680a(str2);
            abstractC25742f0.setPoint(-1.0f);
        }
        for (C26073s c26073s : c25837j3.m43720g()) {
            if (i2 >= fArr.length) {
                str = "MediaUtils: Midroll service missing - not enough user midPoints";
            } else {
                float f3 = fArr[i2];
                if (f3 > f) {
                    str = "MediaUtils: Cannot set midPoint " + f3 + " - out of duration";
                } else {
                    c26073s.m42993b(f3);
                    treeSet.add(Float.valueOf(f3));
                    i2++;
                }
            }
            AbstractC25846ja.m43680a(str);
            c26073s.m42993b(-1.0f);
        }
        float[] fArr2 = new float[treeSet.size()];
        for (Float f4 : treeSet) {
            fArr2[i] = f4.floatValue();
            i++;
        }
        return fArr2;
    }

    /* renamed from: a */
    public static float[] m43797a(C25837j3 c25837j3, float[] fArr, float f) {
        return (fArr == null || fArr.length == 0) ? m43798a(c25837j3, f) : m43793b(c25837j3, fArr, f);
    }

    /* renamed from: b */
    public static float[] m43794b(C25771g5 c25771g5, float[] fArr, float f) {
        String str;
        String str2;
        Arrays.sort(fArr);
        TreeSet<Float> treeSet = new TreeSet();
        int i = 0;
        int i2 = 0;
        for (C25704d5 c25704d5 : c25771g5.m43867d()) {
            if (i2 >= fArr.length) {
                str2 = "MediaUtils: Midroll mediabanner missing - not enough user midPoints";
            } else {
                float f2 = fArr[i2];
                if (f2 > f) {
                    str2 = "MediaUtils: Cannot set midPoint " + f2 + " - out of duration";
                } else {
                    c25704d5.setPoint(f2);
                    treeSet.add(Float.valueOf(f2));
                    if (!"statistics".equals(c25704d5.getType())) {
                        i2++;
                    }
                }
            }
            AbstractC25846ja.m43680a(str2);
            c25704d5.setPoint(-1.0f);
        }
        Iterator it = c25771g5.m43864g().iterator();
        while (it.hasNext()) {
            C26073s c26073s = (C26073s) it.next();
            if (i2 >= fArr.length) {
                str = "MediaUtils: Midroll service missing - not enough user midPoints";
            } else {
                float f3 = fArr[i2];
                if (f3 > f) {
                    str = "MediaUtils: Cannot set midPoint " + f3 + " - out of duration";
                } else {
                    c26073s.m42993b(f3);
                    treeSet.add(Float.valueOf(f3));
                    i2++;
                }
            }
            AbstractC25846ja.m43680a(str);
            c26073s.m42993b(-1.0f);
        }
        float[] fArr2 = new float[treeSet.size()];
        for (Float f4 : treeSet) {
            fArr2[i] = f4.floatValue();
            i++;
        }
        return fArr2;
    }

    /* renamed from: a */
    public static float[] m43800a(C25771g5 c25771g5, float f) {
        float m42944y;
        TreeSet<Float> treeSet = new TreeSet();
        for (C25704d5 c25704d5 : c25771g5.m43867d()) {
            float point = c25704d5.getPoint();
            float pointP = c25704d5.getPointP();
            if (pointP >= 0.0f && pointP <= 100.0f) {
                point = f * (pointP / 100.0f);
            } else if (point < 0.0f || point > f) {
                if (point == -1.0f && pointP == -1.0f) {
                    point = f * 0.5f;
                } else {
                    AbstractC25846ja.m43680a("MediaUtils: Midroll banner " + c25704d5.getId() + " excluded, had point=" + point + ", pointP=" + pointP + ", content duration=" + f);
                }
            }
            float round = Math.round(point * 10.0f) / 10.0f;
            c25704d5.setPoint(round);
            treeSet.add(Float.valueOf(round));
        }
        Iterator it = c25771g5.m43864g().iterator();
        while (it.hasNext()) {
            C26073s c26073s = (C26073s) it.next();
            float m42944y2 = c26073s.m42944y();
            float m42943z = c26073s.m42943z();
            if (m42943z >= 0.0f && m42943z <= 100.0f) {
                m42944y = (m42943z / 100.0f) * f;
            } else if (m42944y2 < 0.0f || m42944y2 > f) {
                AbstractC25846ja.m43680a("MediaUtils: Midroll service " + c26073s.m42950s() + " excluded, had point=" + m42944y2 + ", pointP=" + m42943z + ", content duration=" + f);
            } else {
                m42944y = c26073s.m42944y();
            }
            float round2 = Math.round(m42944y * 10.0f) / 10.0f;
            c26073s.m42993b(round2);
            treeSet.add(Float.valueOf(round2));
        }
        float[] fArr = new float[treeSet.size()];
        int i = 0;
        for (Float f2 : treeSet) {
            fArr[i] = f2.floatValue();
            i++;
        }
        return fArr;
    }

    /* renamed from: b */
    public static boolean m43795b() {
        return C25796a.f66927b;
    }

    /* renamed from: a */
    public static float[] m43799a(C25771g5 c25771g5, float[] fArr, float f) {
        return (fArr == null || fArr.length == 0) ? m43800a(c25771g5, f) : m43794b(c25771g5, fArr, f);
    }

    /* renamed from: a */
    public static boolean m43802a() {
        return C25796a.f66926a;
    }

    /* renamed from: a */
    public static float[] m43801a(float f, float[] fArr) {
        float[] fArr2 = new float[fArr.length];
        for (int i = 0; i < fArr.length; i++) {
            fArr2[i] = (f / 100.0f) * fArr[i];
        }
        return fArr2;
    }

    /* renamed from: a */
    public static InterfaceC26180w m43796a(boolean z, Context context) {
        if (z) {
            try {
                if (m43802a()) {
                    return C25996p1.m43228a(context);
                }
            } catch (Throwable th) {
                AbstractC25846ja.m43678b("MediaUtils error: exception occurred while creating ExoVideoPlayer: " + th.getMessage());
            }
        }
        return TextureView$SurfaceTextureListenerC25811i1.m43772k();
    }
}
