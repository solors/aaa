package p993u4;

import com.ironsource.C21114v8;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Map;

/* renamed from: u4.j */
/* loaded from: classes6.dex */
public class HttpUtil {
    /* renamed from: a */
    public static String m3002a(InputStream inputStream) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8));
            StringBuilder sb2 = new StringBuilder();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                sb2.append(readLine);
                sb2.append("\n");
            }
            String sb3 = sb2.toString();
            bufferedReader.close();
            if (inputStream != null) {
                inputStream.close();
            }
            return sb3;
        } catch (Exception e) {
            C44433l.m2992f(e);
            return "";
        }
    }

    /* renamed from: b */
    public static String m3001b(String str, Map<String, String> map) {
        String str2;
        String sb2;
        if (str != null && map != null) {
            if (!str.contains("?")) {
                str2 = str + "?";
            } else {
                str2 = str + C21114v8.C21123i.f54135c;
            }
            StringBuilder sb3 = new StringBuilder(str2);
            for (String str3 : map.keySet()) {
                sb3.append(str3);
                sb3.append("=");
                sb3.append(map.get(str3));
                sb3.append(C21114v8.C21123i.f54135c);
            }
            return sb3.toString().substring(0, sb2.length() - 1);
        }
        return str;
    }
}
