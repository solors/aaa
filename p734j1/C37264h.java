package p734j1;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.ArrayList;
import java.util.List;
import p750k1.C37377b;
import p750k1.InterfaceC37376a;

/* renamed from: j1.h */
/* loaded from: classes3.dex */
public class C37264h {
    @VisibleForTesting

    /* renamed from: a */
    static List<InterfaceC37376a> f98425a = new C37265a();

    /* renamed from: j1.h$a */
    /* loaded from: classes3.dex */
    class C37265a extends ArrayList<InterfaceC37376a> {
        C37265a() {
            add(new C37377b());
        }
    }

    /* renamed from: j1.h$b */
    /* loaded from: classes3.dex */
    public interface InterfaceC37266b {
        /* renamed from: a */
        void mo18612a(String str);
    }

    /* renamed from: a */
    public static String m18614a(@Nullable String str, @Nullable Bundle bundle) {
        if (str == null) {
            return null;
        }
        for (InterfaceC37376a interfaceC37376a : f98425a) {
            str = interfaceC37376a.mo18276a(str, bundle);
        }
        return str;
    }

    /* renamed from: b */
    public static void m18613b(@Nullable List<String> list, @Nullable Bundle bundle, @Nullable InterfaceC37266b interfaceC37266b) {
        if (list != null && !list.isEmpty() && interfaceC37266b != null) {
            for (String str : list) {
                interfaceC37266b.mo18612a(m18614a(str, bundle));
            }
        }
    }
}
