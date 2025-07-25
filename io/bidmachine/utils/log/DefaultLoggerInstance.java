package io.bidmachine.utils.log;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.C21114v8;
import io.bidmachine.utils.lazy.LazyValue;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;

/* loaded from: classes9.dex */
public class DefaultLoggerInstance implements LoggerInstance {
    private static final int MAX_CHAR_COUNT = 1000;
    @NonNull
    private final String tag;

    public DefaultLoggerInstance(@NonNull String str) {
        this.tag = str;
    }

    @NonNull
    private static String buildStackTraceString(@NonNull Throwable th) {
        StringWriter stringWriter = new StringWriter(256);
        PrintWriter printWriter = new PrintWriter((Writer) stringWriter, false);
        th.printStackTrace(printWriter);
        printWriter.flush();
        return stringWriter.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @NonNull
    public String buildMessage(@Nullable Object obj, @Nullable String str, @Nullable LazyValue<String> lazyValue, @Nullable Throwable th) {
        StringBuilder sb2 = new StringBuilder();
        if (obj != null) {
            sb2.append(C21114v8.C21123i.f54137d);
            sb2.append(obj);
            sb2.append("] ");
        }
        if (str != null) {
            sb2.append(str);
        } else if (lazyValue != null) {
            sb2.append(lazyValue.get());
        }
        if (th != null) {
            if (sb2.length() != 0) {
                sb2.append("\n");
            }
            sb2.append(buildStackTraceString(th));
        }
        return sb2.toString();
    }

    @Override // io.bidmachine.utils.log.LoggerInstance
    /* renamed from: d */
    public void mo18984d(@NonNull Object obj, @NonNull String str) {
        prepareAndLog(3, obj, str, null, null);
    }

    @Override // io.bidmachine.utils.log.LoggerInstance
    /* renamed from: e */
    public void mo18980e(@NonNull Object obj, @NonNull String str) {
        prepareAndLog(6, obj, str, null, null);
    }

    protected boolean isLoggable(int i) {
        return true;
    }

    protected void log(int i, @NonNull String str) {
        if (str.length() > 1000) {
            int length = ((str.length() + 1000) - 1) / 1000;
            int i2 = 0;
            int i3 = 0;
            while (i2 < length) {
                int i4 = i3 + 1000;
                printLog(i, this.tag, str.substring(i3, Math.min(str.length(), i4)));
                i2++;
                i3 = i4;
            }
            return;
        }
        printLog(i, this.tag, str);
    }

    protected void prepareAndLog(int i, @Nullable Object obj, @Nullable String str, @Nullable LazyValue<String> lazyValue, @Nullable Throwable th) {
        if (isLoggable(i)) {
            log(i, buildMessage(obj, str, lazyValue, th));
        }
    }

    protected void printLog(int i, @NonNull String str, @NonNull String str2) {
        Log.println(i, str, str2);
    }

    @Override // io.bidmachine.utils.log.LoggerInstance
    /* renamed from: w */
    public void mo18976w(@NonNull Object obj, @NonNull String str) {
        prepareAndLog(5, obj, str, null, null);
    }

    @Override // io.bidmachine.utils.log.LoggerInstance
    /* renamed from: d */
    public void mo18983d(@NonNull String str) {
        prepareAndLog(3, null, str, null, null);
    }

    @Override // io.bidmachine.utils.log.LoggerInstance
    /* renamed from: e */
    public void mo18979e(@NonNull String str) {
        prepareAndLog(6, null, str, null, null);
    }

    @Override // io.bidmachine.utils.log.LoggerInstance
    /* renamed from: w */
    public void mo18975w(@NonNull String str) {
        prepareAndLog(5, null, str, null, null);
    }

    @Override // io.bidmachine.utils.log.LoggerInstance
    /* renamed from: d */
    public void mo18985d(@NonNull Object obj, @NonNull LazyValue<String> lazyValue) {
        prepareAndLog(3, obj, null, lazyValue, null);
    }

    @Override // io.bidmachine.utils.log.LoggerInstance
    /* renamed from: e */
    public void mo18981e(@NonNull Object obj, @NonNull LazyValue<String> lazyValue) {
        prepareAndLog(6, obj, null, lazyValue, null);
    }

    @Override // io.bidmachine.utils.log.LoggerInstance
    /* renamed from: w */
    public void mo18977w(@NonNull Object obj, @NonNull LazyValue<String> lazyValue) {
        prepareAndLog(5, obj, null, lazyValue, null);
    }

    @Override // io.bidmachine.utils.log.LoggerInstance
    /* renamed from: d */
    public void mo18986d(@NonNull LazyValue<String> lazyValue) {
        prepareAndLog(3, null, null, lazyValue, null);
    }

    @Override // io.bidmachine.utils.log.LoggerInstance
    /* renamed from: e */
    public void mo18982e(@NonNull LazyValue<String> lazyValue) {
        prepareAndLog(6, null, null, lazyValue, null);
    }

    @Override // io.bidmachine.utils.log.LoggerInstance
    /* renamed from: w */
    public void mo18978w(@NonNull LazyValue<String> lazyValue) {
        prepareAndLog(5, null, null, lazyValue, null);
    }

    @Override // io.bidmachine.utils.log.LoggerInstance
    /* renamed from: w */
    public void mo18974w(@NonNull Throwable th) {
        prepareAndLog(5, null, null, null, th);
    }
}
