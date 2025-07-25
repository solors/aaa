package com.amazon.p047a.p048a.p061i;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.amazon.p047a.p048a.p049a.ContextManager;
import com.amazon.p047a.p048a.p061i.PromptContent;
import com.amazon.p047a.p048a.p061i.SimplePrompt;
import com.amazon.p047a.p048a.p063k.Resource;
import com.amazon.p047a.p048a.p065m.KiwiDataStore;
import com.amazon.p047a.p048a.p071o.KiwiLogger;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Locale;

/* renamed from: com.amazon.a.a.i.g */
/* loaded from: classes2.dex */
public class ShutdownPrompt extends SimplePrompt {

    /* renamed from: b */
    public static final long f2461b = 31536000;

    /* renamed from: e */
    private static final KiwiLogger f2462e = new KiwiLogger("ShutdownPrompt");

    /* renamed from: f */
    private static final String f2463f = "https://www.amazon.com/appstore-error-help";

    /* renamed from: g */
    private static final String f2464g = "badcert";

    /* renamed from: h */
    private static final String f2465h = "1.1";
    @Resource

    /* renamed from: i */
    private ContextManager f2466i;
    @Resource

    /* renamed from: j */
    private KiwiDataStore f2467j;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ShutdownPrompt.java */
    /* renamed from: com.amazon.a.a.i.g$a */
    /* loaded from: classes2.dex */
    public static class AsyncTaskC3536a extends AsyncTask<Void, Void, Void> {

        /* renamed from: a */
        private final ContextManager f2468a;

        @Override // android.os.AsyncTask
        /* renamed from: a */
        public Void doInBackground(Void... voidArr) {
            return null;
        }

        private AsyncTaskC3536a(ContextManager contextManager) {
            this.f2468a = contextManager;
        }

        @Override // android.os.AsyncTask
        /* renamed from: a */
        public void onPostExecute(Void r1) {
            ShutdownPrompt.m103060b(this.f2468a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ShutdownPrompt.java */
    /* renamed from: com.amazon.a.a.i.g$b */
    /* loaded from: classes2.dex */
    public static class AsyncTaskC3537b extends AsyncTask<Intent, Void, Void> {

        /* renamed from: a */
        private final Context f2469a;

        /* renamed from: b */
        private final ContextManager f2470b;

        @Override // android.os.AsyncTask
        /* renamed from: a */
        public Void doInBackground(Intent... intentArr) {
            this.f2469a.startActivity(intentArr[0]);
            return null;
        }

        private AsyncTaskC3537b(Context context, ContextManager contextManager) {
            this.f2469a = context;
            this.f2470b = contextManager;
        }

        @Override // android.os.AsyncTask
        /* renamed from: a */
        public void onPostExecute(Void r1) {
            ShutdownPrompt.m103060b(this.f2470b);
        }
    }

    public ShutdownPrompt(PromptContent promptContent) {
        super(promptContent, SimplePrompt.EnumC3542a.EXTENDED);
        f2462e.m102829a("new ShutdownPrompt called!");
    }

    /* renamed from: n */
    private String m103058n() {
        return Locale.getDefault().getLanguage() + "_" + Locale.getDefault().getCountry();
    }

    @Override // com.amazon.p047a.p048a.p056e.Expirable
    /* renamed from: b */
    public void mo103063b() {
        this.f2466i.mo103176g();
    }

    @Override // com.amazon.p047a.p048a.p056e.RelativeExpirable
    /* renamed from: h */
    protected long mo102471h() {
        return f2461b;
    }

    @Override // com.amazon.p047a.p048a.p061i.SimplePrompt
    /* renamed from: i */
    protected void mo102470i() {
        mo103053a(0);
    }

    /* renamed from: m */
    protected void m103059m() {
        KiwiLogger kiwiLogger = f2462e;
        kiwiLogger.m102829a("Store contains " + this.f2467j.toString());
        if (!((SimplePrompt) this).f2473c.m103090i()) {
            kiwiLogger.m102829a("Should not show fixup");
            new AsyncTaskC3536a(this.f2466i).execute(new Void[0]);
            return;
        }
        kiwiLogger.m102829a("Should show fixup");
        Activity mo103192a = this.f2466i.mo103192a();
        m103069a(mo103192a, m103070a((Context) mo103192a));
        kiwiLogger.m102829a("Attempted to start browser.");
    }

    public String toString() {
        return "ShutdownPrompt";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static void m103060b(ContextManager contextManager) {
        KiwiLogger kiwiLogger = f2462e;
        kiwiLogger.m102829a("doShutdown()");
        kiwiLogger.m102824c("Killing application");
        System.exit(0);
    }

    @Override // com.amazon.p047a.p048a.p061i.SimplePrompt
    /* renamed from: a */
    protected void mo103053a(int i) {
        KiwiLogger kiwiLogger = f2462e;
        kiwiLogger.m102829a("doAction(" + i + ")");
        PromptContent.EnumC3530a[] m103096c = ((SimplePrompt) this).f2473c.m103096c();
        PromptContent.EnumC3530a enumC3530a = PromptContent.EnumC3530a.DEFAULT;
        PromptContent.EnumC3530a enumC3530a2 = i < m103096c.length ? m103096c[i] : enumC3530a;
        if (enumC3530a2 == PromptContent.EnumC3530a.HELP) {
            kiwiLogger.m102829a("doAction() help");
            m103059m();
        } else if (enumC3530a2 == PromptContent.EnumC3530a.DEEPLINK) {
            kiwiLogger.m102829a("doAction() deeplink");
            m103066a(f2464g);
        } else if (enumC3530a2 == enumC3530a) {
            m103060b(this.f2466i);
        }
    }

    /* renamed from: b */
    private String m103062b(Context context) {
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        if (telephonyManager == null) {
            f2462e.m102829a("tm was null!");
            return null;
        }
        KiwiLogger kiwiLogger = f2462e;
        kiwiLogger.m102829a("tm was not null.");
        int simState = telephonyManager.getSimState();
        if (simState != 5) {
            kiwiLogger.m102829a("SIM not ready, returning null.  State was " + simState);
            return null;
        }
        return telephonyManager.getSimOperator();
    }

    /* renamed from: b */
    private boolean m103061b(Context context, Intent intent) {
        intent.addFlags(268435456);
        return intent.resolveActivity(context.getPackageManager()) != null;
    }

    /* renamed from: a */
    private final Intent m103070a(Context context) {
        String packageName = context.getPackageName();
        StringBuilder sb2 = new StringBuilder(f2463f);
        PackageManager packageManager = context.getPackageManager();
        m103065a(sb2, "?k=", "1.1");
        m103065a(sb2, "&m=", ((SimplePrompt) this).f2473c.m103094e());
        m103065a(sb2, "&ec=", String.valueOf(((SimplePrompt) this).f2473c.m103092g()));
        String str = (String) this.f2467j.m103005a(KiwiDataStore.f2527f);
        if (str != null) {
            m103065a(sb2, "&t=", str);
            m103064a(sb2, "&tv=", str, packageManager);
        }
        String str2 = (String) this.f2467j.m103005a(KiwiDataStore.f2528g);
        if (str2 != null) {
            m103065a(sb2, "&c=", str2);
        }
        String str3 = (String) this.f2467j.m103005a(KiwiDataStore.f2525d);
        if (str3 != null) {
            m103065a(sb2, "&e=", str3);
        }
        String str4 = Build.PRODUCT;
        if (str4 != null) {
            m103065a(sb2, "&d=", str4);
        }
        String str5 = Build.MANUFACTURER;
        if (str5 != null) {
            m103065a(sb2, "&ma=", str5);
        }
        String str6 = Build.MODEL;
        if (str6 != null) {
            m103065a(sb2, "&mo=", str6);
        }
        String str7 = Build.ID;
        if (str7 != null) {
            m103065a(sb2, "&bn=", str7);
        }
        m103065a(sb2, "&sz=", String.valueOf(context.getResources().getConfiguration().screenLayout & 15));
        m103065a(sb2, "&s=", String.valueOf(Build.VERSION.SDK_INT));
        m103065a(sb2, "&p=", packageName);
        m103064a(sb2, "&pv=", packageName, packageManager);
        m103065a(sb2, "&l=", m103058n());
        String m103062b = m103062b(context);
        if (!TextUtils.isEmpty(m103062b)) {
            m103065a(sb2, "&mc=", m103062b);
        }
        String sb3 = sb2.toString();
        KiwiLogger kiwiLogger = f2462e;
        kiwiLogger.m102829a("Starting browser for uri " + sb3);
        return new Intent("android.intent.action.VIEW", Uri.parse(sb3));
    }

    /* renamed from: a */
    private final void m103064a(StringBuilder sb2, String str, String str2, PackageManager packageManager) {
        try {
            m103065a(sb2, str, String.valueOf(packageManager.getPackageInfo(str2, 0).versionCode));
        } catch (PackageManager.NameNotFoundException unused) {
            KiwiLogger kiwiLogger = f2462e;
            kiwiLogger.m102826b("Could not find information for package " + str2);
        }
    }

    /* renamed from: a */
    private final void m103065a(StringBuilder sb2, String str, String str2) {
        try {
            String encode = URLEncoder.encode(str2, "UTF-8");
            sb2.append(str);
            sb2.append(encode);
        } catch (UnsupportedEncodingException e) {
            f2462e.m102825b("Failed to URL-encode argument", e);
        }
    }

    /* renamed from: a */
    private void m103066a(String str) {
        f2462e.m102829a("Attempting to deep link to appstore.");
        Activity mo103192a = this.f2466i.mo103192a();
        m103069a(mo103192a, m103068a(mo103192a, str));
    }

    /* renamed from: a */
    private Intent m103068a(Context context, String str) {
        String packageName = context.getPackageName();
        return new Intent("android.intent.action.VIEW", Uri.parse("amzn://apps/android?p=" + packageName + "&ref=" + str));
    }

    /* renamed from: a */
    private void m103069a(Context context, Intent intent) {
        if (!m103061b(context, intent)) {
            f2462e.m102826b("Could not start activity, nothing resolves for the given data.");
            m103060b(this.f2466i);
            return;
        }
        new AsyncTaskC3537b(context, this.f2466i).execute(intent);
    }

    @Override // com.amazon.p047a.p048a.p061i.SimplePrompt
    /* renamed from: a */
    protected boolean mo103050a(PromptContent.EnumC3530a enumC3530a) {
        Intent m103070a;
        if (enumC3530a == PromptContent.EnumC3530a.DEFAULT) {
            return true;
        }
        Activity mo103192a = this.f2466i.mo103192a();
        if (enumC3530a == PromptContent.EnumC3530a.DEEPLINK) {
            m103070a = m103068a(mo103192a, f2464g);
        } else {
            m103070a = enumC3530a == PromptContent.EnumC3530a.HELP ? m103070a((Context) mo103192a) : null;
        }
        if (m103070a == null) {
            KiwiLogger kiwiLogger = f2462e;
            kiwiLogger.m102826b("Unexpected action " + enumC3530a + ", could not create intent.");
            return false;
        }
        return m103061b(mo103192a, m103070a);
    }
}
