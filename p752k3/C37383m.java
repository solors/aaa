package p752k3;

import com.helpshift.log.HSLogger;
import java.io.Closeable;
import java.util.HashSet;
import java.util.Map;

/* compiled from: Utils.java */
/* renamed from: k3.m */
/* loaded from: classes5.dex */
public class C37383m {
    /* renamed from: a */
    public static boolean m18239a(String str) {
        if (m18236d(str)) {
            return false;
        }
        int lastIndexOf = str.lastIndexOf("@");
        int lastIndexOf2 = str.lastIndexOf(".");
        if (lastIndexOf == -1 || lastIndexOf2 == -1 || lastIndexOf2 <= lastIndexOf + 1) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static void m18238b(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: c */
    public static String m18237c(String str) {
        if (str == null) {
            return "**null**";
        }
        int length = str.length();
        int ceil = (int) Math.ceil(length * 0.25d);
        String substring = str.substring(0, ceil);
        String substring2 = str.substring(length - ceil, length);
        return substring + "**" + length + "**" + substring2;
    }

    /* renamed from: d */
    public static boolean m18236d(String str) {
        if (str != null && str.trim().length() != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public static boolean m18235e(Map<String, String> map) {
        if (map != null && !map.isEmpty()) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public static boolean m18234f(String str) {
        String trim;
        if (m18236d(str)) {
            trim = "";
        } else {
            trim = str.trim();
        }
        if (!m18236d(trim) && !"null".equalsIgnoreCase(trim) && !"undefined".equalsIgnoreCase(trim) && !"unknown".equalsIgnoreCase(trim) && !"nil".equalsIgnoreCase(trim)) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public static boolean m18233g(String str) {
        return !m18236d(str);
    }

    /* renamed from: h */
    public static boolean m18232h(Map<String, String> map) {
        return !m18235e(map);
    }

    /* renamed from: i */
    public static boolean m18231i(long j) {
        if (j / 86400000 == System.currentTimeMillis() / 86400000) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public static String m18230j(CharSequence charSequence, Iterable iterable) {
        if (iterable == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        boolean z = true;
        for (Object obj : iterable) {
            if (z) {
                z = false;
            } else {
                sb2.append(charSequence);
            }
            sb2.append(obj);
        }
        return sb2.toString();
    }

    /* renamed from: k */
    public static void m18229k(Map<String, String> map) {
        HashSet<String> hashSet = new HashSet();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (m18236d(entry.getValue())) {
                hashSet.add(entry.getKey());
            }
        }
        for (String str : hashSet) {
            map.remove(str);
        }
    }

    /* renamed from: l */
    public static boolean m18228l(String str, String str2) {
        if (m18236d(str) && m18236d(str2)) {
            HSLogger.m65439e("Utils", "Error logging in the user: userId and userEmail both are empty. userId: " + str + " userEmail: " + str2 + ". SDK will respect previously logged in user.");
            return false;
        } else if (m18233g(str) && m18234f(str)) {
            HSLogger.m65439e("Utils", "Invalid userId: " + str + ". SDK will respect previously logged in user.");
            return false;
        } else if (m18233g(str2) && !m18239a(str2)) {
            HSLogger.m65439e("Utils", "Invalid user email: " + str2 + ". SDK will respect previously logged in user.");
            return false;
        } else {
            return true;
        }
    }
}
