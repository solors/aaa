package com.mobilefuse.videoplayer.network;

import com.mobilefuse.sdk.exception.BaseError;
import com.mobilefuse.sdk.exception.Either;
import com.mobilefuse.sdk.exception.ErrorResult;
import com.mobilefuse.sdk.exception.ProcessingError;
import com.mobilefuse.sdk.exception.SuccessResult;
import com.mobilefuse.sdk.network.client.HttpClient;
import com.mobilefuse.sdk.p543rx.Flow;
import com.mobilefuse.sdk.p543rx.FlowCollector;
import com.mobilefuse.videoplayer.model.VastMediaFile;
import com.mobilefuse.videoplayer.utils.DiskCacheUtil;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: Flow.kt */
@Metadata
/* loaded from: classes7.dex */
public final class ProbeMediaFilesFlowKt$probeMediaFiles$$inlined$map$1 extends Lambda implements Function1<FlowCollector<? super Either<? extends BaseError, ? extends VastMediaFile>>, Unit> {
    final /* synthetic */ HttpClient $httpClient$inlined;
    final /* synthetic */ Flow $this_transform;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProbeMediaFilesFlowKt$probeMediaFiles$$inlined$map$1(Flow flow, HttpClient httpClient) {
        super(1);
        this.$this_transform = flow;
        this.$httpClient$inlined = httpClient;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(FlowCollector<? super Either<? extends BaseError, ? extends VastMediaFile>> flowCollector) {
        invoke2(flowCollector);
        return Unit.f99208a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull final FlowCollector<? super Either<? extends BaseError, ? extends VastMediaFile>> flow) {
        Intrinsics.checkNotNullParameter(flow, "$this$flow");
        this.$this_transform.collect(new FlowCollector() { // from class: com.mobilefuse.videoplayer.network.ProbeMediaFilesFlowKt$probeMediaFiles$$inlined$map$1.1
            @Override // com.mobilefuse.sdk.p543rx.FlowCollector
            public final void emit(@NotNull Either<? extends Throwable, ? extends T> value) {
                Object errorResult;
                Either either;
                Intrinsics.checkNotNullParameter(value, "value");
                if (value instanceof SuccessResult) {
                    FlowCollector flowCollector = flow;
                    try {
                        Iterator<T> it = ((List) ((SuccessResult) value).getValue()).iterator();
                        Object obj = null;
                        while (true) {
                            if (it.hasNext()) {
                                VastMediaFile vastMediaFile = (VastMediaFile) it.next();
                                if (DiskCacheUtil.containsFileCache(vastMediaFile.getUrl())) {
                                    errorResult = new SuccessResult(vastMediaFile);
                                    break;
                                }
                                String url = vastMediaFile.getUrl();
                                if (url != null) {
                                    either = HttpClient.DefaultImpls.headSync$default(ProbeMediaFilesFlowKt$probeMediaFiles$$inlined$map$1.this.$httpClient$inlined, url, 0L, 2, null);
                                } else {
                                    either = null;
                                }
                                if (either instanceof SuccessResult) {
                                    errorResult = new SuccessResult(vastMediaFile);
                                    break;
                                } else if (either instanceof ErrorResult) {
                                    obj = (BaseError) ((ErrorResult) either).getValue();
                                }
                            } else {
                                if (obj == null) {
                                    obj = new ProcessingError("No media files to probe");
                                }
                                errorResult = new ErrorResult(obj);
                            }
                        }
                        flowCollector.emit(new SuccessResult(errorResult));
                    } catch (Throwable th) {
                        flowCollector.emit(new ErrorResult(th));
                    }
                } else if (value instanceof ErrorResult) {
                    flow.emit(value);
                }
            }

            @Override // com.mobilefuse.sdk.p543rx.FlowCollector
            public void emitError(@NotNull Throwable error) {
                Intrinsics.checkNotNullParameter(error, "error");
                FlowCollector.DefaultImpls.emitError(this, error);
            }

            @Override // com.mobilefuse.sdk.p543rx.FlowCollector
            public void emitSuccess(T t) {
                FlowCollector.DefaultImpls.emitSuccess(this, t);
            }
        });
    }
}
