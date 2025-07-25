package sg.bigo.ads.controller.p944a.p945a;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;
import sg.bigo.ads.common.utils.C43828k;
import sg.bigo.ads.controller.p944a.C43959k;

/* renamed from: sg.bigo.ads.controller.a.a.g */
/* loaded from: classes10.dex */
public abstract class AbstractC43936g {

    /* renamed from: c */
    public static final long f115054c = TimeUnit.SECONDS.toMillis(30);

    /* JADX INFO: Access modifiers changed from: protected */
    @Nullable
    /* renamed from: a */
    public static <T extends C43916a> T m4539a(List<T> list) {
        if (C43828k.m4877a((Collection) list)) {
            return null;
        }
        T t = (T) C43828k.m4875a((List<Object>) list);
        if (t != null) {
            t.f115002d = false;
        }
        return t;
    }

    /* renamed from: a */
    public abstract C43959k mo4540a(String str);

    @NonNull
    public String toString() {
        return super.toString();
    }

    /* renamed from: a */
    public void mo4538a(boolean z) {
    }
}
