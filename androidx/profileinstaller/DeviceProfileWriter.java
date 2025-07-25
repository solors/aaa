package androidx.profileinstaller;

import android.content.res.AssetManager;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.profileinstaller.ProfileInstaller;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executor;

@RequiresApi(19)
@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes2.dex */
public class DeviceProfileWriter {
    @NonNull
    private final String mApkName;
    @NonNull
    private final AssetManager mAssetManager;
    @NonNull
    private final File mCurProfile;
    @NonNull
    private final ProfileInstaller.DiagnosticsCallback mDiagnostics;
    @NonNull
    private final Executor mExecutor;
    @Nullable
    private DexProfileData[] mProfile;
    @NonNull
    private final String mProfileMetaSourceLocation;
    @NonNull
    private final String mProfileSourceLocation;
    @Nullable
    private byte[] mTranscodedProfile;
    private boolean mDeviceSupportsAotProfile = false;
    @Nullable
    private final byte[] mDesiredVersion = desiredVersion();

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public DeviceProfileWriter(@NonNull AssetManager assetManager, @NonNull Executor executor, @NonNull ProfileInstaller.DiagnosticsCallback diagnosticsCallback, @NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull File file) {
        this.mAssetManager = assetManager;
        this.mExecutor = executor;
        this.mDiagnostics = diagnosticsCallback;
        this.mApkName = str;
        this.mProfileSourceLocation = str2;
        this.mProfileMetaSourceLocation = str3;
        this.mCurProfile = file;
    }

    /* renamed from: a */
    public static /* synthetic */ void m104120a(DeviceProfileWriter deviceProfileWriter, int i, Object obj) {
        deviceProfileWriter.lambda$result$0(i, obj);
    }

    @Nullable
    private DeviceProfileWriter addMetadata(DexProfileData[] dexProfileDataArr, byte[] bArr) {
        InputStream openStreamFromAssets;
        try {
            openStreamFromAssets = openStreamFromAssets(this.mAssetManager, this.mProfileMetaSourceLocation);
        } catch (FileNotFoundException e) {
            this.mDiagnostics.onResultReceived(9, e);
        } catch (IOException e2) {
            this.mDiagnostics.onResultReceived(7, e2);
        } catch (IllegalStateException e3) {
            this.mProfile = null;
            this.mDiagnostics.onResultReceived(8, e3);
        }
        if (openStreamFromAssets != null) {
            try {
                this.mProfile = ProfileTranscoder.readMeta(openStreamFromAssets, ProfileTranscoder.readHeader(openStreamFromAssets, ProfileTranscoder.MAGIC_PROFM), bArr, dexProfileDataArr);
                openStreamFromAssets.close();
                return this;
            } catch (Throwable th) {
                try {
                    openStreamFromAssets.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (openStreamFromAssets != null) {
            openStreamFromAssets.close();
        }
        return null;
    }

    private void assertDeviceAllowsProfileInstallerAotWritesCalled() {
        if (this.mDeviceSupportsAotProfile) {
            return;
        }
        throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
    }

    @Nullable
    private static byte[] desiredVersion() {
        int i = Build.VERSION.SDK_INT;
        if (i > 33) {
            return null;
        }
        switch (i) {
            case 24:
            case 25:
                return ProfileVersion.V001_N;
            case 26:
                return ProfileVersion.V005_O;
            case 27:
                return ProfileVersion.V009_O_MR1;
            case 28:
            case 29:
            case 30:
                return ProfileVersion.V010_P;
            case 31:
            case 32:
            case 33:
                return ProfileVersion.V015_S;
            default:
                return null;
        }
    }

    @Nullable
    private InputStream getProfileInputStream(AssetManager assetManager) {
        try {
            return openStreamFromAssets(assetManager, this.mProfileSourceLocation);
        } catch (FileNotFoundException e) {
            this.mDiagnostics.onResultReceived(6, e);
            return null;
        } catch (IOException e2) {
            this.mDiagnostics.onResultReceived(7, e2);
            return null;
        }
    }

    public /* synthetic */ void lambda$result$0(int i, Object obj) {
        this.mDiagnostics.onResultReceived(i, obj);
    }

    @Nullable
    private InputStream openStreamFromAssets(AssetManager assetManager, String str) throws IOException {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e) {
            String message = e.getMessage();
            if (message != null && message.contains("compressed")) {
                this.mDiagnostics.onDiagnosticReceived(5, null);
            }
            return null;
        }
    }

    @Nullable
    private DexProfileData[] readProfileInternal(InputStream inputStream) {
        try {
            try {
                try {
                    DexProfileData[] readProfile = ProfileTranscoder.readProfile(inputStream, ProfileTranscoder.readHeader(inputStream, ProfileTranscoder.MAGIC_PROF), this.mApkName);
                    try {
                        inputStream.close();
                        return readProfile;
                    } catch (IOException e) {
                        this.mDiagnostics.onResultReceived(7, e);
                        return readProfile;
                    }
                } catch (IOException e2) {
                    this.mDiagnostics.onResultReceived(7, e2);
                    inputStream.close();
                    return null;
                } catch (IllegalStateException e3) {
                    this.mDiagnostics.onResultReceived(8, e3);
                    inputStream.close();
                    return null;
                }
            } catch (Throwable th) {
                try {
                    inputStream.close();
                } catch (IOException e4) {
                    this.mDiagnostics.onResultReceived(7, e4);
                }
                throw th;
            }
        } catch (IOException e5) {
            this.mDiagnostics.onResultReceived(7, e5);
        }
    }

    private static boolean requiresMetadata() {
        int i = Build.VERSION.SDK_INT;
        if (i > 33) {
            return false;
        }
        if (i != 24 && i != 25) {
            switch (i) {
                case 31:
                case 32:
                case 33:
                    break;
                default:
                    return false;
            }
        }
        return true;
    }

    private void result(final int i, @Nullable final Object obj) {
        this.mExecutor.execute(new Runnable() { // from class: androidx.profileinstaller.a
            @Override // java.lang.Runnable
            public final void run() {
                DeviceProfileWriter.m104120a(DeviceProfileWriter.this, i, obj);
            }
        });
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public boolean deviceAllowsProfileInstallerAotWrites() {
        if (this.mDesiredVersion == null) {
            result(3, Integer.valueOf(Build.VERSION.SDK_INT));
            return false;
        } else if (!this.mCurProfile.canWrite()) {
            result(4, null);
            return false;
        } else {
            this.mDeviceSupportsAotProfile = true;
            return true;
        }
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public DeviceProfileWriter read() {
        DeviceProfileWriter addMetadata;
        assertDeviceAllowsProfileInstallerAotWritesCalled();
        if (this.mDesiredVersion == null) {
            return this;
        }
        InputStream profileInputStream = getProfileInputStream(this.mAssetManager);
        if (profileInputStream != null) {
            this.mProfile = readProfileInternal(profileInputStream);
        }
        DexProfileData[] dexProfileDataArr = this.mProfile;
        if (dexProfileDataArr != null && requiresMetadata() && (addMetadata = addMetadata(dexProfileDataArr, this.mDesiredVersion)) != null) {
            return addMetadata;
        }
        return this;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public DeviceProfileWriter transcodeIfNeeded() {
        ByteArrayOutputStream byteArrayOutputStream;
        DexProfileData[] dexProfileDataArr = this.mProfile;
        byte[] bArr = this.mDesiredVersion;
        if (dexProfileDataArr != null && bArr != null) {
            assertDeviceAllowsProfileInstallerAotWritesCalled();
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
            } catch (IOException e) {
                this.mDiagnostics.onResultReceived(7, e);
            } catch (IllegalStateException e2) {
                this.mDiagnostics.onResultReceived(8, e2);
            }
            try {
                ProfileTranscoder.writeHeader(byteArrayOutputStream, bArr);
                if (!ProfileTranscoder.transcodeAndWriteBody(byteArrayOutputStream, bArr, dexProfileDataArr)) {
                    this.mDiagnostics.onResultReceived(5, null);
                    this.mProfile = null;
                    byteArrayOutputStream.close();
                    return this;
                }
                this.mTranscodedProfile = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                this.mProfile = null;
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        return this;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [androidx.profileinstaller.DexProfileData[], byte[]] */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public boolean write() {
        byte[] bArr = this.mTranscodedProfile;
        if (bArr == null) {
            return false;
        }
        assertDeviceAllowsProfileInstallerAotWritesCalled();
        try {
            try {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(this.mCurProfile);
                    Encoding.writeAll(byteArrayInputStream, fileOutputStream);
                    result(1, null);
                    fileOutputStream.close();
                    byteArrayInputStream.close();
                    return true;
                } catch (Throwable th) {
                    try {
                        byteArrayInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (FileNotFoundException e) {
                result(6, e);
                return false;
            } catch (IOException e2) {
                result(7, e2);
                return false;
            }
        } finally {
            this.mTranscodedProfile = null;
            this.mProfile = null;
        }
    }
}
