package com.smaato.sdk.core.util;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.log.Logger;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/* loaded from: classes7.dex */
public final class AssetUtils {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.smaato.sdk.core.util.AssetUtils$a */
    /* loaded from: classes7.dex */
    public class C27295a extends InputStream {
        C27295a() {
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            return 0;
        }
    }

    private AssetUtils() {
    }

    @NonNull
    public static String getFileFromAssets(@NonNull Context context, @Nullable Logger logger, @NonNull String str) {
        Objects.requireNonNull(context);
        Objects.requireNonNull(str);
        StringBuilder sb2 = new StringBuilder();
        try {
            BufferedReader openAssetBuffered = openAssetBuffered(context, str);
            while (true) {
                String readLine = openAssetBuffered.readLine();
                if (readLine == null) {
                    break;
                }
                sb2.append(readLine);
                sb2.append("\n");
            }
            openAssetBuffered.close();
        } catch (Exception e) {
            if (logger != null) {
                logger.error(LogDomain.CORE, String.format("Could not read '%s' file from assets", str), e);
            }
        }
        return sb2.toString();
    }

    @NonNull
    private static BufferedReader openAssetBuffered(@NonNull Context context, @NonNull String str) throws IOException {
        if (context.getAssets() != null) {
            return new BufferedReader(new InputStreamReader(context.getAssets().open(str), "UTF-8"));
        }
        return new BufferedReader(new InputStreamReader(new C27295a()));
    }
}
