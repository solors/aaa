package sg.bigo.ads.common.p933u;

import androidx.annotation.Nullable;
import com.ironsource.C20517nb;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: sg.bigo.ads.common.u.f */
/* loaded from: classes10.dex */
public final class C43806f {

    /* renamed from: a */
    private static final Pattern f114634a = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* renamed from: b */
    private static final Pattern f114635b = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* renamed from: c */
    private final String f114636c;

    /* renamed from: d */
    private final String f114637d;

    /* renamed from: e */
    private final String f114638e;
    @Nullable

    /* renamed from: f */
    private final String f114639f;

    private C43806f(String str, String str2, String str3, @Nullable String str4) {
        this.f114636c = str;
        this.f114637d = str2;
        this.f114638e = str3;
        this.f114639f = str4;
    }

    @Nullable
    /* renamed from: a */
    public static C43806f m4959a(String str) {
        Matcher matcher = f114634a.matcher(str);
        if (!matcher.lookingAt()) {
            return null;
        }
        String group = matcher.group(1);
        Locale locale = Locale.US;
        String lowerCase = group.toLowerCase(locale);
        String lowerCase2 = matcher.group(2).toLowerCase(locale);
        Matcher matcher2 = f114635b.matcher(str);
        String str2 = null;
        for (int end = matcher.end(); end < str.length(); end = matcher2.end()) {
            matcher2.region(end, str.length());
            if (!matcher2.lookingAt()) {
                return null;
            }
            String group2 = matcher2.group(1);
            if (group2 != null && group2.equalsIgnoreCase(C20517nb.f52166M)) {
                String group3 = matcher2.group(2);
                if (group3 != null) {
                    if (group3.startsWith("'") && group3.endsWith("'") && group3.length() > 2) {
                        group3 = group3.substring(1, group3.length() - 1);
                    }
                } else {
                    group3 = matcher2.group(3);
                }
                if (str2 != null && !group3.equalsIgnoreCase(str2)) {
                    return null;
                }
                str2 = group3;
            }
        }
        return new C43806f(str, lowerCase, lowerCase2, str2);
    }

    public final boolean equals(@Nullable Object obj) {
        if ((obj instanceof C43806f) && ((C43806f) obj).f114636c.equals(this.f114636c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f114636c.hashCode();
    }

    public final String toString() {
        return this.f114636c;
    }
}
