package androidx.webkit.internal;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;

/* loaded from: classes2.dex */
public class AssetHelper {
    public static final String DEFAULT_MIME_TYPE = "text/plain";
    @NonNull
    private Context mContext;

    public AssetHelper(@NonNull Context context) {
        this.mContext = context;
    }

    @NonNull
    public static String getCanonicalDirPath(@NonNull File file) throws IOException {
        String canonicalPath = file.getCanonicalPath();
        if (!canonicalPath.endsWith(RemoteSettings.FORWARD_SLASH_STRING)) {
            return canonicalPath + RemoteSettings.FORWARD_SLASH_STRING;
        }
        return canonicalPath;
    }

    @Nullable
    public static File getCanonicalFileIfChild(@NonNull File file, @NonNull String str) throws IOException {
        String canonicalDirPath = getCanonicalDirPath(file);
        String canonicalPath = new File(file, str).getCanonicalPath();
        if (canonicalPath.startsWith(canonicalDirPath)) {
            return new File(canonicalPath);
        }
        return null;
    }

    @NonNull
    public static File getDataDir(@NonNull Context context) {
        return ApiHelperForN.getDataDir(context);
    }

    private int getFieldId(@NonNull String str, @NonNull String str2) {
        return this.mContext.getResources().getIdentifier(str2, str, this.mContext.getPackageName());
    }

    private int getValueType(int i) {
        TypedValue typedValue = new TypedValue();
        this.mContext.getResources().getValue(i, typedValue, true);
        return typedValue.type;
    }

    @NonNull
    public static String guessMimeType(@NonNull String str) {
        String mimeFromFileName = MimeUtil.getMimeFromFileName(str);
        if (mimeFromFileName == null) {
            return DEFAULT_MIME_TYPE;
        }
        return mimeFromFileName;
    }

    @NonNull
    private static InputStream handleSvgzStream(@NonNull String str, @NonNull InputStream inputStream) throws IOException {
        if (str.endsWith(".svgz")) {
            return new GZIPInputStream(inputStream);
        }
        return inputStream;
    }

    @NonNull
    public static InputStream openFile(@NonNull File file) throws FileNotFoundException, IOException {
        return handleSvgzStream(file.getPath(), new FileInputStream(file));
    }

    @NonNull
    private static String removeLeadingSlash(@NonNull String str) {
        if (str.length() > 1 && str.charAt(0) == '/') {
            return str.substring(1);
        }
        return str;
    }

    @NonNull
    public InputStream openAsset(@NonNull String str) throws IOException {
        String removeLeadingSlash = removeLeadingSlash(str);
        return handleSvgzStream(removeLeadingSlash, this.mContext.getAssets().open(removeLeadingSlash, 2));
    }

    @NonNull
    public InputStream openResource(@NonNull String str) throws Resources.NotFoundException, IOException {
        String removeLeadingSlash = removeLeadingSlash(str);
        String[] split = removeLeadingSlash.split(RemoteSettings.FORWARD_SLASH_STRING, -1);
        if (split.length == 2) {
            String str2 = split[0];
            String str3 = split[1];
            int lastIndexOf = str3.lastIndexOf(46);
            if (lastIndexOf != -1) {
                str3 = str3.substring(0, lastIndexOf);
            }
            int fieldId = getFieldId(str2, str3);
            int valueType = getValueType(fieldId);
            if (valueType == 3) {
                return handleSvgzStream(removeLeadingSlash, this.mContext.getResources().openRawResource(fieldId));
            }
            throw new IOException(String.format("Expected %s resource to be of TYPE_STRING but was %d", removeLeadingSlash, Integer.valueOf(valueType)));
        }
        throw new IllegalArgumentException("Incorrect resource path: " + removeLeadingSlash);
    }
}
