package p872s2;

import com.helpshift.log.HSLogger;
import java.util.Map;
import p809o2.HelpshiftAuthenticationFailureReason;
import p809o2.HelpshiftEventsListener;
import p977t2.HSThreadingService;

/* renamed from: s2.e */
/* loaded from: classes5.dex */
public class HSEventProxy {

    /* renamed from: a */
    private HelpshiftEventsListener f104056a;

    /* renamed from: b */
    private final HSThreadingService f104057b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: HSEventProxy.java */
    /* renamed from: s2.e$a */
    /* loaded from: classes5.dex */
    public class RunnableC39598a implements Runnable {

        /* renamed from: b */
        final /* synthetic */ String f104058b;

        /* renamed from: c */
        final /* synthetic */ Map f104059c;

        RunnableC39598a(String str, Map map) {
            this.f104058b = str;
            this.f104059c = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (HSEventProxy.this.f104056a == null) {
                return;
            }
            HSEventProxy.this.f104056a.mo13954a(this.f104058b, this.f104059c);
        }
    }

    /* compiled from: HSEventProxy.java */
    /* renamed from: s2.e$b */
    /* loaded from: classes5.dex */
    class RunnableC39599b implements Runnable {

        /* renamed from: b */
        final /* synthetic */ String f104061b;

        RunnableC39599b(String str) {
            this.f104061b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (HSEventProxy.this.f104056a == null) {
                return;
            }
            HelpshiftAuthenticationFailureReason helpshiftAuthenticationFailureReason = HelpshiftAuthenticationFailureReason.UNKNOWN;
            if ("missing user auth token".equals(this.f104061b)) {
                helpshiftAuthenticationFailureReason = HelpshiftAuthenticationFailureReason.REASON_AUTH_TOKEN_NOT_PROVIDED;
            } else if ("invalid user auth token".equals(this.f104061b)) {
                helpshiftAuthenticationFailureReason = HelpshiftAuthenticationFailureReason.REASON_INVALID_AUTH_TOKEN;
            }
            HSEventProxy.this.f104056a.mo13953b(helpshiftAuthenticationFailureReason);
        }
    }

    public HSEventProxy(HSThreadingService hSThreadingService) {
        this.f104057b = hSThreadingService;
    }

    /* renamed from: b */
    public void m12163b(String str) {
        HSLogger.m65441d("HSEvntPrxy", "Authentication failure, reason: " + str);
        this.f104057b.m3279d(new RunnableC39599b(str));
    }

    /* renamed from: c */
    public void m12162c(String str, Map<String, Object> map) {
        HSLogger.m65441d("HSEvntPrxy", "Event occurred: " + str);
        this.f104057b.m3279d(new RunnableC39598a(str, map));
    }

    /* renamed from: d */
    public void m12161d(HelpshiftEventsListener helpshiftEventsListener) {
        this.f104056a = helpshiftEventsListener;
    }
}
