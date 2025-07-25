package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ExternalAttribution;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.J2 */
/* loaded from: classes9.dex */
public class C33981J2 implements ExternalAttribution {

    /* renamed from: a */
    public final C35035y9 f93048a;

    public C33981J2(@NotNull C35035y9 c35035y9) {
        this.f93048a = c35035y9;
    }

    @Override // io.appmetrica.analytics.ExternalAttribution
    @NotNull
    public final byte[] toBytes() {
        return MessageNano.toByteArray(this.f93048a);
    }

    @NotNull
    public final String toString() {
        return "ExternalAttribution(type=`" + AbstractC33964I9.m22547a(this.f93048a.f95653a) + "`value=`" + new String(this.f93048a.f95654b, Charsets.UTF_8) + "`)";
    }
}
