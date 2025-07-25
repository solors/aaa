package p678g1;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: g1.b */
/* loaded from: classes3.dex */
public class C33182b {

    /* renamed from: c */
    public static final C33182b f90674c = new C33182b(1, "No internet connection");

    /* renamed from: a */
    private final int f90675a;

    /* renamed from: b */
    private final String f90676b;

    public C33182b(int i, @NonNull String str) {
        this.f90675a = i;
        this.f90676b = str;
    }

    /* renamed from: a */
    public static C33182b m24489a(@NonNull String str) {
        return new C33182b(3, str);
    }

    /* renamed from: b */
    public static C33182b m24488b(@NonNull String str) {
        return new C33182b(6, str);
    }

    /* renamed from: e */
    public static C33182b m24485e(@NonNull String str) {
        return new C33182b(4, str);
    }

    /* renamed from: f */
    public static C33182b m24484f(@NonNull String str) {
        return new C33182b(0, str);
    }

    /* renamed from: g */
    public static C33182b m24483g(@NonNull String str) {
        return new C33182b(7, str);
    }

    /* renamed from: h */
    public static C33182b m24482h(@NonNull String str) {
        return new C33182b(2, str);
    }

    /* renamed from: i */
    public static C33182b m24481i(@NonNull String str) {
        return new C33182b(5, str);
    }

    /* renamed from: j */
    public static C33182b m24480j(@NonNull String str, @Nullable Throwable th) {
        if (th != null) {
            try {
                StringBuilder sb2 = new StringBuilder(str);
                sb2.append(" - ");
                sb2.append(th.getClass().getName());
                String message = th.getMessage();
                if (!TextUtils.isEmpty(message)) {
                    sb2.append(": ");
                    sb2.append(message);
                }
                return m24484f(sb2.toString());
            } catch (Throwable unused) {
            }
        }
        return m24484f(str);
    }

    /* renamed from: c */
    public int m24487c() {
        return this.f90675a;
    }

    /* renamed from: d */
    public String m24486d() {
        return this.f90676b;
    }

    @NonNull
    public String toString() {
        return String.format("(%s) %s", Integer.valueOf(this.f90675a), this.f90676b);
    }
}
