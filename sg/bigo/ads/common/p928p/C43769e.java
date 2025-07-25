package sg.bigo.ads.common.p928p;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;
import java.util.concurrent.Executor;
import sg.bigo.ads.common.p928p.C43767d;
import sg.bigo.ads.common.p928p.C43773h;

/* renamed from: sg.bigo.ads.common.p.e */
/* loaded from: classes10.dex */
public final class C43769e {
    /* renamed from: a */
    public static void m5039a(@NonNull final List<String> list, final boolean z, final InterfaceC43772g interfaceC43772g) {
        if (list.size() == 0) {
            interfaceC43772g.mo5036a(0, "urlList all download Failed", "");
        } else {
            m5038a(null, list.remove(0), z, new InterfaceC43772g() { // from class: sg.bigo.ads.common.p.e.1
                @Override // sg.bigo.ads.common.p928p.InterfaceC43772g
                /* renamed from: a */
                public final void mo5036a(int i, @NonNull String str, String str2) {
                    C43769e.m5039a(list, z, InterfaceC43772g.this);
                }

                @Override // sg.bigo.ads.common.p928p.InterfaceC43772g
                /* renamed from: a */
                public final void mo5035a(@NonNull Bitmap bitmap, @NonNull C43771f c43771f) {
                    InterfaceC43772g interfaceC43772g2 = InterfaceC43772g.this;
                    if (interfaceC43772g2 != null) {
                        interfaceC43772g2.mo5035a(bitmap, c43771f);
                    }
                }
            });
        }
    }

    /* renamed from: b */
    public static void m5037b(@Nullable Executor executor, @NonNull String str, boolean z, InterfaceC43772g interfaceC43772g) {
        C43767d.C43768a.m5040a().m5060a(executor, str, z, interfaceC43772g);
    }

    /* renamed from: a */
    public static void m5038a(@Nullable Executor executor, @NonNull String str, boolean z, InterfaceC43772g interfaceC43772g) {
        C43773h.C43774a.m5026a().m5060a(executor, str, z, interfaceC43772g);
    }
}
