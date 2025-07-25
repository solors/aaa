package com.amazon.p047a.p048a.p061i;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import com.amazon.p047a.p048a.p061i.PromptContent;
import com.amazon.p047a.p048a.p071o.KiwiLogger;
import com.amazon.p047a.p048a.p071o.p072a.Assert;

/* renamed from: com.amazon.a.a.i.h */
/* loaded from: classes2.dex */
public abstract class SimplePrompt extends Prompt {

    /* renamed from: b */
    private static final KiwiLogger f2471b = new KiwiLogger("SimplePrompt");

    /* renamed from: e */
    private static final String f2472e = "OK";

    /* renamed from: c */
    protected final PromptContent f2473c;

    /* renamed from: d */
    protected final EnumC3542a f2474d;

    /* compiled from: SimplePrompt.java */
    /* renamed from: com.amazon.a.a.i.h$a */
    /* loaded from: classes2.dex */
    public enum EnumC3542a {
        LEGACY,
        EXTENDED
    }

    public SimplePrompt(PromptContent promptContent) {
        this(promptContent, EnumC3542a.LEGACY);
    }

    /* renamed from: a */
    private void m103052a(AlertDialog.Builder builder) {
        String[] m103097b = this.f2473c.m103097b();
        if (m103097b.length >= 1 && m103097b.length <= 2) {
            boolean[] m103049a = m103049a(this.f2473c.m103096c());
            int i = -1;
            int i2 = 0;
            for (int i3 = 0; i3 < m103049a.length; i3++) {
                if (m103049a[i3]) {
                    i2++;
                    i = i3;
                }
            }
            if (i2 == 1) {
                f2471b.m102829a("single button dialog");
                m103051a(builder, m103097b[i], i);
                return;
            }
            f2471b.m102829a("two button dialog");
            builder.setNegativeButton(m103097b[0], new DialogInterface.OnClickListener() { // from class: com.amazon.a.a.i.h.2
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i4) {
                    if (SimplePrompt.this.m103101k()) {
                        SimplePrompt.this.mo103053a(0);
                    }
                }
            });
            builder.setPositiveButton(m103097b[1], new DialogInterface.OnClickListener() { // from class: com.amazon.a.a.i.h.3
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i4) {
                    if (SimplePrompt.this.m103101k()) {
                        SimplePrompt.this.mo103053a(1);
                    }
                }
            });
            return;
        }
        f2471b.m102826b("Unexpected button count: " + m103097b.length);
    }

    /* renamed from: e */
    private final Dialog m103048e(Activity activity) {
        KiwiLogger kiwiLogger = f2471b;
        kiwiLogger.m102829a("Legacy mode dialog, legacy title = " + this.f2473c.m103094e() + ", extended title = " + this.f2473c.m103093f());
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setTitle(this.f2473c.m103093f()).setMessage(this.f2473c.m103095d()).setCancelable(false).setNeutralButton(f2472e, new DialogInterface.OnClickListener() { // from class: com.amazon.a.a.i.h.1
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                if (SimplePrompt.this.m103101k()) {
                    SimplePrompt.this.mo102470i();
                }
            }
        });
        return builder.create();
    }

    /* renamed from: f */
    private final Dialog m103047f(Activity activity) {
        KiwiLogger kiwiLogger = f2471b;
        kiwiLogger.m102829a("doCreate() called to create extended dialog");
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setTitle(this.f2473c.m103093f()).setMessage(this.f2473c.m103095d()).setCancelable(false);
        m103052a(builder);
        kiwiLogger.m102829a("doCreate() returning");
        return builder.create();
    }

    @Override // com.amazon.p047a.p048a.p061i.Prompt
    /* renamed from: b */
    protected boolean mo102945b(Activity activity) {
        return this.f2473c.m103091h();
    }

    @Override // com.amazon.p047a.p048a.p061i.Prompt
    /* renamed from: d */
    public final Dialog mo102943d(Activity activity) {
        if (this.f2474d == EnumC3542a.LEGACY) {
            return m103048e(activity);
        }
        return m103047f(activity);
    }

    /* renamed from: i */
    protected abstract void mo102470i();

    public SimplePrompt(PromptContent promptContent, EnumC3542a enumC3542a) {
        Assert.m102872a((Object) promptContent, "content");
        this.f2473c = promptContent;
        this.f2474d = enumC3542a;
        KiwiLogger kiwiLogger = f2471b;
        kiwiLogger.m102829a("created SimplePrompt with mode " + enumC3542a);
    }

    /* renamed from: a */
    private void m103051a(AlertDialog.Builder builder, String str, final int i) {
        builder.setNeutralButton(str, new DialogInterface.OnClickListener() { // from class: com.amazon.a.a.i.h.4
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i2) {
                if (SimplePrompt.this.m103101k()) {
                    SimplePrompt.this.mo103053a(i);
                }
            }
        });
    }

    /* renamed from: a */
    private boolean[] m103049a(PromptContent.EnumC3530a[] enumC3530aArr) {
        if (enumC3530aArr == null) {
            return null;
        }
        boolean[] zArr = new boolean[enumC3530aArr.length];
        for (int i = 0; i < enumC3530aArr.length; i++) {
            boolean mo103050a = mo103050a(enumC3530aArr[i]);
            zArr[i] = mo103050a;
            if (!mo103050a) {
                KiwiLogger kiwiLogger = f2471b;
                kiwiLogger.m102829a("filterActions() filtering item " + i);
            }
        }
        return zArr;
    }

    @Override // com.amazon.p047a.p048a.p061i.Prompt
    /* renamed from: a */
    protected void mo102948a(PromptExpirationReason promptExpirationReason) {
        mo102470i();
    }

    /* renamed from: a */
    protected void mo103053a(int i) {
        f2471b.m102826b("extended doAction from base class called, this should never happen.");
        mo102470i();
    }

    /* renamed from: a */
    protected boolean mo103050a(PromptContent.EnumC3530a enumC3530a) {
        return enumC3530a == PromptContent.EnumC3530a.DEFAULT;
    }
}
