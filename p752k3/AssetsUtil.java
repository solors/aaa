package p752k3;

import android.content.Context;
import android.content.res.Resources;
import android.util.Log;
import androidx.annotation.Nullable;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;

/* renamed from: k3.c */
/* loaded from: classes5.dex */
public class AssetsUtil {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.io.Closeable, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.io.Closeable] */
    /* renamed from: a */
    public static String m18264a(Context context, String str) {
        ?? r6;
        BufferedReader bufferedReader;
        IOException e;
        StringBuilder sb2;
        if (context == 0) {
            return "";
        }
        Closeable closeable = null;
        try {
            try {
                sb2 = new StringBuilder();
                context = context.getAssets().open(str);
            } catch (IOException e2) {
                bufferedReader = null;
                e = e2;
                context = 0;
            } catch (Throwable th) {
                th = th;
                r6 = 0;
                C37383m.m18238b(closeable);
                C37383m.m18238b(r6);
                throw th;
            }
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(context));
                while (true) {
                    try {
                        String readLine = bufferedReader.readLine();
                        if (readLine != null) {
                            sb2.append(readLine);
                        } else {
                            String sb3 = sb2.toString();
                            C37383m.m18238b(context);
                            C37383m.m18238b(bufferedReader);
                            return sb3;
                        }
                    } catch (IOException e3) {
                        e = e3;
                        Log.e("astsUtl", "Error in reading the file contents", e);
                        C37383m.m18238b(context);
                        C37383m.m18238b(bufferedReader);
                        return "";
                    }
                }
            } catch (IOException e4) {
                e = e4;
                bufferedReader = null;
            } catch (Throwable th2) {
                th = th2;
                str = null;
                closeable = context;
                r6 = str;
                C37383m.m18238b(closeable);
                C37383m.m18238b(r6);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Nullable
    /* renamed from: b */
    public static boolean m18263b(Context context, int i) {
        if (context == null || i == 0) {
            return false;
        }
        try {
            if (context.getResources().getResourceName(i) == null) {
                return false;
            }
            return true;
        } catch (Resources.NotFoundException unused) {
            return false;
        }
    }
}
