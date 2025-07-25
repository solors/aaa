package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzgw extends zzfr {
    private final Context zza;
    @Nullable
    private zzgd zzb;
    @Nullable
    private AssetFileDescriptor zzc;
    @Nullable
    private InputStream zzd;
    private long zze;
    private boolean zzf;

    public zzgw(Context context) {
        super(false);
        this.zza = context.getApplicationContext();
    }

    @Deprecated
    public static Uri buildRawResourceUri(int i) {
        return Uri.parse("rawresource:///" + i);
    }

    private static int zzk(String str) throws zzgv {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            throw new zzgv("Resource identifier must be an integer.", null, 1004);
        }
    }

    private static AssetFileDescriptor zzl(Context context, zzgd zzgdVar) throws zzgv {
        String host;
        Resources resourcesForApplication;
        int identifier;
        Uri normalizeScheme = zzgdVar.zza.normalizeScheme();
        if (TextUtils.equals("rawresource", normalizeScheme.getScheme())) {
            resourcesForApplication = context.getResources();
            List<String> pathSegments = normalizeScheme.getPathSegments();
            if (pathSegments.size() == 1) {
                identifier = zzk(pathSegments.get(0));
            } else {
                int size = pathSegments.size();
                throw new zzgv("rawresource:// URI must have exactly one path element, found " + size);
            }
        } else if (TextUtils.equals("android.resource", normalizeScheme.getScheme())) {
            String path = normalizeScheme.getPath();
            path.getClass();
            if (path.startsWith(RemoteSettings.FORWARD_SLASH_STRING)) {
                path = path.substring(1);
            }
            if (TextUtils.isEmpty(normalizeScheme.getHost())) {
                host = context.getPackageName();
            } else {
                host = normalizeScheme.getHost();
            }
            if (host.equals(context.getPackageName())) {
                resourcesForApplication = context.getResources();
            } else {
                try {
                    resourcesForApplication = context.getPackageManager().getResourcesForApplication(host);
                } catch (PackageManager.NameNotFoundException e) {
                    throw new zzgv("Package in android.resource:// URI not found. Check http://g.co/dev/packagevisibility.", e, 2005);
                }
            }
            if (path.matches("\\d+")) {
                identifier = zzk(path);
            } else {
                identifier = resourcesForApplication.getIdentifier(host + ":" + path, "raw", null);
                if (identifier == 0) {
                    throw new zzgv("Resource not found.", null, 2005);
                }
            }
        } else {
            String scheme = normalizeScheme.getScheme();
            throw new zzgv("Unsupported URI scheme (" + scheme + "). Only android.resource is supported.", null, 1004);
        }
        try {
            AssetFileDescriptor openRawResourceFd = resourcesForApplication.openRawResourceFd(identifier);
            if (openRawResourceFd != null) {
                return openRawResourceFd;
            }
            throw new zzgv("Resource is compressed: ".concat(String.valueOf(normalizeScheme)), null, 2000);
        } catch (Resources.NotFoundException e2) {
            throw new zzgv(null, e2, 2005);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzl
    public final int zza(byte[] bArr, int i, int i2) throws zzgv {
        if (i2 == 0) {
            return 0;
        }
        long j = this.zze;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, i2);
            } catch (IOException e) {
                throw new zzgv(null, e, 2000);
            }
        }
        InputStream inputStream = this.zzd;
        int i3 = zzei.zza;
        int read = inputStream.read(bArr, i, i2);
        if (read == -1) {
            if (this.zze == -1) {
                return -1;
            }
            throw new zzgv("End of stream reached having not read sufficient data.", new EOFException(), 2000);
        }
        long j2 = this.zze;
        if (j2 != -1) {
            this.zze = j2 - read;
        }
        zzg(read);
        return read;
    }

    @Override // com.google.android.gms.internal.ads.zzfy
    public final long zzb(zzgd zzgdVar) throws zzgv {
        long j;
        this.zzb = zzgdVar;
        zzi(zzgdVar);
        AssetFileDescriptor zzl = zzl(this.zza, zzgdVar);
        this.zzc = zzl;
        long length = zzl.getLength();
        FileInputStream fileInputStream = new FileInputStream(this.zzc.getFileDescriptor());
        this.zzd = fileInputStream;
        int i = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
        if (i != 0) {
            try {
                if (zzgdVar.zze > length) {
                    throw new zzgv(null, null, 2008);
                }
            } catch (zzgv e) {
                throw e;
            } catch (IOException e2) {
                throw new zzgv(null, e2, 2000);
            }
        }
        long startOffset = this.zzc.getStartOffset();
        long skip = fileInputStream.skip(zzgdVar.zze + startOffset) - startOffset;
        if (skip == zzgdVar.zze) {
            if (i == 0) {
                FileChannel channel = fileInputStream.getChannel();
                if (channel.size() == 0) {
                    this.zze = -1L;
                    j = -1;
                } else {
                    j = channel.size() - channel.position();
                    this.zze = j;
                    if (j < 0) {
                        throw new zzgv(null, null, 2008);
                    }
                }
            } else {
                j = length - skip;
                this.zze = j;
                if (j < 0) {
                    throw new zzfz(2008);
                }
            }
            long j2 = zzgdVar.zzf;
            if (j2 != -1) {
                if (j != -1) {
                    j2 = Math.min(j, j2);
                }
                this.zze = j2;
            }
            this.zzf = true;
            zzj(zzgdVar);
            long j3 = zzgdVar.zzf;
            if (j3 != -1) {
                return j3;
            }
            return this.zze;
        }
        throw new zzgv(null, null, 2008);
    }

    @Override // com.google.android.gms.internal.ads.zzfy
    @Nullable
    public final Uri zzc() {
        zzgd zzgdVar = this.zzb;
        if (zzgdVar != null) {
            return zzgdVar.zza;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzfy
    public final void zzd() throws zzgv {
        this.zzb = null;
        try {
            try {
                InputStream inputStream = this.zzd;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.zzd = null;
                try {
                    AssetFileDescriptor assetFileDescriptor = this.zzc;
                    if (assetFileDescriptor != null) {
                        assetFileDescriptor.close();
                    }
                } catch (IOException e) {
                    throw new zzgv(null, e, 2000);
                }
            } finally {
                this.zzc = null;
                if (this.zzf) {
                    this.zzf = false;
                    zzh();
                }
            }
        } catch (IOException e2) {
            throw new zzgv(null, e2, 2000);
        }
    }
}
