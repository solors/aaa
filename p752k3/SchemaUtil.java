package p752k3;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import p809o2.HelpshiftInstallException;

/* renamed from: k3.k */
/* loaded from: classes5.dex */
public class SchemaUtil {

    /* renamed from: a */
    private static final Pattern f98662a = Pattern.compile("^[\\p{L}\\p{N}-]+_platform_\\d{17}-[0-9a-z]{15}$");

    /* renamed from: a */
    private static boolean m18243a(String str) {
        if (C37383m.m18236d(str)) {
            return false;
        }
        List asList = Arrays.asList(str.trim().split("\\."));
        if (asList.size() < 3 || asList.contains("")) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m18242b(String str, String str2) throws HelpshiftInstallException {
        if (m18243a(str)) {
            if (m18241c(str2)) {
                return true;
            }
            throw new HelpshiftInstallException("The platform id used in the Helpshift.install() is not valid!");
        }
        throw new HelpshiftInstallException("The domain name used in the Helpshift.install() is not valid!");
    }

    /* renamed from: c */
    private static boolean m18241c(String str) {
        if (C37383m.m18233g(str) && f98662a.matcher(str.trim()).matches()) {
            return true;
        }
        return false;
    }
}
