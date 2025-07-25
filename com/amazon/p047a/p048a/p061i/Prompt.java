package com.amazon.p047a.p048a.p061i;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.view.KeyEvent;
import com.amazon.p047a.p048a.p056e.RelativeExpirable;
import com.amazon.p047a.p048a.p063k.Resource;
import com.amazon.p047a.p048a.p065m.KiwiDataStore;
import com.amazon.p047a.p048a.p066n.Task;
import com.amazon.p047a.p048a.p066n.p069b.TaskPipelineId;
import com.amazon.p047a.p048a.p071o.KiwiLogger;
import com.amazon.p047a.p048a.p071o.p072a.Assert;
import java.util.Random;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.amazon.a.a.i.b */
/* loaded from: classes2.dex */
public abstract class Prompt extends RelativeExpirable<Prompt> {

    /* renamed from: b */
    private static final KiwiLogger f2422b = new KiwiLogger("Prompt");
    @Resource

    /* renamed from: c */
    private KiwiDataStore f2423c;

    /* renamed from: d */
    private final int f2424d;

    /* renamed from: e */
    private Activity f2425e;

    /* renamed from: f */
    private PromptExpirationReason f2426f;

    /* renamed from: g */
    private Dialog f2427g;

    /* renamed from: h */
    private final AtomicBoolean f2428h = new AtomicBoolean(false);

    public Prompt() {
        int m103103i = m103103i();
        this.f2424d = m103103i;
        if (KiwiLogger.f2770a) {
            KiwiLogger kiwiLogger = f2422b;
            kiwiLogger.m102829a("Creating Prompt: " + m103103i);
        }
    }

    /* renamed from: e */
    private boolean m103105e(Activity activity) {
        if (this.f2423c.m103002b(KiwiDataStore.f2526e)) {
            return false;
        }
        return mo102945b(activity);
    }

    /* renamed from: f */
    private void m103104f(Activity activity) {
        if (KiwiLogger.f2770a) {
            KiwiLogger kiwiLogger = f2422b;
            kiwiLogger.m102829a("Showing prompt, id: " + m103102j() + ", prompt: " + this + ", activity: " + activity);
        }
        if (this.f2425e != null) {
            m103099m();
        }
        activity.showDialog(m103102j());
    }

    /* renamed from: i */
    private int m103103i() {
        int nextInt = new Random().nextInt(2146249079) + 1234567;
        if (nextInt <= 1234567) {
            return 1234567;
        }
        return nextInt;
    }

    /* renamed from: m */
    private void m103099m() {
        if (KiwiLogger.f2770a) {
            KiwiLogger kiwiLogger = f2422b;
            kiwiLogger.m102826b("Dismissing dialog: " + this.f2424d);
        }
        try {
            this.f2425e.dismissDialog(this.f2424d);
            this.f2425e.removeDialog(this.f2424d);
        } catch (Exception unused) {
            if (KiwiLogger.f2770a) {
                KiwiLogger kiwiLogger2 = f2422b;
                kiwiLogger2.m102826b("Unable to remove dialog: " + this.f2424d);
            }
        }
        this.f2425e = null;
        this.f2427g = null;
    }

    /* renamed from: a */
    public final void m103109a(Activity activity) {
        Assert.m102872a((Object) activity, "activity");
        Assert.m102876a();
        if (m103105e(activity)) {
            m103104f(activity);
        } else {
            m103107b(PromptExpirationReason.NOT_COMPATIBLE);
        }
    }

    /* renamed from: a */
    protected abstract void mo102948a(PromptExpirationReason promptExpirationReason);

    /* renamed from: b */
    protected boolean mo102945b(Activity activity) {
        return true;
    }

    /* renamed from: c */
    public final Dialog m103106c(Activity activity) {
        this.f2425e = activity;
        Dialog mo102943d = mo102943d(activity);
        this.f2427g = mo102943d;
        mo102943d.setCancelable(false);
        this.f2427g.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: com.amazon.a.a.i.b.1
            @Override // android.content.DialogInterface.OnKeyListener
            public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                if (i == 84) {
                    return true;
                }
                return false;
            }
        });
        return this.f2427g;
    }

    /* renamed from: d */
    protected abstract Dialog mo102943d(Activity activity);

    @Override // com.amazon.p047a.p048a.p056e.Expirable
    /* renamed from: d */
    protected final void mo102795d() {
        if (KiwiLogger.f2770a) {
            KiwiLogger kiwiLogger = f2422b;
            kiwiLogger.m102829a("Expiring prompt: " + this);
        }
        this.f2386a.mo102888a(TaskPipelineId.FOREGROUND, new Task() { // from class: com.amazon.a.a.i.b.2
            @Override // com.amazon.p047a.p048a.p066n.Task
            /* renamed from: a */
            public void mo102336a() {
                Prompt.this.m103101k();
            }

            public String toString() {
                return "DismissPromptTask: " + Prompt.this.toString();
            }
        });
        mo102948a(m103100l());
    }

    /* renamed from: j */
    public int m103102j() {
        return this.f2424d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: k */
    public final boolean m103101k() {
        Assert.m102876a();
        if (KiwiLogger.f2770a) {
            KiwiLogger kiwiLogger = f2422b;
            kiwiLogger.m102829a("Dismissing Prompt: " + this.f2424d);
        }
        if (!this.f2428h.compareAndSet(false, true)) {
            if (KiwiLogger.f2770a) {
                f2422b.m102826b("Prompt has already been dismissed");
            }
            return false;
        }
        if (this.f2425e != null) {
            m103099m();
        }
        m103133f();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: l */
    public PromptExpirationReason m103100l() {
        if (!m103132g()) {
            return null;
        }
        PromptExpirationReason promptExpirationReason = this.f2426f;
        if (promptExpirationReason == null) {
            return PromptExpirationReason.EXPIRATION_DURATION_ELAPSED;
        }
        return promptExpirationReason;
    }

    /* renamed from: b */
    private void m103107b(PromptExpirationReason promptExpirationReason) {
        if (KiwiLogger.f2770a) {
            KiwiLogger kiwiLogger = f2422b;
            kiwiLogger.m102829a("Expiring prompt pre-maturely: id: " + m103102j() + ", prompt: " + this + ",, reason: " + promptExpirationReason);
        }
        this.f2426f = promptExpirationReason;
        m103134c();
    }

    /* renamed from: a */
    public void m103108a(Activity activity, boolean z) {
        if (activity != this.f2425e) {
            if (KiwiLogger.f2770a) {
                f2422b.m102829a("Unrecognized context");
            }
        } else if (!z || this.f2427g.isShowing()) {
        } else {
            if (KiwiLogger.f2770a) {
                f2422b.m102829a("showing dialog because it was not showing");
            }
            this.f2427g.show();
        }
    }
}
