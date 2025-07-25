package p024b1;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: b1.c */
/* loaded from: classes3.dex */
public abstract class AbstractC3343c {

    /* renamed from: a */
    public static final ThreadPoolExecutor f1549a;

    /* renamed from: b */
    public static final Handler f1550b = new Handler(Looper.getMainLooper());

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 2, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(5), new ThreadFactoryC3341a(), new RejectedExecutionHandlerC3342b());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f1549a = threadPoolExecutor;
    }
}
