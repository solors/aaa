package com.bytedance.sdk.component.utils;

import android.content.Context;
import android.text.TextUtils;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.bytedance.sdk.component.utils.yDt */
/* loaded from: classes3.dex */
public class C7766yDt {

    /* renamed from: bX */
    private static volatile C7766yDt f16940bX;

    /* renamed from: IL */
    private volatile boolean f16941IL = false;

    /* renamed from: bg */
    private Map<String, String> f16942bg;
    private Context eqN;

    private C7766yDt(Context context) {
        if (context != null && this.eqN == null) {
            this.eqN = context.getApplicationContext();
            m87798bg();
        }
        this.eqN = context;
    }

    /* renamed from: IL */
    private static String m87800IL(String str) {
        String substring;
        int indexOf = str.indexOf(47);
        int indexOf2 = str.indexOf(59);
        if (indexOf < 0) {
            return null;
        }
        String trim = str.substring(0, indexOf).trim();
        Locale locale = Locale.ENGLISH;
        String lowerCase = trim.toLowerCase(locale);
        if (!m87799bX(lowerCase)) {
            return null;
        }
        int i = indexOf + 1;
        if (indexOf2 < 0) {
            substring = str.substring(i);
        } else {
            substring = str.substring(i, indexOf2);
        }
        String lowerCase2 = substring.trim().toLowerCase(locale);
        if (!m87799bX(lowerCase2)) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder(lowerCase.length() + lowerCase2.length() + 1);
        sb2.append(lowerCase);
        sb2.append('/');
        sb2.append(lowerCase2);
        return sb2.toString();
    }

    /* renamed from: bX */
    private static boolean m87799bX(String str) {
        int length = str.length();
        if (length == 0) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            if (!m87797bg(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    private String eqN(String str) {
        String str2;
        String m87791zx = m87791zx(str);
        if (m87791zx.isEmpty()) {
            return null;
        }
        m87798bg();
        Map<String, String> map = this.f16942bg;
        if (map == null || map.isEmpty()) {
            return null;
        }
        do {
            str2 = this.f16942bg.get(m87791zx);
            if (str2 == null) {
                m87791zx = m87791zx(m87791zx);
            }
            if (str2 != null) {
                break;
            }
        } while (!m87791zx.isEmpty());
        return str2;
    }

    private void ldr(String str) {
        String trim = str.trim();
        if (!trim.isEmpty()) {
            if (trim.charAt(0) != '#') {
                String replaceAll = trim.replaceAll("\\s*#.*", "");
                if (replaceAll.indexOf(61) > 0) {
                    Matcher matcher = Pattern.compile("\\btype=(\"\\p{Graph}+?/\\p{Graph}+?\"|\\p{Graph}+/\\p{Graph}+\\b)").matcher(replaceAll);
                    if (matcher.find()) {
                        String substring = matcher.group().substring(5);
                        if (substring.charAt(0) == '\"') {
                            substring = substring.substring(1, substring.length() - 1);
                        }
                        Matcher matcher2 = Pattern.compile("\\bexts=(\"[\\p{Graph}|\\p{Blank}]+?\"|\\p{Graph}+\\b)").matcher(replaceAll);
                        if (matcher2.find()) {
                            String substring2 = matcher2.group().substring(5);
                            if (substring2.charAt(0) == '\"') {
                                substring2 = substring2.substring(1, substring2.length() - 1);
                            }
                            for (String str2 : substring2.split("[\\p{Blank}|\\p{Punct}]+")) {
                                m87792bg(str2, substring);
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                String[] split = replaceAll.split("\\s+");
                for (int i = 1; i < split.length; i++) {
                    m87792bg(split[i], split[0]);
                }
            }
        }
    }

    /* renamed from: zx */
    private static String m87791zx(String str) {
        int indexOf;
        if (str != null && !str.isEmpty() && (indexOf = str.indexOf(46)) >= 0 && indexOf < str.length() - 1) {
            return str.substring(indexOf + 1);
        }
        return "";
    }

    /* renamed from: bg */
    public static String m87795bg(Context context, String str) {
        if (str != null) {
            try {
                if (str.startsWith("http") && str.contains("?")) {
                    str = str.split("\\?")[0];
                    if (str.endsWith(RemoteSettings.FORWARD_SLASH_STRING)) {
                        str = str.substring(0, str.length() - 1);
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return m87796bg(context).m87793bg(str);
    }

    /* renamed from: bg */
    static C7766yDt m87796bg(Context context) {
        if (f16940bX == null) {
            synchronized (C7766yDt.class) {
                if (f16940bX == null) {
                    f16940bX = new C7766yDt(context);
                }
            }
        }
        return f16940bX;
    }

    /* renamed from: bg */
    public final String m87793bg(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String eqN = eqN(str);
        if (TextUtils.isEmpty(eqN)) {
            return null;
        }
        return m87800IL(eqN);
    }

    /* renamed from: bg */
    private static boolean m87797bg(char c) {
        return c > ' ' && c < 127 && "()<>@,;:/[]?=\\\"".indexOf(c) < 0;
    }

    /* renamed from: bg */
    private void m87798bg() {
        if (this.eqN == null || this.f16941IL) {
            return;
        }
        synchronized (this) {
            if (!this.f16941IL) {
                List list = (List) AccessController.doPrivileged(new PrivilegedAction<List<String>>() { // from class: com.bytedance.sdk.component.utils.yDt.1
                    @Override // java.security.PrivilegedAction
                    /* renamed from: bg */
                    public List<String> run() {
                        BufferedReader bufferedReader;
                        InputStream inputStream = null;
                        try {
                            ArrayList arrayList = new ArrayList();
                            InputStream open = C7766yDt.this.eqN.getAssets().open("tt_mime_type.pro");
                            try {
                                bufferedReader = new BufferedReader(new InputStreamReader(open));
                                while (true) {
                                    try {
                                        String readLine = bufferedReader.readLine();
                                        if (readLine == null) {
                                            break;
                                        } else if (!TextUtils.isEmpty(readLine)) {
                                            arrayList.add(readLine);
                                        }
                                    } catch (Throwable unused) {
                                        inputStream = open;
                                        try {
                                            List<String> emptyList = Collections.emptyList();
                                            if (bufferedReader != null) {
                                                try {
                                                    bufferedReader.close();
                                                } catch (Throwable unused2) {
                                                }
                                            }
                                            return emptyList;
                                        } finally {
                                            if (inputStream != null) {
                                                try {
                                                    inputStream.close();
                                                } catch (Throwable unused3) {
                                                }
                                            }
                                            if (bufferedReader != null) {
                                                try {
                                                    bufferedReader.close();
                                                } catch (Throwable unused4) {
                                                }
                                            }
                                        }
                                    }
                                }
                                if (open != null) {
                                    try {
                                        open.close();
                                    } catch (Throwable unused5) {
                                    }
                                }
                                try {
                                    bufferedReader.close();
                                } catch (Throwable unused6) {
                                }
                                return arrayList;
                            } catch (Throwable unused7) {
                                bufferedReader = null;
                            }
                        } catch (Throwable unused8) {
                            bufferedReader = null;
                        }
                    }
                });
                this.f16942bg = new HashMap(list.size());
                String str = "";
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    String str2 = str + ((String) it.next());
                    if (str2.endsWith("\\")) {
                        str = str2.substring(0, str2.length() - 1);
                    } else {
                        ldr(str2);
                        str = "";
                    }
                }
                if (!str.isEmpty()) {
                    ldr(str);
                }
                this.f16941IL = true;
            }
        }
    }

    /* renamed from: bg */
    private void m87792bg(String str, String str2) {
        if (str == null || str.isEmpty() || str2 == null || str2.isEmpty() || this.f16942bg.containsKey(str)) {
            return;
        }
        this.f16942bg.put(str, str2);
    }
}
