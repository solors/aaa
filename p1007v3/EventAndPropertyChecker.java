package p1007v3;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
import p027b4.AnalyzeLog;
import p1020w3.C44574a;
import p992u3.LogLevel;

/* renamed from: v3.g */
/* loaded from: classes6.dex */
public class EventAndPropertyChecker {

    /* renamed from: a */
    private static final Pattern f116845a = Pattern.compile("^[a-zA-Z][a-zA-Z0-9_]*");

    /* renamed from: b */
    private static Set<String> f116846b;

    /* renamed from: c */
    private static Set<String> f116847c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m2694a(C44574a c44574a) {
        if (!AnalyzeLog.m103943g()) {
            return;
        }
        String m2371g = c44574a.m2371g();
        if (!TextUtils.isEmpty(m2371g)) {
            if (m2371g.length() >= 2 && m2371g.length() <= 40) {
                if (f116845a.matcher(m2371g).matches()) {
                    Bundle m2372f = c44574a.m2372f();
                    if (m2372f != null && m2372f.size() != 0) {
                        if (m2372f.size() <= 50) {
                            for (String str : m2372f.keySet()) {
                                if (str.length() >= 2 && str.length() <= 40) {
                                    if (f116845a.matcher(str).matches()) {
                                        Object obj = m2372f.get(str);
                                        if (obj != null) {
                                            boolean z = obj instanceof String;
                                            if (!z && !(obj instanceof Integer) && !(obj instanceof Double) && !(obj instanceof Float)) {
                                                throw new IllegalArgumentException("The parameter value must in String、double、int、float. event name:" + m2371g + " error key:" + str);
                                            } else if (z && ((String) obj).length() > 50000) {
                                                LogLevel logLevel = LogLevel.ERROR;
                                                AnalyzeLog.m103949a(logLevel, "The event param value length must less than 500. error name:" + m2371g);
                                            }
                                        }
                                    } else {
                                        throw new IllegalArgumentException("The event key starts with a letter and can contain only letters and numbers and underscores. event name:" + m2371g + " error key:" + str);
                                    }
                                } else {
                                    throw new IllegalArgumentException("The event parameter key length must be between [2,40]. event name:" + m2371g + " error key:" + str);
                                }
                            }
                            return;
                        }
                        throw new IllegalArgumentException("The maximum number of parameters is 50 pairs. error event name:" + m2371g);
                    }
                    return;
                }
                throw new IllegalArgumentException("The event name starts with a letter and can contain only letters and numbers and underscores. error event name:" + m2371g);
            }
            throw new IllegalArgumentException("The event name length must be between [2,40]. error event name:" + m2371g);
        }
        throw new IllegalArgumentException("The name cannot be empty");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static void m2693b(String str, String str2, int i) {
        if (!AnalyzeLog.m103943g()) {
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            if (str.length() >= 2 && str.length() <= 40) {
                if (f116845a.matcher(str).matches()) {
                    if (!TextUtils.isEmpty(str2) && str2.length() > 50000) {
                        LogLevel logLevel = LogLevel.ERROR;
                        AnalyzeLog.m103949a(logLevel, "The property value length must be less than 500 error key:" + str);
                    }
                    if (i == 1) {
                        if (f116846b == null) {
                            f116846b = new HashSet();
                        }
                        f116846b.add(str);
                        if (f116846b.size() > 50) {
                            AnalyzeLog.m103949a(LogLevel.ERROR, "User property have a maximum length of 50");
                        }
                    }
                    if (i == 2) {
                        if (f116847c == null) {
                            f116847c = new HashSet();
                        }
                        f116847c.add(str);
                        if (f116847c.size() > 50) {
                            AnalyzeLog.m103949a(LogLevel.ERROR, "Event property have a maximum length of 50");
                            return;
                        }
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException("The property key starts with a letter and can contain only letters and numbers and underscores. error key:" + str);
            }
            throw new IllegalArgumentException("The property key length must be between [2,40]. error key:" + str);
        }
        throw new IllegalArgumentException("The property cannot be empty");
    }
}
