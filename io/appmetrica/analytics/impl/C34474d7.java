package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.d7 */
/* loaded from: classes9.dex */
public final class C34474d7 implements ProtobufConverter {

    /* renamed from: a */
    public final C33944Hd f94147a;

    /* renamed from: b */
    public final C34690l7 f94148b;

    public C34474d7() {
        this(null, null, 3, null);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a */
    public final C34771o7 fromModel(@NotNull C34528f7 c34528f7) {
        C34771o7 c34771o7 = new C34771o7();
        Integer num = c34528f7.f94319a;
        if (num != null) {
            c34771o7.f95082a = num.intValue();
        }
        String str = c34528f7.f94320b;
        if (str != null) {
            c34771o7.f95083b = StringUtils.correctIllFormedString(str);
        }
        String str2 = c34528f7.f94321c;
        if (str2 != null) {
            c34771o7.f95084c = StringUtils.correctIllFormedString(str2);
        }
        Long l = c34528f7.f94322d;
        if (l != null) {
            c34771o7.f95085d = l.longValue();
        }
        C34663k7 c34663k7 = c34528f7.f94323e;
        if (c34663k7 != null) {
            c34771o7.f95086e = this.f94148b.fromModel(c34663k7);
        }
        String str3 = c34528f7.f94324f;
        if (str3 != null) {
            c34771o7.f95087f = str3;
        }
        String str4 = c34528f7.f94325g;
        if (str4 != null) {
            c34771o7.f95088g = str4;
        }
        Long l2 = c34528f7.f94326h;
        if (l2 != null) {
            c34771o7.f95089h = l2.longValue();
        }
        Integer num2 = c34528f7.f94327i;
        if (num2 != null) {
            c34771o7.f95090i = num2.intValue();
        }
        Integer num3 = c34528f7.f94328j;
        if (num3 != null) {
            c34771o7.f95091j = num3.intValue();
        }
        String str5 = c34528f7.f94329k;
        if (str5 != null) {
            c34771o7.f95092k = str5;
        }
        EnumC33889F8 enumC33889F8 = c34528f7.f94330l;
        if (enumC33889F8 != null) {
            c34771o7.f95093l = enumC33889F8.f92822a;
        }
        String str6 = c34528f7.f94331m;
        if (str6 != null) {
            c34771o7.f95094m = str6;
        }
        EnumC34423ba enumC34423ba = c34528f7.f94332n;
        if (enumC34423ba != null) {
            c34771o7.f95095n = enumC34423ba.f94026a;
        }
        EnumC34692l9 enumC34692l9 = c34528f7.f94333o;
        if (enumC34692l9 != null) {
            c34771o7.f95096o = enumC34692l9.f94824a;
        }
        Boolean bool = c34528f7.f94334p;
        if (bool != null) {
            c34771o7.f95097p = this.f94147a.fromModel(Boolean.valueOf(bool.booleanValue())).intValue();
        }
        Integer num4 = c34528f7.f94335q;
        if (num4 != null) {
            c34771o7.f95098q = num4.intValue();
        }
        byte[] bArr = c34528f7.f94336r;
        if (bArr != null) {
            c34771o7.f95099r = bArr;
        }
        return c34771o7;
    }

    public C34474d7(@NotNull C33944Hd c33944Hd, @NotNull C34690l7 c34690l7) {
        this.f94147a = c33944Hd;
        this.f94148b = c34690l7;
    }

    public /* synthetic */ C34474d7(C33944Hd c33944Hd, C34690l7 c34690l7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new C33944Hd() : c33944Hd, (i & 2) != 0 ? new C34690l7(null, 1, null) : c34690l7);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a */
    public final C34528f7 toModel(@NotNull C34771o7 c34771o7) {
        EnumC34692l9 enumC34692l9;
        C34771o7 c34771o72 = new C34771o7();
        Integer valueOf = Integer.valueOf(c34771o7.f95082a);
        Integer num = valueOf.intValue() != c34771o72.f95082a ? valueOf : null;
        String str = c34771o7.f95083b;
        String str2 = Intrinsics.m17075f(str, c34771o72.f95083b) ^ true ? str : null;
        String str3 = c34771o7.f95084c;
        String str4 = Intrinsics.m17075f(str3, c34771o72.f95084c) ^ true ? str3 : null;
        Long valueOf2 = Long.valueOf(c34771o7.f95085d);
        Long l = valueOf2.longValue() != c34771o72.f95085d ? valueOf2 : null;
        C34663k7 model = this.f94148b.toModel(c34771o7.f95086e);
        String str5 = c34771o7.f95087f;
        String str6 = Intrinsics.m17075f(str5, c34771o72.f95087f) ^ true ? str5 : null;
        String str7 = c34771o7.f95088g;
        String str8 = Intrinsics.m17075f(str7, c34771o72.f95088g) ^ true ? str7 : null;
        Long valueOf3 = Long.valueOf(c34771o7.f95089h);
        if (valueOf3.longValue() == c34771o72.f95089h) {
            valueOf3 = null;
        }
        Integer valueOf4 = Integer.valueOf(c34771o7.f95090i);
        Integer num2 = valueOf4.intValue() != c34771o72.f95090i ? valueOf4 : null;
        Integer valueOf5 = Integer.valueOf(c34771o7.f95091j);
        Integer num3 = valueOf5.intValue() != c34771o72.f95091j ? valueOf5 : null;
        String str9 = c34771o7.f95092k;
        String str10 = Intrinsics.m17075f(str9, c34771o72.f95092k) ^ true ? str9 : null;
        Integer valueOf6 = Integer.valueOf(c34771o7.f95093l);
        if (valueOf6.intValue() == c34771o72.f95093l) {
            valueOf6 = null;
        }
        EnumC33889F8 m22662a = valueOf6 != null ? EnumC33889F8.m22662a(Integer.valueOf(valueOf6.intValue())) : null;
        String str11 = c34771o7.f95094m;
        String str12 = Intrinsics.m17075f(str11, c34771o72.f95094m) ^ true ? str11 : null;
        Integer valueOf7 = Integer.valueOf(c34771o7.f95095n);
        if (valueOf7.intValue() == c34771o72.f95095n) {
            valueOf7 = null;
        }
        EnumC34423ba m21936a = valueOf7 != null ? EnumC34423ba.m21936a(Integer.valueOf(valueOf7.intValue())) : null;
        Integer valueOf8 = Integer.valueOf(c34771o7.f95096o);
        if (valueOf8.intValue() == c34771o72.f95096o) {
            valueOf8 = null;
        }
        if (valueOf8 != null) {
            int intValue = valueOf8.intValue();
            EnumC34692l9[] values = EnumC34692l9.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    EnumC34692l9 enumC34692l92 = values[i];
                    EnumC34692l9[] enumC34692l9Arr = values;
                    if (enumC34692l92.f94824a == intValue) {
                        enumC34692l9 = enumC34692l92;
                        break;
                    }
                    i++;
                    values = enumC34692l9Arr;
                } else {
                    enumC34692l9 = EnumC34692l9.NATIVE;
                    break;
                }
            }
        } else {
            enumC34692l9 = null;
        }
        Boolean m22565a = this.f94147a.m22565a(c34771o7.f95097p);
        Integer valueOf9 = Integer.valueOf(c34771o7.f95098q);
        Integer num4 = valueOf9.intValue() != c34771o72.f95098q ? valueOf9 : null;
        byte[] bArr = c34771o7.f95099r;
        return new C34528f7(num, str2, str4, l, model, str6, str8, valueOf3, num2, num3, str10, m22662a, str12, m21936a, enumC34692l9, m22565a, num4, Arrays.equals(bArr, c34771o72.f95099r) ^ true ? bArr : null);
    }
}
