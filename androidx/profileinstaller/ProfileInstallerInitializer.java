package androidx.profileinstaller;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.profileinstaller.ProfileInstallerInitializer;
import androidx.startup.Initializer;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class ProfileInstallerInitializer implements Initializer<Result> {
    private static final int DELAY_MS = 5000;

    @RequiresApi(16)
    /* loaded from: classes2.dex */
    public static class Choreographer16Impl {
        private Choreographer16Impl() {
        }

        /* renamed from: a */
        public static /* synthetic */ void m104114a(Runnable runnable, long j) {
            runnable.run();
        }

        @DoNotInline
        public static void postFrameCallback(final Runnable runnable) {
            Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback() { // from class: androidx.profileinstaller.g
                @Override // android.view.Choreographer.FrameCallback
                public final void doFrame(long j) {
                    ProfileInstallerInitializer.Choreographer16Impl.m104114a(runnable, j);
                }
            });
        }
    }

    @RequiresApi(28)
    /* loaded from: classes2.dex */
    public static class Handler28Impl {
        private Handler28Impl() {
        }

        @DoNotInline
        public static Handler createAsync(Looper looper) {
            Handler createAsync;
            createAsync = Handler.createAsync(looper);
            return createAsync;
        }
    }

    /* loaded from: classes2.dex */
    public static class Result {
    }

    /* renamed from: a */
    public static /* synthetic */ void m104117a(ProfileInstallerInitializer profileInstallerInitializer, Context context) {
        profileInstallerInitializer.lambda$delayAfterFirstFrame$0(context);
    }

    /* renamed from: b */
    public static /* synthetic */ void m104116b(Context context) {
        writeInBackground(context);
    }

    /* renamed from: c */
    public static /* synthetic */ void m104115c(Context context) {
        ProfileInstaller.writeProfile(context);
    }

    public static void writeInBackground(@NonNull final Context context) {
        new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new Runnable() { // from class: androidx.profileinstaller.f
            @Override // java.lang.Runnable
            public final void run() {
                ProfileInstallerInitializer.m104115c(context);
            }
        });
    }

    @RequiresApi(16)
    void delayAfterFirstFrame(@NonNull final Context context) {
        Choreographer16Impl.postFrameCallback(new Runnable() { // from class: androidx.profileinstaller.e
            @Override // java.lang.Runnable
            public final void run() {
                ProfileInstallerInitializer.m104117a(ProfileInstallerInitializer.this, context);
            }
        });
    }

    @Override // androidx.startup.Initializer
    @NonNull
    public List<Class<? extends Initializer<?>>> dependencies() {
        return Collections.emptyList();
    }

    /* renamed from: installAfterDelay */
    public void lambda$delayAfterFirstFrame$0(@NonNull final Context context) {
        Handler handler;
        if (Build.VERSION.SDK_INT >= 28) {
            handler = Handler28Impl.createAsync(Looper.getMainLooper());
        } else {
            handler = new Handler(Looper.getMainLooper());
        }
        handler.postDelayed(new Runnable() { // from class: androidx.profileinstaller.d
            @Override // java.lang.Runnable
            public final void run() {
                ProfileInstallerInitializer.m104116b(context);
            }
        }, new Random().nextInt(Math.max(1000, 1)) + 5000);
    }

    @Override // androidx.startup.Initializer
    @NonNull
    public Result create(@NonNull Context context) {
        delayAfterFirstFrame(context.getApplicationContext());
        return new Result();
    }
}
