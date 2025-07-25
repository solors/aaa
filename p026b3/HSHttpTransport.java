package p026b3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import javax.net.ssl.HttpsURLConnection;
import p752k3.C37383m;

/* renamed from: b3.f */
/* loaded from: classes5.dex */
public class HSHttpTransport implements HTTPTransport {
    /* renamed from: d */
    private String m103965d(InputStream inputStream) throws IOException {
        InputStreamReader inputStreamReader;
        Throwable th;
        BufferedReader bufferedReader;
        if (inputStream == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        try {
            inputStreamReader = new InputStreamReader(inputStream);
            try {
                bufferedReader = new BufferedReader(inputStreamReader);
                while (true) {
                    try {
                        String readLine = bufferedReader.readLine();
                        if (readLine != null) {
                            sb2.append(readLine);
                        } else {
                            C37383m.m18238b(bufferedReader);
                            C37383m.m18238b(inputStreamReader);
                            return sb2.toString();
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        C37383m.m18238b(bufferedReader);
                        C37383m.m18238b(inputStreamReader);
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                bufferedReader = null;
            }
        } catch (Throwable th4) {
            inputStreamReader = null;
            th = th4;
            bufferedReader = null;
        }
    }

    /* JADX WARN: Not initialized variable reg: 11, insn: 0x041c: MOVE  (r5 I:??[OBJECT, ARRAY]) = (r11 I:??[OBJECT, ARRAY]), block:B:249:0x041a */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x041b: MOVE  (r6 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]), block:B:249:0x041a */
    /* JADX WARN: Removed duplicated region for block: B:253:0x042b A[Catch: Exception -> 0x042f, TRY_LEAVE, TryCatch #40 {Exception -> 0x042f, blocks: (B:251:0x0426, B:253:0x042b), top: B:266:0x0426 }] */
    @Override // p026b3.HTTPTransport
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public p026b3.HSResponse mo103955a(p026b3.HSRequest r20) {
        /*
            Method dump skipped, instructions count: 1077
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p026b3.HSHttpTransport.mo103955a(b3.h):b3.j");
    }

    /* renamed from: b */
    private void m103967b(HttpsURLConnection httpsURLConnection) {
    }

    /* renamed from: c */
    private void m103966c(HttpsURLConnection httpsURLConnection) {
    }
}
