package com.ironsource;

import android.net.Uri;
import android.util.Pair;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ironsource.ff */
/* loaded from: classes6.dex */
public class C19916ff {

    /* renamed from: a */
    private static final String f50086a = "POST";

    /* renamed from: b */
    private static final String f50087b = "GET";

    /* renamed from: c */
    private static final String f50088c = "ISHttpService";

    /* renamed from: com.ironsource.ff$a */
    /* loaded from: classes6.dex */
    public static class C19917a {

        /* renamed from: h */
        private static final int f50089h = 15000;

        /* renamed from: i */
        private static final int f50090i = 15000;

        /* renamed from: j */
        private static final String f50091j = "UTF-8";

        /* renamed from: a */
        final String f50092a;

        /* renamed from: b */
        final String f50093b;

        /* renamed from: c */
        final String f50094c;

        /* renamed from: d */
        final int f50095d;

        /* renamed from: e */
        final int f50096e;

        /* renamed from: f */
        final String f50097f;

        /* renamed from: g */
        ArrayList<Pair<String, String>> f50098g;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.ironsource.ff$a$a */
        /* loaded from: classes6.dex */
        public static class C19918a {

            /* renamed from: b */
            String f50100b;

            /* renamed from: d */
            String f50102d;

            /* renamed from: a */
            List<Pair<String, String>> f50099a = new ArrayList();

            /* renamed from: c */
            String f50101c = "POST";

            /* renamed from: e */
            int f50103e = 15000;

            /* renamed from: f */
            int f50104f = 15000;

            /* renamed from: g */
            String f50105g = "UTF-8";

            C19918a() {
            }

            /* renamed from: a */
            C19918a m58578a(int i) {
                this.f50103e = i;
                return this;
            }

            /* renamed from: b */
            C19918a m58574b(int i) {
                this.f50104f = i;
                return this;
            }

            /* renamed from: c */
            C19918a m58572c(String str) {
                this.f50100b = str;
                return this;
            }

            /* renamed from: d */
            C19918a m58571d(String str) {
                this.f50101c = str;
                return this;
            }

            /* renamed from: a */
            C19918a m58577a(Pair<String, String> pair) {
                this.f50099a.add(pair);
                return this;
            }

            /* renamed from: b */
            C19918a m58573b(String str) {
                this.f50105g = str;
                return this;
            }

            /* renamed from: a */
            C19918a m58576a(String str) {
                this.f50102d = str;
                return this;
            }

            /* renamed from: a */
            C19918a m58575a(List<Pair<String, String>> list) {
                this.f50099a.addAll(list);
                return this;
            }

            /* renamed from: a */
            C19917a m58579a() {
                return new C19917a(this);
            }
        }

        public C19917a(C19918a c19918a) {
            this.f50092a = c19918a.f50100b;
            this.f50093b = c19918a.f50101c;
            this.f50094c = c19918a.f50102d;
            this.f50098g = new ArrayList<>(c19918a.f50099a);
            this.f50095d = c19918a.f50103e;
            this.f50096e = c19918a.f50104f;
            this.f50097f = c19918a.f50105g;
        }

        /* renamed from: a */
        boolean m58580a() {
            return "POST".equals(this.f50093b);
        }
    }

    /* renamed from: a */
    public static C21144vo m58586a(String str, String str2, List<Pair<String, String>> list) throws Exception {
        Uri build = Uri.parse(str).buildUpon().encodedQuery(str2).build();
        C19917a.C19918a c19918a = new C19917a.C19918a();
        c19918a.m58572c(build.toString()).m58576a(str2).m58571d("GET").m58575a(list);
        return m58582b(c19918a.m58579a());
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0068, code lost:
        r6 = r3.getResponseCode();
        r2.f54231a = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0070, code lost:
        if (r6 < 400) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0072, code lost:
        android.util.Log.d(com.ironsource.C19916ff.f50088c, "Failed post to " + r9.f50092a + " StatusCode: " + r2.f54231a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0090, code lost:
        if (r4 == null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0092, code lost:
        r8 = r4;
        r4 = r3;
        r3 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0095, code lost:
        r3.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0099, code lost:
        r4 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009a, code lost:
        r4.disconnect();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x009d, code lost:
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0032, code lost:
        if (r3 != null) goto L15;
     */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x00a0: MOVE  (r8 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]), block:B:42:0x00a0 */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.ironsource.C21144vo m58582b(com.ironsource.C19916ff.C19917a r9) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 221
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.C19916ff.m58582b(com.ironsource.ff$a):com.ironsource.vo");
    }

    /* renamed from: a */
    private static HttpURLConnection m58588a(C19917a c19917a) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(c19917a.f50092a).openConnection();
        httpURLConnection.setConnectTimeout(c19917a.f50095d);
        httpURLConnection.setReadTimeout(c19917a.f50096e);
        httpURLConnection.setRequestMethod(c19917a.f50093b);
        return httpURLConnection;
    }

    /* renamed from: b */
    public static C21144vo m58581b(String str, String str2, List<Pair<String, String>> list) throws Exception {
        C19917a.C19918a c19918a = new C19917a.C19918a();
        c19918a.m58572c(str).m58576a(str2).m58571d("POST").m58575a(list);
        return m58582b(c19918a.m58579a());
    }

    /* renamed from: a */
    private static void m58585a(HttpURLConnection httpURLConnection, C19917a c19917a) throws Exception {
        if (c19917a.m58580a()) {
            byte[] bytes = c19917a.f50094c.getBytes(c19917a.f50097f);
            httpURLConnection.setRequestProperty("Content-Length", Integer.toString(bytes.length));
            m58583a(httpURLConnection, bytes);
        }
    }

    /* renamed from: a */
    private static void m58584a(HttpURLConnection httpURLConnection, List<Pair<String, String>> list) throws ProtocolException {
        for (Pair<String, String> pair : list) {
            httpURLConnection.setRequestProperty((String) pair.first, (String) pair.second);
        }
    }

    /* renamed from: a */
    private static void m58583a(HttpURLConnection httpURLConnection, byte[] bArr) throws Exception {
        httpURLConnection.setDoOutput(true);
        DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
        try {
            dataOutputStream.write(bArr);
            dataOutputStream.flush();
        } finally {
            dataOutputStream.close();
        }
    }

    /* renamed from: a */
    private static boolean m58587a(String str, String str2) {
        return (str == null || str.isEmpty() || str2 == null || str2.isEmpty()) ? false : true;
    }
}
