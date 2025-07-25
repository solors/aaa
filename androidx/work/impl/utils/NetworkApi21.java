package androidx.work.impl.utils;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: NetworkApi21.kt */
@RequiresApi(21)
@Metadata
/* loaded from: classes2.dex */
public final class NetworkApi21 {
    @DoNotInline
    @Nullable
    public static final NetworkCapabilities getNetworkCapabilitiesCompat(@NotNull ConnectivityManager connectivityManager, @Nullable Network network) {
        Intrinsics.checkNotNullParameter(connectivityManager, "<this>");
        return connectivityManager.getNetworkCapabilities(network);
    }

    @DoNotInline
    public static final boolean hasCapabilityCompat(@NotNull NetworkCapabilities networkCapabilities, int i) {
        Intrinsics.checkNotNullParameter(networkCapabilities, "<this>");
        return networkCapabilities.hasCapability(i);
    }

    @DoNotInline
    public static final void unregisterNetworkCallbackCompat(@NotNull ConnectivityManager connectivityManager, @NotNull ConnectivityManager.NetworkCallback networkCallback) {
        Intrinsics.checkNotNullParameter(connectivityManager, "<this>");
        Intrinsics.checkNotNullParameter(networkCallback, "networkCallback");
        connectivityManager.unregisterNetworkCallback(networkCallback);
    }
}
