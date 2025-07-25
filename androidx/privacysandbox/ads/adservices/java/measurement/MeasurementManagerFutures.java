package androidx.privacysandbox.ads.adservices.java.measurement;

import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresPermission;
import androidx.privacysandbox.ads.adservices.java.internal.CoroutineAdapter;
import androidx.privacysandbox.ads.adservices.measurement.DeletionRequest;
import androidx.privacysandbox.ads.adservices.measurement.MeasurementManager;
import androidx.privacysandbox.ads.adservices.measurement.WebSourceRegistrationRequest;
import androidx.privacysandbox.ads.adservices.measurement.WebTriggerRegistrationRequest;
import com.google.common.util.concurrent.ListenableFuture;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C37756k;
import kotlinx.coroutines.C37785p0;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: MeasurementManagerFutures.kt */
@Metadata
/* loaded from: classes2.dex */
public abstract class MeasurementManagerFutures {
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* compiled from: MeasurementManagerFutures.kt */
    @Metadata
    /* loaded from: classes2.dex */
    public static final class Api33Ext5JavaImpl extends MeasurementManagerFutures {
        @NotNull
        private final MeasurementManager mMeasurementManager;

        public Api33Ext5JavaImpl(@NotNull MeasurementManager mMeasurementManager) {
            Intrinsics.checkNotNullParameter(mMeasurementManager, "mMeasurementManager");
            this.mMeasurementManager = mMeasurementManager;
        }

        @Override // androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures
        @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
        @DoNotInline
        @NotNull
        public ListenableFuture<Unit> deleteRegistrationsAsync(@NotNull DeletionRequest deletionRequest) {
            Deferred m16223b;
            Intrinsics.checkNotNullParameter(deletionRequest, "deletionRequest");
            m16223b = C37756k.m16223b(C37785p0.m16131a(Dispatchers.m16378a()), null, null, new C2872x759ed5b3(this, deletionRequest, null), 3, null);
            return CoroutineAdapter.asListenableFuture$default(m16223b, null, 1, null);
        }

        @Override // androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures
        @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
        @DoNotInline
        @NotNull
        public ListenableFuture<Integer> getMeasurementApiStatusAsync() {
            Deferred m16223b;
            m16223b = C37756k.m16223b(C37785p0.m16131a(Dispatchers.m16378a()), null, null, new C2873x3feaa97c(this, null), 3, null);
            return CoroutineAdapter.asListenableFuture$default(m16223b, null, 1, null);
        }

        @Override // androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures
        @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
        @DoNotInline
        @NotNull
        public ListenableFuture<Unit> registerSourceAsync(@NotNull Uri attributionSource, @Nullable InputEvent inputEvent) {
            Deferred m16223b;
            Intrinsics.checkNotNullParameter(attributionSource, "attributionSource");
            m16223b = C37756k.m16223b(C37785p0.m16131a(Dispatchers.m16378a()), null, null, new C2874x2c3ae252(this, attributionSource, inputEvent, null), 3, null);
            return CoroutineAdapter.asListenableFuture$default(m16223b, null, 1, null);
        }

        @Override // androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures
        @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
        @DoNotInline
        @NotNull
        public ListenableFuture<Unit> registerTriggerAsync(@NotNull Uri trigger) {
            Deferred m16223b;
            Intrinsics.checkNotNullParameter(trigger, "trigger");
            m16223b = C37756k.m16223b(C37785p0.m16131a(Dispatchers.m16378a()), null, null, new C2875x9b0c78cd(this, trigger, null), 3, null);
            return CoroutineAdapter.asListenableFuture$default(m16223b, null, 1, null);
        }

        @Override // androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures
        @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
        @DoNotInline
        @NotNull
        public ListenableFuture<Unit> registerWebSourceAsync(@NotNull WebSourceRegistrationRequest request) {
            Deferred m16223b;
            Intrinsics.checkNotNullParameter(request, "request");
            m16223b = C37756k.m16223b(C37785p0.m16131a(Dispatchers.m16378a()), null, null, new C2876x5537f716(this, request, null), 3, null);
            return CoroutineAdapter.asListenableFuture$default(m16223b, null, 1, null);
        }

        @Override // androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures
        @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
        @DoNotInline
        @NotNull
        public ListenableFuture<Unit> registerWebTriggerAsync(@NotNull WebTriggerRegistrationRequest request) {
            Deferred m16223b;
            Intrinsics.checkNotNullParameter(request, "request");
            m16223b = C37756k.m16223b(C37785p0.m16131a(Dispatchers.m16378a()), null, null, new C2877x91b1fc89(this, request, null), 3, null);
            return CoroutineAdapter.asListenableFuture$default(m16223b, null, 1, null);
        }
    }

    /* compiled from: MeasurementManagerFutures.kt */
    @Metadata
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final MeasurementManagerFutures from(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            MeasurementManager obtain = MeasurementManager.Companion.obtain(context);
            if (obtain != null) {
                return new Api33Ext5JavaImpl(obtain);
            }
            return null;
        }
    }

    @Nullable
    public static final MeasurementManagerFutures from(@NotNull Context context) {
        return Companion.from(context);
    }

    @NotNull
    public abstract ListenableFuture<Unit> deleteRegistrationsAsync(@NotNull DeletionRequest deletionRequest);

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    @NotNull
    public abstract ListenableFuture<Integer> getMeasurementApiStatusAsync();

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    @NotNull
    public abstract ListenableFuture<Unit> registerSourceAsync(@NotNull Uri uri, @Nullable InputEvent inputEvent);

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    @NotNull
    public abstract ListenableFuture<Unit> registerTriggerAsync(@NotNull Uri uri);

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    @NotNull
    public abstract ListenableFuture<Unit> registerWebSourceAsync(@NotNull WebSourceRegistrationRequest webSourceRegistrationRequest);

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    @NotNull
    public abstract ListenableFuture<Unit> registerWebTriggerAsync(@NotNull WebTriggerRegistrationRequest webTriggerRegistrationRequest);
}
