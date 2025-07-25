package io.bidmachine;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import io.bidmachine.AdRequest;
import io.bidmachine.core.Logger;
import io.bidmachine.core.Utils;
import io.bidmachine.utils.lazy.LazyValue;
import java.util.List;

/* loaded from: classes9.dex */
public class BidMachine {
    public static final String NAME = "BidMachine";
    private static final String TAG = "BidMachine";
    public static final String VERSION = "3.1.1";

    /* renamed from: io.bidmachine.BidMachine$a */
    /* loaded from: classes9.dex */
    public class RunnableC35165a implements Runnable {
        final /* synthetic */ AdsFormat val$adsFormat;
        final /* synthetic */ Context val$applicationContext;
        final /* synthetic */ BidTokenCallback val$callback;

        RunnableC35165a(BidTokenCallback bidTokenCallback, Context context, AdsFormat adsFormat) {
            this.val$callback = bidTokenCallback;
            this.val$applicationContext = context;
            this.val$adsFormat = adsFormat;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.val$callback.onCollected(BidMachine.getBidToken(this.val$applicationContext, this.val$adsFormat));
        }
    }

    @NonNull
    @WorkerThread
    @Deprecated
    public static String getBidToken(@NonNull Context context) {
        return getBidToken(context, (AdsFormat) null);
    }

    @Nullable
    public static Object getExtrasParam(@NonNull Context context, @NonNull String str) {
        return ExtraParamsManager.get().getPublic(context, str);
    }

    public static void initialize(@NonNull Context context, @NonNull String str) {
        initialize(context, str, null);
    }

    public static boolean isInitialized() {
        return BidMachineImpl.get().isInitialized();
    }

    public static /* synthetic */ String lambda$getBidToken$8(String str) {
        return String.format("getBidToken - %s", str);
    }

    public static /* synthetic */ String lambda$initialize$0(String str) {
        return String.format("initialize - %s", str);
    }

    public static /* synthetic */ String lambda$setConsentConfig$3(boolean z, String str) {
        return String.format("setConsentConfig - %s, %s", Boolean.valueOf(z), str);
    }

    public static /* synthetic */ String lambda$setCoppa$5(Boolean bool) {
        return String.format("setCoppa - %s", bool);
    }

    public static /* synthetic */ String lambda$setEndpoint$1(String str) {
        return String.format("setEndpoint - %s", str);
    }

    public static /* synthetic */ String lambda$setGPP$7(String str, List list) {
        return String.format("setGPP - %s, [%s]", str, Utils.join(list));
    }

    public static /* synthetic */ String lambda$setSubjectToGDPR$4(Boolean bool) {
        return String.format("setSubjectToGDPR - %s", bool);
    }

    public static /* synthetic */ String lambda$setTestMode$2(boolean z) {
        return String.format("setTestMode - %s", Boolean.valueOf(z));
    }

    public static /* synthetic */ String lambda$setUSPrivacyString$6(String str) {
        return String.format("setUSPrivacyString - %s", str);
    }

    public static void registerAdRequestListener(@NonNull AdRequest.AdRequestListener<?> adRequestListener) {
        Logger.m20094d("BidMachine", "registerAdRequestListener");
        BidMachineImpl.get().registerAdRequestListener(adRequestListener);
    }

    public static void registerNetworks(@NonNull NetworkConfig... networkConfigArr) {
        Logger.m20094d("BidMachine", "registerNetworks with NetworkConfig array");
        NetworkRegistry.registerNetworks(networkConfigArr);
    }

    public static void setConsentConfig(final boolean z, @Nullable final String str) {
        Logger.m20095d("BidMachine", new LazyValue() { // from class: io.bidmachine.f1
            @Override // io.bidmachine.utils.lazy.LazyValue
            public final Object get() {
                String lambda$setConsentConfig$3;
                lambda$setConsentConfig$3 = BidMachine.lambda$setConsentConfig$3(z, str);
                return lambda$setConsentConfig$3;
            }
        });
        BidMachineImpl.get().getUserRestrictionParams().setConsentConfig(z, str);
    }

    public static void setCoppa(@Nullable final Boolean bool) {
        Logger.m20095d("BidMachine", new LazyValue() { // from class: io.bidmachine.e1
            @Override // io.bidmachine.utils.lazy.LazyValue
            public final Object get() {
                String lambda$setCoppa$5;
                lambda$setCoppa$5 = BidMachine.lambda$setCoppa$5(bool);
                return lambda$setCoppa$5;
            }
        });
        BidMachineImpl.get().getUserRestrictionParams().setCoppa(bool);
    }

    public static void setEndpoint(@NonNull final String str) {
        Logger.m20095d("BidMachine", new LazyValue() { // from class: io.bidmachine.i1
            @Override // io.bidmachine.utils.lazy.LazyValue
            public final Object get() {
                String lambda$setEndpoint$1;
                lambda$setEndpoint$1 = BidMachine.lambda$setEndpoint$1(str);
                return lambda$setEndpoint$1;
            }
        });
        UrlProvider.setEndpoint(str);
    }

    public static void setGPP(@Nullable final String str, @Nullable final List<Integer> list) {
        Logger.m20095d("BidMachine", new LazyValue() { // from class: io.bidmachine.d1
            @Override // io.bidmachine.utils.lazy.LazyValue
            public final Object get() {
                String lambda$setGPP$7;
                lambda$setGPP$7 = BidMachine.lambda$setGPP$7(str, list);
                return lambda$setGPP$7;
            }
        });
        BidMachineImpl.get().getUserRestrictionParams().setGPP(str, list);
    }

    public static void setLoggingEnabled(boolean z) {
        if (z) {
            Logger.setLoggingEnabled(true);
            Logger.m20094d("BidMachine", "setLoggingEnabled - true");
        } else {
            Logger.m20094d("BidMachine", "setLoggingEnabled - false");
            Logger.setLoggingEnabled(false);
        }
        NetworkRegistry.setLoggingEnabled(z);
    }

    public static void setPublisher(@Nullable Publisher publisher) {
        Logger.m20094d("BidMachine", "setPublisher");
        BidMachineImpl.get().setPublisher(publisher);
    }

    public static void setSubjectToGDPR(@Nullable final Boolean bool) {
        Logger.m20095d("BidMachine", new LazyValue() { // from class: io.bidmachine.j1
            @Override // io.bidmachine.utils.lazy.LazyValue
            public final Object get() {
                String lambda$setSubjectToGDPR$4;
                lambda$setSubjectToGDPR$4 = BidMachine.lambda$setSubjectToGDPR$4(bool);
                return lambda$setSubjectToGDPR$4;
            }
        });
        BidMachineImpl.get().getUserRestrictionParams().setSubjectToGDPR(bool);
    }

    public static void setTargetingParams(@Nullable TargetingParams targetingParams) {
        Logger.m20094d("BidMachine", "setTargetingParams");
        BidMachineImpl.get().setTargetingParams(targetingParams);
    }

    public static void setTestMode(final boolean z) {
        Logger.m20095d("BidMachine", new LazyValue() { // from class: io.bidmachine.h1
            @Override // io.bidmachine.utils.lazy.LazyValue
            public final Object get() {
                String lambda$setTestMode$2;
                lambda$setTestMode$2 = BidMachine.lambda$setTestMode$2(z);
                return lambda$setTestMode$2;
            }
        });
        BidMachineImpl.get().setTestMode(z);
    }

    public static void setUSPrivacyString(@Nullable final String str) {
        Logger.m20095d("BidMachine", new LazyValue() { // from class: io.bidmachine.c1
            @Override // io.bidmachine.utils.lazy.LazyValue
            public final Object get() {
                String lambda$setUSPrivacyString$6;
                lambda$setUSPrivacyString$6 = BidMachine.lambda$setUSPrivacyString$6(str);
                return lambda$setUSPrivacyString$6;
            }
        });
        BidMachineImpl.get().getUserRestrictionParams().setUSPrivacyString(str);
    }

    public static void unregisterAdRequestListener(@NonNull AdRequest.AdRequestListener<?> adRequestListener) {
        Logger.m20094d("BidMachine", "unregisterAdRequestListener");
        BidMachineImpl.get().unregisterAdRequestListener(adRequestListener);
    }

    @NonNull
    @WorkerThread
    public static String getBidToken(@NonNull Context context, @Nullable AdsFormat adsFormat) {
        final String createBidToken = BidTokenManager.createBidToken(context.getApplicationContext(), adsFormat);
        Logger.m20095d("BidMachine", new LazyValue() { // from class: io.bidmachine.g1
            @Override // io.bidmachine.utils.lazy.LazyValue
            public final Object get() {
                String lambda$getBidToken$8;
                lambda$getBidToken$8 = BidMachine.lambda$getBidToken$8(createBidToken);
                return lambda$getBidToken$8;
            }
        });
        return createBidToken;
    }

    public static void initialize(@NonNull Context context, @NonNull final String str, @Nullable InitializationCallback initializationCallback) {
        Logger.m20095d("BidMachine", new LazyValue() { // from class: io.bidmachine.k1
            @Override // io.bidmachine.utils.lazy.LazyValue
            public final Object get() {
                String lambda$initialize$0;
                lambda$initialize$0 = BidMachine.lambda$initialize$0(str);
                return lambda$initialize$0;
            }
        });
        BidMachineImpl.get().initialize(context, str, initializationCallback);
    }

    @WorkerThread
    public static void registerNetworks(@NonNull Context context, @NonNull String str) {
        Logger.m20094d("BidMachine", "registerNetworks with JSON string");
        NetworkRegistry.registerNetworks(context, str);
    }

    @Deprecated
    public static void getBidToken(@NonNull Context context, @NonNull BidTokenCallback bidTokenCallback) {
        getBidToken(context, null, bidTokenCallback);
    }

    public static void getBidToken(@NonNull Context context, @Nullable AdsFormat adsFormat, @NonNull BidTokenCallback bidTokenCallback) {
        BidTokenTaskManager.execute(new RunnableC35165a(bidTokenCallback, context.getApplicationContext(), adsFormat));
    }

    public static void registerNetworks(@NonNull Context context, @NonNull String str, @Nullable NetworkRegistryCallback networkRegistryCallback) {
        Logger.m20094d("BidMachine", "registerNetworks with JSON string");
        NetworkRegistry.registerNetworks(context, str, networkRegistryCallback);
    }
}
