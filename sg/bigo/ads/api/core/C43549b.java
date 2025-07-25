package sg.bigo.ads.api.core;

import android.util.SparseArray;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: sg.bigo.ads.api.core.b */
/* loaded from: classes10.dex */
public final class C43549b {

    /* renamed from: a */
    private static final SparseArray<List<Integer>> f114073a;

    static {
        SparseArray<List<Integer>> sparseArray = new SparseArray<>();
        f114073a = sparseArray;
        sparseArray.put(0, Arrays.asList(1, 2, 3));
        sparseArray.put(1, Arrays.asList(1, 2));
        sparseArray.put(2, Collections.singletonList(3));
        sparseArray.put(3, Arrays.asList(1, 2, 3));
        sparseArray.put(20, Arrays.asList(1, 2, 3));
        sparseArray.put(4, Arrays.asList(1, 2, 3));
        sparseArray.put(12, Arrays.asList(1, 2));
        sparseArray.put(15, Arrays.asList(1, 2, 5));
        sparseArray.put(16, Arrays.asList(1, 2, 5));
        sparseArray.put(17, Arrays.asList(1, 2, 5));
        sparseArray.put(18, Arrays.asList(1, 2, 5));
    }

    /* renamed from: a */
    public static String m5419a(int i) {
        StringBuilder sb2 = new StringBuilder();
        List<Integer> list = f114073a.get(i);
        if (list != null) {
            for (Integer num : list) {
                if (sb2.length() > 0) {
                    sb2.append(",");
                }
                sb2.append(num);
            }
        }
        return sb2.toString();
    }

    /* renamed from: b */
    public static boolean m5418b(int i) {
        if (i != 3 && i != 4) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static boolean m5417c(int i) {
        if (i != 3 && i != 4 && i != 12) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public static boolean m5416d(int i) {
        if (i == 12) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static boolean m5415e(int i) {
        if (i != 4) {
            return true;
        }
        return false;
    }
}
