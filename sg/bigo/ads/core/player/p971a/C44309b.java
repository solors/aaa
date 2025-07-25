package sg.bigo.ads.core.player.p971a;

import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import sg.bigo.ads.common.C43718m;
import sg.bigo.ads.common.p932t.C43782a;

/* renamed from: sg.bigo.ads.core.player.a.b */
/* loaded from: classes10.dex */
final class C44309b {

    /* renamed from: d */
    private static final Pattern f116312d = Pattern.compile("[R,r]ange:[ ]?bytes=(\\d*)-");

    /* renamed from: e */
    private static final Pattern f116313e = Pattern.compile("GET /(.*) HTTP");

    /* renamed from: a */
    public final String f116314a;

    /* renamed from: b */
    public final long f116315b;

    /* renamed from: c */
    public final boolean f116316c;

    private C44309b(String str) {
        long j;
        boolean z;
        String str2;
        C43718m.m5142a(str);
        Matcher matcher = f116312d.matcher(str);
        if (matcher.find()) {
            j = Long.parseLong(matcher.group(1));
        } else {
            j = -1;
        }
        this.f116315b = Math.max(0L, j);
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        this.f116316c = z;
        Matcher matcher2 = f116313e.matcher(str);
        if (matcher2.find()) {
            str2 = matcher2.group(1);
        } else {
            str2 = new String();
        }
        this.f116314a = str2;
    }

    /* renamed from: a */
    public static C44309b m3418a(InputStream inputStream) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
            StringBuilder sb2 = new StringBuilder();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (!TextUtils.isEmpty(readLine)) {
                    sb2.append(readLine);
                    sb2.append('\n');
                } else {
                    C43782a.m5010a(0, 3, "ProxyCache", "GetRequest stringRequest=" + sb2.toString());
                    return new C44309b(sb2.toString());
                }
            }
        } catch (IOException e) {
            C43782a.m5009a(0, "ProxyCache", "GetRequest#read, error message is : " + e.toString());
            return null;
        }
    }

    public final String toString() {
        return "GetRequest{rangeOffset=" + this.f116315b + ", partial=" + this.f116316c + ", uri='" + this.f116314a + "'}";
    }
}
