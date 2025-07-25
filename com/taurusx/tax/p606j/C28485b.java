package com.taurusx.tax.p606j;

import androidx.annotation.VisibleForTesting;
import com.taurusx.tax.C28162a;
import p692h2.StringFogImpl;

/* renamed from: com.taurusx.tax.j.b */
/* loaded from: classes7.dex */
public class C28485b {

    /* renamed from: a */
    public volatile EnumC28488c f73915a = EnumC28488c.PAUSED;

    /* renamed from: b */
    public long f73916b;

    /* renamed from: c */
    public long f73917c;

    /* renamed from: d */
    public final InterfaceC28487b f73918d;

    /* renamed from: com.taurusx.tax.j.b$b */
    /* loaded from: classes7.dex */
    public interface InterfaceC28487b {
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum STARTED uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:391)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:320)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* renamed from: com.taurusx.tax.j.b$c */
    /* loaded from: classes7.dex */
    public static final class EnumC28488c {
        public static final EnumC28488c PAUSED;
        public static final EnumC28488c STARTED;

        /* renamed from: a */
        public static final /* synthetic */ EnumC28488c[] f73919a;

        static {
            StringFogImpl stringFogImpl = C28162a.f73047a;
            EnumC28488c enumC28488c = new EnumC28488c(stringFogImpl.m23824a(new byte[]{1, 46, 19, 40, 6, 63, 22}, new byte[]{82, 122}), 0);
            STARTED = enumC28488c;
            EnumC28488c enumC28488c2 = new EnumC28488c(stringFogImpl.m23824a(new byte[]{-114, 27, -117, 9, -101, 30}, new byte[]{-34, 90}), 1);
            PAUSED = enumC28488c2;
            f73919a = new EnumC28488c[]{enumC28488c, enumC28488c2};
        }

        public EnumC28488c(String str, int i) {
        }

        public static EnumC28488c valueOf(String str) {
            return (EnumC28488c) Enum.valueOf(EnumC28488c.class, str);
        }

        public static EnumC28488c[] values() {
            return (EnumC28488c[]) f73919a.clone();
        }
    }

    /* renamed from: com.taurusx.tax.j.b$d */
    /* loaded from: classes7.dex */
    public static class C28489d implements InterfaceC28487b {
        public C28489d() {
        }
    }

    @VisibleForTesting
    public C28485b(InterfaceC28487b interfaceC28487b) {
        this.f73918d = interfaceC28487b;
    }
}
