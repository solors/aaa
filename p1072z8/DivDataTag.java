package p1072z8;

import androidx.annotation.NonNull;

/* renamed from: z8.a */
/* loaded from: classes.dex */
public class DivDataTag {

    /* renamed from: b */
    public static final DivDataTag f118797b = new DivDataTag("");
    @NonNull

    /* renamed from: a */
    private final String f118798a;

    public DivDataTag(@NonNull String str) {
        this.f118798a = str;
    }

    @NonNull
    /* renamed from: a */
    public String m676a() {
        return this.f118798a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return this.f118798a.equals(((DivDataTag) obj).f118798a);
        }
        return false;
    }

    public int hashCode() {
        return this.f118798a.hashCode();
    }
}
