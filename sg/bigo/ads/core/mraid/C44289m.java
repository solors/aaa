package sg.bigo.ads.core.mraid;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: sg.bigo.ads.core.mraid.m */
/* loaded from: classes10.dex */
final class C44289m {

    /* renamed from: a */
    List<Rect> f116270a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: sg.bigo.ads.core.mraid.m$a */
    /* loaded from: classes10.dex */
    public static class C44292a {

        /* renamed from: a */
        final int f116273a;

        /* renamed from: b */
        final int f116274b;

        C44292a(int i, int i2) {
            this.f116273a = i;
            this.f116274b = i2;
        }

        /* renamed from: a */
        final boolean m3431a(C44292a c44292a) {
            if (this.f116273a <= c44292a.f116274b && this.f116274b >= c44292a.f116273a) {
                return true;
            }
            return false;
        }

        public final String toString() {
            return String.format("Range: %s - %s", Integer.valueOf(this.f116273a), Integer.valueOf(this.f116274b));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C44289m(List<Rect> list, int[] iArr) {
        List<Integer> m3435a = m3435a(list);
        this.f116270a = new ArrayList();
        int i = 0;
        while (i < m3435a.size() - 1) {
            int intValue = m3435a.get(i).intValue();
            i++;
            int intValue2 = m3435a.get(i).intValue();
            if (intValue < intValue2) {
                C44292a c44292a = new C44292a(intValue, intValue2);
                this.f116270a.addAll(m3432b(c44292a, m3433a(c44292a, list)));
            }
        }
        Collections.sort(this.f116270a, new Comparator<Rect>() { // from class: sg.bigo.ads.core.mraid.m.1
            @Override // java.util.Comparator
            public final /* synthetic */ int compare(Rect rect, Rect rect2) {
                Rect rect3 = rect;
                Rect rect4 = rect2;
                return (rect3.width() * rect3.height()) - (rect4.width() * rect4.height());
            }
        });
        for (Rect rect : this.f116270a) {
            rect.offset(-iArr[0], -iArr[1]);
        }
    }

    /* renamed from: b */
    private static List<Rect> m3432b(C44292a c44292a, List<C44292a> list) {
        ArrayList arrayList = new ArrayList();
        for (C44292a c44292a2 : list) {
            arrayList.add(new Rect(c44292a.f116273a, c44292a2.f116273a, c44292a.f116274b, c44292a2.f116274b));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final float m3436a() {
        float f = 0.0f;
        for (Rect rect : this.f116270a) {
            f += rect.width() * rect.height();
        }
        return f;
    }

    /* renamed from: a */
    private List<Integer> m3435a(List<Rect> list) {
        ArrayList arrayList = new ArrayList();
        for (Rect rect : list) {
            arrayList.add(Integer.valueOf(rect.left));
            arrayList.add(Integer.valueOf(rect.right));
        }
        Collections.sort(arrayList, new Comparator<Integer>() { // from class: sg.bigo.ads.core.mraid.m.2
            @Override // java.util.Comparator
            public final /* synthetic */ int compare(Integer num, Integer num2) {
                return num.intValue() - num2.intValue();
            }
        });
        return arrayList;
    }

    /* renamed from: a */
    private static List<C44292a> m3434a(List<C44292a> list, C44292a c44292a) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            C44292a c44292a2 = list.get(i);
            if (!c44292a.m3431a(c44292a2)) {
                arrayList.add(c44292a2);
            } else if (c44292a.m3431a(c44292a2)) {
                int i2 = c44292a.f116273a;
                int i3 = c44292a2.f116273a;
                if (i2 >= i3) {
                    i2 = i3;
                }
                int i4 = c44292a.f116274b;
                int i5 = c44292a2.f116274b;
                if (i4 <= i5) {
                    i4 = i5;
                }
                c44292a = new C44292a(i2, i4);
            }
        }
        arrayList.add(c44292a);
        return arrayList;
    }

    /* renamed from: a */
    private static List<C44292a> m3433a(C44292a c44292a, List<Rect> list) {
        List<C44292a> arrayList = new ArrayList<>();
        for (Rect rect : list) {
            if (c44292a.f116273a < rect.right && c44292a.f116274b > rect.left) {
                arrayList = m3434a(arrayList, new C44292a(rect.top, rect.bottom));
            }
        }
        return arrayList;
    }
}
