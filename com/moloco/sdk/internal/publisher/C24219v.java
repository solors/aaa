package com.moloco.sdk.internal.publisher;

import android.util.Base64;
import androidx.annotation.VisibleForTesting;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.mediators.C23995a;
import com.moloco.sdk.internal.scheduling.C24239c;
import com.moloco.sdk.publisher.MediationInfo;
import com.moloco.sdk.publisher.Moloco;
import java.io.ByteArrayInputStream;
import java.util.zip.GZIPInputStream;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC37596l;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlinx.coroutines.C37734i;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.C38508r;
import sd.C42688d;

@VisibleForTesting(otherwise = 2)
/* renamed from: com.moloco.sdk.internal.publisher.v */
/* loaded from: classes7.dex */
public final class C24219v implements InterfaceC24226x {
    @NotNull

    /* renamed from: a */
    public final String f62717a = "Base64GzippedBidPreprocessor";

    @DebugMetadata(m17095c = "com.moloco.sdk.internal.publisher.Base64GzippedBidPreprocessor$process$2", m17094f = "BidPreprocessor.kt", m17093l = {}, m17092m = "invokeSuspend")
    /* renamed from: com.moloco.sdk.internal.publisher.v$a */
    /* loaded from: classes7.dex */
    public static final class C24220a extends AbstractC37596l implements Function2<CoroutineScope, Continuation<? super String>, Object> {

        /* renamed from: l */
        public int f62718l;

        /* renamed from: n */
        public final /* synthetic */ String f62720n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C24220a(String str, Continuation<? super C24220a> continuation) {
            super(2, continuation);
            this.f62720n = str;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* renamed from: a */
        public final Object mo105910invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super String> continuation) {
            return ((C24220a) create(coroutineScope, continuation)).invokeSuspend(Unit.f99208a);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C24220a(this.f62720n, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            String str;
            C42688d.m6959e();
            if (this.f62718l == 0) {
                C38508r.m14539b(obj);
                if (!C24219v.this.mo46755a()) {
                    return this.f62720n;
                }
                MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
                String str2 = C24219v.this.f62717a;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Base64 Gzipped supported ");
                MediationInfo mediationInfo$moloco_sdk_release = Moloco.INSTANCE.getMediationInfo$moloco_sdk_release();
                if (mediationInfo$moloco_sdk_release != null) {
                    str = mediationInfo$moloco_sdk_release.getName();
                } else {
                    str = null;
                }
                sb2.append(str);
                sb2.append(" mediation is detected. Starting bid response pre-process.");
                MolocoLogger.debug$default(molocoLogger, str2, sb2.toString(), false, 4, null);
                String m46761d = C24219v.this.m46761d(this.f62720n);
                String str3 = C24219v.this.f62717a;
                MolocoLogger.debug$default(molocoLogger, str3, "Processed bidresponse: " + m46761d, false, 4, null);
                return m46761d;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // com.moloco.sdk.internal.publisher.InterfaceC24226x
    @Nullable
    /* renamed from: a */
    public Object mo46754a(@NotNull String str, @NotNull Continuation<? super String> continuation) {
        return C37734i.m16317g(C24239c.m46733a().getDefault(), new C24220a(str, null), continuation);
    }

    /* renamed from: d */
    public final String m46761d(String str) {
        try {
            byte[] decode = Base64.decode(str, 0);
            Intrinsics.checkNotNullExpressionValue(decode, "{\n                Base64…64.DEFAULT)\n            }");
            MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
            String str2 = this.f62717a;
            MolocoLogger.debug$default(molocoLogger, str2, "Base64 decoded bidresponse: " + decode, false, 4, null);
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(decode);
            GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream, 2048);
            StringBuilder sb2 = new StringBuilder();
            byte[] bArr = new byte[2048];
            while (true) {
                try {
                    try {
                        int read = gZIPInputStream.read(bArr);
                        if (read != -1) {
                            sb2.append(new String(bArr, 0, read, Charsets.UTF_8));
                        } else {
                            byteArrayInputStream.close();
                            gZIPInputStream.close();
                            return sb2.toString();
                        }
                    } catch (Exception unused) {
                        MolocoLogger molocoLogger2 = MolocoLogger.INSTANCE;
                        String str3 = this.f62717a;
                        MolocoLogger.error$default(molocoLogger2, str3, "Failed to unzip bidresponse: " + str, null, false, 12, null);
                        byteArrayInputStream.close();
                        gZIPInputStream.close();
                        return null;
                    }
                } catch (Throwable th) {
                    byteArrayInputStream.close();
                    gZIPInputStream.close();
                    throw th;
                }
            }
        } catch (Exception unused2) {
            MolocoLogger molocoLogger3 = MolocoLogger.INSTANCE;
            String str4 = this.f62717a;
            MolocoLogger.error$default(molocoLogger3, str4, "Failed to base64 decode bidresponse: " + str, null, false, 12, null);
            return null;
        }
    }

    @Override // com.moloco.sdk.internal.publisher.InterfaceC24226x
    /* renamed from: a */
    public boolean mo46755a() {
        MediationInfo mediationInfo$moloco_sdk_release = Moloco.INSTANCE.getMediationInfo$moloco_sdk_release();
        return C23995a.m47228b(mediationInfo$moloco_sdk_release != null ? mediationInfo$moloco_sdk_release.getName() : null);
    }
}
