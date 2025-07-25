package com.amazon.p047a.p077b;

import android.os.Build;
import com.amazon.p047a.p048a.p055d.KiwiException;
import com.amazon.p047a.p048a.p061i.PromptContent;
import com.amazon.p047a.p048a.p066n.p067a.p068a.AuthenticationTokenVerificationException;
import com.amazon.p047a.p048a.p066n.p067a.p068a.CommandServiceBindException;
import com.amazon.p047a.p048a.p066n.p067a.p068a.CommandServiceNotInstalledException;
import com.amazon.p047a.p048a.p066n.p067a.p068a.CommandServiceRemoteException;
import com.amazon.p047a.p048a.p066n.p067a.p068a.ExceptionResultException;
import com.amazon.p047a.p048a.p066n.p067a.p068a.MalformedResponseException;
import com.amazon.p047a.p048a.p066n.p067a.p068a.UnhandledCommandExecutionException;
import com.amazon.p047a.p048a.p071o.p072a.Assert;
import com.amazon.p047a.p048a.p071o.p073b.p074a.DataAuthenticationKeyLoadException;
import com.amazon.p047a.p048a.p071o.p073b.p074a.SignedTokenParseException;
import com.amazon.p047a.p048a.p071o.p073b.p074a.SignedTokenSignatureVerificationException;
import com.amazon.p047a.p077b.p078a.LicenseVerificationException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.amazon.a.b.f */
/* loaded from: classes2.dex */
public class LicenseFailurePromptContentMapper {

    /* renamed from: a */
    private final Map<Class<? extends KiwiException>, InterfaceC3569c<? extends KiwiException>> f2819a = new HashMap();

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: LicenseFailurePromptContentMapper.java */
    /* renamed from: com.amazon.a.b.f$a */
    /* loaded from: classes2.dex */
    public static final class C3566a implements InterfaceC3569c<ExceptionResultException> {

        /* renamed from: a */
        final Map<String, PromptContent> f2822a;

        private C3566a() {
            this.f2822a = new HashMap<String, PromptContent>() { // from class: com.amazon.a.b.f.a.1
                {
                    C3566a.this = this;
                    put("NO_INTERNET", LicenseFailurePromptContent.f2812d);
                    put("INVALID_CONTENT_ID", LicenseFailurePromptContent.f2813e);
                    put("INTERNAL_SERVICE_ERROR", LicenseFailurePromptContent.f2814f);
                }
            };
        }

        @Override // com.amazon.p047a.p077b.LicenseFailurePromptContentMapper.InterfaceC3569c
        /* renamed from: a */
        public PromptContent mo102778a(ExceptionResultException exceptionResultException) {
            PromptContent promptContent = this.f2822a.get(exceptionResultException.m103139b());
            return promptContent != null ? promptContent : LicenseFailurePromptContent.f2813e;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: LicenseFailurePromptContentMapper.java */
    /* renamed from: com.amazon.a.b.f$b */
    /* loaded from: classes2.dex */
    public static final class C3568b implements InterfaceC3569c<LicenseVerificationException> {
        private C3568b() {
        }

        @Override // com.amazon.p047a.p077b.LicenseFailurePromptContentMapper.InterfaceC3569c
        /* renamed from: a */
        public PromptContent mo102778a(LicenseVerificationException licenseVerificationException) {
            if (licenseVerificationException.m102793d().m102813a(LicenseVerificationErrorCode.EXPIRATION)) {
                return LicenseFailurePromptContent.f2812d;
            }
            return LicenseFailurePromptContent.f2813e;
        }
    }

    /* compiled from: LicenseFailurePromptContentMapper.java */
    /* renamed from: com.amazon.a.b.f$c */
    /* loaded from: classes2.dex */
    public interface InterfaceC3569c<T extends KiwiException> {
        /* renamed from: a */
        PromptContent mo102778a(T t);
    }

    public LicenseFailurePromptContentMapper() {
        if ("Amazon".equals(Build.MANUFACTURER)) {
            m102782a(CommandServiceNotInstalledException.class, LicenseFailurePromptContent.f2810b);
        } else {
            m102782a(CommandServiceNotInstalledException.class, LicenseFailurePromptContent.f2809a);
        }
        PromptContent promptContent = LicenseFailurePromptContent.f2810b;
        m102782a(CommandServiceBindException.class, promptContent);
        m102782a(CommandServiceRemoteException.class, promptContent);
        m102782a(AuthenticationTokenVerificationException.class, LicenseFailurePromptContent.f2811c);
        m102781a(ExceptionResultException.class, new C3566a());
        PromptContent promptContent2 = LicenseFailurePromptContent.f2813e;
        m102782a(MalformedResponseException.class, promptContent2);
        m102782a(UnhandledCommandExecutionException.class, promptContent2);
        m102781a(LicenseVerificationException.class, new C3568b());
        m102782a(DataAuthenticationKeyLoadException.class, LicenseFailurePromptContent.f2815g);
        m102782a(SignedTokenParseException.class, promptContent2);
        m102782a(SignedTokenSignatureVerificationException.class, promptContent2);
    }

    /* renamed from: a */
    private void m102782a(Class<? extends KiwiException> cls, final PromptContent promptContent) {
        m102781a(cls, new InterfaceC3569c<KiwiException>() { // from class: com.amazon.a.b.f.1
            {
                LicenseFailurePromptContentMapper.this = this;
            }

            @Override // com.amazon.p047a.p077b.LicenseFailurePromptContentMapper.InterfaceC3569c
            /* renamed from: a */
            public PromptContent mo102778a(KiwiException kiwiException) {
                return promptContent;
            }
        });
    }

    /* renamed from: a */
    private void m102781a(Class<? extends KiwiException> cls, InterfaceC3569c<? extends KiwiException> interfaceC3569c) {
        boolean containsKey = this.f2819a.containsKey(cls);
        Assert.m102867b(containsKey, "mapping exists for type: " + cls);
        this.f2819a.put(cls, interfaceC3569c);
    }

    /* renamed from: a */
    public PromptContent m102783a(KiwiException kiwiException) {
        InterfaceC3569c<? extends KiwiException> interfaceC3569c = this.f2819a.get(kiwiException.getClass());
        if (interfaceC3569c == null) {
            return null;
        }
        return interfaceC3569c.mo102778a(kiwiException);
    }
}
