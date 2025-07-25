package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;
import androidx.annotation.Nullable;
import androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzecs {
    @Nullable
    private MeasurementManagerFutures zza;
    private final Context zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzecs(Context context) {
        this.zzb = context;
    }

    public final ListenableFuture zza() {
        try {
            MeasurementManagerFutures from = MeasurementManagerFutures.from(this.zzb);
            this.zza = from;
            if (from == null) {
                return zzgch.zzg(new IllegalStateException("MeasurementManagerFutures is null"));
            }
            return from.getMeasurementApiStatusAsync();
        } catch (Exception e) {
            return zzgch.zzg(e);
        }
    }

    public final ListenableFuture zzb(Uri uri, InputEvent inputEvent) {
        try {
            MeasurementManagerFutures measurementManagerFutures = this.zza;
            Objects.requireNonNull(measurementManagerFutures);
            return measurementManagerFutures.registerSourceAsync(uri, inputEvent);
        } catch (Exception e) {
            return zzgch.zzg(e);
        }
    }
}
