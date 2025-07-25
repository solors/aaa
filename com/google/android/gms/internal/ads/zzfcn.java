package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.ironsource.C21114v8;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzfcn {
    private final zzava zza;

    @VisibleForTesting
    public zzfcn(zzava zzavaVar) {
        this.zza = zzavaVar;
    }

    private static final Uri zzb(Uri uri, String str) throws zzavb {
        if (uri != null) {
            try {
                try {
                    String host = uri.getHost();
                    String path = uri.getPath();
                    if (host != null && host.equals("ad.doubleclick.net") && path != null) {
                        if (path.contains(";")) {
                            if (!uri.toString().contains("dc_ms=")) {
                                String uri2 = uri.toString();
                                int indexOf = uri2.indexOf(";adurl");
                                if (indexOf != -1) {
                                    int i = indexOf + 1;
                                    StringBuilder sb2 = new StringBuilder(uri2.substring(0, i));
                                    sb2.append("dc_ms");
                                    sb2.append("=");
                                    sb2.append(str);
                                    sb2.append(";");
                                    sb2.append((CharSequence) uri2, i, uri2.length());
                                    return Uri.parse(sb2.toString());
                                }
                                String encodedPath = uri.getEncodedPath();
                                if (encodedPath != null) {
                                    int indexOf2 = uri2.indexOf(encodedPath);
                                    StringBuilder sb3 = new StringBuilder(uri2.substring(0, encodedPath.length() + indexOf2));
                                    sb3.append(";");
                                    sb3.append("dc_ms");
                                    sb3.append("=");
                                    sb3.append(str);
                                    sb3.append(";");
                                    sb3.append((CharSequence) uri2, indexOf2 + encodedPath.length(), uri2.length());
                                    return Uri.parse(sb3.toString());
                                }
                                throw new UnsupportedOperationException();
                            }
                            throw new zzavb("Parameter already exists: dc_ms");
                        }
                    }
                } catch (UnsupportedOperationException unused) {
                    throw new zzavb("Provided Uri is not in a valid state");
                }
            } catch (NullPointerException unused2) {
            }
        }
        if (uri.getQueryParameter("ms") == null) {
            String uri3 = uri.toString();
            int indexOf3 = uri3.indexOf("&adurl");
            if (indexOf3 == -1) {
                indexOf3 = uri3.indexOf("?adurl");
            }
            if (indexOf3 != -1) {
                int i2 = indexOf3 + 1;
                StringBuilder sb4 = new StringBuilder(uri3.substring(0, i2));
                sb4.append("ms");
                sb4.append("=");
                sb4.append(str);
                sb4.append(C21114v8.C21123i.f54135c);
                sb4.append((CharSequence) uri3, i2, uri3.length());
                return Uri.parse(sb4.toString());
            }
            return uri.buildUpon().appendQueryParameter("ms", str).build();
        }
        throw new zzavb("Query parameter already exists: ms");
    }

    public final Uri zza(Uri uri, Context context, View view, @Nullable Activity activity) throws zzavb {
        try {
            return zzb(uri, this.zza.zzc().zze(context, uri.getQueryParameter("ai"), view, activity));
        } catch (UnsupportedOperationException unused) {
            throw new zzavb("Provided Uri is not in a valid state");
        }
    }
}
