package p690h0;

import android.util.Log;
import com.airbnb.lottie.L;
import com.airbnb.lottie.LottieLogger;
import java.util.HashSet;
import java.util.Set;

/* renamed from: h0.e */
/* loaded from: classes2.dex */
public class LogcatLogger implements LottieLogger {

    /* renamed from: a */
    private static final Set<String> f91286a = new HashSet();

    @Override // com.airbnb.lottie.LottieLogger
    /* renamed from: a */
    public void mo23908a(String str) {
        mo23906c(str, null);
    }

    @Override // com.airbnb.lottie.LottieLogger
    /* renamed from: b */
    public void mo23907b(String str, Throwable th) {
        if (L.f2111a) {
            Log.d("LOTTIE", str, th);
        }
    }

    @Override // com.airbnb.lottie.LottieLogger
    /* renamed from: c */
    public void mo23906c(String str, Throwable th) {
        Set<String> set = f91286a;
        if (set.contains(str)) {
            return;
        }
        Log.w("LOTTIE", str, th);
        set.add(str);
    }

    @Override // com.airbnb.lottie.LottieLogger
    /* renamed from: d */
    public void mo23905d(String str) {
        m23904e(str, null);
    }

    /* renamed from: e */
    public void m23904e(String str, Throwable th) {
        if (L.f2111a) {
            Log.d("LOTTIE", str, th);
        }
    }
}
