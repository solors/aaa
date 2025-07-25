package com.unity3d.ads.core.domain.attribution;

import android.adservices.AdServicesState;
import android.adservices.measurement.MeasurementManager;
import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.os.OutcomeReceiver;
import android.os.ext.SdkExtensions;
import android.view.InputEvent;
import com.unity3d.ads.adplayer.AdPlayer;
import com.unity3d.ads.adplayer.WebViewContainer;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.ads.core.extensions.ProtobufExtensions;
import com.unity3d.services.core.device.Device;
import com.unity3d.services.core.domain.ISDKDispatchers;
import ge.StateFlow;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuationJvm;
import kotlin.coroutines.jvm.internal.C37591h;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C37798s1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.InterfaceC38501j;
import p804nd.LazyJVM;
import p804nd.Result;
import sd.C42688d;
import sd.IntrinsicsJvm;

/* compiled from: AndroidAttribution.kt */
@Metadata
@SuppressLint({"NewApi", "MissingPermission"})
/* loaded from: classes7.dex */
public final class AndroidAttribution {
    @NotNull
    private final ISDKDispatchers dispatchers;
    @NotNull
    private final InterfaceC38501j measurementManager$delegate;
    @NotNull
    private final SessionRepository sessionRepository;

    public AndroidAttribution(@NotNull Context context, @NotNull ISDKDispatchers dispatchers, @NotNull SessionRepository sessionRepository) {
        InterfaceC38501j m14554a;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
        Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        this.dispatchers = dispatchers;
        this.sessionRepository = sessionRepository;
        m14554a = LazyJVM.m14554a(new AndroidAttribution$measurementManager$2(this, context));
        this.measurementManager$delegate = m14554a;
    }

    private final MeasurementManager getMeasurementManager() {
        return (MeasurementManager) this.measurementManager$delegate.getValue();
    }

    private final Uri getUri(String str, AdObject adObject) {
        Uri parse = Uri.parse(str);
        Intrinsics.checkNotNullExpressionValue(parse, "parse(this)");
        Uri build = parse.buildUpon().appendQueryParameter("sessionToken", ProtobufExtensions.toBase64$default(this.sessionRepository.getSessionToken(), false, 1, null)).appendQueryParameter(HandleInvocationsFromAdViewer.KEY_TRACKING_TOKEN, ProtobufExtensions.toBase64$default(adObject.getTrackingToken(), false, 1, null)).build();
        Intrinsics.checkNotNullExpressionValue(build, "baseUrl.toUri()\n        …4())\n            .build()");
        return build;
    }

    @Nullable
    public final Object isAvailable(@NotNull Continuation<? super Boolean> continuation) {
        Continuation m6961c;
        Unit unit;
        Object m6959e;
        if (Device.getApiLevel() < 33) {
            return boxing.m17100a(false);
        }
        if (SdkExtensions.getExtensionVersion(1000000) < 4) {
            return boxing.m17100a(false);
        }
        if (getMeasurementManager() == null) {
            return boxing.m17100a(false);
        }
        if (AdServicesState.isAdServicesStateEnabled()) {
            m6961c = IntrinsicsJvm.m6961c(continuation);
            final SafeContinuationJvm safeContinuationJvm = new SafeContinuationJvm(m6961c);
            MeasurementManager measurementManager = getMeasurementManager();
            if (measurementManager != null) {
                measurementManager.getMeasurementApiStatus(C37798s1.m16101a(this.dispatchers.getDefault()), new OutcomeReceiver<Integer, Exception>() { // from class: com.unity3d.ads.core.domain.attribution.AndroidAttribution$isAvailable$2$1
                    @Override // android.os.OutcomeReceiver
                    public /* bridge */ /* synthetic */ void onResult(Integer num) {
                        onResult(num.intValue());
                    }

                    @Override // android.os.OutcomeReceiver
                    public void onError(@NotNull Exception error) {
                        Intrinsics.checkNotNullParameter(error, "error");
                        Continuation<Boolean> continuation2 = safeContinuationJvm;
                        Result.C38506a c38506a = Result.f101870c;
                        continuation2.resumeWith(Result.m14549b(Boolean.FALSE));
                    }

                    public void onResult(int i) {
                        Continuation<Boolean> continuation2 = safeContinuationJvm;
                        Result.C38506a c38506a = Result.f101870c;
                        continuation2.resumeWith(Result.m14549b(Boolean.valueOf(i == 1)));
                    }
                });
                unit = Unit.f99208a;
            } else {
                unit = null;
            }
            if (unit == null) {
                Result.C38506a c38506a = Result.f101870c;
                safeContinuationJvm.resumeWith(Result.m14549b(boxing.m17100a(false)));
            }
            Object m17101a = safeContinuationJvm.m17101a();
            m6959e = C42688d.m6959e();
            if (m17101a == m6959e) {
                C37591h.m17084c(continuation);
            }
            return m17101a;
        }
        return boxing.m17100a(false);
    }

    @Nullable
    public final Object registerClick(@NotNull String str, @NotNull AdObject adObject, @NotNull Continuation<? super Boolean> continuation) {
        WebViewContainer webViewContainer;
        StateFlow<InputEvent> lastInputEvent;
        InputEvent value;
        Continuation m6961c;
        Unit unit;
        Object m6959e;
        if (getMeasurementManager() == null) {
            return boxing.m17100a(false);
        }
        AdPlayer adPlayer = adObject.getAdPlayer();
        if (adPlayer != null && (webViewContainer = adPlayer.getWebViewContainer()) != null && (lastInputEvent = webViewContainer.getLastInputEvent()) != null && (value = lastInputEvent.getValue()) != null) {
            m6961c = IntrinsicsJvm.m6961c(continuation);
            final SafeContinuationJvm safeContinuationJvm = new SafeContinuationJvm(m6961c);
            MeasurementManager measurementManager = getMeasurementManager();
            if (measurementManager != null) {
                measurementManager.registerSource(getUri(str, adObject), value, C37798s1.m16101a(this.dispatchers.getDefault()), new OutcomeReceiver<Object, Exception>() { // from class: com.unity3d.ads.core.domain.attribution.AndroidAttribution$registerClick$2$1
                    @Override // android.os.OutcomeReceiver
                    public void onResult(@NotNull Object p0) {
                        Intrinsics.checkNotNullParameter(p0, "p0");
                        Continuation<Boolean> continuation2 = safeContinuationJvm;
                        Result.C38506a c38506a = Result.f101870c;
                        continuation2.resumeWith(Result.m14549b(Boolean.TRUE));
                    }

                    @Override // android.os.OutcomeReceiver
                    public void onError(@NotNull Exception error) {
                        Intrinsics.checkNotNullParameter(error, "error");
                        Continuation<Boolean> continuation2 = safeContinuationJvm;
                        Result.C38506a c38506a = Result.f101870c;
                        continuation2.resumeWith(Result.m14549b(Boolean.FALSE));
                    }
                });
                unit = Unit.f99208a;
            } else {
                unit = null;
            }
            if (unit == null) {
                Result.C38506a c38506a = Result.f101870c;
                safeContinuationJvm.resumeWith(Result.m14549b(boxing.m17100a(false)));
            }
            Object m17101a = safeContinuationJvm.m17101a();
            m6959e = C42688d.m6959e();
            if (m17101a == m6959e) {
                C37591h.m17084c(continuation);
            }
            return m17101a;
        }
        return boxing.m17100a(false);
    }

    @Nullable
    public final Object registerView(@NotNull String str, @NotNull AdObject adObject, @NotNull Continuation<? super Boolean> continuation) {
        Continuation m6961c;
        Object m6959e;
        if (getMeasurementManager() != null) {
            m6961c = IntrinsicsJvm.m6961c(continuation);
            final SafeContinuationJvm safeContinuationJvm = new SafeContinuationJvm(m6961c);
            MeasurementManager measurementManager = getMeasurementManager();
            Unit unit = null;
            if (measurementManager != null) {
                measurementManager.registerSource(getUri(str, adObject), (InputEvent) null, C37798s1.m16101a(this.dispatchers.getDefault()), new OutcomeReceiver<Object, Exception>() { // from class: com.unity3d.ads.core.domain.attribution.AndroidAttribution$registerView$2$1
                    @Override // android.os.OutcomeReceiver
                    public void onResult(@NotNull Object p0) {
                        Intrinsics.checkNotNullParameter(p0, "p0");
                        Continuation<Boolean> continuation2 = safeContinuationJvm;
                        Result.C38506a c38506a = Result.f101870c;
                        continuation2.resumeWith(Result.m14549b(Boolean.TRUE));
                    }

                    @Override // android.os.OutcomeReceiver
                    public void onError(@NotNull Exception error) {
                        Intrinsics.checkNotNullParameter(error, "error");
                        Continuation<Boolean> continuation2 = safeContinuationJvm;
                        Result.C38506a c38506a = Result.f101870c;
                        continuation2.resumeWith(Result.m14549b(Boolean.FALSE));
                    }
                });
                unit = Unit.f99208a;
            }
            if (unit == null) {
                Result.C38506a c38506a = Result.f101870c;
                safeContinuationJvm.resumeWith(Result.m14549b(boxing.m17100a(false)));
            }
            Object m17101a = safeContinuationJvm.m17101a();
            m6959e = C42688d.m6959e();
            if (m17101a == m6959e) {
                C37591h.m17084c(continuation);
            }
            return m17101a;
        }
        return boxing.m17100a(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MeasurementManager getMeasurementManager(Context context) {
        if (Device.getApiLevel() >= 33 && SdkExtensions.getExtensionVersion(1000000) >= 4) {
            return (MeasurementManager) context.getSystemService(MeasurementManager.class);
        }
        return null;
    }
}
