package sg.bigo.ads.core.p964e.p965a;

import androidx.annotation.NonNull;

/* renamed from: sg.bigo.ads.core.e.a.c */
/* loaded from: classes10.dex */
public final class C44199c extends C44212n implements Comparable<C44199c> {

    /* renamed from: a */
    public final int f116008a;

    public C44199c(@NonNull String str, int i) {
        super(str);
        this.f116008a = i;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(@NonNull C44199c c44199c) {
        return this.f116008a - c44199c.f116008a;
    }

    @Override // sg.bigo.ads.core.p964e.p965a.C44212n
    public final String toString() {
        return "{\"Content\":\"" + this.f116042b + "\",\"pro_ms\":\"" + this.f116008a + "\"}";
    }
}
