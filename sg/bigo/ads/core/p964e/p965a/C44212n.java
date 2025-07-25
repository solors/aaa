package sg.bigo.ads.core.p964e.p965a;

import androidx.annotation.NonNull;

/* renamed from: sg.bigo.ads.core.e.a.n */
/* loaded from: classes10.dex */
public class C44212n {

    /* renamed from: a */
    private boolean f116041a;

    /* renamed from: b */
    public final String f116042b;

    /* renamed from: c */
    public boolean f116043c;

    /* renamed from: d */
    public boolean f116044d;

    public C44212n(@NonNull String str) {
        this.f116044d = false;
        this.f116041a = true;
        this.f116042b = str;
    }

    public String toString() {
        return "{\"Content\":\"" + this.f116042b + "\"}";
    }

    public C44212n(@NonNull String str, byte b) {
        this(str);
        this.f116044d = true;
    }
}
