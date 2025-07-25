package androidx.privacysandbox.ads.adservices.topics;

import android.adservices.topics.GetTopicsRequest;
import android.annotation.SuppressLint;
import androidx.annotation.RequiresExtension;
import androidx.annotation.RestrictTo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: TopicsManagerApi33Ext5Impl.kt */
@Metadata
@SuppressLint({"NewApi", "ClassVerificationFailure"})
@RequiresExtension(extension = 1000000, version = 5)
@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes2.dex */
public final class TopicsManagerApi33Ext5Impl extends TopicsManagerImplCommon {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public TopicsManagerApi33Ext5Impl(@org.jetbrains.annotations.NotNull android.content.Context r2) {
        /*
            r1 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.Class<android.adservices.topics.TopicsManager> r0 = android.adservices.topics.TopicsManager.class
            java.lang.Object r2 = r2.getSystemService(r0)
            java.lang.String r0 = "context.getSystemService…opicsManager::class.java)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r0)
            android.adservices.topics.TopicsManager r2 = (android.adservices.topics.TopicsManager) r2
            r1.<init>(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.privacysandbox.ads.adservices.topics.TopicsManagerApi33Ext5Impl.<init>(android.content.Context):void");
    }

    @Override // androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon
    @NotNull
    public android.adservices.topics.GetTopicsRequest convertRequest$ads_adservices_release(@NotNull GetTopicsRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        android.adservices.topics.GetTopicsRequest build = new GetTopicsRequest.Builder().setAdsSdkName(request.getAdsSdkName()).setShouldRecordObservation(request.shouldRecordObservation()).build();
        Intrinsics.checkNotNullExpressionValue(build, "Builder()\n            .s…ion)\n            .build()");
        return build;
    }
}
