package kotlinx.coroutines.android;

import android.os.Build;
import java.lang.Thread;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.CoroutineContextImpl;
import kotlinx.coroutines.InterfaceC37764l0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AndroidExceptionPreHandler.kt */
@Metadata
/* loaded from: classes7.dex */
public final class AndroidExceptionPreHandler extends CoroutineContextImpl implements InterfaceC37764l0 {
    @Nullable
    private volatile Object _preHandler;

    public AndroidExceptionPreHandler() {
        super(InterfaceC37764l0.f99607a8);
        this._preHandler = this;
    }

    private final Method preHandler() {
        Object obj = this._preHandler;
        if (obj != this) {
            return (Method) obj;
        }
        Method method = null;
        try {
            boolean z = false;
            Method declaredMethod = Thread.class.getDeclaredMethod("getUncaughtExceptionPreHandler", new Class[0]);
            if (Modifier.isPublic(declaredMethod.getModifiers())) {
                if (Modifier.isStatic(declaredMethod.getModifiers())) {
                    z = true;
                }
            }
            if (z) {
                method = declaredMethod;
            }
        } catch (Throwable unused) {
        }
        this._preHandler = method;
        return method;
    }

    @Override // kotlinx.coroutines.InterfaceC37764l0
    public void handleException(@NotNull CoroutineContext coroutineContext, @NotNull Throwable th) {
        boolean z;
        Object obj;
        int i = Build.VERSION.SDK_INT;
        if (26 <= i && i < 28) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            Method preHandler = preHandler();
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = null;
            if (preHandler != null) {
                obj = preHandler.invoke(null, new Object[0]);
            } else {
                obj = null;
            }
            if (obj instanceof Thread.UncaughtExceptionHandler) {
                uncaughtExceptionHandler = (Thread.UncaughtExceptionHandler) obj;
            }
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th);
            }
        }
    }
}
