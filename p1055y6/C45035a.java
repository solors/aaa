package p1055y6;

import android.app.Activity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: DisObserveActivityManager.java */
/* renamed from: y6.a */
/* loaded from: classes5.dex */
public class C45035a {

    /* renamed from: a */
    private List<Class<? extends Activity>> f118482a;

    /* compiled from: DisObserveActivityManager.java */
    /* renamed from: y6.a$b */
    /* loaded from: classes5.dex */
    private static class C45037b {

        /* renamed from: a */
        private static final C45035a f118483a = new C45035a();
    }

    /* renamed from: b */
    public static C45035a m1048b() {
        return C45037b.f118483a;
    }

    @SafeVarargs
    /* renamed from: a */
    public final void m1049a(Class<? extends Activity>... clsArr) {
        if (clsArr != null && clsArr.length != 0) {
            if (this.f118482a == null) {
                this.f118482a = new ArrayList();
            }
            this.f118482a.addAll(new ArrayList(Arrays.asList(clsArr)));
            return;
        }
        throw new NullPointerException("addDisObserveActivity method parameter cannot be empty or null");
    }

    /* renamed from: c */
    public boolean m1047c(Class<? extends Activity> cls) {
        List<Class<? extends Activity>> list;
        if (cls != null && (list = this.f118482a) != null) {
            return list.contains(cls);
        }
        return false;
    }

    private C45035a() {
    }
}
