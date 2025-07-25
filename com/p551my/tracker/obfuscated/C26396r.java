package com.p551my.tracker.obfuscated;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p551my.tracker.obfuscated.C26396r;

/* renamed from: com.my.tracker.obfuscated.r */
/* loaded from: classes7.dex */
public final class C26396r {

    /* renamed from: a */
    boolean f68823a = false;

    /* renamed from: b */
    String f68824b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.my.tracker.obfuscated.r$a */
    /* loaded from: classes7.dex */
    public class C26397a implements InterfaceC26399c {

        /* renamed from: a */
        final /* synthetic */ C26400r0 f68825a;

        C26397a(C26400r0 c26400r0) {
            C26396r.this = r1;
            this.f68825a = c26400r0;
        }

        @Override // com.p551my.tracker.obfuscated.C26396r.InterfaceC26399c
        /* renamed from: a */
        public void mo41768a() {
            C26468z0.m41528a("FirebaseAppInstanceIdProvider: retrieving firebase app instance id finished unsuccessfully");
        }

        @Override // com.p551my.tracker.obfuscated.C26396r.InterfaceC26399c
        /* renamed from: a */
        public void mo41767a(String str) {
            C26396r.this.f68824b = str;
            this.f68825a.m41738j(str);
            C26468z0.m41528a("FirebaseAppInstanceIdProvider: retrieved firebase app instance id %" + C26396r.this.f68824b);
        }
    }

    /* renamed from: com.my.tracker.obfuscated.r$b */
    /* loaded from: classes7.dex */
    public static final class C26398b {

        /* renamed from: a */
        public static final boolean f68827a;

        static {
            boolean z;
            try {
                z = FirebaseAnalytics.class.equals(FirebaseAnalytics.class);
            } catch (Throwable th) {
                C26468z0.m41527a("FirebaseHelper: error occurred while working with FirebaseAnalytics", th);
                z = false;
            }
            f68827a = z;
        }

        /* renamed from: a */
        static void m41771a(Context context, final InterfaceC26399c interfaceC26399c) {
            try {
                C26468z0.m41528a("FirebaseHelper: retrieving firebase app instance id");
                FirebaseAnalytics.getInstance(context).getAppInstanceId().addOnCompleteListener(C26325g.f68589b, new OnCompleteListener() { // from class: com.my.tracker.obfuscated.l3
                    @Override // com.google.android.gms.tasks.OnCompleteListener
                    public final void onComplete(Task task) {
                        C26396r.C26398b.m41770a(interfaceC26399c, task);
                    }
                });
            } catch (Throwable th) {
                C26468z0.m41527a("FirebaseHelper: retrieving firebase app instance id error", th);
                interfaceC26399c.mo41768a();
            }
        }

        /* renamed from: a */
        public static /* synthetic */ void m41770a(InterfaceC26399c interfaceC26399c, Task task) {
            if (task.isComplete() && task.isSuccessful()) {
                interfaceC26399c.mo41767a((String) task.getResult());
            } else {
                interfaceC26399c.mo41768a();
            }
        }
    }

    /* renamed from: com.my.tracker.obfuscated.r$c */
    /* loaded from: classes7.dex */
    public interface InterfaceC26399c {
        /* renamed from: a */
        void mo41768a();

        /* renamed from: a */
        void mo41767a(String str);
    }

    /* renamed from: a */
    public void m41774a(Context context) {
        if (this.f68823a) {
            return;
        }
        C26400r0 m41763a = C26400r0.m41763a(context);
        String m41743h = m41763a.m41743h();
        this.f68824b = m41743h;
        if (!TextUtils.isEmpty(m41743h)) {
            C26468z0.m41528a("FirebaseAppInstanceIdProvider: retrieved cached firebase app instance id " + this.f68824b);
        }
        if (!C26398b.f68827a) {
            C26468z0.m41528a("FirebaseAppInstanceIdProvider: firebase analytics is not available");
            return;
        }
        C26398b.m41771a(context, new C26397a(m41763a));
        this.f68823a = true;
    }

    /* renamed from: a */
    public void m41773a(C26405s0 c26405s0, Context context) {
        if (TextUtils.isEmpty(this.f68824b)) {
            return;
        }
        c26405s0.m41662i(this.f68824b);
    }

    /* renamed from: b */
    public void m41772b(Context context) {
    }
}
