package sg.bigo.ads.common.p918h.p920b;

import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: sg.bigo.ads.common.h.b.f */
/* loaded from: classes10.dex */
public final class C43695f {

    /* renamed from: b */
    private static C43695f f114386b = new C43695f();

    /* renamed from: a */
    HashMap<String, CopyOnWriteArrayList<InterfaceC43694e>> f114387a = new HashMap<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: sg.bigo.ads.common.h.b.f$1 */
    /* loaded from: classes10.dex */
    public static /* synthetic */ class C436961 {

        /* renamed from: a */
        static final /* synthetic */ int[] f114388a;

        static {
            int[] iArr = new int[C43698h.m5170a().length];
            f114388a = iArr;
            try {
                iArr[C43698h.f114390a - 1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f114388a[C43698h.f114391b - 1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f114388a[C43698h.f114392c - 1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f114388a[C43698h.f114393d - 1] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f114388a[C43698h.f114394e - 1] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f114388a[C43698h.f114395f - 1] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f114388a[C43698h.f114396g - 1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    C43695f() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public static C43695f m5177a() {
        return f114386b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public final void m5173b(String str) {
        if (this.f114387a.containsKey(str) && this.f114387a.get(str) != null) {
            this.f114387a.get(str).clear();
        }
    }

    /* renamed from: a */
    public final void m5176a(String str) {
        CopyOnWriteArrayList<InterfaceC43694e> copyOnWriteArrayList;
        C43690a m5163c;
        if (!this.f114387a.containsKey(str) || (copyOnWriteArrayList = this.f114387a.get(str)) == null || (m5163c = C43699i.m5163c(str)) == null) {
            return;
        }
        m5174a(m5163c, copyOnWriteArrayList);
    }

    /* renamed from: a */
    private void m5175a(String str, InterfaceC43694e interfaceC43694e) {
        CopyOnWriteArrayList<InterfaceC43694e> copyOnWriteArrayList;
        if (this.f114387a.containsKey(str) && (copyOnWriteArrayList = this.f114387a.get(str)) != null && copyOnWriteArrayList.contains(interfaceC43694e)) {
            copyOnWriteArrayList.remove(interfaceC43694e);
        }
    }

    /* renamed from: a */
    private void m5174a(C43690a c43690a, CopyOnWriteArrayList<InterfaceC43694e> copyOnWriteArrayList) {
        switch (C436961.f114388a[c43690a.f114380e - 1]) {
            case 1:
                Iterator<InterfaceC43694e> it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    it.next();
                }
                return;
            case 2:
                Iterator<InterfaceC43694e> it2 = copyOnWriteArrayList.iterator();
                while (it2.hasNext()) {
                    it2.next();
                }
                return;
            case 3:
                Iterator<InterfaceC43694e> it3 = copyOnWriteArrayList.iterator();
                while (it3.hasNext()) {
                    it3.next().mo5182a(c43690a.f114376a);
                }
                return;
            case 4:
                Iterator<InterfaceC43694e> it4 = copyOnWriteArrayList.iterator();
                while (it4.hasNext()) {
                    String str = c43690a.f114376a;
                    C43700j.m5162a(c43690a.f114379d);
                    it4.next().mo5180b(str);
                }
                return;
            case 5:
                Iterator<InterfaceC43694e> it5 = copyOnWriteArrayList.iterator();
                while (it5.hasNext()) {
                    it5.next().mo5179c(c43690a.f114376a);
                }
                return;
            case 6:
                Iterator<InterfaceC43694e> it6 = copyOnWriteArrayList.iterator();
                while (it6.hasNext()) {
                    InterfaceC43694e next = it6.next();
                    next.mo5178d(c43690a.f114376a);
                    m5175a(c43690a.f114376a, next);
                }
                return;
            case 7:
                Iterator<InterfaceC43694e> it7 = copyOnWriteArrayList.iterator();
                while (it7.hasNext()) {
                    InterfaceC43694e next2 = it7.next();
                    next2.mo5181a(c43690a.f114376a, c43690a.f114381f, c43690a.f114377b.f114340f);
                    m5175a(c43690a.f114376a, next2);
                }
                return;
            default:
                return;
        }
    }
}
