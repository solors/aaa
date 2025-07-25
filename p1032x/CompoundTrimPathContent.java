package p1032x;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;
import p690h0.C33454j;

/* renamed from: x.b */
/* loaded from: classes2.dex */
public class CompoundTrimPathContent {

    /* renamed from: a */
    private List<TrimPathContent> f117190a = new ArrayList();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m2110a(TrimPathContent trimPathContent) {
        this.f117190a.add(trimPathContent);
    }

    /* renamed from: b */
    public void m2109b(Path path) {
        for (int size = this.f117190a.size() - 1; size >= 0; size--) {
            C33454j.m23861b(path, this.f117190a.get(size));
        }
    }
}
