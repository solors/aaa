package sg.bigo.ads.core.p964e.p965a;

import androidx.annotation.NonNull;

/* renamed from: sg.bigo.ads.core.e.a.l */
/* loaded from: classes10.dex */
public final class C44210l extends C44212n implements Comparable<C44210l> {

    /* renamed from: a */
    public final float f116039a;

    public C44210l(@NonNull String str, float f) {
        super(str);
        this.f116039a = f;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(@NonNull C44210l c44210l) {
        return Double.compare(this.f116039a, c44210l.f116039a);
    }

    @Override // sg.bigo.ads.core.p964e.p965a.C44212n
    public final String toString() {
        return "{\"Content\":\"" + this.f116042b + "\",\"progress\":\"" + this.f116039a + "\"}";
    }
}
