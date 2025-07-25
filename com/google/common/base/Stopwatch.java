package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.concurrent.TimeUnit;

@GwtCompatible(emulated = true)
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
public final class Stopwatch {

    /* renamed from: a */
    private final Ticker f39462a;

    /* renamed from: b */
    private boolean f39463b;

    /* renamed from: c */
    private long f39464c;

    /* renamed from: d */
    private long f39465d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.common.base.Stopwatch$1 */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class C166701 {

        /* renamed from: a */
        static final /* synthetic */ int[] f39466a;

        static {
            int[] iArr = new int[TimeUnit.values().length];
            f39466a = iArr;
            try {
                iArr[TimeUnit.NANOSECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f39466a[TimeUnit.MICROSECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f39466a[TimeUnit.MILLISECONDS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f39466a[TimeUnit.SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f39466a[TimeUnit.MINUTES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f39466a[TimeUnit.HOURS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f39466a[TimeUnit.DAYS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    Stopwatch() {
        this.f39462a = Ticker.systemTicker();
    }

    /* renamed from: a */
    private static String m70006a(TimeUnit timeUnit) {
        switch (C166701.f39466a[timeUnit.ordinal()]) {
            case 1:
                return "ns";
            case 2:
                return "μs";
            case 3:
                return "ms";
            case 4:
                return "s";
            case 5:
                return "min";
            case 6:
                return "h";
            case 7:
                return "d";
            default:
                throw new AssertionError();
        }
    }

    /* renamed from: b */
    private static TimeUnit m70005b(long j) {
        TimeUnit timeUnit = TimeUnit.DAYS;
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        if (timeUnit.convert(j, timeUnit2) > 0) {
            return timeUnit;
        }
        TimeUnit timeUnit3 = TimeUnit.HOURS;
        if (timeUnit3.convert(j, timeUnit2) > 0) {
            return timeUnit3;
        }
        TimeUnit timeUnit4 = TimeUnit.MINUTES;
        if (timeUnit4.convert(j, timeUnit2) > 0) {
            return timeUnit4;
        }
        TimeUnit timeUnit5 = TimeUnit.SECONDS;
        if (timeUnit5.convert(j, timeUnit2) > 0) {
            return timeUnit5;
        }
        TimeUnit timeUnit6 = TimeUnit.MILLISECONDS;
        if (timeUnit6.convert(j, timeUnit2) > 0) {
            return timeUnit6;
        }
        TimeUnit timeUnit7 = TimeUnit.MICROSECONDS;
        if (timeUnit7.convert(j, timeUnit2) > 0) {
            return timeUnit7;
        }
        return timeUnit2;
    }

    /* renamed from: c */
    private long m70004c() {
        if (this.f39463b) {
            return (this.f39462a.read() - this.f39465d) + this.f39464c;
        }
        return this.f39464c;
    }

    public static Stopwatch createStarted() {
        return new Stopwatch().start();
    }

    public static Stopwatch createUnstarted() {
        return new Stopwatch();
    }

    public long elapsed(TimeUnit timeUnit) {
        return timeUnit.convert(m70004c(), TimeUnit.NANOSECONDS);
    }

    public boolean isRunning() {
        return this.f39463b;
    }

    @CanIgnoreReturnValue
    public Stopwatch reset() {
        this.f39464c = 0L;
        this.f39463b = false;
        return this;
    }

    @CanIgnoreReturnValue
    public Stopwatch start() {
        Preconditions.checkState(!this.f39463b, "This stopwatch is already running.");
        this.f39463b = true;
        this.f39465d = this.f39462a.read();
        return this;
    }

    @CanIgnoreReturnValue
    public Stopwatch stop() {
        long read = this.f39462a.read();
        Preconditions.checkState(this.f39463b, "This stopwatch is already stopped.");
        this.f39463b = false;
        this.f39464c += read - this.f39465d;
        return this;
    }

    public String toString() {
        long m70004c = m70004c();
        TimeUnit m70005b = m70005b(m70004c);
        String m70050c = Platform.m70050c(m70004c / TimeUnit.NANOSECONDS.convert(1L, m70005b));
        String m70006a = m70006a(m70005b);
        StringBuilder sb2 = new StringBuilder(String.valueOf(m70050c).length() + 1 + String.valueOf(m70006a).length());
        sb2.append(m70050c);
        sb2.append(" ");
        sb2.append(m70006a);
        return sb2.toString();
    }

    public static Stopwatch createStarted(Ticker ticker) {
        return new Stopwatch(ticker).start();
    }

    public static Stopwatch createUnstarted(Ticker ticker) {
        return new Stopwatch(ticker);
    }

    Stopwatch(Ticker ticker) {
        this.f39462a = (Ticker) Preconditions.checkNotNull(ticker, "ticker");
    }
}
