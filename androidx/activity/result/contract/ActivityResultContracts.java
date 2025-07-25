package androidx.activity.result.contract;

import android.annotation.SuppressLint;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.ext.SdkExtensions;
import android.provider.MediaStore;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;
import androidx.activity.result.PickVisualMediaRequest;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.annotation.CallSuper;
import androidx.annotation.RequiresApi;
import androidx.core.content.ContextCompat;
import com.maticoo.sdk.utils.request.network.Headers;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Tuples;
import kotlin.collections.C37559r0;
import kotlin.collections.C37563v;
import kotlin.collections.MapsJVM;
import kotlin.collections._Arrays;
import kotlin.collections._Collections;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges._Ranges;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.C38513v;
import p804nd.NoWhenBranchMatchedException;

/* compiled from: ActivityResultContracts.kt */
@Metadata
/* loaded from: classes.dex */
public final class ActivityResultContracts {

    /* compiled from: ActivityResultContracts.kt */
    @Metadata
    /* loaded from: classes.dex */
    public static class CaptureVideo extends ActivityResultContract<Uri, Boolean> {
        @Override // androidx.activity.result.contract.ActivityResultContract
        @Nullable
        public final ActivityResultContract.SynchronousResult<Boolean> getSynchronousResult(@NotNull Context context, @NotNull Uri input) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(input, "input");
            return null;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        @CallSuper
        @NotNull
        public Intent createIntent(@NotNull Context context, @NotNull Uri input) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(input, "input");
            Intent putExtra = new Intent("android.media.action.VIDEO_CAPTURE").putExtra("output", input);
            Intrinsics.checkNotNullExpressionValue(putExtra, "Intent(MediaStore.ACTION…tore.EXTRA_OUTPUT, input)");
            return putExtra;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.activity.result.contract.ActivityResultContract
        @NotNull
        public final Boolean parseResult(int i, @Nullable Intent intent) {
            return Boolean.valueOf(i == -1);
        }
    }

    /* compiled from: ActivityResultContracts.kt */
    @Metadata
    @RequiresApi(19)
    /* loaded from: classes.dex */
    public static class CreateDocument extends ActivityResultContract<String, Uri> {
        @NotNull
        private final String mimeType;

        public CreateDocument(@NotNull String mimeType) {
            Intrinsics.checkNotNullParameter(mimeType, "mimeType");
            this.mimeType = mimeType;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        @Nullable
        public final ActivityResultContract.SynchronousResult<Uri> getSynchronousResult(@NotNull Context context, @NotNull String input) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(input, "input");
            return null;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        @CallSuper
        @NotNull
        public Intent createIntent(@NotNull Context context, @NotNull String input) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(input, "input");
            Intent putExtra = new Intent("android.intent.action.CREATE_DOCUMENT").setType(this.mimeType).putExtra("android.intent.extra.TITLE", input);
            Intrinsics.checkNotNullExpressionValue(putExtra, "Intent(Intent.ACTION_CRE…ntent.EXTRA_TITLE, input)");
            return putExtra;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.activity.result.contract.ActivityResultContract
        @Nullable
        public final Uri parseResult(int i, @Nullable Intent intent) {
            if (!(i == -1)) {
                intent = null;
            }
            if (intent != null) {
                return intent.getData();
            }
            return null;
        }

        public CreateDocument() {
            this(Headers.VALUE_ACCEPT_ALL);
        }
    }

    /* compiled from: ActivityResultContracts.kt */
    @Metadata
    /* loaded from: classes.dex */
    public static class GetContent extends ActivityResultContract<String, Uri> {
        @Override // androidx.activity.result.contract.ActivityResultContract
        @Nullable
        public final ActivityResultContract.SynchronousResult<Uri> getSynchronousResult(@NotNull Context context, @NotNull String input) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(input, "input");
            return null;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        @CallSuper
        @NotNull
        public Intent createIntent(@NotNull Context context, @NotNull String input) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(input, "input");
            Intent type = new Intent("android.intent.action.GET_CONTENT").addCategory("android.intent.category.OPENABLE").setType(input);
            Intrinsics.checkNotNullExpressionValue(type, "Intent(Intent.ACTION_GET…          .setType(input)");
            return type;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.activity.result.contract.ActivityResultContract
        @Nullable
        public final Uri parseResult(int i, @Nullable Intent intent) {
            if (!(i == -1)) {
                intent = null;
            }
            if (intent != null) {
                return intent.getData();
            }
            return null;
        }
    }

    /* compiled from: ActivityResultContracts.kt */
    @Metadata
    @RequiresApi(18)
    /* loaded from: classes.dex */
    public static class GetMultipleContents extends ActivityResultContract<String, List<Uri>> {
        @NotNull
        public static final Companion Companion = new Companion(null);

        /* compiled from: ActivityResultContracts.kt */
        @RequiresApi(18)
        @Metadata
        /* loaded from: classes.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final List<Uri> getClipDataUris$activity_release(@NotNull Intent intent) {
                List<Uri> m17166m;
                Intrinsics.checkNotNullParameter(intent, "<this>");
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Uri data = intent.getData();
                if (data != null) {
                    linkedHashSet.add(data);
                }
                ClipData clipData = intent.getClipData();
                if (clipData == null && linkedHashSet.isEmpty()) {
                    m17166m = C37563v.m17166m();
                    return m17166m;
                }
                if (clipData != null) {
                    int itemCount = clipData.getItemCount();
                    for (int i = 0; i < itemCount; i++) {
                        Uri uri = clipData.getItemAt(i).getUri();
                        if (uri != null) {
                            linkedHashSet.add(uri);
                        }
                    }
                }
                return new ArrayList(linkedHashSet);
            }
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        @Nullable
        public final ActivityResultContract.SynchronousResult<List<Uri>> getSynchronousResult(@NotNull Context context, @NotNull String input) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(input, "input");
            return null;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        @CallSuper
        @NotNull
        public Intent createIntent(@NotNull Context context, @NotNull String input) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(input, "input");
            Intent putExtra = new Intent("android.intent.action.GET_CONTENT").addCategory("android.intent.category.OPENABLE").setType(input).putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
            Intrinsics.checkNotNullExpressionValue(putExtra, "Intent(Intent.ACTION_GET…TRA_ALLOW_MULTIPLE, true)");
            return putExtra;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        @NotNull
        public final List<Uri> parseResult(int i, @Nullable Intent intent) {
            List<Uri> m17166m;
            List<Uri> clipDataUris$activity_release;
            if (!(i == -1)) {
                intent = null;
            }
            if (intent == null || (clipDataUris$activity_release = Companion.getClipDataUris$activity_release(intent)) == null) {
                m17166m = C37563v.m17166m();
                return m17166m;
            }
            return clipDataUris$activity_release;
        }
    }

    /* compiled from: ActivityResultContracts.kt */
    @Metadata
    @RequiresApi(19)
    /* loaded from: classes.dex */
    public static class OpenDocument extends ActivityResultContract<String[], Uri> {
        @Override // androidx.activity.result.contract.ActivityResultContract
        @Nullable
        public final ActivityResultContract.SynchronousResult<Uri> getSynchronousResult(@NotNull Context context, @NotNull String[] input) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(input, "input");
            return null;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        @CallSuper
        @NotNull
        public Intent createIntent(@NotNull Context context, @NotNull String[] input) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(input, "input");
            Intent type = new Intent("android.intent.action.OPEN_DOCUMENT").putExtra("android.intent.extra.MIME_TYPES", input).setType(Headers.VALUE_ACCEPT_ALL);
            Intrinsics.checkNotNullExpressionValue(type, "Intent(Intent.ACTION_OPE…          .setType(\"*/*\")");
            return type;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.activity.result.contract.ActivityResultContract
        @Nullable
        public final Uri parseResult(int i, @Nullable Intent intent) {
            if (!(i == -1)) {
                intent = null;
            }
            if (intent != null) {
                return intent.getData();
            }
            return null;
        }
    }

    /* compiled from: ActivityResultContracts.kt */
    @Metadata
    @RequiresApi(21)
    /* loaded from: classes.dex */
    public static class OpenDocumentTree extends ActivityResultContract<Uri, Uri> {
        @Override // androidx.activity.result.contract.ActivityResultContract
        @Nullable
        public final ActivityResultContract.SynchronousResult<Uri> getSynchronousResult(@NotNull Context context, @Nullable Uri uri) {
            Intrinsics.checkNotNullParameter(context, "context");
            return null;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        @CallSuper
        @NotNull
        public Intent createIntent(@NotNull Context context, @Nullable Uri uri) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT_TREE");
            if (Build.VERSION.SDK_INT >= 26 && uri != null) {
                intent.putExtra("android.provider.extra.INITIAL_URI", uri);
            }
            return intent;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.activity.result.contract.ActivityResultContract
        @Nullable
        public final Uri parseResult(int i, @Nullable Intent intent) {
            if (!(i == -1)) {
                intent = null;
            }
            if (intent != null) {
                return intent.getData();
            }
            return null;
        }
    }

    /* compiled from: ActivityResultContracts.kt */
    @Metadata
    @RequiresApi(19)
    /* loaded from: classes.dex */
    public static class OpenMultipleDocuments extends ActivityResultContract<String[], List<Uri>> {
        @Override // androidx.activity.result.contract.ActivityResultContract
        @Nullable
        public final ActivityResultContract.SynchronousResult<List<Uri>> getSynchronousResult(@NotNull Context context, @NotNull String[] input) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(input, "input");
            return null;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        @CallSuper
        @NotNull
        public Intent createIntent(@NotNull Context context, @NotNull String[] input) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(input, "input");
            Intent type = new Intent("android.intent.action.OPEN_DOCUMENT").putExtra("android.intent.extra.MIME_TYPES", input).putExtra("android.intent.extra.ALLOW_MULTIPLE", true).setType(Headers.VALUE_ACCEPT_ALL);
            Intrinsics.checkNotNullExpressionValue(type, "Intent(Intent.ACTION_OPE…          .setType(\"*/*\")");
            return type;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        @NotNull
        public final List<Uri> parseResult(int i, @Nullable Intent intent) {
            List<Uri> m17166m;
            List<Uri> clipDataUris$activity_release;
            if (!(i == -1)) {
                intent = null;
            }
            if (intent == null || (clipDataUris$activity_release = GetMultipleContents.Companion.getClipDataUris$activity_release(intent)) == null) {
                m17166m = C37563v.m17166m();
                return m17166m;
            }
            return clipDataUris$activity_release;
        }
    }

    /* compiled from: ActivityResultContracts.kt */
    @Metadata
    /* loaded from: classes.dex */
    public static final class PickContact extends ActivityResultContract<Void, Uri> {
        @Override // androidx.activity.result.contract.ActivityResultContract
        @NotNull
        public Intent createIntent(@NotNull Context context, @Nullable Void r2) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intent type = new Intent("android.intent.action.PICK").setType("vnd.android.cursor.dir/contact");
            Intrinsics.checkNotNullExpressionValue(type, "Intent(Intent.ACTION_PIC…ct.Contacts.CONTENT_TYPE)");
            return type;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.activity.result.contract.ActivityResultContract
        @Nullable
        public Uri parseResult(int i, @Nullable Intent intent) {
            if (!(i == -1)) {
                intent = null;
            }
            if (intent != null) {
                return intent.getData();
            }
            return null;
        }
    }

    /* compiled from: ActivityResultContracts.kt */
    @Metadata
    @RequiresApi(19)
    /* loaded from: classes.dex */
    public static class PickMultipleVisualMedia extends ActivityResultContract<PickVisualMediaRequest, List<Uri>> {
        @NotNull
        public static final Companion Companion = new Companion(null);
        private final int maxItems;

        /* compiled from: ActivityResultContracts.kt */
        @Metadata
        /* loaded from: classes.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @SuppressLint({"NewApi", "ClassVerificationFailure"})
            public final int getMaxItems$activity_release() {
                if (PickVisualMedia.Companion.isSystemPickerAvailable$activity_release()) {
                    return MediaStore.getPickImagesMaxLimit();
                }
                return Integer.MAX_VALUE;
            }
        }

        public PickMultipleVisualMedia() {
            this(0, 1, null);
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        @Nullable
        public final ActivityResultContract.SynchronousResult<List<Uri>> getSynchronousResult(@NotNull Context context, @NotNull PickVisualMediaRequest input) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(input, "input");
            return null;
        }

        public /* synthetic */ PickMultipleVisualMedia(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? Companion.getMaxItems$activity_release() : i);
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        @SuppressLint({"NewApi", "ClassVerificationFailure"})
        @CallSuper
        @NotNull
        public Intent createIntent(@NotNull Context context, @NotNull PickVisualMediaRequest input) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(input, "input");
            PickVisualMedia.Companion companion = PickVisualMedia.Companion;
            if (companion.isSystemPickerAvailable$activity_release()) {
                Intent intent = new Intent("android.provider.action.PICK_IMAGES");
                intent.setType(companion.getVisualMimeType$activity_release(input.getMediaType()));
                if (this.maxItems <= MediaStore.getPickImagesMaxLimit()) {
                    intent.putExtra("android.provider.extra.PICK_IMAGES_MAX", this.maxItems);
                    return intent;
                }
                throw new IllegalArgumentException("Max items must be less or equals MediaStore.getPickImagesMaxLimit()".toString());
            } else if (companion.isSystemFallbackPickerAvailable$activity_release(context)) {
                ResolveInfo systemFallbackPicker$activity_release = companion.getSystemFallbackPicker$activity_release(context);
                if (systemFallbackPicker$activity_release != null) {
                    ActivityInfo activityInfo = systemFallbackPicker$activity_release.activityInfo;
                    Intent intent2 = new Intent(PickVisualMedia.ACTION_SYSTEM_FALLBACK_PICK_IMAGES);
                    intent2.setClassName(activityInfo.applicationInfo.packageName, activityInfo.name);
                    intent2.setType(companion.getVisualMimeType$activity_release(input.getMediaType()));
                    intent2.putExtra(PickVisualMedia.GMS_EXTRA_PICK_IMAGES_MAX, this.maxItems);
                    return intent2;
                }
                throw new IllegalStateException("Required value was null.".toString());
            } else if (companion.isGmsPickerAvailable$activity_release(context)) {
                ResolveInfo gmsPicker$activity_release = companion.getGmsPicker$activity_release(context);
                if (gmsPicker$activity_release != null) {
                    ActivityInfo activityInfo2 = gmsPicker$activity_release.activityInfo;
                    Intent intent3 = new Intent(PickVisualMedia.GMS_ACTION_PICK_IMAGES);
                    intent3.setClassName(activityInfo2.applicationInfo.packageName, activityInfo2.name);
                    intent3.putExtra(PickVisualMedia.GMS_EXTRA_PICK_IMAGES_MAX, this.maxItems);
                    return intent3;
                }
                throw new IllegalStateException("Required value was null.".toString());
            } else {
                Intent intent4 = new Intent("android.intent.action.OPEN_DOCUMENT");
                intent4.setType(companion.getVisualMimeType$activity_release(input.getMediaType()));
                intent4.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
                if (intent4.getType() == null) {
                    intent4.setType(Headers.VALUE_ACCEPT_ALL);
                    intent4.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/*", "video/*"});
                    return intent4;
                }
                return intent4;
            }
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        @NotNull
        public final List<Uri> parseResult(int i, @Nullable Intent intent) {
            List<Uri> m17166m;
            List<Uri> clipDataUris$activity_release;
            if (!(i == -1)) {
                intent = null;
            }
            if (intent == null || (clipDataUris$activity_release = GetMultipleContents.Companion.getClipDataUris$activity_release(intent)) == null) {
                m17166m = C37563v.m17166m();
                return m17166m;
            }
            return clipDataUris$activity_release;
        }

        public PickMultipleVisualMedia(int i) {
            this.maxItems = i;
            if (!(i > 1)) {
                throw new IllegalArgumentException("Max items must be higher than 1".toString());
            }
        }
    }

    /* compiled from: ActivityResultContracts.kt */
    @Metadata
    @RequiresApi(19)
    /* loaded from: classes.dex */
    public static class PickVisualMedia extends ActivityResultContract<PickVisualMediaRequest, Uri> {
        @NotNull
        public static final String ACTION_SYSTEM_FALLBACK_PICK_IMAGES = "androidx.activity.result.contract.action.PICK_IMAGES";
        @NotNull
        public static final Companion Companion = new Companion(null);
        @NotNull
        public static final String EXTRA_SYSTEM_FALLBACK_PICK_IMAGES_MAX = "androidx.activity.result.contract.extra.PICK_IMAGES_MAX";
        @NotNull
        public static final String GMS_ACTION_PICK_IMAGES = "com.google.android.gms.provider.action.PICK_IMAGES";
        @NotNull
        public static final String GMS_EXTRA_PICK_IMAGES_MAX = "com.google.android.gms.provider.extra.PICK_IMAGES_MAX";

        /* compiled from: ActivityResultContracts.kt */
        @Metadata
        /* loaded from: classes.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @Nullable
            public final ResolveInfo getGmsPicker$activity_release(@NotNull Context context) {
                Intrinsics.checkNotNullParameter(context, "context");
                return context.getPackageManager().resolveActivity(new Intent(PickVisualMedia.GMS_ACTION_PICK_IMAGES), 1114112);
            }

            @Nullable
            public final ResolveInfo getSystemFallbackPicker$activity_release(@NotNull Context context) {
                Intrinsics.checkNotNullParameter(context, "context");
                return context.getPackageManager().resolveActivity(new Intent(PickVisualMedia.ACTION_SYSTEM_FALLBACK_PICK_IMAGES), 1114112);
            }

            @Nullable
            public final String getVisualMimeType$activity_release(@NotNull VisualMediaType input) {
                Intrinsics.checkNotNullParameter(input, "input");
                if (input instanceof ImageOnly) {
                    return "image/*";
                }
                if (input instanceof VideoOnly) {
                    return "video/*";
                }
                if (input instanceof SingleMimeType) {
                    return ((SingleMimeType) input).getMimeType();
                }
                if (input instanceof ImageAndVideo) {
                    return null;
                }
                throw new NoWhenBranchMatchedException();
            }

            public final boolean isGmsPickerAvailable$activity_release(@NotNull Context context) {
                Intrinsics.checkNotNullParameter(context, "context");
                if (getGmsPicker$activity_release(context) != null) {
                    return true;
                }
                return false;
            }

            @SuppressLint({"ClassVerificationFailure", "NewApi"})
            public final boolean isPhotoPickerAvailable() {
                return isSystemPickerAvailable$activity_release();
            }

            public final boolean isSystemFallbackPickerAvailable$activity_release(@NotNull Context context) {
                Intrinsics.checkNotNullParameter(context, "context");
                if (getSystemFallbackPicker$activity_release(context) != null) {
                    return true;
                }
                return false;
            }

            @SuppressLint({"ClassVerificationFailure", "NewApi"})
            public final boolean isSystemPickerAvailable$activity_release() {
                int i = Build.VERSION.SDK_INT;
                if (i >= 33) {
                    return true;
                }
                if (i >= 30 && SdkExtensions.getExtensionVersion(30) >= 2) {
                    return true;
                }
                return false;
            }

            @SuppressLint({"ClassVerificationFailure", "NewApi"})
            public final boolean isPhotoPickerAvailable(@NotNull Context context) {
                Intrinsics.checkNotNullParameter(context, "context");
                return isSystemPickerAvailable$activity_release() || isSystemFallbackPickerAvailable$activity_release(context) || isGmsPickerAvailable$activity_release(context);
            }

            public static /* synthetic */ void getACTION_SYSTEM_FALLBACK_PICK_IMAGES$annotations() {
            }

            public static /* synthetic */ void getEXTRA_SYSTEM_FALLBACK_PICK_IMAGES_MAX$annotations() {
            }
        }

        /* compiled from: ActivityResultContracts.kt */
        @Metadata
        /* loaded from: classes.dex */
        public static final class ImageAndVideo implements VisualMediaType {
            @NotNull
            public static final ImageAndVideo INSTANCE = new ImageAndVideo();

            private ImageAndVideo() {
            }
        }

        /* compiled from: ActivityResultContracts.kt */
        @Metadata
        /* loaded from: classes.dex */
        public static final class ImageOnly implements VisualMediaType {
            @NotNull
            public static final ImageOnly INSTANCE = new ImageOnly();

            private ImageOnly() {
            }
        }

        /* compiled from: ActivityResultContracts.kt */
        @Metadata
        /* loaded from: classes.dex */
        public static final class SingleMimeType implements VisualMediaType {
            @NotNull
            private final String mimeType;

            public SingleMimeType(@NotNull String mimeType) {
                Intrinsics.checkNotNullParameter(mimeType, "mimeType");
                this.mimeType = mimeType;
            }

            @NotNull
            public final String getMimeType() {
                return this.mimeType;
            }
        }

        /* compiled from: ActivityResultContracts.kt */
        @Metadata
        /* loaded from: classes.dex */
        public static final class VideoOnly implements VisualMediaType {
            @NotNull
            public static final VideoOnly INSTANCE = new VideoOnly();

            private VideoOnly() {
            }
        }

        /* compiled from: ActivityResultContracts.kt */
        @Metadata
        /* loaded from: classes.dex */
        public interface VisualMediaType {
        }

        @SuppressLint({"ClassVerificationFailure", "NewApi"})
        public static final boolean isPhotoPickerAvailable() {
            return Companion.isPhotoPickerAvailable();
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        @Nullable
        public final ActivityResultContract.SynchronousResult<Uri> getSynchronousResult(@NotNull Context context, @NotNull PickVisualMediaRequest input) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(input, "input");
            return null;
        }

        @SuppressLint({"ClassVerificationFailure", "NewApi"})
        public static final boolean isPhotoPickerAvailable(@NotNull Context context) {
            return Companion.isPhotoPickerAvailable(context);
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        @CallSuper
        @NotNull
        public Intent createIntent(@NotNull Context context, @NotNull PickVisualMediaRequest input) {
            Intent intent;
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(input, "input");
            Companion companion = Companion;
            if (companion.isSystemPickerAvailable$activity_release()) {
                Intent intent2 = new Intent("android.provider.action.PICK_IMAGES");
                intent2.setType(companion.getVisualMimeType$activity_release(input.getMediaType()));
                return intent2;
            }
            if (companion.isSystemFallbackPickerAvailable$activity_release(context)) {
                ResolveInfo systemFallbackPicker$activity_release = companion.getSystemFallbackPicker$activity_release(context);
                if (systemFallbackPicker$activity_release != null) {
                    ActivityInfo activityInfo = systemFallbackPicker$activity_release.activityInfo;
                    intent = new Intent(ACTION_SYSTEM_FALLBACK_PICK_IMAGES);
                    intent.setClassName(activityInfo.applicationInfo.packageName, activityInfo.name);
                    intent.setType(companion.getVisualMimeType$activity_release(input.getMediaType()));
                } else {
                    throw new IllegalStateException("Required value was null.".toString());
                }
            } else if (companion.isGmsPickerAvailable$activity_release(context)) {
                ResolveInfo gmsPicker$activity_release = companion.getGmsPicker$activity_release(context);
                if (gmsPicker$activity_release != null) {
                    ActivityInfo activityInfo2 = gmsPicker$activity_release.activityInfo;
                    intent = new Intent(GMS_ACTION_PICK_IMAGES);
                    intent.setClassName(activityInfo2.applicationInfo.packageName, activityInfo2.name);
                    intent.setType(companion.getVisualMimeType$activity_release(input.getMediaType()));
                } else {
                    throw new IllegalStateException("Required value was null.".toString());
                }
            } else {
                Intent intent3 = new Intent("android.intent.action.OPEN_DOCUMENT");
                intent3.setType(companion.getVisualMimeType$activity_release(input.getMediaType()));
                if (intent3.getType() == null) {
                    intent3.setType(Headers.VALUE_ACCEPT_ALL);
                    intent3.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/*", "video/*"});
                    return intent3;
                }
                return intent3;
            }
            return intent;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.activity.result.contract.ActivityResultContract
        @Nullable
        public final Uri parseResult(int i, @Nullable Intent intent) {
            Object m17529r0;
            if (!(i == -1)) {
                intent = null;
            }
            if (intent != null) {
                Uri data = intent.getData();
                if (data == null) {
                    m17529r0 = _Collections.m17529r0(GetMultipleContents.Companion.getClipDataUris$activity_release(intent));
                    data = (Uri) m17529r0;
                }
                return data;
            }
            return null;
        }
    }

    /* compiled from: ActivityResultContracts.kt */
    @Metadata
    /* loaded from: classes.dex */
    public static final class RequestMultiplePermissions extends ActivityResultContract<String[], Map<String, Boolean>> {
        @NotNull
        public static final String ACTION_REQUEST_PERMISSIONS = "androidx.activity.result.contract.action.REQUEST_PERMISSIONS";
        @NotNull
        public static final Companion Companion = new Companion(null);
        @NotNull
        public static final String EXTRA_PERMISSIONS = "androidx.activity.result.contract.extra.PERMISSIONS";
        @NotNull
        public static final String EXTRA_PERMISSION_GRANT_RESULTS = "androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS";

        /* compiled from: ActivityResultContracts.kt */
        @Metadata
        /* loaded from: classes.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final Intent createIntent$activity_release(@NotNull String[] input) {
                Intrinsics.checkNotNullParameter(input, "input");
                Intent putExtra = new Intent(RequestMultiplePermissions.ACTION_REQUEST_PERMISSIONS).putExtra(RequestMultiplePermissions.EXTRA_PERMISSIONS, input);
                Intrinsics.checkNotNullExpressionValue(putExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
                return putExtra;
            }
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        @NotNull
        public Intent createIntent(@NotNull Context context, @NotNull String[] input) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(input, "input");
            return Companion.createIntent$activity_release(input);
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        @Nullable
        public ActivityResultContract.SynchronousResult<Map<String, Boolean>> getSynchronousResult(@NotNull Context context, @NotNull String[] input) {
            int m17292f;
            int m16917e;
            Map m17284j;
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(input, "input");
            boolean z = true;
            if (input.length == 0) {
                m17284j = C37559r0.m17284j();
                return new ActivityResultContract.SynchronousResult<>(m17284j);
            }
            int length = input.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (!(ContextCompat.checkSelfPermission(context, input[i]) == 0)) {
                    z = false;
                    break;
                }
                i++;
            }
            if (z) {
                m17292f = MapsJVM.m17292f(input.length);
                m16917e = _Ranges.m16917e(m17292f, 16);
                LinkedHashMap linkedHashMap = new LinkedHashMap(m16917e);
                for (String str : input) {
                    Tuples m14532a = C38513v.m14532a(str, Boolean.TRUE);
                    linkedHashMap.put(m14532a.m17630c(), m14532a.m17629d());
                }
                return new ActivityResultContract.SynchronousResult<>(linkedHashMap);
            }
            return null;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        @NotNull
        public Map<String, Boolean> parseResult(int i, @Nullable Intent intent) {
            Map<String, Boolean> m17284j;
            List m17335Q;
            List m17537j1;
            Map<String, Boolean> m17271w;
            Map<String, Boolean> m17284j2;
            Map<String, Boolean> m17284j3;
            if (i != -1) {
                m17284j3 = C37559r0.m17284j();
                return m17284j3;
            } else if (intent == null) {
                m17284j2 = C37559r0.m17284j();
                return m17284j2;
            } else {
                String[] stringArrayExtra = intent.getStringArrayExtra(EXTRA_PERMISSIONS);
                int[] intArrayExtra = intent.getIntArrayExtra(EXTRA_PERMISSION_GRANT_RESULTS);
                if (intArrayExtra == null || stringArrayExtra == null) {
                    m17284j = C37559r0.m17284j();
                    return m17284j;
                }
                ArrayList arrayList = new ArrayList(intArrayExtra.length);
                for (int i2 : intArrayExtra) {
                    arrayList.add(Boolean.valueOf(i2 == 0));
                }
                m17335Q = _Arrays.m17335Q(stringArrayExtra);
                m17537j1 = _Collections.m17537j1(m17335Q, arrayList);
                m17271w = C37559r0.m17271w(m17537j1);
                return m17271w;
            }
        }
    }

    /* compiled from: ActivityResultContracts.kt */
    @Metadata
    /* loaded from: classes.dex */
    public static final class RequestPermission extends ActivityResultContract<String, Boolean> {
        @Override // androidx.activity.result.contract.ActivityResultContract
        @NotNull
        public Intent createIntent(@NotNull Context context, @NotNull String input) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(input, "input");
            return RequestMultiplePermissions.Companion.createIntent$activity_release(new String[]{input});
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        @Nullable
        public ActivityResultContract.SynchronousResult<Boolean> getSynchronousResult(@NotNull Context context, @NotNull String input) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(input, "input");
            if (ContextCompat.checkSelfPermission(context, input) == 0) {
                return new ActivityResultContract.SynchronousResult<>(Boolean.TRUE);
            }
            return null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.activity.result.contract.ActivityResultContract
        @NotNull
        public Boolean parseResult(int i, @Nullable Intent intent) {
            boolean z;
            if (intent != null && i == -1) {
                int[] intArrayExtra = intent.getIntArrayExtra(RequestMultiplePermissions.EXTRA_PERMISSION_GRANT_RESULTS);
                boolean z2 = false;
                if (intArrayExtra != null) {
                    int length = intArrayExtra.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            z = false;
                            break;
                        }
                        if (intArrayExtra[i2] == 0) {
                            z = true;
                            break;
                        }
                        i2++;
                    }
                    if (z) {
                        z2 = true;
                    }
                }
                return Boolean.valueOf(z2);
            }
            return Boolean.FALSE;
        }
    }

    /* compiled from: ActivityResultContracts.kt */
    @Metadata
    /* loaded from: classes.dex */
    public static final class StartActivityForResult extends ActivityResultContract<Intent, ActivityResult> {
        @NotNull
        public static final Companion Companion = new Companion(null);
        @NotNull
        public static final String EXTRA_ACTIVITY_OPTIONS_BUNDLE = "androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE";

        /* compiled from: ActivityResultContracts.kt */
        @Metadata
        /* loaded from: classes.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        @NotNull
        public Intent createIntent(@NotNull Context context, @NotNull Intent input) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(input, "input");
            return input;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.activity.result.contract.ActivityResultContract
        @NotNull
        public ActivityResult parseResult(int i, @Nullable Intent intent) {
            return new ActivityResult(i, intent);
        }
    }

    /* compiled from: ActivityResultContracts.kt */
    @Metadata
    /* loaded from: classes.dex */
    public static final class StartIntentSenderForResult extends ActivityResultContract<IntentSenderRequest, ActivityResult> {
        @NotNull
        public static final String ACTION_INTENT_SENDER_REQUEST = "androidx.activity.result.contract.action.INTENT_SENDER_REQUEST";
        @NotNull
        public static final Companion Companion = new Companion(null);
        @NotNull
        public static final String EXTRA_INTENT_SENDER_REQUEST = "androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST";
        @NotNull
        public static final String EXTRA_SEND_INTENT_EXCEPTION = "androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION";

        /* compiled from: ActivityResultContracts.kt */
        @Metadata
        /* loaded from: classes.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        @NotNull
        public Intent createIntent(@NotNull Context context, @NotNull IntentSenderRequest input) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(input, "input");
            Intent putExtra = new Intent(ACTION_INTENT_SENDER_REQUEST).putExtra(EXTRA_INTENT_SENDER_REQUEST, input);
            Intrinsics.checkNotNullExpressionValue(putExtra, "Intent(ACTION_INTENT_SEN…NT_SENDER_REQUEST, input)");
            return putExtra;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.activity.result.contract.ActivityResultContract
        @NotNull
        public ActivityResult parseResult(int i, @Nullable Intent intent) {
            return new ActivityResult(i, intent);
        }
    }

    /* compiled from: ActivityResultContracts.kt */
    @Metadata
    /* loaded from: classes.dex */
    public static class TakePicture extends ActivityResultContract<Uri, Boolean> {
        @Override // androidx.activity.result.contract.ActivityResultContract
        @Nullable
        public final ActivityResultContract.SynchronousResult<Boolean> getSynchronousResult(@NotNull Context context, @NotNull Uri input) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(input, "input");
            return null;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        @CallSuper
        @NotNull
        public Intent createIntent(@NotNull Context context, @NotNull Uri input) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(input, "input");
            Intent putExtra = new Intent("android.media.action.IMAGE_CAPTURE").putExtra("output", input);
            Intrinsics.checkNotNullExpressionValue(putExtra, "Intent(MediaStore.ACTION…tore.EXTRA_OUTPUT, input)");
            return putExtra;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.activity.result.contract.ActivityResultContract
        @NotNull
        public final Boolean parseResult(int i, @Nullable Intent intent) {
            return Boolean.valueOf(i == -1);
        }
    }

    /* compiled from: ActivityResultContracts.kt */
    @Metadata
    /* loaded from: classes.dex */
    public static class TakePicturePreview extends ActivityResultContract<Void, Bitmap> {
        @Override // androidx.activity.result.contract.ActivityResultContract
        @Nullable
        public final ActivityResultContract.SynchronousResult<Bitmap> getSynchronousResult(@NotNull Context context, @Nullable Void r2) {
            Intrinsics.checkNotNullParameter(context, "context");
            return null;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        @CallSuper
        @NotNull
        public Intent createIntent(@NotNull Context context, @Nullable Void r2) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new Intent("android.media.action.IMAGE_CAPTURE");
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.activity.result.contract.ActivityResultContract
        @Nullable
        public final Bitmap parseResult(int i, @Nullable Intent intent) {
            if (!(i == -1)) {
                intent = null;
            }
            if (intent != null) {
                return (Bitmap) intent.getParcelableExtra("data");
            }
            return null;
        }
    }

    /* compiled from: ActivityResultContracts.kt */
    @Metadata
    /* loaded from: classes.dex */
    public static class TakeVideo extends ActivityResultContract<Uri, Bitmap> {
        @Override // androidx.activity.result.contract.ActivityResultContract
        @Nullable
        public final ActivityResultContract.SynchronousResult<Bitmap> getSynchronousResult(@NotNull Context context, @NotNull Uri input) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(input, "input");
            return null;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        @CallSuper
        @NotNull
        public Intent createIntent(@NotNull Context context, @NotNull Uri input) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(input, "input");
            Intent putExtra = new Intent("android.media.action.VIDEO_CAPTURE").putExtra("output", input);
            Intrinsics.checkNotNullExpressionValue(putExtra, "Intent(MediaStore.ACTION…tore.EXTRA_OUTPUT, input)");
            return putExtra;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.activity.result.contract.ActivityResultContract
        @Nullable
        public final Bitmap parseResult(int i, @Nullable Intent intent) {
            if (!(i == -1)) {
                intent = null;
            }
            if (intent != null) {
                return (Bitmap) intent.getParcelableExtra("data");
            }
            return null;
        }
    }

    private ActivityResultContracts() {
    }
}
