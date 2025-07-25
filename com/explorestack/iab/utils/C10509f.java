package com.explorestack.iab.utils;

import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.explorestack.iab.utils.f */
/* loaded from: classes3.dex */
public class C10509f {
    @Nullable

    /* renamed from: c */
    private static EnumC10510a f24029c = EnumC10510a.error;
    @NonNull

    /* renamed from: a */
    private final String f24030a;
    @NonNull

    /* renamed from: b */
    private final List<InterfaceC10508e> f24031b = new CopyOnWriteArrayList();

    /* renamed from: com.explorestack.iab.utils.f$a */
    /* loaded from: classes3.dex */
    public enum EnumC10510a {
        debug(1),
        info(2),
        warning(3),
        error(4),
        none(5);
        

        /* renamed from: b */
        private final int f24038b;

        EnumC10510a(int i) {
            this.f24038b = i;
        }

        /* renamed from: c */
        public int m79333c() {
            return this.f24038b;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.explorestack.iab.utils.f$b */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class C10511b {

        /* renamed from: a */
        static final /* synthetic */ int[] f24039a;

        static {
            int[] iArr = new int[EnumC10510a.values().length];
            f24039a = iArr;
            try {
                iArr[EnumC10510a.debug.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24039a[EnumC10510a.error.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f24039a[EnumC10510a.warning.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public C10509f(@NonNull String str) {
        this.f24030a = str;
    }

    @NonNull
    /* renamed from: a */
    private static String m79350a(@NonNull String str, @NonNull String str2) {
        return String.format("[%s] %s", str, str2);
    }

    /* renamed from: b */
    private void m79349b(@NonNull EnumC10510a enumC10510a, @NonNull String str) {
        int i = C10511b.f24039a[enumC10510a.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    Log.w(this.f24030a, str);
                    return;
                }
                return;
            }
            Log.e(this.f24030a, str);
            return;
        }
        Log.d(this.f24030a, str);
    }

    /* renamed from: c */
    private void m79348c(@NonNull EnumC10510a enumC10510a, @NonNull String str, @Nullable String str2, @Nullable Object... objArr) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        boolean m79340k = m79340k(enumC10510a);
        boolean m79335p = m79335p();
        if (!m79340k && !m79335p) {
            return;
        }
        String m79338m = m79338m(str, str2, objArr);
        if (m79340k) {
            m79349b(enumC10510a, m79338m);
        }
        if (m79335p) {
            m79343h(enumC10510a, m79338m);
        }
    }

    /* renamed from: g */
    private boolean m79344g(@NonNull EnumC10510a enumC10510a) {
        if (!m79340k(enumC10510a) && !m79335p()) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    private void m79343h(@NonNull EnumC10510a enumC10510a, @NonNull String str) {
        for (InterfaceC10508e interfaceC10508e : this.f24031b) {
            interfaceC10508e.m79351a(enumC10510a, this.f24030a, str);
        }
    }

    /* renamed from: k */
    private boolean m79340k(@NonNull EnumC10510a enumC10510a) {
        EnumC10510a enumC10510a2 = f24029c;
        if (enumC10510a2 != null && enumC10510a2.m79333c() <= enumC10510a.m79333c()) {
            return true;
        }
        return false;
    }

    @NonNull
    /* renamed from: m */
    private static String m79338m(@NonNull String str, @NonNull String str2, @Nullable Object... objArr) {
        String m79350a = m79350a(str, str2);
        if (objArr != null) {
            if (objArr.length != 0) {
                try {
                } catch (Throwable unused) {
                    return m79350a;
                }
            }
            return String.format(m79350a, objArr);
        }
        return m79350a;
    }

    /* renamed from: p */
    private boolean m79335p() {
        return !this.f24031b.isEmpty();
    }

    /* renamed from: d */
    public void m79347d(@NonNull String str, @Nullable String str2, @Nullable Object... objArr) {
        m79348c(EnumC10510a.debug, str, str2, objArr);
    }

    /* renamed from: e */
    public void m79346e(@NonNull String str, @NonNull Throwable th) {
        m79348c(EnumC10510a.error, str, th.toString(), new Object[0]);
    }

    /* renamed from: f */
    public boolean m79345f() {
        return m79344g(EnumC10510a.debug);
    }

    /* renamed from: i */
    public void m79342i(@NonNull String str, @Nullable String str2, @Nullable Object... objArr) {
        m79348c(EnumC10510a.error, str, str2, objArr);
    }

    /* renamed from: j */
    public boolean m79341j() {
        return m79344g(EnumC10510a.error);
    }

    @Nullable
    /* renamed from: l */
    public EnumC10510a m79339l() {
        return f24029c;
    }

    /* renamed from: n */
    public void m79337n(@Nullable EnumC10510a enumC10510a) {
        Log.d(this.f24030a, String.format("Changing logging level. From: %s, To: %s", f24029c, enumC10510a));
        f24029c = enumC10510a;
    }

    /* renamed from: o */
    public void m79336o(@NonNull String str, @Nullable String str2, @Nullable Object... objArr) {
        m79348c(EnumC10510a.warning, str, str2, objArr);
    }
}
