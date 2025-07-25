package p001a0;

/* renamed from: a0.h */
/* loaded from: classes2.dex */
public class Marker {

    /* renamed from: d */
    private static String f34d = "\r";

    /* renamed from: a */
    private final String f35a;

    /* renamed from: b */
    public final float f36b;

    /* renamed from: c */
    public final float f37c;

    public Marker(String str, float f, float f2) {
        this.f35a = str;
        this.f37c = f2;
        this.f36b = f;
    }

    /* renamed from: a */
    public boolean m105881a(String str) {
        if (this.f35a.equalsIgnoreCase(str)) {
            return true;
        }
        if (this.f35a.endsWith(f34d)) {
            String str2 = this.f35a;
            if (str2.substring(0, str2.length() - 1).equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }
}
