package com.smaato.sdk.core.log;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.smaato.sdk.core.util.Objects;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.smaato.sdk.core.log.d */
/* loaded from: classes7.dex */
final class LoggerImpl implements Logger {
    @NonNull

    /* renamed from: d */
    private static final Map<LogDomain, String> f71649d;
    @NonNull

    /* renamed from: e */
    private static final String f71650e;
    @NonNull

    /* renamed from: f */
    private static final Pattern f71651f;
    @NonNull

    /* renamed from: a */
    private final List<LogWriter> f71652a = new ArrayList();
    @NonNull

    /* renamed from: b */
    private final ThreadLocal<String> f71653b = new ThreadLocal<>();
    @NonNull

    /* renamed from: c */
    private final EnumC27168a f71654c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LoggerImpl.java */
    /* renamed from: com.smaato.sdk.core.log.d$a */
    /* loaded from: classes7.dex */
    public enum EnumC27168a {
        DEBUG,
        RELEASE
    }

    static {
        HashMap hashMap = new HashMap();
        f71649d = hashMap;
        f71650e = LoggerImpl.class.getName();
        f71651f = Pattern.compile("(\\$\\d+)+$");
        hashMap.put(LogDomain.CORE, "core");
        hashMap.put(LogDomain.AD, "ad");
        hashMap.put(LogDomain.API, "api");
        hashMap.put(LogDomain.NETWORK, "network");
        hashMap.put(LogDomain.LOGGER, "log");
        hashMap.put(LogDomain.WIDGET, "widget");
        hashMap.put(LogDomain.BROWSER, "browser");
        hashMap.put(LogDomain.APP_CONFIG_CHECK, "appconfigcheck");
        hashMap.put(LogDomain.DATA_COLLECTOR, "datacollector");
        hashMap.put(LogDomain.VAST, "vast");
        hashMap.put(LogDomain.INTERSTITIAL, "interstitial");
        hashMap.put(LogDomain.RICH_MEDIA, "richmedia");
        hashMap.put(LogDomain.MRAID, "mraid");
        hashMap.put(LogDomain.UNIFIED_BIDDING, "ub");
        hashMap.put(LogDomain.CMP, "cmp");
        hashMap.put(LogDomain.NATIVE, "nativead");
        hashMap.put(LogDomain.ADMOB, "admob");
        hashMap.put(LogDomain.VIDEO, "video");
        hashMap.put(LogDomain.REWARDED, "rewarded");
        hashMap.put(LogDomain.INAPP_BIDDING, "iahb");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public LoggerImpl(@NonNull EnumC27168a enumC27168a) {
        this.f71654c = (EnumC27168a) Objects.requireNonNull(enumC27168a, "Parameter environment cannot be null for LoggerImpl::new");
    }

    /* renamed from: b */
    private void m39491b(@NonNull LogDomain logDomain, @NonNull String str) {
        String[] split;
        for (String str2 : str.split("\\.")) {
            String str3 = f71649d.get(logDomain);
            if (str3 == null) {
                m39480m(LogLevel.ERROR, m39487f(LogDomain.LOGGER) + ("Unknown LogDomain (" + logDomain + ") is not found in LOG_DOMAIN_TO_PACKAGE_NAME_MAP"), m39486g());
                return;
            } else if (str3.equals(str2)) {
                return;
            }
        }
        m39480m(LogLevel.ERROR, m39487f(LogDomain.LOGGER) + ("LogDomain = " + logDomain.name() + " was not found in a caller classpath: " + str + ". Looks like an inappropriate LogDomain is used."), m39486g());
    }

    @Nullable
    /* renamed from: c */
    private StackTraceElement m39490c() {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        if (stackTrace.length <= 4) {
            error(LogDomain.LOGGER, new IllegalStateException("Not enough stacktrace elements: might be a proguard issue"), "Synthetic stack trace", new Object[0]);
            return null;
        }
        return stackTrace[4];
    }

    @NonNull
    /* renamed from: d */
    private String m39489d(@NonNull String str, @Nullable Object[] objArr) {
        Objects.requireNonNull(str);
        return String.format(str, objArr);
    }

    @NonNull
    /* renamed from: e */
    private String m39488e(@NonNull StackTraceElement stackTraceElement) {
        Objects.requireNonNull(stackTraceElement);
        String className = stackTraceElement.getClassName();
        Matcher matcher = f71651f.matcher(className);
        if (matcher.find()) {
            return matcher.replaceAll("");
        }
        return className;
    }

    @NonNull
    /* renamed from: g */
    private String m39486g() {
        return "SmaatoSDK: ";
    }

    @Nullable
    /* renamed from: i */
    private String m39484i() {
        String str = this.f71653b.get();
        if (str != null) {
            this.f71653b.remove();
            return str;
        }
        StackTraceElement m39490c = m39490c();
        if (m39490c != null) {
            return m39483j(m39490c);
        }
        return f71650e;
    }

    @NonNull
    /* renamed from: j */
    private String m39483j(@NonNull StackTraceElement stackTraceElement) {
        Objects.requireNonNull(stackTraceElement);
        String m39488e = m39488e(stackTraceElement);
        return m39488e.substring(m39488e.lastIndexOf(46) + 1);
    }

    /* renamed from: k */
    private void m39482k(@NonNull LogLevel logLevel, @NonNull LogDomain logDomain, @Nullable Throwable th, @NonNull String str, @Nullable Object... objArr) {
        boolean z;
        String str2;
        Objects.requireNonNull(logLevel);
        Objects.requireNonNull(logDomain);
        Objects.requireNonNull(str);
        String m39486g = m39486g();
        String m39487f = m39487f(logDomain);
        if (this.f71654c == EnumC27168a.DEBUG) {
            m39487f = m39487f + m39484i() + ": ";
            m39481l(logDomain);
        }
        Iterator<LogWriter> it = this.f71652a.iterator();
        while (true) {
            if (it.hasNext()) {
                if (it.next().mo39496b(logLevel)) {
                    z = true;
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        if (!z) {
            return;
        }
        if (str.length() == 0) {
            if (th == null) {
                return;
            }
            str2 = m39485h(th);
        } else {
            if (objArr != null && objArr.length > 0) {
                str = m39489d(str, objArr);
            }
            if (th != null) {
                str2 = str + "\n" + m39485h(th);
            } else {
                str2 = str;
            }
        }
        m39480m(logLevel, m39487f + str2, m39486g);
    }

    /* renamed from: l */
    private void m39481l(@NonNull LogDomain logDomain) {
        StackTraceElement m39490c = m39490c();
        if (m39490c != null) {
            String m39488e = m39488e(m39490c);
            m39491b(logDomain, m39488e.substring(0, m39488e.lastIndexOf(46)));
        }
    }

    /* renamed from: m */
    private void m39480m(@NonNull LogLevel logLevel, @NonNull String str, @NonNull String str2) {
        for (LogWriter logWriter : this.f71652a) {
            if (logWriter.mo39496b(logLevel)) {
                logWriter.mo39495c(logLevel, str2, str);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m39492a(@NonNull LogWriter logWriter) {
        Objects.requireNonNull(logWriter);
        this.f71652a.add(logWriter);
    }

    @Override // com.smaato.sdk.core.log.Logger
    public void debug(@NonNull LogDomain logDomain, @NonNull String str, @Nullable Object... objArr) {
        m39482k(LogLevel.DEBUG, logDomain, null, str, objArr);
    }

    @Override // com.smaato.sdk.core.log.Logger
    public void error(@NonNull LogDomain logDomain, @NonNull String str, @Nullable Object... objArr) {
        m39482k(LogLevel.ERROR, logDomain, null, str, objArr);
    }

    @NonNull
    @VisibleForTesting
    /* renamed from: f */
    String m39487f(@NonNull LogDomain logDomain) {
        return logDomain.name() + ": ";
    }

    @VisibleForTesting
    /* renamed from: h */
    String m39485h(@NonNull Throwable th) {
        Objects.requireNonNull(th);
        StringWriter stringWriter = new StringWriter(256);
        PrintWriter printWriter = new PrintWriter((Writer) stringWriter, false);
        th.printStackTrace(printWriter);
        printWriter.flush();
        return stringWriter.toString();
    }

    @Override // com.smaato.sdk.core.log.Logger
    public void info(@NonNull LogDomain logDomain, @NonNull String str, @Nullable Object... objArr) {
        m39482k(LogLevel.INFO, logDomain, null, str, objArr);
    }

    @Override // com.smaato.sdk.core.log.Logger
    public void log(@NonNull LogLevel logLevel, @NonNull LogDomain logDomain, @NonNull String str, @Nullable Object... objArr) {
        m39482k(logLevel, logDomain, null, str, objArr);
    }

    @Override // com.smaato.sdk.core.log.Logger
    public void setExplicitOneShotTag(@NonNull String str) {
        Objects.requireNonNull(str);
        this.f71653b.set(str);
    }

    @Override // com.smaato.sdk.core.log.Logger
    public void warning(@NonNull LogDomain logDomain, @NonNull String str, @Nullable Object... objArr) {
        m39482k(LogLevel.WARNING, logDomain, null, str, objArr);
    }

    @Override // com.smaato.sdk.core.log.Logger
    public void debug(@NonNull LogDomain logDomain, @NonNull Throwable th, @NonNull String str, @Nullable Object... objArr) {
        m39482k(LogLevel.DEBUG, logDomain, th, str, objArr);
    }

    @Override // com.smaato.sdk.core.log.Logger
    public void error(@NonNull LogDomain logDomain, @NonNull Throwable th, @NonNull String str, @Nullable Object... objArr) {
        m39482k(LogLevel.ERROR, logDomain, th, str, objArr);
    }

    @Override // com.smaato.sdk.core.log.Logger
    public void info(@NonNull LogDomain logDomain, @NonNull Throwable th, @NonNull String str, @Nullable Object... objArr) {
        m39482k(LogLevel.INFO, logDomain, th, str, objArr);
    }

    @Override // com.smaato.sdk.core.log.Logger
    public void log(@NonNull LogLevel logLevel, @NonNull LogDomain logDomain, @NonNull Throwable th, @NonNull String str, @Nullable Object... objArr) {
        m39482k(logLevel, logDomain, th, str, objArr);
    }

    @Override // com.smaato.sdk.core.log.Logger
    public void warning(@NonNull LogDomain logDomain, @NonNull Throwable th, @NonNull String str, @Nullable Object... objArr) {
        m39482k(LogLevel.WARNING, logDomain, th, str, objArr);
    }
}
