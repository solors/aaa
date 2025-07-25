package com.mobilefuse.sdk.network.client;

import com.mobilefuse.sdk.StabilityHelper;
import com.mobilefuse.sdk.exception.Either;
import com.mobilefuse.sdk.exception.ErrorResult;
import com.mobilefuse.sdk.exception.ExceptionHandlingStrategy;
import com.mobilefuse.sdk.exception.SuccessResult;
import com.mobilefuse.sdk.exception.TryKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Charsets;
import org.jetbrains.annotations.Nullable;
import p804nd.NoWhenBranchMatchedException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: HttpRequestDataModel.kt */
@Metadata
/* loaded from: classes7.dex */
public final class HttpJsonPostBody$content$2 extends Lambda implements Functions<byte[]> {
    final /* synthetic */ HttpJsonPostBody this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpJsonPostBody$content$2(HttpJsonPostBody httpJsonPostBody) {
        super(0);
        this.this$0 = httpJsonPostBody;
    }

    @Override // kotlin.jvm.functions.Functions
    @Nullable
    public final byte[] invoke() {
        Either errorResult;
        Object value;
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            byte[] bytes = this.this$0.getJson().getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            errorResult = new SuccessResult(bytes);
        } catch (Throwable th) {
            if (TryKt.WhenMappings.$EnumSwitchMapping$1[exceptionHandlingStrategy.ordinal()] == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            }
            errorResult = new ErrorResult(th);
        }
        if (errorResult instanceof ErrorResult) {
            Throwable th2 = (Throwable) ((ErrorResult) errorResult).getValue();
            value = null;
        } else if (!(errorResult instanceof SuccessResult)) {
            throw new NoWhenBranchMatchedException();
        } else {
            value = ((SuccessResult) errorResult).getValue();
        }
        return (byte[]) value;
    }
}
