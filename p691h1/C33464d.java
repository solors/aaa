package p691h1;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.explorestack.iab.mraid.C10472c;
import com.explorestack.iab.mraid.C10474e;
import com.explorestack.iab.utils.C10512g;
import com.explorestack.iab.utils.C10515h;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.net.URLDecoder;

/* renamed from: h1.d */
/* loaded from: classes3.dex */
final class C33464d {
    @NonNull

    /* renamed from: a */
    private static final C10515h f91310a = new C10515h();

    /* renamed from: b */
    static final /* synthetic */ boolean f91311b = true;

    @NonNull
    /* renamed from: a */
    private static Pair<String, String> m23832a(@NonNull String str) {
        String[] split = str.split(RemoteSettings.FORWARD_SLASH_STRING);
        return new Pair<>(split[0], split[1]);
    }

    /* renamed from: b */
    private static void m23831b(@Nullable C10474e c10474e) {
        if (c10474e != null) {
            c10474e.m79520a("nativeStorage.fireErrorEvent('internal error');");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static void m23830c(@Nullable C10474e c10474e, @Nullable String str) {
        if (m23827f(c10474e, str)) {
            return;
        }
        try {
            Pair<String, String> m23832a = m23832a(f91310a.m79288c(URLDecoder.decode(str, "UTF-8")));
            if (m23827f(c10474e, (String) m23832a.first, (String) m23832a.second)) {
                return;
            }
            boolean z = f91311b;
            if (!z && c10474e == null) {
                throw new AssertionError();
            }
            Object obj = c10474e.getContext().getApplicationContext().getSharedPreferences((String) m23832a.first, 0).getAll().get(m23832a.second);
            if (obj == null) {
                m23831b(c10474e);
                return;
            }
            String valueOf = String.valueOf(obj);
            if (!m23827f(c10474e, valueOf)) {
                if (!z && str == null) {
                    throw new AssertionError();
                }
                m23828e(c10474e, "fireReadDefaultsSuccessEvent", str, Base64.encodeToString(valueOf.getBytes(), 2));
            }
        } catch (Throwable th) {
            m23831b(c10474e);
            C10472c.m79528b("NativeStorage", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static void m23829d(@Nullable C10474e c10474e, @Nullable String str, @Nullable String str2) {
        if (m23827f(c10474e, str, str2)) {
            return;
        }
        try {
            String m79288c = f91310a.m79288c(URLDecoder.decode(str, "UTF-8"));
            byte[] decode = Base64.decode(URLDecoder.decode(str2, "UTF-8"), 2);
            Pair<String, String> m23832a = m23832a(m79288c);
            if (m23827f(c10474e, (String) m23832a.first, (String) m23832a.second)) {
                return;
            }
            if (!f91311b && c10474e == null) {
                throw new AssertionError();
            }
            c10474e.getContext().getApplicationContext().getSharedPreferences((String) m23832a.first, 0).edit().putString((String) m23832a.second, new String(decode)).apply();
        } catch (Throwable th) {
            m23831b(c10474e);
            C10472c.m79528b("NativeStorage", th);
        }
    }

    /* renamed from: e */
    private static void m23828e(@Nullable C10474e c10474e, @NonNull String str, @NonNull String str2, @NonNull String str3) {
        if (c10474e != null) {
            c10474e.m79520a(String.format("nativeStorage.%s(\"%s\", \"%s\");", str, str2, str3));
        }
    }

    /* renamed from: f */
    private static boolean m23827f(@Nullable C10474e c10474e, @Nullable String... strArr) {
        if (c10474e != null && !c10474e.m79518c() && c10474e.getContext() != null) {
            if (strArr != null) {
                for (String str : strArr) {
                    if (TextUtils.isEmpty(str)) {
                        m23831b(c10474e);
                        return true;
                    }
                }
            }
            return false;
        }
        m23831b(c10474e);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static void m23826g(@Nullable C10474e c10474e, @Nullable String str) {
        FileInputStream fileInputStream;
        File fileStreamPath;
        if (m23827f(c10474e, str)) {
            return;
        }
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            String m79288c = f91310a.m79288c(URLDecoder.decode(str, "UTF-8"));
            if (!f91311b && c10474e == null) {
                throw new AssertionError();
            }
            Context applicationContext = c10474e.getContext().getApplicationContext();
            if (m79288c.contains(RemoteSettings.FORWARD_SLASH_STRING)) {
                fileStreamPath = new File(m79288c);
            } else {
                fileStreamPath = applicationContext.getFileStreamPath(m79288c);
            }
            if (fileStreamPath != null && fileStreamPath.exists()) {
                fileInputStream = applicationContext.openFileInput(m79288c);
                try {
                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                    try {
                        byte[] bArr = new byte[8192];
                        if (fileInputStream != null) {
                            while (true) {
                                int read = fileInputStream.read(bArr);
                                if (-1 == read) {
                                    break;
                                }
                                byteArrayOutputStream2.write(bArr, 0, read);
                            }
                        }
                        byte[] byteArray = byteArrayOutputStream2.toByteArray();
                        if (byteArray.length > 0) {
                            if (!f91311b && str == null) {
                                throw new AssertionError();
                            }
                            m23828e(c10474e, "fireReadFileSuccessEvent", str, Base64.encodeToString(byteArray, 2));
                        } else {
                            m23831b(c10474e);
                        }
                        C10512g.m79304m(fileInputStream);
                        C10512g.m79304m(byteArrayOutputStream2);
                        return;
                    } catch (Throwable th) {
                        th = th;
                        byteArrayOutputStream = byteArrayOutputStream2;
                        try {
                            m23831b(c10474e);
                            C10472c.m79528b("NativeStorage", th);
                            return;
                        } finally {
                            C10512g.m79304m(fileInputStream);
                            C10512g.m79304m(byteArrayOutputStream);
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            m23831b(c10474e);
            C10512g.m79304m(null);
            C10512g.m79304m(null);
        } catch (Throwable th3) {
            th = th3;
            fileInputStream = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public static void m23825h(@Nullable C10474e c10474e, @Nullable String str, @Nullable String str2) {
        if (m23827f(c10474e, str, str2)) {
            return;
        }
        FileOutputStream fileOutputStream = null;
        try {
            String m79288c = f91310a.m79288c(URLDecoder.decode(str, "UTF-8"));
            byte[] decode = Base64.decode(URLDecoder.decode(str2, "UTF-8"), 2);
            if (!m23827f(c10474e, m79288c, new String(decode))) {
                if (!f91311b && c10474e == null) {
                    throw new AssertionError();
                }
                Context applicationContext = c10474e.getContext().getApplicationContext();
                if (m79288c.contains(RemoteSettings.FORWARD_SLASH_STRING)) {
                    fileOutputStream = new FileOutputStream(m79288c);
                } else {
                    fileOutputStream = applicationContext.openFileOutput(m79288c, 0);
                }
                fileOutputStream.write(decode);
            }
        } finally {
            try {
            } finally {
            }
        }
    }
}
