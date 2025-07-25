package sg.bigo.ads.common.form;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import sg.bigo.ads.common.InterfaceC43707j;
import sg.bigo.ads.core.p958c.C44136b;

/* renamed from: sg.bigo.ads.common.form.b */
/* loaded from: classes10.dex */
public final class C43636b {

    /* renamed from: c */
    private static final C43636b f114225c = new C43636b();

    /* renamed from: d */
    private static final Map<Integer, Map<String, Object>> f114226d = new ConcurrentHashMap();

    /* renamed from: a */
    public final AtomicBoolean f114227a = new AtomicBoolean(false);

    /* renamed from: b */
    public InterfaceC43707j f114228b;

    /* renamed from: sg.bigo.ads.common.form.b$a */
    /* loaded from: classes10.dex */
    public interface InterfaceC43638a {
        /* renamed from: a */
        void mo5264a(int i);

        /* renamed from: a */
        void mo5261a(Map<String, Object> map);
    }

    private C43636b() {
    }

    @Nullable
    /* renamed from: a */
    public static Map<String, Object> m5281a(int i) {
        Map<Integer, Map<String, Object>> map = f114226d;
        if (map.containsKey(Integer.valueOf(i))) {
            return map.get(Integer.valueOf(i));
        }
        return null;
    }

    /* renamed from: b */
    public static void m5278b(int i) {
        f114226d.remove(Integer.valueOf(i));
    }

    /* renamed from: a */
    public static C43636b m5282a() {
        return f114225c;
    }

    /* renamed from: a */
    public static void m5280a(int i, @NonNull Map<String, Object> map) {
        f114226d.put(Integer.valueOf(i), map);
    }

    /* renamed from: a */
    public final void m5279a(final Map<String, Object> map, final InterfaceC43638a interfaceC43638a, final int i) {
        if (this.f114228b == null || map == null) {
            return;
        }
        C44136b.m3848b(1, i, "");
        this.f114228b.mo4195a(map, new InterfaceC43707j.InterfaceC43708a() { // from class: sg.bigo.ads.common.form.b.1
            @Override // sg.bigo.ads.common.InterfaceC43707j.InterfaceC43708a
            /* renamed from: a */
            public final void mo3835a() {
                InterfaceC43638a interfaceC43638a2 = interfaceC43638a;
                if (interfaceC43638a2 != null) {
                    interfaceC43638a2.mo5264a(i);
                }
                C44136b.m3848b(2, i, "");
            }

            @Override // sg.bigo.ads.common.InterfaceC43707j.InterfaceC43708a
            /* renamed from: a */
            public final void mo3834a(int i2, int i3, String str) {
                InterfaceC43638a interfaceC43638a2 = interfaceC43638a;
                if (interfaceC43638a2 != null) {
                    interfaceC43638a2.mo5261a(map);
                }
                C44136b.m3848b(3, i, String.format(Locale.ENGLISH, "code: %d, subcode: %d, error msg: %s", Integer.valueOf(i2), Integer.valueOf(i3), str));
            }
        });
    }
}
