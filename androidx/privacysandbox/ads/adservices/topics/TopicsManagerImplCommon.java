package androidx.privacysandbox.ads.adservices.topics;

import android.adservices.topics.GetTopicsRequest;
import android.annotation.SuppressLint;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresExtension;
import androidx.annotation.RequiresPermission;
import androidx.annotation.RestrictTo;
import androidx.core.p017os.OutcomeReceiverKt;
import androidx.media3.exoplayer.hls.offline.ExecutorC2515a;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.C37591h;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C37784p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sd.C42688d;
import sd.IntrinsicsJvm;

/* compiled from: TopicsManagerImplCommon.kt */
@Metadata
@SuppressLint({"NewApi"})
@RequiresExtension(extension = 1000000, version = 4)
@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes2.dex */
public class TopicsManagerImplCommon extends TopicsManager {
    @NotNull
    private final android.adservices.topics.TopicsManager mTopicsManager;

    public TopicsManagerImplCommon(@NotNull android.adservices.topics.TopicsManager mTopicsManager) {
        Intrinsics.checkNotNullParameter(mTopicsManager, "mTopicsManager");
        this.mTopicsManager = mTopicsManager;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0035  */
    @androidx.annotation.RequiresPermission("android.permission.ACCESS_ADSERVICES_TOPICS")
    @androidx.annotation.DoNotInline
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ java.lang.Object getTopics$suspendImpl(androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon r4, androidx.privacysandbox.ads.adservices.topics.GetTopicsRequest r5, kotlin.coroutines.Continuation<? super androidx.privacysandbox.ads.adservices.topics.GetTopicsResponse> r6) {
        /*
            boolean r0 = r6 instanceof androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon$getTopics$1
            if (r0 == 0) goto L13
            r0 = r6
            androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon$getTopics$1 r0 = (androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon$getTopics$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon$getTopics$1 r0 = new androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon$getTopics$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = sd.C42683b.m6964e()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.L$0
            androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon r4 = (androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon) r4
            p804nd.C38508r.m14539b(r6)
            goto L47
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            p804nd.C38508r.m14539b(r6)
            android.adservices.topics.GetTopicsRequest r5 = r4.convertRequest$ads_adservices_release(r5)
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r6 = r4.getTopicsAsyncInternal(r5, r0)
            if (r6 != r1) goto L47
            return r1
        L47:
            android.adservices.topics.GetTopicsResponse r6 = (android.adservices.topics.GetTopicsResponse) r6
            androidx.privacysandbox.ads.adservices.topics.GetTopicsResponse r4 = r4.convertResponse$ads_adservices_release(r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon.getTopics$suspendImpl(androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon, androidx.privacysandbox.ads.adservices.topics.GetTopicsRequest, kotlin.coroutines.d):java.lang.Object");
    }

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_TOPICS")
    public final Object getTopicsAsyncInternal(android.adservices.topics.GetTopicsRequest getTopicsRequest, Continuation<? super android.adservices.topics.GetTopicsResponse> continuation) {
        Continuation m6961c;
        Object m6959e;
        m6961c = IntrinsicsJvm.m6961c(continuation);
        C37784p c37784p = new C37784p(m6961c, 1);
        c37784p.m16132y();
        this.mTopicsManager.getTopics(getTopicsRequest, new ExecutorC2515a(), OutcomeReceiverKt.asOutcomeReceiver(c37784p));
        Object m16135u = c37784p.m16135u();
        m6959e = C42688d.m6959e();
        if (m16135u == m6959e) {
            C37591h.m17084c(continuation);
        }
        return m16135u;
    }

    @NotNull
    public android.adservices.topics.GetTopicsRequest convertRequest$ads_adservices_release(@NotNull GetTopicsRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        android.adservices.topics.GetTopicsRequest build = new GetTopicsRequest.Builder().setAdsSdkName(request.getAdsSdkName()).build();
        Intrinsics.checkNotNullExpressionValue(build, "Builder()\n            .s…ame)\n            .build()");
        return build;
    }

    @NotNull
    public final GetTopicsResponse convertResponse$ads_adservices_release(@NotNull android.adservices.topics.GetTopicsResponse response) {
        Intrinsics.checkNotNullParameter(response, "response");
        ArrayList arrayList = new ArrayList();
        for (android.adservices.topics.Topic topic : response.getTopics()) {
            arrayList.add(new Topic(topic.getTaxonomyVersion(), topic.getModelVersion(), topic.getTopicId()));
        }
        return new GetTopicsResponse(arrayList);
    }

    @Override // androidx.privacysandbox.ads.adservices.topics.TopicsManager
    @RequiresPermission("android.permission.ACCESS_ADSERVICES_TOPICS")
    @DoNotInline
    @Nullable
    public Object getTopics(@NotNull GetTopicsRequest getTopicsRequest, @NotNull Continuation<? super GetTopicsResponse> continuation) {
        return getTopics$suspendImpl(this, getTopicsRequest, continuation);
    }
}
