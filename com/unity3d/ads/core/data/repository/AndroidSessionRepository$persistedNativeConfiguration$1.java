package com.unity3d.ads.core.data.repository;

import gatewayprotocol.p687v1.NativeConfigurationOuterClass;
import kotlin.Metadata;
import kotlin.Tuples;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC37596l;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p1076zd.InterfaceC45268n;
import p804nd.C38508r;
import p804nd.C38513v;
import sd.C42688d;

/* compiled from: AndroidSessionRepository.kt */
@DebugMetadata(m17095c = "com.unity3d.ads.core.data.repository.AndroidSessionRepository$persistedNativeConfiguration$1", m17094f = "AndroidSessionRepository.kt", m17093l = {}, m17092m = "invokeSuspend")
@Metadata
/* loaded from: classes7.dex */
final class AndroidSessionRepository$persistedNativeConfiguration$1 extends AbstractC37596l implements InterfaceC45268n<NativeConfigurationOuterClass.NativeConfiguration, Boolean, Continuation<? super Tuples<? extends NativeConfigurationOuterClass.NativeConfiguration, ? extends Boolean>>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ boolean Z$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AndroidSessionRepository$persistedNativeConfiguration$1(Continuation<? super AndroidSessionRepository$persistedNativeConfiguration$1> continuation) {
        super(3, continuation);
    }

    @Nullable
    public final Object invoke(@NotNull NativeConfigurationOuterClass.NativeConfiguration nativeConfiguration, boolean z, @Nullable Continuation<? super Tuples<NativeConfigurationOuterClass.NativeConfiguration, Boolean>> continuation) {
        AndroidSessionRepository$persistedNativeConfiguration$1 androidSessionRepository$persistedNativeConfiguration$1 = new AndroidSessionRepository$persistedNativeConfiguration$1(continuation);
        androidSessionRepository$persistedNativeConfiguration$1.L$0 = nativeConfiguration;
        androidSessionRepository$persistedNativeConfiguration$1.Z$0 = z;
        return androidSessionRepository$persistedNativeConfiguration$1.invokeSuspend(Unit.f99208a);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        C42688d.m6959e();
        if (this.label == 0) {
            C38508r.m14539b(obj);
            return C38513v.m14532a((NativeConfigurationOuterClass.NativeConfiguration) this.L$0, boxing.m17100a(this.Z$0));
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // p1076zd.InterfaceC45268n
    public /* bridge */ /* synthetic */ Object invoke(NativeConfigurationOuterClass.NativeConfiguration nativeConfiguration, Boolean bool, Continuation<? super Tuples<? extends NativeConfigurationOuterClass.NativeConfiguration, ? extends Boolean>> continuation) {
        return invoke(nativeConfiguration, bool.booleanValue(), (Continuation<? super Tuples<NativeConfigurationOuterClass.NativeConfiguration, Boolean>>) continuation);
    }
}
